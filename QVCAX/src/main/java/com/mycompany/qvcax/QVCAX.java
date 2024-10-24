/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/
package com.mycompany.qvcax;

import Forms.FormProductsModels;
import Model.WeightDims;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author andre
 */
public class QVCAX extends javax.swing.JFrame {

    private JFileChooser seleccion = null;
    File archivoOrdenesAX = null;
    File archivoEOD = null;
    File archivoTrackingumber = null;
    
    FileWriter fileQVCUpload = null;
    BufferedWriter bufferGrabarQVCUpload = null;    

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCellStyle style;
    
    ArrayList<WeightDims> listaWeightDims = null;
    String nombreArchivo = " ";
    String salida = " ";
    String lineaCSV = " ";  
    String [] celdasRow;
    String [] encabezados;
    
    ImageIcon iconCarpeta = new ImageIcon("images\\carpeta.png");
    ImageIcon iconFlecha = new ImageIcon("images\\flecha.png");
    
    FormProductsModels formProductsModels;
    
    int contadorFilas = 0;
    int contadorCeldas = 0;
    
    public QVCAX() {
        initComponents();
        
        jLabel1.setIcon(iconCarpeta);
        jLabel2.setIcon(iconCarpeta);
        jLabel3.setIcon(iconFlecha);
        jLabel4.setIcon(iconFlecha);
        
        seleccion = new JFileChooser();   
        listaWeightDims = new <WeightDims>ArrayList();
        formProductsModels = new FormProductsModels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAXOrders = new javax.swing.JButton();
        botonEOD = new javax.swing.JButton();
        botonProceso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        botonTrackingNumber = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador QVCUpLoad - Tracking number format");
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        botonAXOrders.setText("Select AX open orders file");
        botonAXOrders.setMaximumSize(new java.awt.Dimension(297, 35));
        botonAXOrders.setMinimumSize(new java.awt.Dimension(297, 35));
        botonAXOrders.setPreferredSize(new java.awt.Dimension(297, 35));
        botonAXOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAXOrdersActionPerformed(evt);
            }
        });

        botonEOD.setText("Select EOD file");
        botonEOD.setMaximumSize(new java.awt.Dimension(297, 35));
        botonEOD.setMinimumSize(new java.awt.Dimension(297, 35));
        botonEOD.setPreferredSize(new java.awt.Dimension(297, 35));
        botonEOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEODActionPerformed(evt);
            }
        });

        botonProceso.setText("Process to QVCUpload.csv");
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

        botonTrackingNumber.setText("Process to Tracking number format");
        botonTrackingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrackingNumberActionPerformed(evt);
            }
        });

        jMenu1.setText("ProductsModels");

        jMenuItem1.setText("Update");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEOD, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(botonAXOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonTrackingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonAXOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTrackingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesoActionPerformed
        boolean procesoOk = true;
        if (formProductsModels.isTestUpdate()){
            areaTexto.append("Products Models without updating. Please close the Product Models window.\n");
            JOptionPane.showMessageDialog(null, "Products Models without updating. \nPlease close the Product Models window.");
            procesoOk = false;
        }
        
        if (archivoOrdenesAX == null || !archivoOrdenesAX.isFile()) {
            areaTexto.append("Error en la selección de las OrdenesAX\n\n");
            procesoOk = false;
        }
        if (procesoOk) {
            generarListaWeightDims();
            generarQVCUpload();
        } else {
            areaTexto.append("Error en los archivos seleccionados\n\n");
        }
    }//GEN-LAST:event_botonProcesoActionPerformed

    private void botonEODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEODActionPerformed

        archivoEOD = seleccionarArchivo(2);
    }//GEN-LAST:event_botonEODActionPerformed

    private void botonAXOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAXOrdersActionPerformed

        archivoOrdenesAX = seleccionarArchivo(1);
    }//GEN-LAST:event_botonAXOrdersActionPerformed

    private void botonTrackingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrackingNumberActionPerformed
        boolean procesoOk = true;
        if (archivoEOD == null || !(archivoEOD.isFile())) {
            areaTexto.append("Error en la selección del archivo EOD\n\n");
            procesoOk = false;
        }
        if (procesoOk) {
            generarTrackingNumber();
        } else {
            areaTexto.append("Error en los archivos seleccionados\n\n");
        }
    }//GEN-LAST:event_botonTrackingNumberActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        formProductsModels.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(QVCAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QVCAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QVCAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QVCAX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QVCAX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botonAXOrders;
    private javax.swing.JButton botonEOD;
    private javax.swing.JButton botonProceso;
    private javax.swing.JButton botonTrackingNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private File seleccionarArchivo(int testFile) {
        int result = seleccion.showOpenDialog(null);
        File archivo = seleccion.getSelectedFile();
        // validar archivo.exists() archivo.isFile()
        if (result == JFileChooser.APPROVE_OPTION) {
            salida = archivo.getPath() + " | " + archivo.getName();
            System.out.println("Salida = " + salida);
            nombreArchivo = archivo.getName();
            switch(testFile){
                case 1:            
                    if (!(nombreArchivo.contains(".xls"))) {
                        salida += " | La interface no es una Hoja Electronica\n\n";
                    }
                    break;
                case 2:   
                    if (!(nombreArchivo.contains(".xls"))) {
                        salida += " | La interface no es una Hoja Electronica\n\n";
                    }                    
            }
            salida += "\n\n";
            areaTexto.append(salida);
                        
        } else if (result == JFileChooser.CANCEL_OPTION) {
            areaTexto.append("Cancelar Seleccion\n\n");
        }

        return archivo;
    }

    private void generarQVCUpload() {
        //
        areaTexto.append("\n********** generarQVCUpload **********\n");
        
        LocalDateTime objFechaHora = LocalDateTime.now();
        String fechaHora = objFechaHora.toString();
        fechaHora = fechaHora.replace(':', '.').replace("-", "");
        
        try {
            fileQVCUpload = new FileWriter(archivoOrdenesAX.getPath().replace(archivoOrdenesAX.getName(),
                    "QVCUpload" + fechaHora.substring(0, 8) + ".csv"));
            bufferGrabarQVCUpload = new BufferedWriter(fileQVCUpload);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "generarQVCUpload.fileQVCUpload." + ex.getMessage());
        }
        
        FileInputStream archivoXLS;     
        try {
            archivoXLS = new FileInputStream(new File(archivoOrdenesAX.getPath()));

            // Creamos el objeto iterator = recorrer filas
            Iterator<Row> rowIterator = null;
            
            try {
                
                if (archivoOrdenesAX.getName().contains(".xlsx")) {
                    // Crear el objeto que tendrá el libro de Excel                    
                    XSSFWorkbook workbook = new XSSFWorkbook(archivoXLS); 
                    // Seleccionar la primera hoja del workbook
                    XSSFSheet sheet = workbook.getSheetAt(0);  
                    rowIterator = sheet.iterator();                    
                }else {
                    HSSFWorkbook workbookOld = new HSSFWorkbook(archivoXLS); 
                    HSSFSheet sheetOld = workbookOld.getSheetAt(0);                 
                    rowIterator = sheetOld.iterator();                    
                }
                
                Row row;
                // Ignorar Encabezados
                if (rowIterator.hasNext()) {
                    rowIterator.next();
                }  
                // Grabar Nuevo Encabezado QVCUpload()
                salida = crearEncabezadoQVCUpload();            
                bufferGrabarQVCUpload.write(salida + "\r\n");
                areaTexto.append(salida + "\n");                
                // Recorremos todas las filas
                while (rowIterator.hasNext()) {
                    row = rowIterator.next();

                    //System.out.println("Fila #"+(++contadorFilas));
                    // Creamos el objeto iterator = recorrer las celdas * fila
                    Iterator<Cell> cellIterator = row.cellIterator();
                    Cell celda;

                    contadorCeldas = 0;
                    celdasRow = new String[30];

                    while (cellIterator.hasNext()) {

                        celda = cellIterator.next();
                        
                        //Dependiendo del formato de la celda el valor se debe mostrar como String, Fecha, boolean, entero...
                        //System.out.println("Celda #"+contadorCeldas+"|Tipo Celda = "+celda.getCellType()+"|"+celda.getCellType().ordinal()+"|"+celda.toString());
                        
                        celdasRow[contadorCeldas] = celda.toString();
                        contadorCeldas++;                        
                        
                    }
                    //
                    salida = generarSalidaQVCUpload();
                    areaTexto.append(salida + "\n");                
                    // 
                    try {
                        bufferGrabarQVCUpload.write(salida + "\r\n");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "generarQVCUpload.bufferGrabarQVCUpload." + ex.getMessage());
                    }                    
                    //
                }
                // cerramos el libro excel
                archivoXLS.close();
                bufferGrabarQVCUpload.close();
                areaTexto.append("Fin proceso generarQVCUpload" + "\n");                
                //
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "generarQVCUpload()."+ex.getMessage());
            }
        
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "generarQVCUpload()."+ex.getMessage());
        }
    }

    private void generarTrackingNumber() {
        //
        areaTexto.append("\n********** generarTrackingNumber **********\n");

        LocalDateTime objFechaHora = LocalDateTime.now();
        String fechaHora = objFechaHora.toString();
        fechaHora = fechaHora.replace(':', '.');
        
        FileInputStream archivoXLS;     
        try {
            archivoXLS = new FileInputStream(new File(archivoEOD.getPath()));

            // Creamos el objeto iterator = recorrer filas
            Iterator<Row> rowIterator = null;
            
            try {
                
                if (archivoEOD.getName().contains(".xlsx")) {
                    // Crear el objeto que tendrá el libro de Excel                    
                    XSSFWorkbook workbook = new XSSFWorkbook(archivoXLS); 
                    // Seleccionar la primera hoja del workbook
                    XSSFSheet sheet = workbook.getSheetAt(0);  
                    rowIterator = sheet.iterator();                    
                }else {
                    HSSFWorkbook workbookOld = new HSSFWorkbook(archivoXLS); 
                    HSSFSheet sheetOld = workbookOld.getSheetAt(0);                 
                    rowIterator = sheetOld.iterator();                    
                }
                
                Row row;
                // Ignorar Encabezados
                if (rowIterator.hasNext()) {
                    rowIterator.next();
                }  
                // Grabar work book TrackingNumber
                crearWorkBook();   
                // Recorremos todas las filas
                while (rowIterator.hasNext()) {
                    row = rowIterator.next();

                    //System.out.println("Fila #"+(++contadorFilas));
                    // Creamos el objeto iterator = recorrer las celdas * fila
                    Iterator<Cell> cellIterator = row.cellIterator();
                    Cell celda;

                    contadorCeldas = 0;
                    celdasRow = new String[15];

                    while (cellIterator.hasNext()) {

                        celda = cellIterator.next();
                        
                        //Dependiendo del formato de la celda el valor se debe mostrar como String, Fecha, boolean, entero...
                        //System.out.println("Celda #"+contadorCeldas+"|Tipo Celda = "+celda.getCellType()+"|"+celda.getCellType().ordinal()+"|"+celda.toString());
                        
                        celdasRow[contadorCeldas] = celda.toString();
                        contadorCeldas++;                        
                        
                    }
                    //
                    crearRowWorkBook();                    
                    // 
                }
                // cerramos el libro excel
                archivoXLS.close();
                //
                fechaHora = fechaHora.replace("-", "");            
                archivoTrackingumber = new File(archivoEOD.getPath().replace(archivoEOD.getName(),
                        "TrackingNumber" + fechaHora.substring(0, 8) + ".xlsx"));

                try (FileOutputStream outputOrdenesDespacho = new FileOutputStream(archivoTrackingumber)) {
                    workbook.write(outputOrdenesDespacho);
                }       
                areaTexto.append("Fin proceso generarTrackingNumber" + "\n");
                //
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "generarTrackingNumber()."+ex.getMessage());
            }
        
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "generarTrackingNumber()."+ex.getMessage());
        }        
    }

    private String crearEncabezadoQVCUpload() {
        return "Name,Attention,Address,Add2,City,State,Zip,Service,L,W,H,Weight,Ref1,Ref2,Ref3,PackageType,BillTo";
    }

    private String generarSalidaQVCUpload() {
        WeightDims weightDims = buscarWeightDims(celdasRow[13]);
        celdasRow[18] = celdasRow[18].replace(',', '.').replace('\r', ' ').replace('\n', ' ').replace("  ", "");
        //System.out.println(celdasRow[18]);
        return  celdasRow[1].toUpperCase()+","+ // #1
                ","+ // #2
                celdasRow[18]+","+ // #3
                ","+ // #4
                celdasRow[21]+","+ // #5
                celdasRow[22]+","+ // #6 
                celdasRow[23]+","+ // #7
                celdasRow[10]+","+ // #8
                weightDims.getL()+","+ // #9
                weightDims.getW()+","+ // #10
                weightDims.getH()+","+ // #11
                weightDims.getWeight()+","+ // #12
                celdasRow[13]+","+ // #13
		celdasRow[11] + ","+ // #14
                celdasRow[2] + ","+ // #15
                "CP" + ","+ // #16
                "SHP" // #17
                ;
    }
        
    private WeightDims buscarWeightDims(String celda) {
        WeightDims weightDimsBusqueda = new WeightDims("ERROR", "99", "99", "99", "99");
        for (WeightDims weightDims : listaWeightDims) {
            if (weightDims.getModelo().contains(celda)) {
                weightDimsBusqueda = weightDims;
                break;
            }
        }
        return weightDimsBusqueda;
    }
    
    private void crearWorkBook() {
        // Creamos nuestro libro de excel
        workbook = new XSSFWorkbook();
        // Creamos una hoja de calculo llama "AXQVC"
        sheet = workbook.createSheet("ShipConfirm");
        //
        style = workbook.createCellStyle();
        // Eqiquetas Encabezado        
        String etiquetas = "Order ID;Tacking #;Fee Code;Fee;Description;Column1;REFERENCE";

        encabezados = etiquetas.split(";");
        //
        Row rowEncabezado = sheet.createRow(contadorFilas++);
        style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
        for (int i = 0; i < encabezados.length; i++) {
            Cell celda = rowEncabezado.createCell(i);
            celda.setCellValue(encabezados[i]);
            celda.setCellStyle(style);
        }
    }

    private void crearRowWorkBook() {
        // Creamos una fila en la posicion indicada
        salida = "|";
        Row fila = sheet.createRow(contadorFilas++);
        
        if (celdasRow[7].contains("SO")){
            Cell celda = fila.createCell(0);
            celda.setCellValue(celdasRow[7]);
            salida+=fila.getCell(0)+"|";
            //
            celda = fila.createCell(1);
            celda.setCellValue(celdasRow[10]);	    
            salida+=fila.getCell(1)+"|";
            //
            celda = fila.createCell(2);
            celda.setBlank();
            //
            celda = fila.createCell(3);
            celda.setBlank();
            //
            celda = fila.createCell(4);
            celda.setBlank();
            //
            celda = fila.createCell(5);
            celda.setBlank();
            //
            celda = fila.createCell(6);
            celda.setBlank();
            salida+=fila.getCell(6)+"|";
        } else {
            Cell celda = fila.createCell(0);
            celda.setCellValue(celdasRow[8]);	
            salida+=fila.getCell(0)+"|";
            //
            celda = fila.createCell(1);
            celda.setCellValue(celdasRow[11]);	
            salida+=fila.getCell(1)+"|";
            //
            celda = fila.createCell(2);
            celda.setBlank();
            //
            celda = fila.createCell(3);
            celda.setBlank();
            //
            celda = fila.createCell(4);
            celda.setBlank();
            //
            celda = fila.createCell(5);
            celda.setBlank();
            //
            celda = fila.createCell(6);
            celda.setBlank();
            salida+=fila.getCell(6)+"|";
        }
        areaTexto.append(salida + "\n"); 
    }

    private void generarListaWeightDims() {

        areaTexto.append("\n********** generarListaWeightDims **********\n");
        nombreArchivo = "WeightDimsCSV.csv";
        try ( BufferedReader fileEntrada = new BufferedReader(new FileReader(nombreArchivo))) {

            while ((salida = fileEntrada.readLine()) != null) {

                String[] celdas = salida.split(";");
                
                WeightDims weightDims = new WeightDims(celdas[0], celdas[1], 
                        celdas[2], celdas[3], celdas[4]);
                listaWeightDims.add(weightDims);
                areaTexto.append(weightDims + "\n");

            }
            fileEntrada.close();            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "generarListaWeightDims().fileEntrada." + e.getMessage());
        }
    }
    
}
