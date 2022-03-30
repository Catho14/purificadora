package form;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
public class Inicio_1 extends javax.swing.JFrame {
    public Inicio_1() {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Purificadora de los Ángeles");
        this.setLocation(400,200);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/anexos/agua.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Grown Localy", 1, 28)); // NOI18N
        jLabel1.setText("Inicio de Sesión");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 230, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Ensure", 0, 24)); // NOI18N
        jLabel3.setText("Ingresa Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 40));

        jLabel4.setFont(new java.awt.Font("Ensure", 0, 24)); // NOI18N
        jLabel4.setText("Ingresa Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 210, 40));

        usuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        usuario.setToolTipText("admin");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 40));

        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setToolTipText("1234");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 400, 40));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Ensure", 0, 16)); // NOI18N
        jButton1.setText(" Empezar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, 40));

        jButton2.setFont(new java.awt.Font("Ensure", 0, 16)); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 80, 30));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setForeground(new java.awt.Color(0, 51, 51));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/fondouser.jpg"))); // NOI18N
        Fondo.setText("jLabel2");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 470, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
  
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Usuario;
      Usuario = "admin";
      String Contraseña;
         Contraseña="1234";
         int intentos=0;
         String Passw=new String(Password.getPassword());
         if(Contraseña.equals(Passw) && usuario.getText().equals(Usuario)){
        MenuPrincipal abrirmenu= new MenuPrincipal();
        abrirmenu.setVisible(true);
        dispose();
         }else{
             JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrecta");
             intentos +=1;
         }
         Password.setText("");
         usuario.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (Exception e) {
                }
                new Inicio_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
