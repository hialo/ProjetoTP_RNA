package Service;

import UI.Treinamento;
import Persistence.STDNetwork;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

    /**
    * File: Training.java <br>
    * Purpose: This class realizes the execution of the network, training it and make it able to be used.<br>
    * @author Hialo
    * @version 1.0 
    */

public class Training {

    /** This function realizes the execution of the network, making it able to use.
     * 
     * @param function The function used to the training.
     * @param learningRate The learning rate used for the training
     * @param moment The moment used for the training.
     * @param minimumError The minimum error used for the training.
     */
    
    public static void training_network(int function, double learningRate, double moment, double minimumError) {

        new STDNetwork(function);

        String filename = "training_" + learningRate + "_" + moment + "_" + "_" + minimumError + ".txt";
        File dir = new File("C:\\MLP");

        if (!dir.exists()) {
            dir.mkdir();
        }

        File arq = new File(dir, filename);
        if (!arq.exists()) {
            try {
                arq.createNewFile();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        STDNetwork.dst.setLearningRate(learningRate);
        STDNetwork.dst.setMoment(moment);

        int cycles = 0;
        double error = 0;
        double aux = 9999;

        while (aux > minimumError) {

            for (int j = 0; j < Parameters.test_inputs.length; j++) {
                error += STDNetwork.dst.training(Parameters.test_inputs[j], Parameters.expected_outputs[j]);
            }
            error = error / Parameters.test_inputs.length;

            if (cycles == 0) {
                try {
                    DataManipulation.write(dir, arq, cycles + 1 + " " + error, false);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    DataManipulation.write(dir, arq, cycles + 1 + " " + error, true);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            cycles++;
            aux = error;
            error = 0;
        }
        JOptionPane.showMessageDialog(null, "Rede treinada!\nÉpocas: " + cycles,
                "Treinamento da rede concluido", JOptionPane.INFORMATION_MESSAGE);
    }
}
