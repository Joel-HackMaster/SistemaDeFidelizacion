/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import controller.conexionController;
import dao.VendedorDAO;
import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.DetalleAcumulacionEntity;
import modelos.VendedorEntity;

/**
 *
 * @author GHOST
 */
public class FramePuntosXcanjear extends javax.swing.JInternalFrame {

    /**
     * Creates new form FramePuntosXcanjear
     */
    public FramePuntosXcanjear() {
        initComponents();
        cargarVendedores();
    }

    private void mostrarImagen(int idVendedor) {
        try {
            Connection con = conexionController.conectar();
            VendedorDAO vend = new VendedorDAO(con);
            // Cargar la imagen desde la carpeta de recursos
            String furia = "D:\\Programacion Java\\AlgoritmosEstructura\\ProjectoAlgoritmos\\SistemaDeFidelizacion\\src\\main\\java\\assets\\furia.png";
            String feliz = "D:\\Programacion Java\\AlgoritmosEstructura\\ProjectoAlgoritmos\\SistemaDeFidelizacion\\src\\main\\java\\assets\\feliz.jpg";
            int verificar = vend.ValidarBonoCumple(idVendedor);
            ImageIcon originalIcon = new ImageIcon();
            if (verificar == 1) {
                originalIcon = new ImageIcon(feliz);
            } else {
                originalIcon = new ImageIcon(furia);
            }

            Image img = originalIcon.getImage();  // Obtener la imagen original

            // Redimensionar la imagen al tamaño deseado (puedes ajustar el tamaño)
            Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);  // Cambiar el tamaño a 100x100 píxeles
            ImageIcon scaledIcon = new ImageIcon(scaledImg);  // Crear un ImageIcon con la imagen redimensionada

            // Establecer la imagen redimensionada en el JLabel
            ImageLabel.setIcon(scaledIcon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarVendedores() {
        Connection con = conexionController.conectar();
        VendedorDAO vendedordao = new VendedorDAO(con);
        List<VendedorEntity> ListaVendedores = vendedordao.obtenerIDVendedor();

        for (VendedorEntity vendedor : ListaVendedores) {
            String nombreCompleto = vendedor.getNombres() + ' ' + vendedor.getApellidos();
            System.out.println("Vendedor encontrado con id: " + nombreCompleto);
            ComboNombre.addItem(nombreCompleto);
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void rellenarTabla(int idVendedor){
        Connection con = conexionController.conectar();
        VendedorDAO vendedor = new VendedorDAO(con);
        String[] columnNames = {"id", "tipo", "puntos", "fecha", "bono"};
        DefaultTableModel modelo = new DefaultTableModel(columnNames, 0);
                
        List<DetalleAcumulacionEntity> detalles = vendedor.obtenerPuntosVendedores(idVendedor);
        
        for (DetalleAcumulacionEntity d: detalles) {
            Object[] fila = {d.getId(), d.getIdtipoacum(), d.getPuntos(), d.getFecha_acum(), d.isBono_cum()};
            modelo.addRow(fila);
        }
        TablaAcumulacion.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboNombre = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCostoPuntosxCanje = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaAcumulacion = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtProductoCajear = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ImageLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PuntosAcumLabel = new javax.swing.JLabel();
        BotonBonoCumple = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("¡Canjeando Puntos!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre de vendedor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Costo de puntos por canje");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Puntos del vendedor");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Producto a canjear");

        ComboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNombreActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtCostoPuntosxCanje);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("CANJEAR PRODUCTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TablaAcumulacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TablaAcumulacion);

        jScrollPane5.setViewportView(txtProductoCajear);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Detalle de producto");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        ImageLabel.setIcon(new javax.swing.ImageIcon("D:\\Programacion Java\\AlgoritmosEstructura\\ProjectoAlgoritmos\\SistemaDeFidelizacion\\src\\main\\java\\assets\\furia.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Estado del Vendedor:");

        BotonBonoCumple.setBackground(new java.awt.Color(255, 255, 204));
        BotonBonoCumple.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonBonoCumple.setText("CANJEAR BONO X CUMPLEAÑOS");
        BotonBonoCumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBonoCumpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel5))
                            .addComponent(jLabel10)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PuntosAcumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonBonoCumple)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PuntosAcumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(55, 55, 55)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonBonoCumple)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombreActionPerformed
        Connection con = conexionController.conectar();
        String selectedItem = (String) ComboNombre.getSelectedItem();

        if (selectedItem != "") {
            String modeloProd = selectedItem;

            VendedorDAO vendedordao = new VendedorDAO(con);
            VendedorEntity vendedor = vendedordao.obtenerPuntosPorNombre(selectedItem);

            if (vendedor != null) {
                mostrarImagen(vendedor.getId());
                PuntosAcumLabel.setText(vendedor.getPuntosxacum().toString());
                rellenarTabla(vendedor.getId());
            } else {
                System.out.println("Vendedor no registrado: " + modeloProd);
            }
        } else {
            System.out.println("Vendedor no seleccionado.");
        }
    }//GEN-LAST:event_ComboNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonBonoCumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBonoCumpleActionPerformed
        Connection con = conexionController.conectar();
        String selectedItem = (String) ComboNombre.getSelectedItem();
        
        if (selectedItem != "") {
            String modeloProd = selectedItem;

            VendedorDAO vendedordao = new VendedorDAO(con);
            VendedorEntity vendedor = vendedordao.obtenerPuntosPorNombre(selectedItem);

            if (vendedor != null) {
                int resultado = vendedordao.AgregarBonoCumple(vendedor.getId());
                
                if(resultado == 0) JOptionPane.showMessageDialog(this,"El vendedor ya tiene el bono por cumpleaños");
                if(resultado == 1) JOptionPane.showMessageDialog(this,"Bono por cumpleaños registrado");
                if(resultado == -1) JOptionPane.showMessageDialog(this,"Aun no es el cumpleaños del Vendedor");
                mostrarImagen(vendedor.getId());
            } else {
                System.out.println("Vendedor no registrado:: " + modeloProd);
            }
        } else {
            System.out.println("Vendedor no seleccionado.");
        }

    }//GEN-LAST:event_BotonBonoCumpleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBonoCumple;
    private javax.swing.JComboBox<String> ComboNombre;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel PuntosAcumLabel;
    private javax.swing.JTable TablaAcumulacion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane txtCostoPuntosxCanje;
    private javax.swing.JTextPane txtProductoCajear;
    // End of variables declaration//GEN-END:variables
}
