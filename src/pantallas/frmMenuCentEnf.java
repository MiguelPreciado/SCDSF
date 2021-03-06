/*
 * Nombre del autor: Iván Ruiz Ramírez
 * Fecha de creación: 2017/01/31
 * Nombre del proyecto: casaDescanso
 * Nombre del módulo: centralDeEnfermería
 * Breve descripción del contenido: Menú que contiene los botones para las demás pantallas. 
 */
package pantallas;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
public class frmMenuCentEnf extends javax.swing.JFrame {

    /**
     * Creates new form Modulo1
     */
    
    
    public frmMenuCentEnf() {
        initComponents();
        skin1();
    }
    
    static JFrame menuP = new frmMenuCentEnf();
    Font textoBtn = new Font("Tahoma",Font.BOLD,14);
    Font textoTitulos = new Font("Tahoma", Font.BOLD,24);
    Font textoComponentes = new Font("Tahoma", Font.BOLD,14);
    
    public void skin1(){
        Dimension dmnBtn = new Dimension(240, 40); //130, 50
        btnPerEnf.setSize(dmnBtn);
        btnRegSaludPac.setSize(dmnBtn);
        btnAsigPac.setSize(dmnBtn);
        btnPedMed.setSize(dmnBtn);
        lblMenuEnf.setText(lblMenuEnf.getText().toUpperCase());
        btnPerEnf.setText(btnPerEnf.getText().toUpperCase());
        btnRegSaludPac.setText(btnRegSaludPac.getText().toUpperCase());
        btnAsigPac.setText(btnAsigPac.getText().toUpperCase());
        btnPedMed.setText(btnPedMed.getText().toUpperCase());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuEnf = new javax.swing.JLabel();
        btnPerEnf = new javax.swing.JButton();
        btnAsigPac = new javax.swing.JButton();
        btnRegSaludPac = new javax.swing.JButton();
        btnPedMed = new javax.swing.JButton();
        lblImgPerEnf = new javax.swing.JLabel();
        lblImgAsigPac = new javax.swing.JLabel();
        lblImgSalPac = new javax.swing.JLabel();
        lblImgPedMed = new javax.swing.JLabel();
        lblFondoVerde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuEnf.setFont(textoTitulos);
        lblMenuEnf.setText("Central de Enfermería - Menu");
        getContentPane().add(lblMenuEnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 502, -1));

        btnPerEnf.setFont(textoComponentes);
        btnPerEnf.setText("Personal Enfermería");
        btnPerEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerEnfActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerEnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 218, 255, 40));

        btnAsigPac.setFont(textoComponentes);
        btnAsigPac.setText("Asignacion Pacientes");
        btnAsigPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsigPacActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsigPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 426, 255, 40));

        btnRegSaludPac.setFont(textoComponentes);
        btnRegSaludPac.setText("Registro de Salud - Pacientes");
        btnRegSaludPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSaludPacActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegSaludPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 218, 305, 40));

        btnPedMed.setFont(textoComponentes);
        btnPedMed.setText("Pedido medicamento");
        btnPedMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedMedActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 426, 251, 40));

        lblImgPerEnf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgPerEnf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personalEnf.png"))); // NOI18N
        getContentPane().add(lblImgPerEnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 377, 120));

        lblImgAsigPac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImgAsigPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asigPac.jpg"))); // NOI18N
        lblImgAsigPac.setToolTipText("");
        getContentPane().add(lblImgAsigPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, 377, 132));

        lblImgSalPac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImgSalPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/saludPac.jpg"))); // NOI18N
        getContentPane().add(lblImgSalPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 404, 120));

        lblImgPedMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedMed.jpeg"))); // NOI18N
        getContentPane().add(lblImgPedMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 276, 404, 132));

        lblFondoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoVerde.jpg"))); // NOI18N
        getContentPane().add(lblFondoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerEnfActionPerformed
        //JFrame persEnf = new frmEnfermeras();
        //dispose();
        //persEnf.setVisible(true);
    }//GEN-LAST:event_btnPerEnfActionPerformed

    private void btnPedMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedMedActionPerformed
        JFrame pedMed = new frmPedMed();
        dispose();
        pedMed.setVisible(true);
    }//GEN-LAST:event_btnPedMedActionPerformed

    private void btnAsigPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsigPacActionPerformed
        JFrame asigPac = new frmAsigPaciente();
        dispose();
        asigPac.setVisible(true);
    }//GEN-LAST:event_btnAsigPacActionPerformed

    private void btnRegSaludPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSaludPacActionPerformed
        JFrame regSalud = new frmRegSaludPac();
        dispose();
        regSalud.setVisible(true);
    }//GEN-LAST:event_btnRegSaludPacActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuCentEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuCentEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuCentEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuCentEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuCentEnf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsigPac;
    private javax.swing.JButton btnPedMed;
    private javax.swing.JButton btnPerEnf;
    private javax.swing.JButton btnRegSaludPac;
    private javax.swing.JLabel lblFondoVerde;
    private javax.swing.JLabel lblImgAsigPac;
    private javax.swing.JLabel lblImgPedMed;
    private javax.swing.JLabel lblImgPerEnf;
    private javax.swing.JLabel lblImgSalPac;
    private javax.swing.JLabel lblMenuEnf;
    // End of variables declaration//GEN-END:variables
}
