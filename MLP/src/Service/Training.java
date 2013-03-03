package Service;

import UI.Treinamento;
import Persistence.STDNetwork;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Training {

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

        STDNetwork.dst.setEta(learningRate);
        STDNetwork.dst.setAlpha(moment);

        int cycles = 0;
        double error = 0;
        double aux = 9999;

        while (aux > minimumError) {

            for (int j = 0; j < Parameters.test_inputs.length; j++) {
                error += STDNetwork.dst.treinar(Parameters.test_inputs[j], Parameters.expected_outputs[j]);
            }
            error = error / Parameters.test_inputs.length;

            if (cycles == 0) {
                try {
                    DataManipulation.escrever(dir, arq, cycles + 1 + " " + error, false);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    DataManipulation.escrever(dir, arq, cycles + 1 + " " + error, true);
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
