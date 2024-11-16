package Vistas;

import controller.conexionController;
import dao.ProductosDAO;
import dao.VendedorDAO;
import dao.VentasDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import modelos.VendedorEntity;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import metodos.quicksort;
import modelos.ProductoEntity;
import modelos.VentaEntity;

public class InternalRegistrarVenta extends javax.swing.JInternalFrame {

   //alejandro.moritasayco@gmail.com
    
    public InternalRegistrarVenta() {
        initComponents();
        cargarVendedores();
        cargarProductos();
        rellenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtObtenerPrecio = new javax.swing.JTextField();
        btnRegistrarVenta = new javax.swing.JButton();
        btnquicksort = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        comboBoxProducto = new javax.swing.JComboBox<>();
        comboBoxVendedor = new javax.swing.JComboBox<>();
        btnListadonormal = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setForeground(new java.awt.Color(102, 204, 255));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Registar Ventas de TV");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ingresar ID de vendedor : ");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ingresar ID de Producto : ");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingresar precio del Producto : ");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Detalle de venta : ");

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID empleado", "ID Producto", "Precio", "Detalle de venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaVentas);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        txtObtenerPrecio.setText(" ");
        txtObtenerPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObtenerPrecioActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnquicksort.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnquicksort.setForeground(new java.awt.Color(255, 255, 255));
        btnquicksort.setText("Quick Sort (Ordena por precio, mayor a menor)");
        btnquicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquicksortActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Nombre de Cliente:");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        comboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProductoActionPerformed(evt);
            }
        });

        comboBoxVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVendedorActionPerformed(evt);
            }
        });

        btnListadonormal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListadonormal.setForeground(new java.awt.Color(255, 255, 255));
        btnListadonormal.setText("Listado Normal");
        btnListadonormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadonormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtObtenerPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(comboBoxProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnRegistrarVenta)
                        .addGap(42, 42, 42)
                        .addComponent(btnquicksort)
                        .addGap(31, 31, 31)
                        .addComponent(btnListadonormal)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(258, 258, 258))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(comboBoxVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(comboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtObtenerPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnquicksort)
                            .addComponent(btnRegistrarVenta)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnListadonormal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarVendedores() {
        Connection con = conexionController.conectar(); 
        VendedorDAO vendedordao = new VendedorDAO(con);
        List<VendedorEntity> ListaVendedores = vendedordao.obtenerIDVendedor();
        
        for (VendedorEntity vendedor : ListaVendedores) {
            String nombreCompleto = vendedor.getNombres()+' '+vendedor.getApellidos();
            System.out.println("Vendedor encontrado con id: " + nombreCompleto);
            comboBoxVendedor.addItem(nombreCompleto);
        }       
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
   private void cargarProductos() {
        Connection con = conexionController.conectar();
        ProductosDAO productodao = new ProductosDAO(con);
        List<ProductoEntity> listaProductos = productodao.obtenerProductos();
        System.out.println("Lista de productos: "+listaProductos);
        for (ProductoEntity producto : listaProductos) {
            System.out.println("Descripcion de producto: " + producto.getModelo());
            String modelo = producto.getModelo();
            comboBoxProducto.addItem(modelo);
        }
        
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }  


 
      
    private void txtObtenerPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObtenerPrecioActionPerformed
      
    }//GEN-LAST:event_txtObtenerPrecioActionPerformed
    
    public void rellenarTabla(){
        Connection con = conexionController.conectar();
        VentasDAO ventaDAO = new VentasDAO(con);
        String[] columnNames = {"idempleado", "idproducto", "monto", "detalle"};
        DefaultTableModel modelo = new DefaultTableModel(columnNames, 0);
                
        List<VentaEntity> listaVentas =     ventaDAO.obtenerVentas();
        
        for (VentaEntity v : listaVentas) {
            Object[] fila = {v.getIdVendedor(), v.getIdProducto(), v.getMontoVenta(), v.getDetalleVenta()};
            modelo.addRow(fila);
        }
        tablaVentas.setModel(modelo);
    }
    
    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        try {
                Connection con = conexionController.conectar(); // Establece la conexión

                // Obtén el vendedor y producto seleccionados
               int selectedIdVendedor = 0;
               selectedIdVendedor = Integer.parseInt((String) comboBoxVendedor.getSelectedItem());
               
               int selectedIdProducto = 0;
               selectedIdProducto = Integer.parseInt((String) comboBoxProducto.getSelectedItem());
               

                // Verifica que se haya seleccionado un vendedor y un producto
                if (selectedIdVendedor == 0 || selectedIdProducto == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona un vendedor y un producto.");
                    return;
                }

                String cliente= txtCliente.getText().trim();
                float montoVenta = Float.parseFloat(txtObtenerPrecio.getText().trim());
                String detalleVenta = jTextArea1.getText().trim();  


                // Crear una nueva instancia de VentaEntity
                VentasDAO nuevaVenta = new VentasDAO(con);
                
                Boolean exito = nuevaVenta.registrarVenta(selectedIdVendedor, selectedIdProducto, cliente, montoVenta, detalleVenta);
                
                if(exito) JOptionPane.showMessageDialog(null, "Venta registrada exitosamente.");
                
                String[] columnNames = {"idempleado", "idproducto", "monto", "detalle"};
        
                DefaultTableModel modelo = new DefaultTableModel(columnNames, 0);
                
                List<VentaEntity> listaVentas = nuevaVenta.obtenerVentas();
        
                for (VentaEntity v : listaVentas) {
                    Object[] fila = {v.getIdVendedor(), v.getIdProducto(), v.getMontoVenta(), v.getDetalleVenta()};
                    modelo.addRow(fila);
                }
        
                tablaVentas.setModel(modelo);
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El monto de la venta no es válido.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar la venta: " + ex.getMessage());
            }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void comboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProductoActionPerformed
        // TODO add your handling code here:
        Connection con = conexionController.conectar();
        
        String selectedItem = (String)comboBoxProducto.getSelectedItem();

    if (selectedItem != "") {
        String modeloProd = selectedItem;

        ProductosDAO productodao = new ProductosDAO(con);
        ProductoEntity producto = productodao.obtenerProductoPorModelo(modeloProd);

        if (producto != null) {
            float precio = producto.getPrecio();
            String detalle = producto.getDetalle();

            txtObtenerPrecio.setText(String.valueOf(precio));
            jTextArea1.setText(detalle); 
        } else {
            System.out.println("Producto no encontrado con id: " + modeloProd);
        }
    } else {
        System.out.println("No hay producto seleccionado.");
        }
    }//GEN-LAST:event_comboBoxProductoActionPerformed

    private void btnquicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquicksortActionPerformed
        try {
        // Obtener la lista actual de ventas
        VentasDAO ventaDAO = new VentasDAO(conexionController.conectar());
        List<VentaEntity> listaVentas = ventaDAO.obtenerVentas();

        // Ordenar la lista por precio utilizando el método de QuickSort
        quicksort quickSort = new quicksort();
        quickSort.ordenar(listaVentas); // Asegúrate de que el método de QuickSort esté adaptado para trabajar con listas de VentaEntity

        // Rellenar la tabla con los datos ordenados
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"idempleado", "idproducto", "monto", "detalle"}, 0);
        for (VentaEntity v : listaVentas) {
            Object[] fila = {v.getIdVendedor(), v.getIdProducto(), v.getMontoVenta(), v.getDetalleVenta()};
            modelo.addRow(fila);
        }
        tablaVentas.setModel(modelo);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al ordenar: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnquicksortActionPerformed

    private void btnListadonormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadonormalActionPerformed
        // TODO add your handling code here:
        rellenarTabla();
    }//GEN-LAST:event_btnListadonormalActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void comboBoxVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVendedorActionPerformed
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListadonormal;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnquicksort;
    private javax.swing.JComboBox<String> comboBoxProducto;
    private javax.swing.JComboBox<String> comboBoxVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtObtenerPrecio;
    // End of variables declaration//GEN-END:variables


}
