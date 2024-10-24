/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class DataBase {
    private String connectionUrl
            = "jdbc:sqlserver://;servername=hkgazuresql.database.windows.net;"
            + "database=HKGPricing;"
            + "user=adminsql;"
            + "password=s2VsWmcQ98ytQ44;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";
    
    private Connection connection = null;    
    private Statement statement = null;
    private ResultSet resultSet = null;

    public DataBase() {
        
        try {            
            connection = DriverManager.getConnection(connectionUrl);
            
            if (connection == null){
                JOptionPane.showMessageDialog( null, "Conexion().!!!ERROR!!! Azure sin Conexión");
                System.exit(0);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog( null, "Conexion()."+e.getMessage());
            System.exit(0);
        }        
    }

    public ArrayList<BodegasEstados> consultarWarehouseStates() {
        ArrayList <BodegasEstados> listaBodegasEstados = new <BodegasEstados> ArrayList();
        try {
            statement = connection.createStatement();
            if (statement != null){
                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from WarehouseStates order by Abrev";
                resultSet = statement.executeQuery(selectSql);

                // Print results from select statement
                while (resultSet.next()) {
                    BodegasEstados bodegaEstado = new BodegasEstados(resultSet.getString(4),
                                    resultSet.getString(2),
                                    resultSet.getString(5));  
                    listaBodegasEstados.add(bodegaEstado);                    
                    System.out.println(resultSet.getString(2) + "|" + resultSet.getString(4)
                            + "|" + resultSet.getString(5)
                            );
                }              
            }           
        } 
        catch  (SQLException e) {
            JOptionPane.showMessageDialog( null, "consultarWarehouseStates()."+e.getMessage());
        }
        return listaBodegasEstados;
    }

    public void consultarInventOnHand(String SKU) {
        try {
            statement = connection.createStatement();
            if (statement != null){
                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT ITEMID, INVENTSITEID, SUM(AVAILINVENT) from InventOnHand$ where ITEMID = "+"\'"+SKU+"\'"
                        + " group by ITEMID, INVENTSITEID"
                        ;
                resultSet = statement.executeQuery(selectSql);

                // Print results from select statement
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1) + "|" + resultSet.getString(2)
                            + "|" + resultSet.getString(3) + "|" 
                            );
                }              
            }           
        } 
        catch  (SQLException e) {
            JOptionPane.showMessageDialog( null, "consultarInventOnHand()."+e.getMessage());
        }        
    }    
}
