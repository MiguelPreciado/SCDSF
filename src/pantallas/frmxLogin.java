/*
 * Nombre del autor: Dámaso Valdés Rosales
 * Fecha de creación: 2017/03/12
 * Nombre del proyecto: casaDescanso
 * Nombre del módulo: centralDeEnfermería
 * Breve descripción del contenido: Esta es la clase para validar los login de los usuarios.
 */

package pantallas;

import clases.LoginEnf;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author Damaso
 */
public class frmxLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmxLogin() {
        initComponents();
        skin1();
    }
    
    static JFrame regSalud = new frmRegSaludPac();
    Font textoTitulos = new Font("Tahoma",Font.BOLD,24);
    Font textoComponentes = new Font("Tahoma",Font.BOLD,14);
    
    public void skin1(){
        Dimension dmnBtn = new Dimension(130, 40); //130, 50
        btnRegresar.setSize(dmnBtn);
        lblPanIncioSesion.setText(lblPanIncioSesion.getText().toUpperCase());
        lblContraseña.setText(lblContraseña.getText().toUpperCase());
        lblUsuario.setText(lblUsuario.getText().toUpperCase());
        btnContinuar.setText(btnContinuar.getText().toUpperCase());
        btnBorrarCampos.setText(btnBorrarCampos.getText().toUpperCase());
        btnRegresar.setText(btnRegresar.getText().toUpperCase());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPanIncioSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        pswfPassword = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBorrarCampos = new javax.swing.JButton();
        lblFondoVerde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPanIncioSesion.setFont(textoTitulos);
        lblPanIncioSesion.setText("Permisos Incidencias");
        getContentPane().add(lblPanIncioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        lblUsuario.setFont(textoComponentes);
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 80, -1));

        txtUsuario.setFont(textoComponentes);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, -1));

        lblContraseña.setFont(textoComponentes);
        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 100, -1));

        pswfPassword.setFont(textoComponentes);
        getContentPane().add(pswfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        btnContinuar.setFont(textoComponentes);
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 170, 140, 40));

        btnRegresar.setFont(textoComponentes);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 150, 40));

        btnBorrarCampos.setFont(textoComponentes);
        btnBorrarCampos.setText("Borrar Campos");
        btnBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 40));

        lblFondoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoVerde.jpg"))); // NOI18N
        getContentPane().add(lblFondoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        LoginEnf logEnf = new LoginEnf();
        logEnf.setUsuario(txtUsuario.getText());
        logEnf.setPassword(pswfPassword.getText());
        logEnf.validarLogin();
        dispose();
        txtUsuario.setText("");
        pswfPassword.setText("");
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCamposActionPerformed
        txtUsuario.setText("");
        pswfPassword.setText("");
    }//GEN-LAST:event_btnBorrarCamposActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        regSalud.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmxLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCampos;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondoVerde;
    private javax.swing.JLabel lblPanIncioSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswfPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
