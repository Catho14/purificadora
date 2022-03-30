package form;
public class Creditos extends javax.swing.JFrame {
    public Creditos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Industry-Return-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 30, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("En este software, respecto a las tablas correspondientes, estan compuestos por botones con \ndiferentes funciones ( agregar, actualizar, buscar, borrar), en cada boton viene un mensaje de uso.\nEn el frame de \"Cobro de servicios\", se muestra 2 tablas (Clientes y productos), donde se seleccionará\nun único cliente para el cobro de servicio y se dará clic en el boton de agregar cliente, donde se mostrará\nen la tabla de su derecha; después seleccionará su producto correspondiente al dato de marca de \ngarrafon del registro del cliente; donde también, se le agregará los que sean deseados por el cliente;\nfinalmente, se dará clic en el botón de cobro, donde calculará el importe a pagar, además de solicitar \nel pago del cliente para corresponderle su cambio al ser necesario \nLa realización de este programa es con el fin de comercializar en la empresa de purificadora de agua\n\"Purificadora de los Ángeles\".\nLa reproducción de copias de este programa sin el permiso de los desarrolladores, será penalizado por\n las autorizados correspondientes.\nCualquier duda, queja o sugerencia respecto al software, comunicarse en\nlos correos: \ncarloscathi3@gmail.com\ndanirello888@gmail.com");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              MenuPrincipal stark = new MenuPrincipal();
              stark.setVisible(true);
              dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
