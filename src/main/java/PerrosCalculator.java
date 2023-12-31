import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David Leon
 */
public class PerrosCalculator extends javax.swing.JFrame {

    /**
     * Creates new form PerrosCalculator
     */
    public PerrosCalculator() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void calcularCostoTotal(){
        try {
            int cantGrandes = Integer.parseInt(textFieldGrandes.getText());
            int cantMedianos = Integer.parseInt(textFieldMedianos.getText());
            int cantPequeños = Integer.parseInt(textFieldPequeños.getText());
            int horas = Integer.parseInt(textFieldHoras.getText());
            int costoTotal = (cantGrandes * 10000) + (cantMedianos * 5000)+ (cantPequeños * 3000);
           
            if (cantGrandes + cantMedianos + cantPequeños > 2){
                costoTotal = (int) (costoTotal * 0.9);
            }
            
            costoTotal *= horas;
            
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese solo valor numerico", "Ingrese nuevamente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        labelGrandes = new javax.swing.JLabel();
        labelMedianos = new javax.swing.JLabel();
        labelPequeños = new javax.swing.JLabel();
        labelHoras = new javax.swing.JLabel();
        textFieldGrandes = new javax.swing.JTextField();
        textFieldPequeños = new javax.swing.JTextField();
        textFieldMedianos = new javax.swing.JTextField();
        textFieldHoras = new javax.swing.JTextField();
        JButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelGrandes.setText("Cantidad de perros grandes:");

        labelMedianos.setText("Cantidad de perros medianos:");

        labelPequeños.setText("Cantidad de perros pequeños:");

        labelHoras.setText("Cantidad de horas:");

        textFieldGrandes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldGrandes.setToolTipText("");
        textFieldGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldGrandesActionPerformed(evt);
            }
        });

        textFieldPequeños.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        textFieldMedianos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldMedianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMedianosActionPerformed(evt);
            }
        });

        textFieldHoras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHorasActionPerformed(evt);
            }
        });

        JButton.setBackground(new java.awt.Color(0, 255, 0));
        JButton.setForeground(new java.awt.Color(0, 0, 0));
        JButton.setText("Calcular");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan David Leon\\Downloads\\young-man-dog-walker-free-vector.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(JButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelGrandes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHoras)
                                    .addComponent(labelMedianos))
                                .addComponent(labelPequeños))
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldPequeños, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textFieldMedianos, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelGrandes)
                                    .addComponent(textFieldGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMedianos)
                                    .addComponent(textFieldMedianos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPequeños)
                                    .addComponent(textFieldPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelHoras))
                            .addComponent(textFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(JButton)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldGrandesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldGrandesActionPerformed

    private void textFieldMedianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMedianosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMedianosActionPerformed

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
            
            calcularCostoTotal();
            
            int cantGrandes = Integer.parseInt(textFieldGrandes.getText());
            int cantMedianos = Integer.parseInt(textFieldMedianos.getText());
            int cantPequeños = Integer.parseInt(textFieldPequeños.getText());
            int horas = Integer.parseInt(textFieldHoras.getText());
            double costoTotal = (cantGrandes * 10000) + (cantMedianos * 5000)+ (cantPequeños * 3000);
            
            if (cantGrandes + cantMedianos + cantPequeños > 2){
                costoTotal = (int) (costoTotal * 0.9);
            }
        
        JOptionPane.showMessageDialog(this, "El costo total es: $" + costoTotal, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JButtonActionPerformed

    private void textFieldHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHorasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerrosCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerrosCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerrosCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerrosCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PerrosCalculator calculator = new PerrosCalculator();
                calculator.setTitle("Calculadora de Paseo de Perros");
                calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                calculator.setLocationRelativeTo(null);
                calculator.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelGrandes;
    private javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelMedianos;
    private javax.swing.JLabel labelPequeños;
    private javax.swing.JTextField textFieldGrandes;
    private javax.swing.JTextField textFieldHoras;
    private javax.swing.JTextField textFieldMedianos;
    private javax.swing.JTextField textFieldPequeños;
    // End of variables declaration//GEN-END:variables
}
