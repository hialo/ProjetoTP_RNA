package Model;

import java.util.Random;

    /**
    * File: Neuron.java <br>
    * Purpose: Create the neurons who will be a part of the MLP. <br>
    * @author Hialo
    * @version 1.0
    */

public class Neuron {
    
    /* weights - A double vector who receives randomic values for it's weights.
    * bias - A double value who is utilized for modify the weights of the ANN.
    * deltaw - A double vector who receives the connections of the ANN.
    * deltabias - A double vector who receives the modifications of the bias.*/

    private double[] weights = null;
    private double bias = 0;
    private double[] deltaw = null;
    private double deltaBias = 0;

    Neuron(int conexoes) {
        weights = new double[conexoes];
        deltaw = new double[conexoes];

        for (int i = 0; i < deltaw.length; i++) {
            deltaw[i] = 0;
        }
    }
    
    /** Weight correction function used on the training of the network.
     * 
     * @param i The position of the neuron on the vector of neurons.
     * @param delta Correction parameter.
     */

    public final void correctWeight(int i, double delta) {
        weights[i] += delta;
    }

    /** Bias correction function.
     * 
     * @param delta Correction parameter.
     */
    public final void correctBias(double delta) {
        bias += delta;
    }
    
    /** Function used for initialize the weights.
     * 
     */
    
    void initializeWeigths() {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random(); //
                    //(Math.random() - 0.5) * 2;
        }
        bias = Math.random();
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
    public int getWeightLength() {
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

    public final double getWeight(int i) {
        return weights[i];
    }

    final void setWeight(int i, double w) {
        weights[i] = w;
    }

    final double getBias() {
        return bias;
    }

    final void setBias(double b) {
        bias = b;
    }
}