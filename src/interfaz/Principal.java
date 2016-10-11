/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GABRIEL
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesT[] = {cmdCrear, cmdLimpiar};
        JButton botonesF[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdCalcular};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        txtNumeroColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoAuto = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        cmbOperacion = new javax.swing.JComboBox<>();
        cmdCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATRICES - RECORRIDOS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Iniciales:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("No. de columnas:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No. de filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 25, 50, 25));
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 65, 50, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 110, 30));

        cmdLlenadoAuto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenadoAuto.setText("LlenarAuto");
        cmdLlenadoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 25, 100, 30));

        cmdLlenadoManual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenadoManual.setText("LlenarManual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 65, 110, 30));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 65, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 350, 110));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado:"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 120));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 350, 150));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recorrido Uno", "Recorrido Dos", "Recorrido Tres", "Recorrido Cuatro", "Recorrido Cinco" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(685, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
        int nf, nc, op;
        nf = Integer.parseInt(txtNumeroFilas.getText());
        nc = Integer.parseInt(txtNumeroColumnas.getText());
        op = cmbOperacion.getSelectedIndex();
        switch (op) {
            case 0:
                if (nf%2==0) {
                    Helper.mensaje(this, "Para visualizar este recorrido, el número de filas debe ser impar.", 3);
                }
                else {
                    txtResultado.setText(Helper.recorridoUno(tblTablaInicial));
                }
                break;
            case 1:
                if (nc%2==0) {
                    Helper.mensaje(this, "Para visualizar este recorrido, el número de columnas debe ser impar.", 3);
                }
                else {
                    txtResultado.setText(Helper.recorridoDos(tblTablaInicial));
                }
                break;
            case 2:
                if (nf != nc) {
                    Helper.mensaje(this, "Para visualizar este recorrido, el número de filas y columnas deben ser iguales.", 3);
                }
                else {
                    txtResultado.setText(Helper.recorridoTres(tblTablaInicial));
                }
                break;
            case 3:
                if (nf != nc) {
                    Helper.mensaje(this, "Para visualizar este recorrido, el número de filas debe ser igual al número de columnas.", 3);
                }
                else {
                    txtResultado.setText(Helper.recorridoCuatro(tblTablaInicial));
                }
                break;
            case 4:
                if ((nf % 2 == 0 && nc % 2 == 0) || (nf != nc)) {
                    Helper.mensaje(this, "Para visualizar este recorrido, el número de filas y columnas deben ser iguales e impares.", 3);
                }
                else {
                     txtResultado.setText(Helper.recorridoCinco(tblTablaInicial));
                }
                break;
        }
        JButton botonesT[] = {cmdLimpiar};
        JButton botonesF[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAuto};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        Helper.porDefectoTabla(tblTablaInicial);
        txtResultado.setText("");
        txtNumeroFilas.setText("");
        txtNumeroFilas.setEditable(true);
        txtNumeroColumnas.setText("");
        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdCalcular};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        try {
            int nc, nf;
            DefaultTableModel tm;
            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt(txtNumeroColumnas.getText());
            tm = (DefaultTableModel) tblTablaInicial.getModel();
            if (nf < 4 || nc < 4) {
                Helper.mensaje(this, "Por favor considere 4 como el mínimo para filas y columnas.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else if (nf > 10 || nc > 10) {
                Helper.mensaje(this, "Por favor considere 10 como el máximo para filas y columnas.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else {
                Helper.mensaje(this, "Matriz creada exitosamente.", 1);
                tm.setRowCount(nf);
                tm.setColumnCount(nc);
                txtNumeroFilas.setEditable(false);
                txtNumeroColumnas.setEditable(false);
                JButton botonesT[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdLimpiar};
                JButton botonesF[] = {cmdCrear};
                Helper.habilitarBotones(botonesT);
                Helper.deshabilitarBotones(botonesF);
            }
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Campo(s) Inválido(s).", 3);
            txtNumeroFilas.setText("");
            txtNumeroColumnas.setText("");
            txtNumeroFilas.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutoActionPerformed
        // TODO add your handling code here:
        int nf, nc, n;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        Helper.mensaje(this, "Matriz llenada exitosamente.", 1);
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesT[] = {cmdCalcular, cmdLimpiar};
        JButton botonesF[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAuto};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdLlenadoAutoActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        // TODO add your handling code here:
        int nf, nc, n, sw, res;
        boolean aux = true;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento en la posición ["+i+"]" + "["+j+"]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Estás seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            Helper.mensaje(this, "Debe llenar la matriz.", 2);
                            sw = 1;
                            i = nf;
                            j = nc;
                            aux = false;
                            Helper.limpiadoTabla(tblTablaInicial);
                        }
                        else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        //Controlo los botones de llenar para  cuando se salgan del confirm dialog:
        if (aux == false) {
            cmdLlenadoAuto.setEnabled(true);
            cmdLlenadoManual.setEnabled(true);
        }
        else {
            Helper.mensaje(this, "Matriz llenada exitosamente.", 1);
            cmdLlenadoAuto.setEnabled(false);
            cmdLlenadoManual.setEnabled(false);
        }//
        cmdCalcular.setEnabled(aux);
        JButton botonesT[] = {cmdLimpiar};
        JButton botonesF[] = {cmdCrear};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAuto;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
