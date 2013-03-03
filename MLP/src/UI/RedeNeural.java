
package UI;

import Model.MLP;
import Persistence.STDNetwork;
import javax.swing.JOptionPane;

public class RedeNeural extends javax.swing.JFrame {

    public RedeNeural() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_sintomas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sintoma_ferida = new javax.swing.JCheckBox();
        sintoma_caroco = new javax.swing.JCheckBox();
        sintoma_mancha = new javax.swing.JCheckBox();
        sintoma_queda = new javax.swing.JCheckBox();
        sintoma_bolha = new javax.swing.JCheckBox();
        sintoma_coceira = new javax.swing.JCheckBox();
        sintoma_febre = new javax.swing.JCheckBox();
        sintoma_malEstar = new javax.swing.JCheckBox();
        sintoma_verrugas = new javax.swing.JCheckBox();
        sintoma_dorSexo = new javax.swing.JCheckBox();
        sintoma_dorUrinar = new javax.swing.JCheckBox();
        sintoma_sangramento = new javax.swing.JCheckBox();
        sintoma_pus = new javax.swing.JCheckBox();
        sintoma_desconforto = new javax.swing.JCheckBox();
        sintoma_ardor = new javax.swing.JCheckBox();
        botao_limpar = new javax.swing.JButton();
        botao_processar = new javax.swing.JButton();
        painel_resultados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botao_sair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        painel_resultado = new javax.swing.JPanel();
        texto_resultado = new javax.swing.JTextField();
        resultado_sifilis = new javax.swing.JFormattedTextField();
        resultado_herpes = new javax.swing.JFormattedTextField();
        resultado_hpv = new javax.swing.JFormattedTextField();
        resultado_gonorreia = new javax.swing.JFormattedTextField();
        resultado_cancro = new javax.swing.JFormattedTextField();
        resultado_dip = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        unb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD'DST");
        setResizable(false);

        painel_sintomas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Sintomas");

        sintoma_ferida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_ferida.setText("Ferida nos orgãos sexuais");

        sintoma_caroco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_caroco.setText("Caroços na virilha");

        sintoma_mancha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_mancha.setText("Manchas em várias partes do corpo ");

        sintoma_queda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_queda.setText("Queda dos cabelos ");

        sintoma_bolha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_bolha.setText("Bolhas na região genital ");

        sintoma_coceira.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_coceira.setText("Coceira ");

        sintoma_febre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_febre.setText("Febre ");

        sintoma_malEstar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_malEstar.setText("Mal Estar ");

        sintoma_verrugas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_verrugas.setText("Verrugas ");

        sintoma_dorSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_dorSexo.setText("Dor na relação sexual ");

        sintoma_dorUrinar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_dorUrinar.setText("Dor ao urinar ");

        sintoma_sangramento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_sangramento.setText("Sangramento fora da menstruação ");

        sintoma_pus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_pus.setText("Pus ");

        sintoma_desconforto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_desconforto.setText("Desconforto abdominal ");

        sintoma_ardor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sintoma_ardor.setText("Ardor ");

        botao_limpar.setBackground(new java.awt.Color(255, 255, 102));
        botao_limpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botao_limpar.setText("Limpar");
        botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limparActionPerformed(evt);
            }
        });

        botao_processar.setBackground(new java.awt.Color(0, 204, 51));
        botao_processar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botao_processar.setForeground(new java.awt.Color(255, 255, 255));
        botao_processar.setText("Processar");
        botao_processar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_processarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_sintomasLayout = new javax.swing.GroupLayout(painel_sintomas);
        painel_sintomas.setLayout(painel_sintomasLayout);
        painel_sintomasLayout.setHorizontalGroup(
            painel_sintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_sintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_sintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_sintomasLayout.createSequentialGroup()
                        .addComponent(botao_limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_processar))
                    .addGroup(painel_sintomasLayout.createSequentialGroup()
                        .addGroup(painel_sintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sintoma_ferida)
                            .addComponent(jLabel1)
                            .addComponent(sintoma_caroco)
                            .addComponent(sintoma_mancha)
                            .addComponent(sintoma_queda)
                            .addComponent(sintoma_bolha)
                            .addComponent(sintoma_coceira)
                            .addComponent(sintoma_febre)
                            .addComponent(sintoma_malEstar)
                            .addComponent(sintoma_verrugas)
                            .addComponent(sintoma_dorSexo)
                            .addComponent(sintoma_dorUrinar)
                            .addComponent(sintoma_sangramento)
                            .addComponent(sintoma_pus)
                            .addComponent(sintoma_desconforto)
                            .addComponent(sintoma_ardor))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_sintomasLayout.setVerticalGroup(
            painel_sintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_sintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_ferida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_caroco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_mancha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_queda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_bolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_coceira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_febre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_malEstar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_verrugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_dorSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_dorUrinar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_sangramento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_pus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_desconforto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sintoma_ardor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_sintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_limpar)
                    .addComponent(botao_processar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_resultados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Resultados");

        botao_sair.setBackground(new java.awt.Color(255, 51, 51));
        botao_sair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botao_sair.setForeground(new java.awt.Color(255, 255, 255));
        botao_sair.setText("Sair");
        botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Sifilis");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Herpes");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("HPV");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Gonorréia");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Cancro mole");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("DIP");

        painel_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Doença"));

        texto_resultado.setEditable(false);
        texto_resultado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        texto_resultado.setForeground(new java.awt.Color(255, 0, 0));
        texto_resultado.setText("Nenhuma");

        javax.swing.GroupLayout painel_resultadoLayout = new javax.swing.GroupLayout(painel_resultado);
        painel_resultado.setLayout(painel_resultadoLayout);
        painel_resultadoLayout.setHorizontalGroup(
            painel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        painel_resultadoLayout.setVerticalGroup(
            painel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        resultado_sifilis.setEditable(false);
        resultado_sifilis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));

        resultado_herpes.setEditable(false);
        resultado_herpes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));

        resultado_hpv.setEditable(false);
        resultado_hpv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));

        resultado_gonorreia.setEditable(false);
        resultado_gonorreia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));

        resultado_cancro.setEditable(false);
        resultado_cancro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));

        resultado_dip.setEditable(false);
        resultado_dip.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));

        javax.swing.GroupLayout painel_resultadosLayout = new javax.swing.GroupLayout(painel_resultados);
        painel_resultados.setLayout(painel_resultadosLayout);
        painel_resultadosLayout.setHorizontalGroup(
            painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_resultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_resultadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_resultadosLayout.createSequentialGroup()
                        .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_resultadosLayout.createSequentialGroup()
                                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_resultadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(resultado_dip, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(resultado_cancro, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(resultado_gonorreia, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(resultado_hpv, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(resultado_herpes, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(painel_resultadosLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(resultado_sifilis))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_resultadosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botao_sair))
                            .addComponent(painel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        painel_resultadosLayout.setVerticalGroup(
            painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_resultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resultado_sifilis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(resultado_herpes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resultado_hpv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resultado_gonorreia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(resultado_cancro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(resultado_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_sair)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel9.setText("SD'DST - Rede neural");

        unb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        unb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/images.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painel_sintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painel_resultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(unb)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(unb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel_sintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sairActionPerformed
        JOptionPane.showMessageDialog(this, "Obrigado por utilizar o SD'DST!");
        System.exit(0);
    }//GEN-LAST:event_botao_sairActionPerformed

    private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limparActionPerformed
        sintoma_ardor.setSelected(false);
        sintoma_bolha.setSelected(false);
        sintoma_caroco.setSelected(false);
        sintoma_coceira.setSelected(false);
        sintoma_desconforto.setSelected(false);
        sintoma_dorSexo.setSelected(false);
        sintoma_dorUrinar.setSelected(false);
        sintoma_febre.setSelected(false);
        sintoma_ferida.setSelected(false);
        sintoma_malEstar.setSelected(false);
        sintoma_mancha.setSelected(false);
        sintoma_pus.setSelected(false);
        sintoma_queda.setSelected(false);
        sintoma_sangramento.setSelected(false);
        sintoma_verrugas.setSelected(false);
        
        resultado_cancro.setText("");
        resultado_dip.setText("");
        resultado_gonorreia.setText("");
        resultado_herpes.setText("");
        resultado_hpv.setText("");
        resultado_sifilis.setText("");
        
        texto_resultado.setText("Nenhuma");
    }//GEN-LAST:event_botao_limparActionPerformed

    private void botao_processarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_processarActionPerformed

        STDNetwork.dst.processar(getEntrada());
        processarSaida(STDNetwork.dst);
    }//GEN-LAST:event_botao_processarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_limpar;
    private javax.swing.JButton botao_processar;
    private javax.swing.JButton botao_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painel_resultado;
    private javax.swing.JPanel painel_resultados;
    private javax.swing.JPanel painel_sintomas;
    private javax.swing.JFormattedTextField resultado_cancro;
    private javax.swing.JFormattedTextField resultado_dip;
    private javax.swing.JFormattedTextField resultado_gonorreia;
    private javax.swing.JFormattedTextField resultado_herpes;
    private javax.swing.JFormattedTextField resultado_hpv;
    private javax.swing.JFormattedTextField resultado_sifilis;
    private javax.swing.JCheckBox sintoma_ardor;
    private javax.swing.JCheckBox sintoma_bolha;
    private javax.swing.JCheckBox sintoma_caroco;
    private javax.swing.JCheckBox sintoma_coceira;
    private javax.swing.JCheckBox sintoma_desconforto;
    private javax.swing.JCheckBox sintoma_dorSexo;
    private javax.swing.JCheckBox sintoma_dorUrinar;
    private javax.swing.JCheckBox sintoma_febre;
    private javax.swing.JCheckBox sintoma_ferida;
    private javax.swing.JCheckBox sintoma_malEstar;
    private javax.swing.JCheckBox sintoma_mancha;
    private javax.swing.JCheckBox sintoma_pus;
    private javax.swing.JCheckBox sintoma_queda;
    private javax.swing.JCheckBox sintoma_sangramento;
    private javax.swing.JCheckBox sintoma_verrugas;
    private javax.swing.JTextField texto_resultado;
    private javax.swing.JLabel unb;
    // End of variables declaration//GEN-END:variables

    private double[] getEntrada() {
        double[] entrada = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (sintoma_ferida.isSelected()) {
            entrada[0] = 1;
        }
        if (sintoma_caroco.isSelected()) {
            entrada[1] = 1;
        }
        if (sintoma_mancha.isSelected()) {
            entrada[2] = 1;
        }
        if (sintoma_queda.isSelected()) {
            entrada[3] = 1;
        }
        if (sintoma_bolha.isSelected()) {
            entrada[4] = 1;
        }
        if (sintoma_coceira.isSelected()) {
            entrada[5] = 1;
        }
        if (sintoma_febre.isSelected()) {
            entrada[6] = 1;
        }
        if (sintoma_malEstar.isSelected()) {
            entrada[7] = 1;
        }
        if (sintoma_verrugas.isSelected()) {
            entrada[8] = 1;
        }
        if (sintoma_dorSexo.isSelected()) {
            entrada[9] = 1;
        }
        if (sintoma_dorUrinar.isSelected()) {
            entrada[10] = 1;
        }
        if (sintoma_sangramento.isSelected()) {
            entrada[11] = 1;
        }
        if (sintoma_pus.isSelected()) {
            entrada[12] = 1;
        }
        if (sintoma_desconforto.isSelected()) {
            entrada[13] = 1;
        }
        if (sintoma_ardor.isSelected()) {
            entrada[14] = 1;
        }
        return entrada;
    }

    private void processarSaida(MLP m) {
        resultado_cancro.setValue(m.getSaida(4));
        resultado_dip.setValue(m.getSaida(5));
        resultado_gonorreia.setValue(m.getSaida(3));
        resultado_herpes.setValue(m.getSaida(1));
        resultado_hpv.setValue(m.getSaida(2));
        resultado_sifilis.setValue(m.getSaida(0));

        switch (maiorValor(m)) {
            case 0:
                texto_resultado.setText("Sifilis");
                break;
            case 1:
                texto_resultado.setText("Herpes");
                break;
            case 2:
                texto_resultado.setText("HPV");
                break;
            case 3:
                texto_resultado.setText("Gonorréia");
                break;
            case 4:
                texto_resultado.setText("Cancro Mole");
                break;
            case 5:
                texto_resultado.setText("DIP");
                break;
            default:
                texto_resultado.setText("Houston, we have a problem.");
                break;
        }
    }

    private int maiorValor(MLP m) {
        int maiorValor = 0;
        double aux = 0;
        for (int i = 0; i < m.getTamanhoDaSaida(); i++) {
            if (m.getSaida(i) > aux) {
                aux = m.getSaida(i);
                maiorValor = i;
            }
        }
        return maiorValor;
    }
}
