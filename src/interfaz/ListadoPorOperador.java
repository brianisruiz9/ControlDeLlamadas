/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;

/**
 *
 * @author Esmeralda
 */
public class ListadoPorOperador extends javax.swing.JDialog {

    /**
     * Creates new form ListadoPorOperador
     */
    String ruta;
    
    public ListadoPorOperador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/llamadas.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbOperador = new javax.swing.JComboBox<String>();
        jPanel11 = new javax.swing.JPanel();
        cmdListar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTablaPrincipal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 4));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos principales:", 0, 0, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Operador:");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmbOperador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbOperador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tigo", "Claro", "Movistar", "Avantel", "Virgin", "Fijo Nacional", "Internacional" }));
        cmbOperador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbOperador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOperadorItemStateChanged(evt);
            }
        });
        cmbOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperadorActionPerformed(evt);
            }
        });
        jPanel10.add(cmbOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 300, 80));

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones\n", 0, 0, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdListar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdListar.setText("Listar");
        cmdListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListarActionPerformed(evt);
            }
        });
        jPanel11.add(cmdListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 30));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 170, 80));

        jPanel12.setBackground(new java.awt.Color(255, 255, 153));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Llamadas:", 0, 0, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tblTablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Codigo", "Operador", "Cantidad de minutos", "Valor", "Nacional", "Internacional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaPrincipal.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane4.setViewportView(tblTablaPrincipal);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 310));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 700, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\ControlDeLlamadas-master\\src\\imagenes\\420854_1108_1.jpg")); // NOI18N
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(746, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperadorActionPerformed

    private void cmdListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListarActionPerformed
        String operador = cmbOperador.getSelectedItem().toString();
        Helper.listadoPorOperador(tblTablaPrincipal, ruta, operador);
    }//GEN-LAST:event_cmdListarActionPerformed

    private void cmbOperadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOperadorItemStateChanged
        String operador = cmbOperador.getSelectedItem().toString();
        Helper.listadoPorOperador(tblTablaPrincipal, ruta, operador);
    }//GEN-LAST:event_cmbOperadorItemStateChanged

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
            java.util.logging.Logger.getLogger(ListadoPorOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoPorOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoPorOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoPorOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoPorOperador dialog = new ListadoPorOperador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperador;
    private javax.swing.JButton cmdListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblTablaPrincipal;
    // End of variables declaration//GEN-END:variables
}
