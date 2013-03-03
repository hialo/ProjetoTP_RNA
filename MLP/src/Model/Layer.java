package Model;

import Service.SigmoidFunction;
import Service.HyperbolicTangentFunction;
import Service.ActivationFunction;

public class Layer {
   
    /**
    * File: Layer.java
    * Purpose: Create the layers of the MLP, using the activation function chosen by the user.
    * @author Hialo
    * @version 1.0
    * neurons - A vector of objects of Neuron type.
    * output - A double vector who receives the answer of the MLP.
    * function - A object who has the type of the activate function (Hyperbolic Tangent or Sigmoid).
    * errors - A double vector who receives the errors of the training of the neural network.
    */

    private Neuron[] neurons;
    private double[] outputs;
    private ActivationFunction function;
    private double[] errors = null;

    /**
     * Layer constructor.
     * @param qtd_neuronios Quantity of neurons used in the layer.
     * @param conexoes Number of connections per neuron.
     * @param funcao Activation function used.
     */
    
    public Layer(int qtd_neuronios, int conexoes, int funcao) {
        
        neurons = new Neuron[qtd_neuronios];
        outputs = new double[qtd_neuronios];
        errors = new double[qtd_neuronios];

        for (int i = 0; i < neurons.length; i++) {
            neurons[i] = new Neuron(conexoes);
            neurons[i].inicializarPesos();
            errors[i] = 0;
        }
        
        switch (funcao) {
            case 0:
                this.function = new SigmoidFunction();
                break;
            case 1:
                this.function = new HyperbolicTangentFunction();
                break;
        }

    }

    public void setErro(int i, double valor) {
        errors[i] = valor;
    }

    public double getErro(int i) {
        return errors[i];
    }

    void computar(double[] input) {
        for (int i = 0; i < neurons.length; i++) {
            outputs[i] = function.function(net(i, input));
        }
    }

    public int getTamanho() {
        return neurons.length;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + neurons.length + "]";
    }

    public final double getSaida(int i) {
        return outputs[i];
    }

    public final double[] getSaida() {
        return outputs;
    }

    public final Neuron getNeuronio(int i) {
        return neurons[i];
    }

    final public int getTamanhoNeuronio() {
        return neurons[0].getTamanho();
    }

    private double net(int neuronio, double[] entrada) {
        double u = 0;

        for (int i = 0; i < entrada.length; i++) {
            u += entrada[i] * neurons[neuronio].getPeso(i);
        }
        u -= neurons[neuronio].getBias();
        return u;
    }

    public ActivationFunction getFuncao() {
        return function;
    }
}
