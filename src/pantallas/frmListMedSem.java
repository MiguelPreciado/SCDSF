/*
 * Nombre del autor: Iván Ruiz Ramírez
                     Jose Luis Terraza Cortés
                     Dámaso Valdés Rosales
 * Fecha de creación: 2017/03/13
 * Nombre del proyecto: casaDescanso
 * Nombre del módulo: centralDeEnfermería
 * Breve descripción del contenido: El frame "frmListMedSem" contiene la lista de medicamentos del paciente que fueron autorizados y en base a la fecha, filtrar
 * los medicamentos que debe tomar el paciente.
 */
package pantallas;

import clases.ComboItem;
import clases.Conex;
import clases.DAOPedMed;
import static pantallas.frmPedMed.pedMed;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

/**
 *
 * @author IvanR
 */
public class frmListMedSem extends javax.swing.JFrame {

    /**
     * Creates new form frmListMedSem
     */
    public frmListMedSem() {
        initComponents();
        cargaComboPaciente();
        skin1();
    }

    private Connection con;
    DAOPedMed daoPed = new DAOPedMed();
    Font textoTitulos = new Font("Tahoma", Font.BOLD, 24);
    Font textoComponentes = new Font("Tahoma", Font.BOLD, 14);

    public void skin1() {
        Dimension dmnBtn = new Dimension(130, 50); //130, 50
        btnRegresar.setSize(dmnBtn);
        lblListMedSem.setText(lblListMedSem.getText().toUpperCase());
        lblFilt.setText(lblFilt.getText().toUpperCase());
        lblFechaSem.setText(lblFechaSem.getText().toUpperCase());
        lblPac.setText(lblPac.getText().toUpperCase());
        btnFiltrar.setText(btnFiltrar.getText().toUpperCase());
        btnJasperRep.setText(btnJasperRep.getText().toUpperCase());
        btnRegresar.setText(btnRegresar.getText().toUpperCase());
    }

    public void cargaComboPaciente() {
        if (daoPed.getNomPac() == null) {
            daoPed.setNomPac("%");
        }
        con = Conex.getInstance().getConnection();
        String cadSql = "{call sp_cmbNomPac(?)};";
        try {
            CallableStatement cstm = con.prepareCall(cadSql);
            cstm.setString(1, daoPed.getNomPac());
            ComboItem miItem;
            ResultSet res = cstm.executeQuery();
            while (res.next()) {
                miItem = new ComboItem(res.getInt("idPaciente"), res.getString("Nombre") + " " + res.getString("apPat") + " " + res.getString("apMat"));
                cmbPac.addItem(String.valueOf(miItem));
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmPedMed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pumMedSem = new javax.swing.JPopupMenu();
        muiDesautorizar = new javax.swing.JMenuItem();
        lblListMedSem = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListMedSem = new javax.swing.JTable();
        lblFilt = new javax.swing.JLabel();
        lblFechaSem = new javax.swing.JLabel();
        dchFechaSem = new com.toedter.calendar.JDateChooser();
        lblPac = new javax.swing.JLabel();
        cmbPac = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        btnJasperRep = new javax.swing.JButton();
        lblFondoVerde = new javax.swing.JLabel();

        muiDesautorizar.setText("jMenuItem1");
        muiDesautorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muiDesautorizarActionPerformed(evt);
            }
        });
        pumMedSem.add(muiDesautorizar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblListMedSem.setFont(textoTitulos);
        lblListMedSem.setText("Lista de medicamentos - SEMANAL");
        getContentPane().add(lblListMedSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, -1, -1));

        btnRegresar.setFont(textoComponentes);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 587, 175, 40));

        tblListMedSem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblListMedSem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMedSemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListMedSem);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 1058, -1));

        lblFilt.setFont(textoComponentes);
        lblFilt.setText("Filtro(s):");
        getContentPane().add(lblFilt, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 69, -1, -1));

        lblFechaSem.setFont(textoComponentes);
        lblFechaSem.setText("Fecha semana:");
        getContentPane().add(lblFechaSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 107, 120, -1));

        dchFechaSem.setFont(textoComponentes);
        getContentPane().add(dchFechaSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 101, 150, 20));

        lblPac.setFont(textoComponentes);
        lblPac.setText("Paciente:");
        getContentPane().add(lblPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 104, 80, -1));

        cmbPac.setFont(textoComponentes);
        getContentPane().add(cmbPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 101, 170, -1));

        btnFiltrar.setFont(textoComponentes);
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 84, 150, 40));

        btnJasperRep.setFont(textoComponentes);
        btnJasperRep.setText("Generar Reporte / Imprimir");
        btnJasperRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJasperRepActionPerformed(evt);
            }
        });
        getContentPane().add(btnJasperRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 84, 270, 40));

        lblFondoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoVerde.jpg"))); // NOI18N
        getContentPane().add(lblFondoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        pedMed.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        DateFormat fmt = new SimpleDateFormat("yy/MM/dd");
        if (dchFechaSem.getDate() == null) {
            JOptionPane.showMessageDialog(null, "El campo de la fecha no puede estar vacío.");
        } else {
            daoPed.setNomPac(cmbPac.getSelectedItem().toString());
            String dateSem = fmt.format(dchFechaSem.getDate());
            daoPed.setFechaPedMed(dateSem);
            daoPed.getTmodel().setColumnCount(0);
            daoPed.getTmodel().setRowCount(0);
            daoPed.filtrarMedSem();
            tblListMedSem.setModel(daoPed.getTmodel());
        }

    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnJasperRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJasperRepActionPerformed
        DateFormat fmt = new SimpleDateFormat("yy/MM/dd");
        if (dchFechaSem.getDate() == null) {
            JOptionPane.showMessageDialog(null, "El campo de la fecha no puede estar vacío. (es necesario para el rango de fecha de medicamentos de los pacientes)");
        }
        else{
            String dateSem = fmt.format(dchFechaSem.getDate());
            daoPed.generarReporte(dateSem);
        }
        
    }//GEN-LAST:event_btnJasperRepActionPerformed

    private void tblListMedSemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMedSemMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            Point p = evt.getPoint(); //Para obtener las coordenadas del click derecho
            int rowNumber = tblListMedSem.rowAtPoint(p); // index que tiene la coordenada
            ListSelectionModel model = tblListMedSem.getSelectionModel();
            model.setSelectionInterval(rowNumber, rowNumber);
            muiDesautorizar.setText("Desautorizar Pedido");
            pumMedSem.show(evt.getComponent(), evt.getX(), evt.getY());
        } 
    }//GEN-LAST:event_tblListMedSemMouseClicked

    private void muiDesautorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muiDesautorizarActionPerformed
        int index = tblListMedSem.getSelectedRow();
        TableModel model = tblListMedSem.getModel();
        daoPed.setIdPedidoMed(Integer.valueOf((String) model.getValueAt(index, 0)));
        daoPed.eliminarMedSem();
        daoPed.getTmodel().setColumnCount(0);
        daoPed.getTmodel().setRowCount(0);
        daoPed.listarMedSem();
        tblListMedSem.setModel(daoPed.getTmodel());
        JOptionPane.showMessageDialog(null, "Pedido desautorizado.");
    }//GEN-LAST:event_muiDesautorizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmListMedSem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListMedSem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListMedSem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListMedSem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListMedSem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnJasperRep;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbPac;
    private com.toedter.calendar.JDateChooser dchFechaSem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaSem;
    private javax.swing.JLabel lblFilt;
    private javax.swing.JLabel lblFondoVerde;
    private javax.swing.JLabel lblListMedSem;
    private javax.swing.JLabel lblPac;
    private javax.swing.JMenuItem muiDesautorizar;
    private javax.swing.JPopupMenu pumMedSem;
    public javax.swing.JTable tblListMedSem;
    // End of variables declaration//GEN-END:variables
}
