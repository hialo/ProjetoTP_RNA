package Model;

public class MLP {
    
    /**
    * File: MLP.java
    * Purpose: Create the MLP itself, using the created layers, test inputs and outputs.
    * @author Hialo
    * @version 1.0
    * layers - A vector of objects of type Layer. Receives the quantity of the layers of the network.
    * lastLayer - A integer who has the value of the last layer of the network.
    * learningRate - A integer which is selected to ensure thate the wights will converge fast enough, without oscillations.
    * moment
    */
    
    private Layer[] layers;
    private int lastLayer = -1;
    private double learningRate = 0.2; 
    private double moment = 0.8;

    /** MLP constructor.
     * @param layers Number of layers of the MLP.
     */
    public MLP(int camadas) {
        this.layers = new Layer[camadas];
    }

    /** Add the first layer of the MLP.
     * @param neuronios numero de neuronios na camada
     * @param conexoes numero de entradas em cada neuronio
     */
    public void adicionarPrimeiraCamada(int neuronios, int conexoes, int funcao) {
        layers[0] = new Layer(neuronios, conexoes, funcao);
        lastLayer = 0;
    }

    public void adicionarCamada(int neuronios, int funcao) {
        layers[lastLayer + 1] = new Layer(neuronios, layers[lastLayer].getTamanho(), funcao);
        lastLayer++;
    }

    /**
     * Forward
     *
     * @param input entrada da rede
     */
    public void processar(double[] entrada) {
        for (int i = 0; i < layers.length; i++) {
            layers[i].computar(entrada);

            entrada = layers[i].getSaida();
        }
    }

    //Retorna a saida de um neuronio especifico na camada de saida
    public double getSaida(int neuronio) {
        return layers[lastLayer].getSaida(neuronio);
    }

    //Retorna o numero de saidas
    public int getTamanhoDaSaida() {
        return layers[lastLayer].getTamanho();
    }

    //Retorna o numero de camadas da MLP
    public int getTamanho() {
        return layers.length;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + layers.length + "]";
    }

    //Retorna uma camada especifica
    public Layer getCamada(int i) {
        return layers[i];
    }

    //Retorna a ultima camada
    public Layer getUltimaCamada() {
        return layers[lastLayer];
    }

    public void setEta(double eta) {
        this.learningRate = eta;
    }

    public double getEta() {
        return learningRate;
    }

    public void setAlpha(double alpha) {
        this.moment = alpha;
    }

    public double getAlpha() {
        return moment;
    }

    //Retropropagacao dos erros
    public void retropropagacao(double[] entrada, double[] saidaDesejada) {

        computarErrosDaUltimaCamada(saidaDesejada);
        computarErrosDasCamadasOcultas();
        computarDeltas(entrada);

        aplicarCorrecoes();

    }

    //Treinar rede
    public double treinar(double[] entrada, double[] saidaDesejada) {

        processar(entrada);
        retropropagacao(entrada, saidaDesejada);

        return computarErroFinal(entrada, saidaDesejada);
    }

    //Computa os erros da camada de saida
    private void computarErrosDaUltimaCamada(double[] saidaDesejada) {

        double erro = 0;
        Layer l = layers[lastLayer];

        int tamanho = l.getTamanho();

        for (int i = 0; i < tamanho; i++) {
            erro = (saidaDesejada[i] - l.getSaida(i)) * layers[lastLayer].getFuncao().derivative(l.getSaida(i));
            l.setErro(i, erro);
        }
    }

    //Computa erros das camadas internas
    private void computarErrosDasCamadasOcultas() {
        double error;

        for (int i = layers.length - 2; i >= 0; i--) // Layer por camada 
        {
            for (int j = 0; j < layers[i].getTamanho(); j++) { // Neuron por neuronio
                error = 0;
                // Neuron por neuronio na proxima camada
                for (int k = 0; k < layers[i + 1].getTamanho(); k++) {
                    error += layers[i + 1].getErro(k) * layers[i + 1].getNeuronio(k).getPeso(j);
                }

                error *= layers[i].getFuncao().derivative(getCamada(i).getSaida(j));
                layers[i].setErro(j, error);
            }
        }
    }

    private void computarDeltas(double[] entrada) {
        int i, j, k;

        for (i = 0; i < layers.length; i++) { // Layer by Layer
            for (j = 0; j < layers[i].getTamanho(); j++) { // Neuron by Neuron
                for (k = 0; k < layers[i].getNeuronio(j).getTamanho(); k++) { // Weight by Weight
                    layers[i].getNeuronio(j).setDeltaw(k, learningRate * entrada[k] * layers[i].getErro(j) + 
                            moment * layers[i].getNeuronio(j).getDeltaw(k));
                }
                layers[i].getNeuronio(j).setDeltaBias(learningRate * (-1) * layers[i].getErro(j) + moment * layers[i].getNeuronio(j).getDeltaBias());
            }
            entrada = layers[i].getSaida();
        }
    }

    private void aplicarCorrecoes() {
        int i, j, k;

        for (i = 0; i < layers.length; i++) {
            for (j = 0; j < layers[i].getTamanho(); j++) {
                Neuron n = layers[i].getNeuronio(j);

                for (k = 0; k < n.getTamanho(); k++) {
                    n.corrigirPeso(k, layers[i].getNeuronio(j).getDeltaw(k));
                }
                n.corrigirBias(layers[i].getNeuronio(j).getDeltaBias());
            }
        }
    }

    private double computarErroFinal(double[] entrada, double[] saidaDesejada) {
        processar(entrada);

        double erro = 0;

        Layer l = layers[lastLayer];

        int tamanho = l.getTamanho();

        for (int i = 0; i < tamanho; i++) {
            erro = (saidaDesejada[i] - l.getSaida(i));
        }
        if (erro < 0) {
            return erro * (-1);
        } else {
            return erro;
        }
    }
}
