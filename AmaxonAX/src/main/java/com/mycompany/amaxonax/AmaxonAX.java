/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.amaxonax;

import Model.BodegasEstados;
import Model.DataBase;
import Model.IndexByLabelsOrdersExcell;
import Model.IndexByLabelsPreciosExcell;
import Model.ItemOrdenProducto;
import Model.ProductoStock;
import Model.SalidaCSV;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class AmaxonAX extends javax.swing.JFrame {

    private DataBase dataBase = null;
    private JFileChooser seleccion = null;
    File archivoPrecios = null;
    File archivoOrdenes = null;

    FileWriter fileOrdenesPrecios = null;
    BufferedWriter bufferGrabarTXT = null;
    FileWriter fileAmaxonAX = null;
    BufferedWriter bufferGrabarCSV = null;

    ArrayList<SalidaCSV> listaSalidaCSV = null;
    ArrayList<ProductoStock> listaProductoStock = null;
    ArrayList<BodegasEstados> listaBodegasEstados = null;
    ArrayList<ItemOrdenProducto> listaOrdenProductos = null;
    IndexByLabelsPreciosExcell indexByLabelsPrecios = null;
    IndexByLabelsOrdersExcell indexByLabelsOrders = null;
    
    String nombreArchivo = " ";
    String salida = " ";
    String nuevoEncabezado = " "; // Add 4 columnas al inicio
    boolean bodega002 = false;
    boolean bodega008 = false;
    boolean bodega999 = false;
    
    public AmaxonAX() {
        initComponents();
        seleccion = new JFileChooser();
        dataBase = new DataBase();
        //listaBodegasEstados = dataBase.consultarWarehouseStates();
        listaBodegasEstados = dataBase.asignarWarehouseStates();
        listaProductoStock = new <ProductoStock>ArrayList();
        listaSalidaCSV = new <SalidaCSV>ArrayList();
        indexByLabelsPrecios = new IndexByLabelsPreciosExcell();
        indexByLabelsOrders = new IndexByLabelsOrdersExcell();
        //dataBase.consultarInventOnHand("107822");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonPrecios = new javax.swing.JButton();
        botonOrdenes = new javax.swing.JButton();
        botonProceso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor Interface Amazon a Interface AX");
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        botonPrecios.setText("Seleccionar Interface AMAXON - Precios");
        botonPrecios.setMaximumSize(new java.awt.Dimension(297, 35));
        botonPrecios.setMinimumSize(new java.awt.Dimension(297, 35));
        botonPrecios.setPreferredSize(new java.awt.Dimension(297, 35));
        botonPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPreciosActionPerformed(evt);
            }
        });

        botonOrdenes.setText("Seleccionar Interface AMAXON - Ordenes");
        botonOrdenes.setMaximumSize(new java.awt.Dimension(297, 35));
        botonOrdenes.setMinimumSize(new java.awt.Dimension(297, 35));
        botonOrdenes.setPreferredSize(new java.awt.Dimension(297, 35));
        botonOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenesActionPerformed(evt);
            }
        });

        botonProceso.setText("Generar Interface AX");
        botonProceso.setMaximumSize(new java.awt.Dimension(297, 35));
        botonProceso.setMinimumSize(new java.awt.Dimension(297, 35));
        botonProceso.setPreferredSize(new java.awt.Dimension(297, 35));
        botonProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesoActionPerformed(evt);
            }
        });

        areaTexto.setEditable(false);
        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesoActionPerformed
        boolean procesoOk = true;
        if (archivoPrecios == null || !archivoPrecios.isFile()) {
            areaTexto.append("Error en la selección de los Precios\n\n");
            procesoOk = false;
        }
        if (archivoOrdenes == null || !(archivoOrdenes.isFile())) {
            areaTexto.append("Error en la selección de las Ordenes\n\n");
            procesoOk = false;
        }
        if (procesoOk) {
            generarListaOrdenProductos();
            generarListaSalidaCSV();
            generarInterfaceAX();
        } else {
            areaTexto.append("Error en los archivos seleccionados\n\n");
        }
        try {
            dataBase.getConnection().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "dataBase.getConnection."+ex.getMessage());
        }
    }//GEN-LAST:event_botonProcesoActionPerformed

    private void botonOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenesActionPerformed

        archivoOrdenes = seleccionarArchivo();
    }//GEN-LAST:event_botonOrdenesActionPerformed

    private void botonPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreciosActionPerformed

        archivoPrecios = seleccionarArchivo();
    }//GEN-LAST:event_botonPreciosActionPerformed

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
            java.util.logging.Logger.getLogger(AmaxonAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmaxonAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmaxonAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmaxonAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmaxonAX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botonOrdenes;
    private javax.swing.JButton botonPrecios;
    private javax.swing.JButton botonProceso;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private File seleccionarArchivo() {
        int result = seleccion.showOpenDialog(null);
        File archivo = seleccion.getSelectedFile();
        // validar archivo.exists() archivo.isFile()
        if (result == JFileChooser.APPROVE_OPTION) {
            salida = archivo.getPath() + " | " + archivo.getName();
            System.out.println("Salida = " + salida);
            nombreArchivo = archivo.getName();
            if (!(nombreArchivo.contains(".txt"))) {
                salida += " | La interface no es un Archivo de Texto\n\n";
                areaTexto.append(salida);
            } else {
                salida += "\n\n";
                areaTexto.append(salida);
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            areaTexto.append("Cancelar Seleccion\n\n");
        }

        return archivo;
    }

    private void generarListaOrdenProductos() {
        //
        listaBodegasEstados.forEach((bodegaEstado) -> areaTexto.append(bodegaEstado.toString() + "\n"));
        areaTexto.append("\n");
        listaOrdenProductos = new <ItemOrdenProducto> ArrayList();
        //
        nombreArchivo = archivoPrecios.getPath();
        try ( BufferedReader fileEntrada = new BufferedReader(new FileReader(nombreArchivo))) {
            // Ignorar Encabezados - Determinar index Labels
            if ((salida = fileEntrada.readLine()) != null) {
                getIndexByLabelsPrecios(salida);
            }else{
                JOptionPane.showMessageDialog(null, "The interface Precios has no headers");
                System.exit(0);                
            }
            while ((salida = fileEntrada.readLine()) != null) {
                String[] celdas = salida.split("\t");
                ItemOrdenProducto producto = new ItemOrdenProducto(celdas[indexByLabelsPrecios.orderItemId], 
                        celdas[indexByLabelsPrecios.sku],
                        celdas[indexByLabelsPrecios.itemPrice], 
                        celdas[indexByLabelsPrecios.itemTax], 
                        celdas[indexByLabelsPrecios.quantityPurchased]);
                //areaTexto.append(producto.toString()+"\n");   
                listaOrdenProductos.add(producto);
            }
            fileEntrada.close();
            ordenarListaOrdenProductos();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "generarListaProductos()." + e.getMessage());
        }
    }

    private void ordenarListaOrdenProductos() {
        listaOrdenProductos.sort((ItemOrdenProducto p1, ItemOrdenProducto p2) -> p1.getOrderItemID().compareTo(p2.getOrderItemID()));
        areaTexto.append("\n********** listaOrdenProductosOrdenado **********\n");
        listaOrdenProductos.forEach((producto) -> areaTexto.append(producto.toString() + "\n"));
    }

    private void generarListaSalidaCSV() {
        LocalDateTime objFechaHora = LocalDateTime.now();
        String fechaHora = objFechaHora.toString();
        fechaHora = fechaHora.replace(':', '.');

        try {
            fileOrdenesPrecios = new FileWriter(archivoOrdenes.getPath().replace(archivoOrdenes.getName(),
                    "AXWork-" + fechaHora + ".txt"));
            bufferGrabarTXT = new BufferedWriter(fileOrdenesPrecios);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "generarInterfaceAX().fileOrdenesPrecios." + ex.getMessage());
            System.exit(0);
        }
        areaTexto.append("\n********** generarNuevaInterfaceOrdenes **********\n");
        nombreArchivo = archivoOrdenes.getPath();
        try ( BufferedReader fileEntrada = new BufferedReader(new FileReader(nombreArchivo))) {
            // Leer Encabezados
            salida = fileEntrada.readLine();
            // Determinar index Labels proceso preliminar
            if (salida != null) {
                getIndexByLabelsOrders(salida);
            } else {
                JOptionPane.showMessageDialog(null, "The interface Ordenes has no headers");
                System.exit(0);
            }
            // Grabar Nuevo Encabezado
            salida = "AssignedWharehouse" + "\t"
                    + "Wharehouse" + "\t"
                    + "item-price" + "\t"
                    + "item-tax" + "\t"
                    + salida;
            
            nuevoEncabezado = salida;
            bufferGrabarTXT.write(salida+"\r\n");
            areaTexto.append(salida + "\n");
            //
            while ((salida = fileEntrada.readLine()) != null) {
                String[] celdas = salida.split("\t");
                BodegasEstados bodegaEstado;
                
                if (celdas[indexByLabelsOrders.shipState].length()>2){
                    bodegaEstado = buscarBodegaEstadoNombre(celdas[indexByLabelsOrders.shipState]);
                } else {
                    bodegaEstado = buscarBodegaEstado(celdas[indexByLabelsOrders.shipState]);
                }
                
                ItemOrdenProducto itemProducto = buscarOrdenProducto(celdas[indexByLabelsOrders.orderItemId]);
                ProductoStock productoStock = asignarBodegaDisponibilidad(
                        bodegaEstado, itemProducto);

                salida = productoStock.getBodegaAsignada() + "\t"
                        + bodegaEstado.getBodegaID() + "\t"
                        + itemProducto.getPrecio() + "\t"
                        + itemProducto.getTax() + "\t" 
                        + salida;
                
                bufferGrabarTXT.write(salida+"\r\n");
                areaTexto.append(salida + "\n");
                
                SalidaCSV salidaCSV = new SalidaCSV(productoStock.getBodegaAsignada(),
                                    salida);
                listaSalidaCSV.add(salidaCSV);
            }
            fileEntrada.close();
            bufferGrabarTXT.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "generarInterfaceAX().fileEntrada." + e.getMessage());
        }
    }

    private ItemOrdenProducto buscarOrdenProducto(String celda) {
        ItemOrdenProducto productoBusqueda = new ItemOrdenProducto("", "", "Error", "Error", "Error");
        for (ItemOrdenProducto producto : listaOrdenProductos) {
            if (celda.equals(producto.getOrderItemID())) {
                productoBusqueda = producto;
                break;
            }
        }
        areaTexto.append(productoBusqueda.toString()+"\n");
        return productoBusqueda;
    }

    private BodegasEstados buscarBodegaEstado(String celda) {
        BodegasEstados bodegaBusqueda = new BodegasEstados("99", "Error", "999");
        for (BodegasEstados bodega : listaBodegasEstados) {
            if (celda.toUpperCase().equals(bodega.getEstadoID())) {
                bodegaBusqueda = bodega;
                break;
            }
        }
        areaTexto.append(bodegaBusqueda.toString()+"\n");
        return bodegaBusqueda;
    }

    private BodegasEstados buscarBodegaEstadoNombre(String celda) {
        BodegasEstados bodegaBusqueda = new BodegasEstados("99", "Error", "999");
        for (BodegasEstados bodega : listaBodegasEstados) {
            if (bodega.getNombreEstado().contains(celda.toUpperCase())) {
                bodegaBusqueda = bodega;
                break;
            }
        }
        areaTexto.append(bodegaBusqueda.toString()+"\n");
        return bodegaBusqueda;
    }
    
    private String ignorarCaracteresSKU(String celda) {
        int index = celda.indexOf('-');
        celda = celda.substring(0, index);
        return celda;
    }

    private ProductoStock asignarBodegaDisponibilidad(BodegasEstados bodegaEstado,
            ItemOrdenProducto itemProducto) {
        
        String sku = ignorarCaracteresSKU(itemProducto.getSKU());
        ProductoStock productoBusqueda = buscarProductoStock(sku);
        
        // Asignar Bodega x Disponibilidad
        int cantidad = Integer.parseInt(itemProducto.getCantidad());
        
        switch (bodegaEstado.getBodegaID()){
            case "002":
                if (productoBusqueda.getStock002() >= cantidad) {
                    productoBusqueda.setBodegaAsignada(bodegaEstado.getBodegaID());
                    productoBusqueda.setRestaStock002(cantidad);
                    bodega002 = true;
                } else if (productoBusqueda.getStock008() >= cantidad){
                    productoBusqueda.setBodegaAsignada("008");
                    productoBusqueda.setRestaStock008(cantidad);
                    bodega008 = true;
                } else {
                    productoBusqueda.setBodegaAsignada("999");
                    bodega999 = true;
                }
                break;
            case "008":
                if (productoBusqueda.getStock008() >= cantidad) {
                    productoBusqueda.setBodegaAsignada(bodegaEstado.getBodegaID());
                    productoBusqueda.setRestaStock008(cantidad);
                    bodega008 = true;
                } else if (productoBusqueda.getStock002() >= cantidad){
                    productoBusqueda.setBodegaAsignada("002");
                    productoBusqueda.setRestaStock002(cantidad); 
                    bodega002 = true;
                } else {
                    productoBusqueda.setBodegaAsignada("999");
                    bodega999 = true;
                }               
        }
        // Update Objeto
        listaProductoStock.set(productoBusqueda.getIndexLista(), productoBusqueda);
        //
        areaTexto.append(productoBusqueda.toString()+"\n");
        return productoBusqueda;
    }

    private ProductoStock buscarProductoStock(String sku) {
        ProductoStock productoBusqueda = new ProductoStock(sku);        
        boolean existeProducto = false;
        int indexLista = 0;
        
        if (!listaProductoStock.isEmpty()){
            for (ProductoStock producto : listaProductoStock) {
                if (sku.equals(producto.getSKU())) {
                    productoBusqueda = producto;
                    productoBusqueda.setIndexLista(indexLista);
                    existeProducto = true;
                    break;
                }
                indexLista++;
            }
        }
        
        if (!existeProducto){
            productoBusqueda = dataBase.consultarInventOnHand(sku);
            indexLista = listaProductoStock.size();
            productoBusqueda.setIndexLista(indexLista);
            listaProductoStock.add(productoBusqueda);  
            //indexLista = listaProductoStock.indexOf(productoBusqueda);
        }
        
        return productoBusqueda;
    }

    private void generarInterfaceAX() {
        areaTexto.append("\n********** generarInterfaceAX **********\n");
        // Determinar index Labels nuevo Encabezado
        if (nuevoEncabezado != null) {
            indexByLabelsOrders = new IndexByLabelsOrdersExcell(); // Valores en cero
            getIndexByLabelsOrders(nuevoEncabezado);
        } else {
            JOptionPane.showMessageDialog(null, "The interface Ordenes has no headers");
            System.exit(0);
        }        
        if (bodega002){
            generarInterfaceBodegaAX("002","Miami");
        }
        if (bodega008){
            generarInterfaceBodegaAX("008", "Laredo");
        }  
        if (bodega999){
            generarInterfaceBodegaAX("999", "NoAsignado");
        }
        areaTexto.append("Fin Proceso");
    }

    private void generarInterfaceBodegaAX(String bodega, String nombreBodega) {        
        areaTexto.append("\n********** generarInterfaceAX - Bodega "+bodega+nombreBodega+" **********\n");        
        LocalDateTime objFechaHora = LocalDateTime.now();
        String fechaHora = objFechaHora.toString();
        fechaHora = fechaHora.replace(':', '.');

        try {
            fileAmaxonAX  = new FileWriter(archivoOrdenes.getPath().replace(archivoOrdenes.getName(),
                    "AX"+nombreBodega + fechaHora + ".txt"));
            bufferGrabarCSV = new BufferedWriter(fileAmaxonAX);

            // Encabezados AX
            salida = crearEtiquetasAxCSV();
            bufferGrabarCSV.write(salida);
            areaTexto.append(salida);
            //
            for (SalidaCSV salidaCSV : listaSalidaCSV) {
                if (bodega.equals(salidaCSV.getBodegaAsignada())) {
                    salida = generarAxCSV(salidaCSV.getLineaCSV());
                    bufferGrabarCSV.write(salida);
                    areaTexto.append(salida);
                }
            } 
            bufferGrabarCSV.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "generarInterfaceBodegaAX().fileAmaxonAX." + ex.getMessage());
        }
    }

    private String crearEtiquetasAxCSV() {
        return  "order-id\t"+"order-item-id\t"+"purchase-date\t"+"payments-date\t"+"buyer-email\t"+
                "buyer-name\t"+"buyer-phone-number\t"+"sku\t"+"product-name\t"+"quantity-purchased\t"+
                "currency\t"+"item-price\t"+"item-tax\t"+"shipping-price\t"+"shipping-tax\t"+
                "gift-wrap-price\t"+"gift-wrap-tax\t"+"ship-service-level\t"+"recipient-name\t"+
                "ship-address-1\t"+"ship-address-2\t"+"ship-address-3\t"+"ship-city\t"+"ship-state\t"+
                "ship-postal-code\t"+"ship-country\t"+"ship-phone-number\t"+"tax-location-code\t"+
                "tax-location-city\t"+"tax-location-county\t"+"tax-location-state\t"+
                "per-unit-item-taxable-district\t"+"per-unit-item-taxable-city\t"+
                "per-unit-item-taxable-county\t"+"per-unit-item-taxable-state\t"+
                "per-unit-item-non-taxable-district\t"+"per-unit-item-non-taxable-city\t"+
                "per-unit-item-non-taxable-county\t"+"per-unit-item-non-taxable-state\t"+
                "per-unit-item-zero-rated-district\t"+"per-unit-item-zero-rated-city\t"+
                "per-unit-item-zero-rated-county\t"+"per-unit-item-zero-rated-state\t"+
                "per-unit-item-tax-collected-district\t"+"per-unit-item-tax-collected-city\t"+
                "per-unit-item-tax-collected-county\t"+"per-unit-item-tax-collected-state\t"+
                "per-unit-shipping-taxable-district\t"+"per-unit-shipping-taxable-city\t"+
                "per-unit-shipping-taxable-county\t"+"per-unit-shipping-taxable-state\t"+
                "per-unit-shipping-non-taxable-district\t"+"per-unit-shipping-non-taxable-city\t"+
                "per-unit-shipping-non-taxable-county\t"+"per-unit-shipping-non-taxable-state\t"+
                "per-unit-shipping-zero-rated-district\t"+"per-unit-shipping-zero-rated-city\t"+
                "per-unit-shipping-zero-rated-county\t"+"per-unit-shipping-zero-rated-state\t"+
                "per-unit-shipping-tax-collected-district\t"+" per-unit-shipping-tax-collected-city\t"+
                "per-unit-shipping-tax-collected-county\t"+"per-unit-shipping-tax-collected-state\t"+
                "per-unit-giftwrap-taxable-district\t"+"per-unit-giftwrap-taxable-city\t"+   
                "per-unit-giftwrap-taxable-county\t"+"per-unit-giftwrap-taxable-state\t"+
                "per-unit-giftwrap-non-taxable-district\t"+"per-unit-giftwrap-non-taxable-city\t"+
                "per-unit-giftwrap-non-taxable-county\t"+"per-unit-giftwrap-non-taxable-state\t"+
                "per-unit-giftwrap-zero-rated-district\t"+"per-unit-giftwrap-zero-rated-city\t"+
                "per-unit-giftwrap-zero-rated-county\t"+"per-unit-giftwrap-zero-rated-state\t"+
                "per-unit-giftwrap-tax-collected-district\t"+" per-unit-giftwrap-tax-collected-city\t"+
                "per-unit-giftwrap-tax-collected-county\t"+"per-unit-giftwrap-tax-collected-state\t"+
                "gift-wrap-type\t"+"gift-message-text\t"+"delivery-start-date\t"+"delivery-end-date\t"+
                "delivery-time-zone\t"+"delivery-Instructions\t"+"sales-channel\t"+"order-channel\t"+
                "order-channel-instance\t"+"external-order-id"+
                "\r\n";
    }

    private String generarAxCSV(String lineaCSV) {
        String[] celdasRow = lineaCSV.split("\t");
        celdasRow[indexByLabelsOrders.sku] = this.ignorarCaracteresSKU(celdasRow[indexByLabelsOrders.sku]);
        celdasRow[indexByLabelsOrders.productName]=celdasRow[indexByLabelsOrders.productName].replace('"', '?');
        celdasRow[indexByLabelsOrders.itemTax]=" "; // 21/02/2023 Solicitud Contabilidad
        
        return  celdasRow[indexByLabelsOrders.orderId]+"\t"+ // #1
                celdasRow[indexByLabelsOrders.orderItemId]+"\t"+ // #2
                celdasRow[indexByLabelsOrders.purchaseDate]+"\t"+ // #3
                celdasRow[indexByLabelsOrders.paymentsDate]+"\t"+ // #4
                celdasRow[indexByLabelsOrders.buyerEmail]+"\t"+ // #5
                celdasRow[indexByLabelsOrders.buyerName]+"\t"+ // #6 
                celdasRow[indexByLabelsOrders.buyerPhoneNumber]+"\t"+ // #7
                celdasRow[indexByLabelsOrders.sku]+"\t"+ // #8
                celdasRow[indexByLabelsOrders.productName]+"\t"+ // #9
                celdasRow[indexByLabelsOrders.quantityPurchased]+"\t"+ // #10
                "USD"+"\t"+ // #11
                celdasRow[indexByLabelsOrders.itemPrice]+"\t"+ // #12
                celdasRow[indexByLabelsOrders.itemTax]+"\t"+ // #13
                "\t"+"\t"+"\t"+"\t"+ // #14-15-16-17
                celdasRow[indexByLabelsOrders.shipServiceLevel]+"\t"+ // #18
                celdasRow[indexByLabelsOrders.recipientName]+"\t"+ // #19
                celdasRow[indexByLabelsOrders.shipAddress1]+"\t"+ // #20
                celdasRow[indexByLabelsOrders.shipAddress2]+"\t"+ // #21
                "\t"+ // #22
                celdasRow[indexByLabelsOrders.shipCity]+"\t"+ // #23
                celdasRow[indexByLabelsOrders.shipState]+"\t"+ // #24
                celdasRow[indexByLabelsOrders.shipPostalCode]+"\t"+ // #25
                celdasRow[indexByLabelsOrders.shipCountry]+"\t"+ // #26
                celdasRow[indexByLabelsOrders.buyerPhoneNumber]+"\t"+ // #27
                "\t"+"\t"+"\t"+ // #28-29-30
                "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ // #31-al-40
                "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ // #41-al-50
                "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ // #51-al-60
                "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ // #61-al-70
                "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ // #71-al-80
                "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ // #81-al-89
                "\r\n";        
    }

    private void getIndexByLabelsPrecios(String salida) {
        List<String> celdas = Arrays.asList(salida.split("\t"));
        Iterator<String> cellIterator = celdas.listIterator();
        String celda;
        byte contadorCampos=0;
        // index a partir de [0]
        byte indexLabel = -1; 
        while (cellIterator.hasNext()) {
            celda = cellIterator.next();
            indexLabel++;
            switch (celda) {
                case "order-item-id":
                    indexByLabelsPrecios.orderItemId = indexLabel;
                    contadorCampos++;
                    break;
                case "sku":
                    indexByLabelsPrecios.sku = indexLabel;
                    contadorCampos++;
                    break;
                case "quantity-purchased":
                    indexByLabelsPrecios.quantityPurchased = indexLabel;
                    contadorCampos++;
                    break;
                case "item-price":
                    indexByLabelsPrecios.itemPrice = indexLabel;
                    contadorCampos++;
                    break;
                case "item-tax":
                    indexByLabelsPrecios.itemTax = indexLabel;
                    contadorCampos++;
                    break;
            }
        }
        areaTexto.append(this.indexByLabelsPrecios.toString()+"\n\n");        
        if (contadorCampos<5){
            JOptionPane.showMessageDialog(null, "The interface Precios does not correspond to the work template");
            System.exit(0);
        }
    }

    private void getIndexByLabelsOrders(String encabezado) {
        List<String> celdas = Arrays.asList(encabezado.split("\t"));
        Iterator<String> cellIterator = celdas.listIterator();
        String celda;
        byte contadorCampos=0;
        // index a partir de [0]
        byte indexLabel = -1; 
        while (cellIterator.hasNext()) {
            celda = cellIterator.next();
            indexLabel++;
            switch (celda) {
                case "item-price"://1
                    indexByLabelsOrders.itemPrice = indexLabel;
                    contadorCampos++;
                    break;
                case "item-tax"://2
                    indexByLabelsOrders.itemTax = indexLabel;
                    contadorCampos++;
                    break;
                case "order-id"://3
                    indexByLabelsOrders.orderId = indexLabel;
                    contadorCampos++;
                    break;                
                case "order-item-id"://4
                    indexByLabelsOrders.orderItemId = indexLabel;
                    contadorCampos++;
                    break;
                case "purchase-date"://5
                    indexByLabelsOrders.purchaseDate = indexLabel;
                    contadorCampos++;
                    break;
                case "payments-date"://6
                    indexByLabelsOrders.paymentsDate = indexLabel;
                    contadorCampos++;
                    break;
                case "buyer-email"://7
                    indexByLabelsOrders.buyerEmail = indexLabel;
                    contadorCampos++;
                    break;
                case "buyer-name"://8
                    indexByLabelsOrders.buyerName = indexLabel;
                    contadorCampos++;
                    break;
                case "buyer-phone-number"://9
                    indexByLabelsOrders.buyerPhoneNumber = indexLabel;
                    contadorCampos++;
                    break;                    
                case "sku"://10
                    indexByLabelsOrders.sku = indexLabel;
                    contadorCampos++;
                    break;
                case "product-name"://11
                    indexByLabelsOrders.productName = indexLabel;
                    contadorCampos++;
                    break;                    
                case "quantity-purchased"://12
                    indexByLabelsOrders.quantityPurchased = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-service-level"://13
                    indexByLabelsOrders.shipServiceLevel = indexLabel;
                    contadorCampos++;
                    break;
                case "recipient-name"://14
                    indexByLabelsOrders.recipientName = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-address-1"://15
                    indexByLabelsOrders.shipAddress1 = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-address-2"://16
                    indexByLabelsOrders.shipAddress2 = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-city"://17
                    indexByLabelsOrders.shipCity = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-state"://18
                    indexByLabelsOrders.shipState = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-postal-code"://19
                    indexByLabelsOrders.shipPostalCode = indexLabel;
                    contadorCampos++;
                    break;
                case "ship-country"://20
                    indexByLabelsOrders.shipCountry = indexLabel;
                    contadorCampos++;
                    break;
            }
        }
        areaTexto.append(this.indexByLabelsOrders.toString()+"\n\n");
        // Nuevas columnas price + tax = 20
        if (!(contadorCampos>=18 && contadorCampos<=20)){
            JOptionPane.showMessageDialog(null, "The interface Ordenes does not correspond to the work template");
            System.exit(0);
        }
    }
}
