/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Luis Miguel
 */
public class InformacionUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InformacionUsuario
     */
    public InformacionUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Nombre3 = new javax.swing.JLabel();
        jLabel_Nombre4 = new javax.swing.JLabel();
        jLabel_Nombre5 = new javax.swing.JLabel();
        jLabel_Nombre6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_mail1 = new javax.swing.JTextField();
        txt_mail2 = new javax.swing.JTextField();
        txt_mail3 = new javax.swing.JTextField();
        txt_mail4 = new javax.swing.JTextField();
        txt_mail5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Informacion del Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel_Nombre.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre.setText("Nombre");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, 20));

        jLabel_Nombre1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre1.setText("Mail");
        getContentPane().add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 30, 20));

        jLabel_Nombre2.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre2.setText("Telefono");
        getContentPane().add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 50, 20));

        jLabel_Nombre3.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre3.setText("Permiso de");
        getContentPane().add(jLabel_Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 20));

        jLabel_Nombre4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre4.setText("Username");
        getContentPane().add(jLabel_Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel_Nombre5.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre5.setText("Estatus");
        getContentPane().add(jLabel_Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel_Nombre6.setBackground(new java.awt.Color(222, 222, 222));
        jLabel_Nombre6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel_Nombre6.setText("Registrado por");
        getContentPane().add(jLabel_Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 20));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 210, -1));

        txt_mail1.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, -1));

        txt_mail2.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 210, -1));

        txt_mail3.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 210, -1));

        txt_mail4.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 210, -1));

        txt_mail5.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Nombre6;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_mail1;
    private javax.swing.JTextField txt_mail2;
    private javax.swing.JTextField txt_mail3;
    private javax.swing.JTextField txt_mail4;
    private javax.swing.JTextField txt_mail5;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
