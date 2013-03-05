package Model;

import Service.SigmoidFunction;
import Service.HyperbolicTangentFunction;
import Service.ActivationFunction;

    /**
     * File: Layer.java <br> 
     * Purpose: Create the layers of the MLP, using the
     * activation function chosen by the user. <br>
     *
     * @author Hialo
     * @version 1.0 
     */

public class Layer {
    
     /* neurons - A vector of objects of Neuron type. 
     *  output - A double vector who receives the answer of the MLP.
     *  function - A object who has the type of the activate function (Hyperbolic Tangent or Sigmoid). 
     *  errors - A double vector who receives the errors of the training of the
     *  neural network. */

    private Neuron[] neurons;
    private double[] outputs;
    private ActivationFunction function;
    private double[] errors = null;

    /**
     * Layer constructor.
     *
     * @param number_of_neurons Quantity of neurons used in the layer.
     * @param connections Number of connections per neuron.
     * @param function Activation function used.
     */
    public Layer(int number_of_neurons, int connections, int function) {

        neurons = new Neuron[number_of_neurons];
        outputs = new double[number_of_neurons];
        errors = new double[number_of_neurons];

        /* Initialize the neurons with their respective weights. */
        for (int i = 0; i < neurons.length; i++) {
            neurons[i] = new Neuron(connections);
            neurons[i].initializeWeigths();
            errors[i] = 0;
        }

        /* Choose which function will be used. */
        switch (function) {
            case 0:
                this.function = new SigmoidFunction();
                break;
            case 1:
                this.function = new HyperbolicTangentFunction();
                break;
        }

    }

    /**
     * Routine who calcules the outputs using the inputs and the weights of the
     * neurons.
     *
     * @param neuron Neuron of the network.
     * @param input A vector with the inputs of the network.
     */
    private double net(int neuron, double[] input) {
        double u = 0;

        for (int i = 0; i < input.length; i++) {
            u += input[i] * neurons[neuron].getWeight(i);
        }
        u -= neurons[neuron].getBias();
        return u;
    }

    void compute(double[] input) {
        for (int i = 0; i < neurons.length; i++) {
            outputs[i] = function.function(net(i, input));
        }
    }

    public ActivationFunction getFunction() {
        return function;
    }

    /* Getters and setters. */
    public void setError(int i, double value) {
        errors[i] = value;
    }

    public double getError(int i) {
        return errors[i];
    }

    public int getLength() {
        return neurons.length;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + neurons.length + "]";
    }

    public final double getOutputs(int i) {
        return outputs[i];
    }

    public final double[] getOutputs() {
        return outputs;
    }

    public final Neuron getNeuron(int i) {
        return neurons[i];
    }

    final public int getNeuronLength() {
        return neurons[0].getWeightLength();
    }
}
