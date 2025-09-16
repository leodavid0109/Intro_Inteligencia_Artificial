package interfaz;

import javax.swing.JOptionPane;
import fis_horno_repostero_ldvd.FIS_Horno_Repostero_LDVD;

public class FIS_Horno_Repostero_UI extends javax.swing.JFrame {
    private final FIS_Horno_Repostero_LDVD resultados = new FIS_Horno_Repostero_LDVD();

    public FIS_Horno_Repostero_UI() {
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
        IntensidadMarronLabel = new javax.swing.JLabel();
        VolumenPostreLabel = new javax.swing.JLabel();
        HumedadHornoLabel = new javax.swing.JLabel();
        GenerarButton = new javax.swing.JButton();
        VolumenPostreTextField = new javax.swing.JTextField();
        HumedadHornoTextField = new javax.swing.JTextField();
        IntensidadMarronTextField = new javax.swing.JTextField();
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Temperatura Horno Repostero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        BannerLabel.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        BannerLabel.setForeground(new java.awt.Color(255, 255, 255));
        BannerLabel.setText("TEMPERATURA HORNO REPOSTERO");

        InstruccionesLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        InstruccionesLabel.setForeground(new java.awt.Color(204, 204, 204));
        InstruccionesLabel.setText("<html> <b>Instrucciones de uso:</b><br><br>Ingrese los valores para determinar la temperatura ideal de su horno:<br> - Humedad del Horno (0-10): Nivel de humedad del horno<br> - Intensidad del Marron (0-10): Nivel de intensidad de marrón del postre<br> - Volumen del Postre (1-10): Nivel de volumen del postre<br><br></html>");

        IntensidadMarronLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        IntensidadMarronLabel.setForeground(new java.awt.Color(51, 153, 255));
        IntensidadMarronLabel.setText("Intensidad del Marron:");

        VolumenPostreLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        VolumenPostreLabel.setForeground(new java.awt.Color(0, 153, 255));
        VolumenPostreLabel.setText("Volumen del Postre:");

        HumedadHornoLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        HumedadHornoLabel.setForeground(new java.awt.Color(0, 153, 255));
        HumedadHornoLabel.setText("Humedad del Horno:");

        GenerarButton.setBackground(new java.awt.Color(0, 153, 255));
        GenerarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        GenerarButton.setForeground(new java.awt.Color(255, 255, 255));
        GenerarButton.setText("Generar");
        GenerarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarButtonActionPerformed(evt);
            }
        });

        VolumenPostreTextField.setBackground(new java.awt.Color(33, 36, 43));
        VolumenPostreTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VolumenPostreTextField.setForeground(new java.awt.Color(255, 255, 255));
        VolumenPostreTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VolumenPostreTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VolumenPostreTextFieldKeyTyped(evt);
            }
        });

        HumedadHornoTextField.setBackground(new java.awt.Color(33, 36, 43));
        HumedadHornoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HumedadHornoTextField.setForeground(new java.awt.Color(255, 255, 255));
        HumedadHornoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HumedadHornoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HumedadHornoTextFieldKeyTyped(evt);
            }
        });

        IntensidadMarronTextField.setBackground(new java.awt.Color(33, 36, 43));
        IntensidadMarronTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IntensidadMarronTextField.setForeground(new java.awt.Color(255, 255, 255));
        IntensidadMarronTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IntensidadMarronTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IntensidadMarronTextFieldKeyTyped(evt);
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
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BannerLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(InstruccionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GenerarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IntensidadMarronLabel)
                            .addComponent(HumedadHornoLabel)
                            .addComponent(VolumenPostreLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HumedadHornoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IntensidadMarronTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VolumenPostreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IconLabel)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(InstruccionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HumedadHornoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumedadHornoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IntensidadMarronLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IntensidadMarronTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VolumenPostreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VolumenPostreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GenerarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarButtonActionPerformed
        try {
            double HumedadHorno = Double.parseDouble(HumedadHornoTextField.getText().replace(",", "."));
            double IntensidadMarron = Double.parseDouble(IntensidadMarronTextField.getText().replace(",", "."));
            double VolumenPostre = Double.parseDouble(VolumenPostreTextField.getText().replace(",", "."));
            
            if (HumedadHorno < 0 || HumedadHorno > 10) {
                JOptionPane.showMessageDialog(rootPane, "La humedad del horno debe estar entre 0 y 10");
                return;
            }
            if (IntensidadMarron < 0 || IntensidadMarron > 10) {
                JOptionPane.showMessageDialog(rootPane, "La intensidad de marron del postre debe estar entre 0 y 10");
                return;
            }
            if (VolumenPostre < 0 || VolumenPostre > 10) {
                JOptionPane.showMessageDialog(rootPane, "El volumen del postre debe estar entre 0 y 10");
                return;
            }
            
            ResultadosTextArea.setText(resultados.calcularTemperatura(HumedadHorno, IntensidadMarron, VolumenPostre));
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos con valores numéricos válidos");
        }
    }//GEN-LAST:event_GenerarButtonActionPerformed

    private void HumedadHornoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HumedadHornoTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_HumedadHornoTextFieldKeyTyped

    private void IntensidadMarronTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IntensidadMarronTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_IntensidadMarronTextFieldKeyTyped

    private void VolumenPostreTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VolumenPostreTextFieldKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_VolumenPostreTextFieldKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIS_Horno_Repostero_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FIS_Horno_Repostero_UI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JButton GenerarButton;
    private javax.swing.JLabel HumedadHornoLabel;
    private javax.swing.JTextField HumedadHornoTextField;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel InstruccionesLabel;
    private javax.swing.JLabel IntensidadMarronLabel;
    private javax.swing.JTextField IntensidadMarronTextField;
    private javax.swing.JTextArea ResultadosTextArea;
    private javax.swing.JLabel VolumenPostreLabel;
    private javax.swing.JTextField VolumenPostreTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
