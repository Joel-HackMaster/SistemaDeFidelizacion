/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import java.sql.SQLException;
import java.sql.Connection;
import controller.conexionController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import dao.AdministradorDAO;
import metodos.BcryptUtil;
import modelos.AdministradorEntity;

/**
 *
 * @author jwsb1
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BotonLogin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PassInput = new javax.swing.JTextField();
        UserInput = new javax.swing.JTextField();
        ValCorreo = new javax.swing.JLabel();
        ValPass = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Sistema de Puntos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");

        BotonLogin.setBackground(new java.awt.Color(235, 255, 202));
        BotonLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        BotonLogin.setText("Iniciar Sesion");
        BotonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Olvidaste tu contraseña");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Iniciar Sesion");

        ValCorreo.setForeground(new java.awt.Color(255, 51, 102));

        ValPass.setForeground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(PassInput)
                                    .addComponent(UserInput)
                                    .addComponent(BotonLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(ValCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ValPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel3)))
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PassInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValPass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotonLogin)
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\jwsb1.JOEL.000\\OneDrive - Universidad Tecnologica del Peru\\ProyectoAyE\\SistemaDeVentas\\src\\main\\java\\assets\\loginv1.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        ValCorreo.setText("");
        ValPass.setText("");
        String correo = UserInput.getText();
        String password = PassInput.getText();
        // Validar los campos antes de hacer la consulta
        if (correo.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos");
            return;
        }
        
        Connection con = conexionController.conectar();
        
        
        
        try {
            AdministradorDAO administradorDAO = new AdministradorDAO(con);
        
            AdministradorEntity administrador = administradorDAO.obtenerUsuarioPorCredenciales(correo);
        
            if(administrador == null){ 
                ValCorreo.setText("El usuario no existe");
                return;
            }    
            if (BcryptUtil.checkPassword(password, administrador.getPassword())) {
                System.out.println("Clave: "+administrador.getPassword());
                JOptionPane.showMessageDialog(this, "Bienvenido " + administrador.getNombres()+" "+administrador.getApellidos());
                // Aquí puedes abrir la siguiente ventana pasando el objeto Administrador
                new DashboardAdmin().setVisible(true);
            } else {
                ValPass.setText("Contraseña Incorrecta");
            }
            
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLogin;
    private javax.swing.JTextField PassInput;
    private javax.swing.JTextField UserInput;
    private javax.swing.JLabel ValCorreo;
    private javax.swing.JLabel ValPass;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
