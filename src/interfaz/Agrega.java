/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.LLamada;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author aolivero11
 */
public class Agrega extends javax.swing.JDialog {

    /**
     * Creates new form Agrega
     */
    String ruta;
    LLamada l;
    ObjectOutputStream salida;
    LinkedList<LLamada> llamadas;
    int aux = 0;
    TableRowSorter trsFiltro;

    public Agrega(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        JButton botonesH[] = {cmdBuscar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar2, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        ruta = "src/datos/llamadas.txt";
        try {
            llamadas = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, llamadas);
        Helper.llenarTabla(tblTablaPrincipal, ruta);
    }

    public void filtro() {
        int columnaABuscar = 0;
        if (cmbBuscador.getSelectedItem() == "Codigo") {
            columnaABuscar = 1;
        }
        if (cmbBuscador.getSelectedItem() == "Operador") {
            columnaABuscar = 2;
        }
        if (cmbBuscador.getSelectedItem() == "Minutos") {
            columnaABuscar = 3;
        }
        if (cmbBuscador.getSelectedItem() == "Valor") {
            columnaABuscar = 4;
        }
        if (cmbBuscador.getSelectedItem() == "Nacional") {
            columnaABuscar = 5;
        }
        if (cmbBuscador.getSelectedItem() == "Internacional") {
            columnaABuscar = 6;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbNacional = new javax.swing.ButtonGroup();
        rbInternacional = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        cmdEliminar2 = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTablaPrincipal = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCMinutos2 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        cmbOperador = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtInternacional = new javax.swing.JTextField();
        txtNacional = new javax.swing.JTextField();
        cbNacional = new javax.swing.JCheckBox();
        cbInternal = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cmbBuscador = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        cbBuscar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR LLAMADAS");

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 4));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdEliminar2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdEliminar2.setText("Eliminar");
        cmdEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminar2ActionPerformed(evt);
            }
        });
        jPanel11.add(cmdEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 30));

        cmdCancelar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel11.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 30));

        cmdBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdBuscar.setText("Buscar Codigo");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel11.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 30));

        cmdGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel11.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 180, 210));

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Llamadas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
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
        tblTablaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblTablaPrincipal);
        if (tblTablaPrincipal.getColumnModel().getColumnCount() > 0) {
            tblTablaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblTablaPrincipal.getColumnModel().getColumn(0).setHeaderValue("No.");
            tblTablaPrincipal.getColumnModel().getColumn(1).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(1).setHeaderValue("Codigo");
            tblTablaPrincipal.getColumnModel().getColumn(2).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(2).setHeaderValue("Operador");
            tblTablaPrincipal.getColumnModel().getColumn(3).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(3).setHeaderValue("Cantidad de minutos");
            tblTablaPrincipal.getColumnModel().getColumn(4).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(4).setHeaderValue("Valor");
            tblTablaPrincipal.getColumnModel().getColumn(5).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(5).setHeaderValue("Nacional");
            tblTablaPrincipal.getColumnModel().getColumn(6).setResizable(false);
            tblTablaPrincipal.getColumnModel().getColumn(6).setHeaderValue("Internacional");
        }

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 310));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 700, 350));

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos principales:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad de minutos:");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Código:");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 20));

        txtCMinutos2.setEnabled(false);
        txtCMinutos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCMinutos2KeyTyped(evt);
            }
        });
        jPanel10.add(txtCMinutos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 80, 30));

        txtValor2.setEnabled(false);
        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor2KeyTyped(evt);
            }
        });
        jPanel10.add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 80, 30));

        cmbOperador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tigo", "Claro", "Movistar", "Avantel", "Virgin", "Fijo Nacional", "Internacional" }));
        cmbOperador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(cmbOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Valor de la llamada:");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel10.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Operador:");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txtInternacional.setText("No");
        txtInternacional.setEnabled(false);
        txtInternacional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInternacionalKeyTyped(evt);
            }
        });
        jPanel10.add(txtInternacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, 30));

        txtNacional.setText("No");
        txtNacional.setEnabled(false);
        txtNacional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNacionalKeyTyped(evt);
            }
        });
        jPanel10.add(txtNacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, 30));

        cbNacional.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbNacional.setText("Nacional:");
        cbNacional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbNacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNacionalActionPerformed(evt);
            }
        });
        jPanel10.add(cbNacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        cbInternal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbInternal.setText("Internacional:");
        cbInternal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInternalActionPerformed(evt);
            }
        });
        jPanel10.add(cbInternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 210));

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Buscar por:");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        cmbBuscador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbBuscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Operador", "Minutos", "Valor", "Nacional", "Internacional" }));
        cmbBuscador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbBuscador.setEnabled(false);
        jPanel13.add(cmbBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 130, -1));

        txtFiltro.setEnabled(false);
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        jPanel13.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 160, 30));

        cbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarActionPerformed(evt);
            }
        });
        jPanel13.add(cbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 700, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(759, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminar2ActionPerformed
        int i, op;
        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta llamada?", "Eliminar", JOptionPane.YES_NO_OPTION);

        LinkedList<LLamada> llamadas = Helper.traerDatos(ruta);
        if (op == JOptionPane.YES_OPTION) {
            i = tblTablaPrincipal.getSelectedRow();
            llamadas.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Agrega.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Agrega.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, llamadas);
            Helper.llenarTabla(tblTablaPrincipal, ruta);

            cmbOperador.setSelectedIndex(0);
            cmbOperador.setSelectedIndex(0);
            txtCodigo.setText("");
            txtCMinutos2.setText("");
            txtValor2.setText("");
            txtNacional.setText("No");
            txtInternacional.setText("No");
            txtCodigo.requestFocusInWindow();

            txtCMinutos2.setEnabled(false);
            txtValor2.setEnabled(false);
        }
        JButton botonesH[] = {cmdBuscar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar2, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdEliminar2ActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        cmbOperador.setSelectedIndex(0);
        cmbOperador.setSelectedIndex(0);
        txtCodigo.setText("");
        txtCMinutos2.setText("");
        txtValor2.setText("");
        txtNacional.setText("No");
        txtInternacional.setText("No");
        txtCodigo.requestFocusInWindow();

        txtCMinutos2.setEnabled(false);
        txtValor2.setEnabled(false);
        txtNacional.setEnabled(false);
        txtInternacional.setEnabled(false);

        JButton botonesH[] = {cmdBuscar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar2, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void tblTablaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaPrincipalMouseClicked
        int i;
        LLamada l;
        LinkedList<LLamada> personas = Helper.traerDatos(ruta);
        i = tblTablaPrincipal.getSelectedRow();

        l = personas.get(i);

        cmbOperador.setSelectedItem(l.getOperador());
        txtCodigo.setText(l.getCodigo());
        txtCMinutos2.setText(l.getCantidadm());
        txtValor2.setText(l.getValor());
        txtNacional.setText(l.getNacional());
        txtInternacional.setText(l.getInternacional());

        aux = 1;

        txtCMinutos2.setEnabled(true);
        txtValor2.setEnabled(true);

        JButton botonesH[] = {cmdEliminar2, cmdCancelar, cmdGuardar};
        JButton botonesD[] = {cmdBuscar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_tblTablaPrincipalMouseClicked

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tblTablaPrincipal.getModel());
        tblTablaPrincipal.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void txtCMinutos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCMinutos2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCMinutos2KeyTyped

    private void txtValor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtValor2KeyTyped

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        if (txtCodigo.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Dijite el codigo de la llamada!", 3);
            txtCodigo.requestFocusInWindow();
        } else {

            String codigo;
            codigo = txtCodigo.getText();
            LLamada l;

            if (Helper.buscarLlamadaCodigo(codigo, ruta)) {
                l = Helper.traerLlamadaCodigo(codigo, ruta);
                txtCMinutos2.setText(l.getCantidadm());
                txtValor2.setText(l.getValor());
                cmbOperador.setSelectedItem(l.getOperador());
                txtNacional.setText(l.getNacional());
                txtInternacional.setText(l.getInternacional());
                aux = 1;
            } else {
                txtCMinutos2.requestFocusInWindow();
                aux = 0;
            }
            txtCMinutos2.setEnabled(true);
            txtValor2.setEnabled(true);

            JButton botonesH[] = {cmdCancelar, cmdGuardar};
            JButton botonesD[] = {cmdBuscar, cmdEliminar2};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String codigo, operador, cantm, valor, nacional, internacional;

        if (txtCodigo.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Dijite el codigo de la llamada!", 3);
            txtCodigo.requestFocusInWindow();
        } else if (txtCMinutos2.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Dijite el número de minutos!", 3);
            txtCMinutos2.requestFocusInWindow();
        } else if (txtValor2.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Dijite el valor de la llamada!", 3);
            txtValor2.requestFocusInWindow();
        } else if (txtNacional.getText().trim().isEmpty()) {
            Helper.mensaje(this, "¡Dijite la llamada Fija Nacional!", 3);
            txtNacional.requestFocusInWindow();
        } else if (txtInternacional.getText().trim().isEmpty()) {
            Helper.mensaje(this, "¡Dijite la llamada Internacional!", 3);
            txtInternacional.requestFocusInWindow();
        } else {

            operador = cmbOperador.getSelectedItem().toString();
            codigo = txtCodigo.getText();
            cantm = txtCMinutos2.getText();
            valor = txtValor2.getText();
            nacional = txtNacional.getText();
            internacional = txtInternacional.getText();

            LinkedList<LLamada> llamadasMod;
            try {
                if (aux == 0) {
                    LLamada l = new LLamada(codigo, operador, cantm, valor, nacional, internacional);
                    l.guardar(salida);
                } else {
                    llamadasMod = Helper.modificarLlamada(ruta, codigo, operador, valor, cantm, nacional, internacional);
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                    Helper.volcado(salida, llamadasMod);
                    aux = 0;
                    Helper.mensaje(this, "Llamada Actualizada Exitosamente!", 1);
                }

            } catch (IOException ex) {
                Logger.getLogger(Agrega.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.llenarTabla(tblTablaPrincipal, ruta);

            cmbOperador.setSelectedIndex(0);
            txtCodigo.setText("");
            txtCMinutos2.setText("");
            txtValor2.setText("");
            txtNacional.setText("No");
            txtInternacional.setText("No");
            txtCodigo.requestFocusInWindow();

            txtCMinutos2.setEnabled(false);
            txtValor2.setEnabled(false);
            txtNacional.setEnabled(false);
            txtInternacional.setEnabled(false);

            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdEliminar2, cmdGuardar};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtInternacionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInternacionalKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtInternacionalKeyTyped

    private void txtNacionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNacionalKeyTyped

    private void cbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarActionPerformed
        if (cbBuscar.isSelected() == true) {
            cmbBuscador.setEnabled(true);
            txtFiltro.setEnabled(true);
        } else {
            cmbBuscador.setEnabled(false);
            txtFiltro.setEnabled(false);
        }
    }//GEN-LAST:event_cbBuscarActionPerformed

    private void cbNacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNacionalActionPerformed
        if (cbNacional.isSelected() == true) {
            txtNacional.setEnabled(true);
            txtNacional.setText("");
        } else {
            txtNacional.setEnabled(false);
            txtNacional.setText("No");
        }
    }//GEN-LAST:event_cbNacionalActionPerformed

    private void cbInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInternalActionPerformed
        if (cbInternal.isSelected() == true) {
            txtInternacional.setEnabled(true);
            txtInternacional.setText("");
        } else {
            txtInternacional.setEnabled(false);
            txtInternacional.setText("No");
        }
    }//GEN-LAST:event_cbInternalActionPerformed

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
            java.util.logging.Logger.getLogger(Agrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agrega dialog = new Agrega(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox cbBuscar;
    private javax.swing.JCheckBox cbInternal;
    private javax.swing.JCheckBox cbNacional;
    private javax.swing.JComboBox<String> cmbBuscador;
    private javax.swing.JComboBox<String> cmbOperador;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar2;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.ButtonGroup rbInternacional;
    public static javax.swing.ButtonGroup rbNacional;
    private javax.swing.JTable tblTablaPrincipal;
    private javax.swing.JTextField txtCMinutos2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtInternacional;
    private javax.swing.JTextField txtNacional;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
