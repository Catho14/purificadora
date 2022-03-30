package form;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Calculadora extends javax.swing.JFrame {
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Purificadora de los Ángeles");
        this.setLocation(400,200);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFDias = new javax.swing.JTextField();
        jTFPago = new javax.swing.JTextField();
        jTFDias1 = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/anexos/agua.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("UnicornFlakes", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 50));

        jLabel1.setFont(new java.awt.Font("Ensure", 1, 20)); // NOI18N
        jLabel1.setText("Costo por garrafón:  $");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 40));

        jLabel3.setFont(new java.awt.Font("Ensure", 1, 24)); // NOI18N
        jLabel3.setText("Servicio extra:  $");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        jLabel5.setFont(new java.awt.Font("Ensure", 1, 24)); // NOI18N
        jLabel5.setText("Garrafones llenados:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 40));

        jTFDias.setFont(new java.awt.Font("UnicornFlakes", 0, 24)); // NOI18N
        jTFDias.setText("0");
        jTFDias.setToolTipText("0");
        jTFDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTFDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 50, -1));

        jTFPago.setFont(new java.awt.Font("UnicornFlakes", 0, 24)); // NOI18N
        jTFPago.setText("0");
        jTFPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, 40));

        jTFDias1.setFont(new java.awt.Font("UnicornFlakes", 0, 24)); // NOI18N
        jTFDias1.setText("0");
        jTFDias1.setToolTipText("");
        jTFDias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDias1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFDias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, 40));

        jBLimpiar.setBackground(java.awt.SystemColor.activeCaption);
        jBLimpiar.setFont(new java.awt.Font("HelloPicasso", 1, 20)); // NOI18N
        jBLimpiar.setText("Borrar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jBAceptar.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jBAceptar.setFont(new java.awt.Font("HelloPicasso", 1, 20)); // NOI18N
        jBAceptar.setText("Calcular");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 130, 40));

        jButton1.setFont(new java.awt.Font("HelloPicasso", 3, 18)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 397, 90, 40));

        Fondo.setFont(new java.awt.Font("Art_Class", 0, 36)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/fondouser.jpg"))); // NOI18N
        Fondo.setText("olA");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 470, 460));

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Calcular Salarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Borrar registros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jMenuItem3.setText("Regresar Menú");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Cerrar Sesión");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cerrar programa");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiasActionPerformed
   
    }//GEN-LAST:event_jTFDiasActionPerformed

    private void jTFDias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDias1ActionPerformed
   
    }//GEN-LAST:event_jTFDias1ActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        double N1 = Double.parseDouble(jTFDias.getText());
        double N2 = Double.parseDouble(jTFPago.getText());
        double N3 = Double.parseDouble(jTFDias1.getText());
        double Resultado=(N1*N2)+N3;
        JOptionPane.showMessageDialog(null,"El cobro del garrafon es: $"+Resultado);
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
          jTFDias.setText("0");
       jTFPago.setText("0");
       jTFDias1.setText("0");
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrincipal regresar= new MenuPrincipal();
         regresar.setVisible(true);
        dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         double N1 = Double.parseDouble(jTFDias.getText());
        double N2 = Double.parseDouble(jTFPago.getText());
        double N3 = Double.parseDouble(jTFDias1.getText());
        double Resultado=(N1*N2)+N3;
        JOptionPane.showMessageDialog(null,"El cobro del garrafon es: $"+Resultado);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MenuPrincipal abrirmenu= new MenuPrincipal();
        abrirmenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jTFDias.setText("0");
       jTFPago.setText("0");
       jTFDias1.setText("0");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      Inicio_1 abrirmenu= new Inicio_1();
        abrirmenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTFPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPagoActionPerformed

    }//GEN-LAST:event_jTFPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField jTFDias;
    private javax.swing.JTextField jTFDias1;
    private javax.swing.JTextField jTFPago;
    // End of variables declaration//GEN-END:variables
}
