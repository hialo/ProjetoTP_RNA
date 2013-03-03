package UI;

import Persistence.STDNetwork;
import Service.Parameters;
import Service.DataManipulation;
import Service.Training;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Treinamento extends javax.swing.JFrame {

    public Treinamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botao_treinar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botao_usarRede = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        text_numero_epocas = new javax.swing.JTextField();
        text_taxa_aprendizado = new javax.swing.JTextField();
        text_momento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_funcao = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD'DST - Treinamento");
        setResizable(false);

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Treinamento");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Taxa de Aprendizado:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Momento:");

        botao_treinar.setBackground(new java.awt.Color(153, 180, 209));
        botao_treinar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botao_treinar.setText("Treinar");
        botao_treinar.setToolTipText("Inicia o treinamento da rede");
        botao_treinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_treinarActionPerformed(evt);
            }
        });

        botao_usarRede.setBackground(new java.awt.Color(255, 0, 0));
        botao_usarRede.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botao_usarRede.setText("Usar rede");
        botao_usarRede.setToolTipText("Utilizar a rede após treina-la");
        botao_usarRede.setEnabled(false);
        botao_usarRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_usarRedeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Erro minimo               :");

        text_numero_epocas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        text_numero_epocas.setText("0.002");

        text_taxa_aprendizado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        text_taxa_aprendizado.setText("0.005");

        text_momento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        text_momento.setText("0.995");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Função");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Para usar a rede é necessário treina-la primeiro!");

        combo_funcao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combo_funcao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sigmóide", "Tangente Hiperbólica" }));
        combo_funcao.setToolTipText("Função de transferência");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_taxa_aprendizado, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(text_numero_epocas, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(combo_funcao, 0, 1, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text_momento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(botao_treinar)
                                .addComponent(botao_usarRede)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(text_taxa_aprendizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_momento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_numero_epocas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(botao_treinar))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_usarRede)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_usarRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_usarRedeActionPerformed
        this.dispose();
        new RedeNeural().setVisible(true);
    }//GEN-LAST:event_botao_usarRedeActionPerformed

    private void botao_treinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_treinarActionPerformed
        
        double learningRate = Double.parseDouble (text_taxa_aprendizado.getText());
        double moment = Double.parseDouble (text_momento.getText());
        double minimumError = Double.parseDouble(text_numero_epocas.getText());
        
        if (learningRate < 0 || learningRate > 1 || moment < 0 || moment > 1 || minimumError < 0) {
            JOptionPane.showMessageDialog(null, "Entradas inválidas.", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
        else {
            Training.training_network (combo_funcao.getSelectedIndex(), learningRate, moment, minimumError);

            botao_usarRede.setEnabled(true);
            botao_treinar.setEnabled(false);
        }
    }//GEN-LAST:event_botao_treinarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_treinar;
    private javax.swing.JButton botao_usarRede;
    private javax.swing.JComboBox combo_funcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField text_momento;
    private javax.swing.JTextField text_numero_epocas;
    private javax.swing.JTextField text_taxa_aprendizado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

       
        /*new STDNetwork(combo_funcao.getSelectedIndex());


        if (text_momento.getText().isEmpty() || text_taxa_aprendizado.getText().isEmpty() || text_numero_epocas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha os dados!");
        } else if (Double.parseDouble(text_taxa_aprendizado.getText()) < 0
                || Double.parseDouble(text_taxa_aprendizado.getText()) > 1
                || Double.parseDouble(text_momento.getText()) < 0
                || Double.parseDouble(text_momento.getText()) > 1
                || Double.parseDouble(text_numero_epocas.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Entradas invalidas.");
        } else {
            //criando o arquivo
            String nome_arquivo = "treinamento_" + text_taxa_aprendizado.getText() + "_" + text_momento.getText() + "_" + text_numero_epocas.getText() + ".txt";
            //cria o diretório
            File dir = new File("C:\\MLP");
            if (!dir.exists()) {
                dir.mkdir();
            }
            //cria o arquivo
            File arq = new File(dir, nome_arquivo);
            if (!arq.exists()) {
                try {
                    arq.createNewFile();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, e.toString());
                }
            }

            STDNetwork.dst.setEta(Double.parseDouble(text_taxa_aprendizado.getText()));
            STDNetwork.dst.setAlpha(Double.parseDouble(text_momento.getText()));

            int epocas = 0;
            double erro = 0;
            double aux = 9999;
            //JOptionPane.showMessageDialog(this, "Treinando rede...");

            while (aux > Double.parseDouble((text_numero_epocas.getText()))) {
                
                for (int j = 0; j < Parameters.test_inputs.length; j++) {
                    erro += STDNetwork.dst.treinar(Parameters.test_inputs[j], Parameters.expected_outputs[j]);
                }
                erro = erro / Parameters.test_inputs.length;
                //escreve no arquivo
                if (epocas == 0) {
                    try {
                        DataManipulation.escrever(dir, arq, epocas + 1 + " " + erro, false);
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, e.toString());
                    }
                } else {
                    try {
                        DataManipulation.escrever(dir, arq, epocas + 1 + " " + erro, true);
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, e.toString());
                    }
                }
                //atualiza a época
                epocas++;
                //zera o erro para a proxima época
                aux = erro;
                erro = 0;
            }

            JOptionPane.showMessageDialog(this, "Rede Treinada!\nÉpocas: " + epocas);*/