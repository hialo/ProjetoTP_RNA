package Model;

public class MLP {

    /**
     * File: MLP.java Purpose: Create the MLP itself, using the created layers,
     * test inputs and outputs.
     *
     * @author Hialo
     * @version 1.0 layers - A vector of objects of type Layer. Receives the
     * quantity of the layers of the network. lastLayer - A integer who has the
     * value of the last layer of the network. learningRate - A integer which is
     * selected to ensure thate the wights will converge fast enough, without
     * oscillations. moment
     */
    private Layer[] layers;
    private int lastLayer = -1;
    private double learningRate = 0.2;
    private double moment = 0.8;

    /**
     * MLP constructor.
     *
     * @param layers Number of layers of the MLP.
     */
    public MLP(int layers) {
        this.layers = new Layer[layers];
    }

    /**
     * Add the first layer of the MLP.
     *
     * @param neurons Number of neurons on the layer.
     * @param connections Number of inputs/connections in each neuron.
     */
    public void addFirstLayer(int neurons, int connections, int function) {
        layers[0] = new Layer(neurons, connections, function);
        lastLayer = 0;
    }

    /**
     * Add new layers on the netowrk. The standart number of layers is 3.
     *
     * @param neurons Number of neurons on the layer.
     * @param function Function used (sigmoid or hyperbolic tangent).
     */
    public void addLayer(int neurons, int function) {
        layers[lastLayer + 1] = new Layer(neurons, layers[lastLayer].getLength(), function);
        lastLayer++;
    }

    /**
     * Forward
     *
     * @param input Inputs of the network.
     */
    public void processing(double[] inputs) {
        for (int i = 0; i < layers.length; i++) {
            layers[i].compute(inputs);

            inputs = layers[i].getOutputs();
        }
    }

    /**
     * Backpropagation algorithm to train the network.
     *
     * @param inputs Inputs of the network.
     * @param outputs Selected output of the network.
     */
    public void backpropagation(double[] inputs, double[] outputs) {

        computeLastLayerErrors(outputs);
        computeHiddenLayersErrors();
        computeDeltas(inputs);

        HandleCorrections();

    }

    /**
     * Method who realize the training of the network using the backpropagation
     * algorithm.
     *
     * @param inputs Inputs of the network.
     * @param outputs Selected outputs of the network.
     * @return computingFinalErrors (inputs, outputs)
     */
    public double training(double[] inputs, double[] outputs) {

        processing(inputs);
        backpropagation(inputs, outputs);

        return computingFinalErrors(inputs, outputs);
    }

    /**
     * Method who compute the errors of the last layer, the output layer.
     *
     * @param outputs Outputs of the layer.
     */
    private void computeLastLayerErrors(double[] outputs) {

        double error = 0;
        Layer l = layers[lastLayer];

        int tamanho = l.getLength();

        for (int i = 0; i < tamanho; i++) {
            error = (outputs[i] - l.getOutputs(i)) * layers[lastLayer].getFunction().derivative(l.getOutputs(i));
            l.setError(i, error);
        }
    }

    /**
     * Compute the errors of the hidden layers, or the internal layers.
     *
     */
    private void computeHiddenLayersErrors() {
        double error;

        for (int i = layers.length - 2; i >= 0; i--) // Layer por camada 
        {
            for (int j = 0; j < layers[i].getLength(); j++) { // Neuron por neuronio
                error = 0;
                // Neuron por neuronio na proxima camada
                for (int k = 0; k < layers[i + 1].getLength(); k++) {
                    error += layers[i + 1].getError(k) * layers[i + 1].getNeuron(k).getWeight(j);
                }

                error *= layers[i].getFunction().derivative(getLayer(i).getOutputs(j));
                layers[i].setError(j, error);
            }
        }
    }

    /**
     * Compute the deltas used on the training of the network.
     *
     * @param inputs Inputs of the network.
     */
    private void computeDeltas(double[] inputs) {
        int i, j, k;

        for (i = 0; i < layers.length; i++) { // Layer by Layer
            for (j = 0; j < layers[i].getLength(); j++) { // Neuron by Neuron
                for (k = 0; k < layers[i].getNeuron(j).getWeightLength(); k++) { // Weight by Weight
                    layers[i].getNeuron(j).setDeltaw(k, learningRate * inputs[k] * layers[i].getError(j)
                            + moment * layers[i].getNeuron(j).getDeltaw(k));
                }
                layers[i].getNeuron(j).setDeltaBias(learningRate * (-1) * layers[i].getError(j) + moment * layers[i].getNeuron(j).getDeltaBias());
            }
            inputs = layers[i].getOutputs();
        }
    }

    /**
     * Handle the corrections made on the network during the training.
     *
     */
    private void HandleCorrections() {
        int i, j, k;

        for (i = 0; i < layers.length; i++) {
            for (j = 0; j < layers[i].getLength(); j++) {
                Neuron n = layers[i].getNeuron(j);

                for (k = 0; k < n.getWeightLength(); k++) {
                    n.correctWeight(k, layers[i].getNeuron(j).getDeltaw(k));
                }
                n.correctBias(layers[i].getNeuron(j).getDeltaBias());
            }
        }
    }

    /**
     * Compute the final errors of the network.
     *
     * @param inputs Inputs of the network.
     * @param outputs Selected outputs of the network.
     * @return error The final error calculated on the network.
     */
    private double computingFinalErrors(double[] inputs, double[] outputs) {
        processing(inputs);

        double error = 0;

        Layer l = layers[lastLayer];

        int tamanho = l.getLength();

        for (int i = 0; i < tamanho; i++) {
            error = (outputs[i] - l.getOutputs(i));
        }
        if (error < 0) {
            return error * (-1);
        } else {
            return error;
        }
    }

    //Retorna a saida de um neuronio especifico na camada de saida
    public double getOutput(int neuron) {
        return layers[lastLayer].getOutputs(neuron);
    }

    //Retorna o numero de saidas
    public int getOutputLength() {
        return layers[lastLayer].getLength();
    }

    //Retorna o numero de camadas da MLP
    public int getLength() {
        return layers.length;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + layers.length + "]";
    }

    //Retorna uma camada especifica
    public Layer getLayer(int i) {
        return layers[i];
    }

    //Retorna a ultima camada
    public Layer getLastLayer() {
        return layers[lastLayer];
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    public double getLearningRate() {
        return learningRate;
    }

    public void setMoment(double moment) {
        this.moment = moment;
    }

    public double getMoment() {
        return moment;
    }
}
