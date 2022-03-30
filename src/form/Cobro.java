package form;
import javax.swing.table.DefaultTableModel;
import dba.MySQL;
import java.applet.AudioClip;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Cobro extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    static int lui;
    float cam;
    public Cobro() {
                initComponents();
        this.setTitle("Cobro de garrafones " );
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/anexos/agua.png")).getImage());
        conn = MySQL.getConnetion();
        Llenar();
        LlenarProd();
    }
    void Llenar() {
        try {
            conn = MySQL.getConnetion();
            String[] titulos = {"ID", "NombreCliente","CalleCliente","NoCasaCliente",
                "Telefono","MarcaGarrafon"};
            String sql = "select * from clientes"; //Ten cuidado posible cambio de variable
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[6];
            while (rs.next()) {
                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("NombreCliente");
                fila[2] = rs.getString("CalleCliente");
                fila[3] = rs.getString("NoCasaCliente");
                fila[4] = rs.getString("Telefono");
                fila[5] = rs.getString("MarcaGarrafon");
                model.addRow(fila);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void LlenarProd() {
        try {
            conn = MySQL.getConnetion();
            String[] titulos = {"ID", "Producto", "Precio"};
            String sql = "select * from productos"; //Ten cuidado posible cambio de variable
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[3];
            while (rs.next()) {
                fila[0] = rs.getString("Id");
                fila[1] = rs.getString("Producto");
                fila[2] = rs.getString("Precio");
                model.addRow(fila);
            }
            jTable3.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void buscar() {
       try {
          //  Habilitar();
            conn = MySQL.getConnetion();
            String[] titulos = {"ID", "NombreCliente","CalleCliente","NoCasaCliente",
                "Telefono","MarcaGarrafon"};
            String sql = "select ID, NombreCliente, CalleCliente, NoCasaCliente,"
                    + "Telefono, MarcaGarrafon"
                    + " FROM clientes WHERE NombreCliente like '" + txtbus.getText() + "%'";
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[6];
            while (rs.next()) {
               fila[0] = rs.getString("ID");
                fila[1] = rs.getString("NombreCliente");
                fila[2] = rs.getString("CalleCliente");
                fila[3] = rs.getString("NoCasaCliente");
                fila[4] = rs.getString("Telefono");
                fila[5] = rs.getString("MarcaGarrafon");
                model.addRow(fila);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El dato no existe");
        }
    }
    public void sumar() {
        double sumatoria = 0, n1, lui;
        int totalRow = jTable4.getRowCount();
        
        totalRow -= 1;
        for (int i = 0; i <= (totalRow); i++) {
            sumatoria = sumatoria + Double.parseDouble(String.valueOf(jTable4.getValueAt(i, 2)));
        }
       
        lui = sumatoria;
        txtresul.setText(String.valueOf("$" + lui));
                float pc=Float.parseFloat(JOptionPane.showInputDialog("El total a pagar por el servicio es $"+lui+""
                + "¿Cuanto pago el cliente?"));
        cam=(float) (pc-lui);
         JOptionPane.showMessageDialog(null,"El cambio a regresar es $"+cam);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnbus = new javax.swing.JButton();
        txtbus = new javax.swing.JTextField();
        btnagre = new javax.swing.JButton();
        btnmost = new javax.swing.JButton();
        btnnb = new javax.swing.JButton();
        btnco = new javax.swing.JButton();
        txtresul = new javax.swing.JLabel();
        btnlimp = new javax.swing.JButton();
        vm = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btnagre1 = new javax.swing.JButton();
        btnlimp1 = new javax.swing.JButton();
        btnelim1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/anexos/agua.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cobro\n"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 347, 100));

        jTable2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Calle", "No. Casa", "Telefono", "Garrafon Marca"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(3).setHeaderValue("No. Casa");
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Telefono");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Garrafon Marca");
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 360, 50));

        btnbus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Zoom-icon.png"))); // NOI18N
        btnbus.setToolTipText("Buscar cliente por nombre");
        btnbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusActionPerformed(evt);
            }
        });
        jPanel1.add(btnbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 30, 30));

        txtbus.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtbus.setToolTipText("Ingresa el nombre del cliente");
        txtbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusActionPerformed(evt);
            }
        });
        jPanel1.add(txtbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 30));

        btnagre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Files-New-File-icon.png"))); // NOI18N
        btnagre.setToolTipText("Agregar Cliente");
        btnagre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagreActionPerformed(evt);
            }
        });
        jPanel1.add(btnagre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 30, 30));

        btnmost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/eye.png"))); // NOI18N
        btnmost.setToolTipText("Mostrar todos los clientes");
        btnmost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostActionPerformed(evt);
            }
        });
        jPanel1.add(btnmost, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 40, 30));

        btnnb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/back.png"))); // NOI18N
        btnnb.setToolTipText("Borrar busqueda");
        btnnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnbActionPerformed(evt);
            }
        });
        jPanel1.add(btnnb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 30, 30));

        btnco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/currency_dollar_yellow.png"))); // NOI18N
        btnco.setToolTipText("Calculo de costos de los productos ");
        btnco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoActionPerformed(evt);
            }
        });
        jPanel1.add(btnco, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 50, 50));

        txtresul.setBackground(new java.awt.Color(255, 255, 255));
        txtresul.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtresul.setText("$");
        txtresul.setOpaque(true);
        jPanel1.add(txtresul, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 56, 30));

        btnlimp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/gnome_edit_clear.png"))); // NOI18N
        btnlimp.setToolTipText("Borrar todos los registros en tabla");
        btnlimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 30, 30));

        vm.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        vm.setText("Volver al Menu");
        vm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmActionPerformed(evt);
            }
        });
        jPanel1.add(vm, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jTable3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 347, 100));

        jTable4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 360, 90));

        btnagre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Files-New-File-icon.png"))); // NOI18N
        btnagre1.setToolTipText("Agregar garrafon");
        btnagre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagre1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnagre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 30, 30));

        btnlimp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/gnome_edit_clear.png"))); // NOI18N
        btnlimp1.setToolTipText("Borrar todos los registros en tabla");
        btnlimp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimp1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 30, 30));

        btnelim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Places-trash-full-icon.png"))); // NOI18N
        btnelim1.setToolTipText("Borrar los datos del producto");
        btnelim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelim1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnelim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 30, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel4.setText("Datos de productos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Agregar productos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Agregar solo un cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel5.setText("Datos del cliente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/burbujas_de_agua-other.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 760, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 760, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnmostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostActionPerformed
        Llenar();
    }//GEN-LAST:event_btnmostActionPerformed

    private void btnnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnbActionPerformed
        txtbus.setText("");
        txtbus.requestFocus();
    }//GEN-LAST:event_btnnbActionPerformed

    private void btncoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoActionPerformed
        sumar();
  
    }//GEN-LAST:event_btncoActionPerformed

    private void btnbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusActionPerformed
        buscar();
    }//GEN-LAST:event_btnbusActionPerformed

    private void btnagreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagreActionPerformed
        JOptionPane.showMessageDialog(null, "Solo agregar un cliente y su producto correspondiente en la otra tabla");
        DefaultTableModel tmO = (DefaultTableModel) jTable1.getModel(),
                tmD = (DefaultTableModel) jTable2.getModel();
        if (jTable1.getSelectedRowCount() > 0) {
            int[] indices = jTable1.getSelectedRows();
            for (int i : indices) {
                Object[] fila = new Object[tmO.getColumnCount()];
                for (int j = 0; j < fila.length; j++) {
                    fila[j] = tmO.getValueAt(i, j);
                }
                tmD.addRow(fila);
            }
        }
    }//GEN-LAST:event_btnagreActionPerformed

    private void vmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vmActionPerformed
            MenuPrincipal mc = new MenuPrincipal();
            mc.setVisible(true);
            dispose();
    }//GEN-LAST:event_vmActionPerformed

    private void btnlimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpActionPerformed
//        txtex.setText("");
        txtresul.setText("$");
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
            int filas = jTable2.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }//GEN-LAST:event_btnlimpActionPerformed

    private void txtbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnagre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagre1ActionPerformed
       DefaultTableModel tmO = (DefaultTableModel) jTable3.getModel(),
                tmD = (DefaultTableModel) jTable4.getModel();
        if (jTable3.getSelectedRowCount() > 0) {
            int[] indices = jTable3.getSelectedRows();
            for (int i : indices) {
                Object[] fila = new Object[tmO.getColumnCount()];
                for (int j = 0; j < fila.length; j++) {
                    fila[j] = tmO.getValueAt(i, j);
                }
                tmD.addRow(fila);
            }
        }
    }//GEN-LAST:event_btnagre1ActionPerformed

    private void btnlimp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimp1ActionPerformed
//         txtex.setText("");
        txtresul.setText("$");
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel();
            int filas = jTable4.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }//GEN-LAST:event_btnlimp1ActionPerformed

    private void btnelim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelim1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable4.getModel(); //TableProducto es el nombre de mi tabla ;) 
        dtm.removeRow(jTable4.getSelectedRow());
    }//GEN-LAST:event_btnelim1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagre;
    private javax.swing.JButton btnagre1;
    private javax.swing.JButton btnbus;
    private javax.swing.JButton btnco;
    private javax.swing.JButton btnelim1;
    private javax.swing.JButton btnlimp;
    private javax.swing.JButton btnlimp1;
    private javax.swing.JButton btnmost;
    private javax.swing.JButton btnnb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField txtbus;
    private javax.swing.JLabel txtresul;
    private javax.swing.JButton vm;
    // End of variables declaration//GEN-END:variables
}
