/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
/**
 *
 * @author Luis Miguel
 */
public class Administrador extends javax.swing.JFrame {
    //enviar dato entre las interfaces
    public static int sesion_usuario;
    
    //alojar datos
    String user, nombre_usuario;
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        //hacer uso del nombre de usuario ingresado en login
        user = Login.user;
        sesion_usuario=1;
        
        setSize(650,430);
        setResizable(false);
        setTitle("Administrador - Sesion de "+user);
        setLocationRelativeTo(null);
        
        //para que el programa no se ejecute en segundo plano
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //change imagen
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        
        //adapt to jlabel
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),jLabel_wallpaper.getHeight(),Image.SCALE_DEFAULT));
        
        //add to jlabel
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
        
        // saber nombre completo del usuario
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT nombre_usuario FROM usuarios WHERE username ='"+user+"'");
            //obtener despues de la ejecucion
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                //recuperar el nombre de usuario
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_NombreUsuario.setText("BIENVENIDO "+nombre_usuario+"!");
                
            }
        } catch (Exception e) {
            System.err.println("Error "+e);
        }
    }
    //cambiar icono interface
         @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/system.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_RegistrarUsuario = new javax.swing.JButton();
        jButton_GestionarUsuarios = new javax.swing.JButton();
        jButton_Creatividad = new javax.swing.JButton();
        jButton_Capturista = new javax.swing.JButton();
        jButton_Tecnico = new javax.swing.JButton();
        jButton_AcercaDe = new javax.swing.JButton();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_RegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_GestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        jButton_GestionarUsuarios.setToolTipText("");
        jButton_GestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton_Creatividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creatividad.png"))); // NOI18N
        getContentPane().add(jButton_Creatividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        jButton_Capturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        jButton_Capturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CapturistaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Capturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        jButton_Tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        getContentPane().add(jButton_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system.png"))); // NOI18N
        getContentPane().add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 100));

        jLabel_NombreUsuario.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_NombreUsuario.setFont(new java.awt.Font("Arial", 2, 20)); // NOI18N
        jLabel_NombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setText("Gestionar Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel3.setText("Creatividad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel4.setText("Capturista");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel5.setText("Tecnico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jLabel6.setText("Acerca De");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel7.setText("Creado por Luis M. Rodriguez");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioActionPerformed

        RegistrarUsuarios registrarUsuarios = new RegistrarUsuarios();
        registrarUsuarios.setVisible(true);
    }//GEN-LAST:event_jButton_RegistrarUsuarioActionPerformed

    private void jButton_GestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarUsuariosActionPerformed
        // TODO add your handling code here:
        GestionarUsuarios gestionarusuarios = new GestionarUsuarios ();
        gestionarusuarios.setVisible(true);
    }//GEN-LAST:event_jButton_GestionarUsuariosActionPerformed

    private void jButton_CapturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CapturistaActionPerformed
        // TODO add your handling code here:
        Capturista capturista = new Capturista();
        capturista.setVisible(true);
    }//GEN-LAST:event_jButton_CapturistaActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Capturista;
    private javax.swing.JButton jButton_Creatividad;
    private javax.swing.JButton jButton_GestionarUsuarios;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JButton jButton_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_wallpaper;
    // End of variables declaration//GEN-END:variables
}
