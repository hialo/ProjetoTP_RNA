package Model;

import java.util.Random;

    /**
    * File: Neuron.java
    * Purpose: Create the neurons who will be a part of the MLP.
    * @author Hialo
    * @version 1.0
    * weights - A double vector who receives randomic values for it's weights.
    * bias - A double value who is utilized for modify the weights of the ANN.
    * deltaw - A double vector who receives the connections of the ANN.
    * deltabias - A double vector who receives the modifications of the bias.
    */

public class Neuron {

    private double[] weights = null;
    private double bias = 0;
    private double[] deltaw = null;
    private double deltaBias = 0;

    Neuron(int conexoes) {
        weights = new double[conexoes];
        deltaw = new double[conexoes];

        //Iniciando com zeros
        for (int i = 0; i < deltaw.length; i++) {
            deltaw[i] = 0;
        }
    }

    final double getDeltaw(int i) {
        return deltaw[i];
    }

    final void setDeltaw(int i, double valor) {
        deltaw[i] = valor;
    }

    final double getDeltaBias() {
        return deltaBias;
    }

    final void setDeltaBias(double deltaBias) {
        this.deltaBias = deltaBias;
    }

    //Retorna a quantidade de pesos
    public int getTamanho() {
        return weights.length;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        b.append(getClass().getName()).append("[");

        b.append("bias=").append(bias).append("; ");

        for (int i = 0; i < weights.length; i++) {
            b.append("w").append(i + 1).append("=").append(weights[i]).append("; ");
        }

        b.append("]");

        return b.toString();
    }

    public final double getPeso(int i) {
        return weights[i];
    }

    final void setPeso(int i, double w) {
        weights[i] = w;
    }

    final double getBias() {
        return bias;
    }

    final void setBias(double b) {
        bias = b;
    }

    //Funções de correção durante o treinamento
    public final void corrigirPeso(int i, double delta) {
        weights[i] += delta;
    }

    public final void corrigirBias(double delta) {
        bias += delta;
    }
    
    //Inicializa os pesos com valores randomicos (o bias tbm)
    //Random rd = new Random();

    void inicializarPesos() {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random(); //
                    //(Math.random() - 0.5) * 2;
        }
        bias = Math.random();
    }
}
