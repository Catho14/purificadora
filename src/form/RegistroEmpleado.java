package form;
import javax.swing.table.DefaultTableModel;
import dba.MySQL;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
public class RegistroEmpleado extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    public RegistroEmpleado() {
        initComponents();
        this.setTitle("Registro de empleados");
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/anexos/agua.png")).getImage());
        conn = MySQL.getConnetion();       
        Desabilitar();
        Llenar();
    }
    void Desabilitar() {
        txtproducto.setEditable(false);
        txtprecio.setEditable(false);
        txtcargo.setEditable(false);
        txtdireccion.setEditable(false);
        txtTelefono.setEditable(false);
    }
    void Limpiar() {
        txtproducto.setText("");
        txtprecio.setText("");
         txtcargo.setText("");
         txtdireccion.setText("");
         txtTelefono.setText("");
    }
    void Habilitar() {
        txtproducto.setEditable(true);
        txtprecio.setEditable(true);
         txtcargo.setEditable(true);
         txtdireccion.setEditable(true);
        txtTelefono.setEditable(true);
        txtproducto.requestFocus();
    }
    void Llenar() {
        try {
            conn = MySQL.getConnetion();
            String[] titulos = {"ID", "Nombre","Sueldo","Cargo","Direccion","Telefono"};
            String sql = "select * from Empleados"; //Ten cuidado posible cambio de variable
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[6];
            while (rs.next()) {
                fila[0] = rs.getString("ID");
                fila[1] = rs.getString("Nombre");
                fila[2] = rs.getString("Sueldo");
                fila[3] = rs.getString("Cargo");
                fila[4] = rs.getString("Direccion");
                fila[5] = rs.getString("Telefono");
                model.addRow(fila);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void buscar() {
         try {
            Habilitar();
            conn = MySQL.getConnetion();
            String[] titulos = {"ID", "Nombre","Sueldo","Cargo","Direccion","Telefono"};
            String sql = "select ID, Nombre, Sueldo, Cargo,Direccion, Telefono"
                    + " FROM empleados WHERE Nombre like '" + txtproducto.getText() + "%'";
            model = new DefaultTableModel(null, titulos);
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            String[] fila = new String[6];
            while (rs.next()) {
               fila[0] = rs.getString("ID");
                fila[1] = rs.getString("Nombre");
                fila[2] = rs.getString("Sueldo");
                fila[3] = rs.getString("Cargo");
                fila[4] = rs.getString("Direccion");
                fila[5] = rs.getString("Telefono");
                model.addRow(fila);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El dato no existe");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrartodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Files-New-File-icon.png"))); // NOI18N
        btnnuevo.setToolTipText("Registrar empleado");
        btnnuevo.setBorder(null);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 30, -1));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Actions-document-save-icon.png"))); // NOI18N
        btnguardar.setToolTipText("Guardar registro");
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 30, 30));

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Gear-icon.png"))); // NOI18N
        btnmodificar.setToolTipText("Modificar registro");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 30, 30));

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Places-trash-full-icon.png"))); // NOI18N
        btneliminar.setToolTipText("Borrar registro");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 30, 30));

        btnmostrartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/eye.png"))); // NOI18N
        btnmostrartodo.setToolTipText("Mostrar todos los registros");
        btnmostrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrartodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 40, 30));

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 500, 90));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros de Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Sueldo:");

        txtproducto.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });

        txtprecio.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Cargo:");

        txtcargo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcargoActionPerformed(evt);
            }
        });

        jLabel5.setText("Direccion:");

        jLabel6.setText("Telefono:");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcargo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txtprecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 490, 140));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Zoom-icon.png"))); // NOI18N
        btnbuscar.setToolTipText("Buscar registro");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/Industry-Return-icon.png"))); // NOI18N
        jButton2.setToolTipText("Regresar al menú");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anexos/fondouser.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmostrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrartodoActionPerformed
        Llenar();
    }//GEN-LAST:event_btnmostrartodoActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {
            String sql = "UPDATE empleados set Nombre=?,Sueldo=?, Cargo=?,Direccion=?, Telefono=? "
                    + "where ID=?";
            int fila = jTable1.getSelectedRow();
            String dao = (String) jTable1.getValueAt(fila, 0);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtproducto.getText());
            ps.setString(2, txtprecio.getText());
            ps.setString(3, txtcargo.getText());
            ps.setString(4, txtdireccion.getText());
            ps.setString(5, txtTelefono.getText());
            ps.setString(6, dao);//la llamada sql se muestra en la tabla
            int n = ps.executeUpdate();
            if (n > 0) {
                Limpiar();
                Llenar();
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            int fila = jTable1.getSelectedRow();
            String sql = "delete from Empleados where ID=" + jTable1.getValueAt(fila, 0);
            sent = conn.createStatement();
            int n = sent.executeUpdate(sql);
            if (n > 0) {
                Llenar();
            }
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            Limpiar();
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
        try {
            String sql = ("INSERT INTO Empleados (Nombre, Sueldo, Cargo, Direccion, Telefono ) VALUES (?,?,?,?,?)");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtproducto.getText());
            ps.setString(2, txtprecio.getText());
            ps.setString(3, txtcargo.getText());
            ps.setString(4, txtdireccion.getText());
            ps.setString(5, txtTelefono.getText());
            
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        Llenar();
        Limpiar();
    }//GEN-LAST:event_btnguardarMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        Limpiar();
        Habilitar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        JOptionPane.showMessageDialog(null, "La busqueda se realiza por el nombre");
        Habilitar();
        buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

    }//GEN-LAST:event_btnguardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getButton() <= 1) {
            try {
                Habilitar();
                int fila = jTable1.getSelectedRow();
                String sql = "select * from Empleados where ID=" + jTable1.getValueAt(fila, 0);
                sent = conn.createStatement();
                ResultSet rs = sent.executeQuery(sql);
                rs.next();
                txtproducto.setText(rs.getString("Nombre"));
                txtprecio.setText(rs.getString("Sueldo"));
                txtcargo.setText(rs.getString("Cargo"));
                txtdireccion.setText(rs.getString("Direccion"));
                txtTelefono.setText(rs.getString("Telefono"));
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          MenuBd scarllet = new MenuBd();
          scarllet.setVisible(true);
          dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcargoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed
 public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (Exception e) {
                }
                new RegistroEmpleado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmostrartodo;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}