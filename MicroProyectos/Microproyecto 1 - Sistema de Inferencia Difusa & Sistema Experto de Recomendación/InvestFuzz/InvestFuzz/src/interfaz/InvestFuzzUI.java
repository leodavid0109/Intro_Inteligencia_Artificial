package interfaz;

import javax.swing.JOptionPane;
import investfuzz.InvestFuzz;

public class InvestFuzzUI extends javax.swing.JFrame {
    private InvestFuzz resultados = new InvestFuzz();

    public InvestFuzzUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BannerLabel = new javax.swing.JLabel();
        InstruccionesLabel = new javax.swing.JLabel();
        RentabilidadLabel = new javax.swing.JLabel();
        PlazoLabel = new javax.swing.JLabel();
        RiesgoLabel = new javax.swing.JLabel();
        GenerarButton = new javax.swing.JButton();
        PlazoTextField = new javax.swing.JTextField();
        RiesgoTextField = new javax.swing.JTextField();
        RentabilidadTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultadosTextArea = new javax.swing.JTextArea();
        IconLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 36, 43));
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 800));

        jPanel2.setBackground(new java.awt.Color(33, 36, 43));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Generar Portafolio de Inversión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        BannerLabel.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BannerLabel.setForeground(new java.awt.Color(255, 255, 255));
        BannerLabel.setText("PORTAFOLIO DE INVERSIÓN");

        InstruccionesLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        InstruccionesLabel.setForeground(new java.awt.Color(204, 204, 204));
        InstruccionesLabel.setText("<html> <b>Instrucciones de uso:</b><br><br>Ingrese los valores para generar un portafolio de inversión acorde a sus preferencias:<br> - Riesgo (0-1): Nivel de riesgo soportado para la inversión<br> - Rentabilidad (0-100 %): Porcentaje de rentabilidad esperado en las inversiones<br> - Plazo (1-10 Años): Tiempo de espera para retorno inversión<br><br></html>");

        RentabilidadLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        RentabilidadLabel.setForeground(new java.awt.Color(51, 153, 255));
        RentabilidadLabel.setText("Rentabilidad:");

        PlazoLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        PlazoLabel.setForeground(new java.awt.Color(0, 153, 255));
        PlazoLabel.setText("Plazo:");

        RiesgoLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        RiesgoLabel.setForeground(new java.awt.Color(0, 153, 255));
        RiesgoLabel.setText("Riesgo:");

        GenerarButton.setBackground(new java.awt.Color(0, 153, 255));
        GenerarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        GenerarButton.setForeground(new java.awt.Color(255, 255, 255));
        GenerarButton.setText("Generar");
        GenerarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarButtonActionPerformed(evt);
            }
        });

        PlazoTextField.setBackground(new java.awt.Color(33, 36, 43));
        PlazoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PlazoTextField.setForeground(new java.awt.Color(255, 255, 255));
        PlazoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PlazoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PlazoTextFieldKeyTyped(evt);
            }
        });

        RiesgoTextField.setBackground(new java.awt.Color(33, 36, 43));
        RiesgoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RiesgoTextField.setForeground(new java.awt.Color(255, 255, 255));
        RiesgoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RiesgoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RiesgoTextFieldKeyTyped(evt);
            }
        });

        RentabilidadTextField.setBackground(new java.awt.Color(33, 36, 43));
        RentabilidadTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RentabilidadTextField.setForeground(new java.awt.Color(255, 255, 255));
        RentabilidadTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RentabilidadTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RentabilidadTextFieldKeyTyped(evt);
            }
        });

        ResultadosTextArea.setEditable(false);
        ResultadosTextArea.setBackground(new java.awt.Color(33, 36, 43));
        ResultadosTextArea.setColumns(20);
        ResultadosTextArea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ResultadosTextArea.setForeground(new java.awt.Color(255, 255, 255));
        ResultadosTextArea.setRows(5);
        jScrollPane1.setViewportView(ResultadosTextArea);

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InstruccionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BannerLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RentabilidadLabel)
                                    .addComponent(RiesgoLabel)
                                    .addComponent(PlazoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlazoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RiesgoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(RentabilidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(GenerarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(IconLabel)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InstruccionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RiesgoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RiesgoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RentabilidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RentabilidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(GenerarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlazoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlazoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(IconLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarButtonActionPerformed
        try {
            double riesgo = Double.parseDouble(RiesgoTextField.getText().replace(",", "."));
            double rentabilidad = Double.parseDouble(RentabilidadTextField.getText().replace(",", "."));
            double plazo = Double.parseDouble(PlazoTextField.getText().replace(",", "."));
            
            if (riesgo < 0 || riesgo > 1) {
                JOptionPane.showMessageDialog(rootPane, "El riesgo de la inversión debe estar entre 0 y 1");
                return;
            }
            if (rentabilidad < 0 || rentabilidad > 100) {
                JOptionPane.showMessageDialog(rootPane, "El porcentaje de rentabilidad esperado de la inversión debe estar entre 0 y 100");
                return;
            }
            if (plazo < 1 || plazo > 10) {
                JOptionPane.showMessageDialog(rootPane, "El plazo de la inversión debe estar entre 1 y 10");
                return;
            }
            
            ResultadosTextArea.setText(resultados.evaluarPortafolioInversion(riesgo, rentabilidad, plazo));
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos con valores numéricos válidos");
        }
    }//GEN-LAST:event_GenerarButtonActionPerformed

    private void RiesgoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RiesgoTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_RiesgoTextFieldKeyTyped

    private void RentabilidadTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RentabilidadTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_RentabilidadTextFieldKeyTyped

    private void PlazoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlazoTextFieldKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_PlazoTextFieldKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvestFuzzUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvestFuzzUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvestFuzzUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvestFuzzUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InvestFuzzUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JButton GenerarButton;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel InstruccionesLabel;
    private javax.swing.JLabel PlazoLabel;
    private javax.swing.JTextField PlazoTextField;
    private javax.swing.JLabel RentabilidadLabel;
    private javax.swing.JTextField RentabilidadTextField;
    private javax.swing.JTextArea ResultadosTextArea;
    private javax.swing.JLabel RiesgoLabel;
    private javax.swing.JTextField RiesgoTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
