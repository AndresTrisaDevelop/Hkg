/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ATriana
 */
public class BodegasEstados {
    private String estadoID;
    private String nombreEstado;
    private String bodegaID;

    public BodegasEstados(String estadoID, String nombreEstado, String bodegaID) {
        this.estadoID = estadoID;
        this.nombreEstado = nombreEstado;
        this.bodegaID = bodegaID;
    }

    public String getEstadoID() {
        return estadoID;
    }

    public void setEstadoID(String estadoID) {
        this.estadoID = estadoID;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getBodegaID() {
        return bodegaID;
    }

    public void setBodegaID(String bodegaID) {
        this.bodegaID = bodegaID;
    }

    @Override
    public String toString() {
        return "BodegasEstados{" + "estadoID=" + estadoID + ", nombreEstado=" + nombreEstado + ", bodegaID=" + bodegaID + '}';
    }   
    
    public static ArrayList<BodegasEstados> asignarWarehouseStates() {
        ArrayList <BodegasEstados> listaBodegasEstados = new <BodegasEstados> ArrayList();

        listaBodegasEstados.add(new BodegasEstados("AK", "ALASKA", "999"));
        listaBodegasEstados.add(new BodegasEstados("AL", "ALABAMA", "002"));
        listaBodegasEstados.add(new BodegasEstados("AR", "ARKANSAS", "008"));
        listaBodegasEstados.add(new BodegasEstados("AZ", "ARIZONA", "008"));
        listaBodegasEstados.add(new BodegasEstados("CA", "CALIFORNIA", "008"));
        listaBodegasEstados.add(new BodegasEstados("CO", "COLORADO", "008"));
        listaBodegasEstados.add(new BodegasEstados("CT", "CONNECTICUT", "002"));
        listaBodegasEstados.add(new BodegasEstados("DE", "DELAWARE", "002"));
        listaBodegasEstados.add(new BodegasEstados("FL", "FLORIDA", "002"));
        listaBodegasEstados.add(new BodegasEstados("GA", "GEORGIA", "002"));
        listaBodegasEstados.add(new BodegasEstados("HI", "HAWAI", "999"));
        listaBodegasEstados.add(new BodegasEstados("IA", "IOWA", "002"));
        listaBodegasEstados.add(new BodegasEstados("ID", "IDAHO", "008"));
        listaBodegasEstados.add(new BodegasEstados("IL", "ILLINOIS", "002"));
        listaBodegasEstados.add(new BodegasEstados("IN", "INDIANA", "002"));
        listaBodegasEstados.add(new BodegasEstados("KS", "KANSAS", "008"));
        listaBodegasEstados.add(new BodegasEstados("KY", "KENTUCKY", "002"));
        listaBodegasEstados.add(new BodegasEstados("LA", "LUISIANA", "008"));
        listaBodegasEstados.add(new BodegasEstados("MA", "MASSACHUSETTS", "002"));
        listaBodegasEstados.add(new BodegasEstados("MD", "MARYLAND", "002"));
        listaBodegasEstados.add(new BodegasEstados("ME", "MAINE", "002"));
        listaBodegasEstados.add(new BodegasEstados("MI", "MICHIGAN", "002"));
        listaBodegasEstados.add(new BodegasEstados("MN", "MINNESOTA", "002"));
        listaBodegasEstados.add(new BodegasEstados("MO", "MISURI", "002"));
        listaBodegasEstados.add(new BodegasEstados("MS", "MISISIPI", "002"));
        listaBodegasEstados.add(new BodegasEstados("MT", "MONTANA", "008"));
        listaBodegasEstados.add(new BodegasEstados("NC", "CAROLINA DEL NORTE", "002"));
        listaBodegasEstados.add(new BodegasEstados("ND", "DAKOTA DEL NORTE", "008"));
        listaBodegasEstados.add(new BodegasEstados("NE", "NEBRASKA", "008"));
        listaBodegasEstados.add(new BodegasEstados("NH", "NUEVO HAMPSHIRE", "002"));
        listaBodegasEstados.add(new BodegasEstados("NJ", "NUEVA JERSEY", "002"));
        listaBodegasEstados.add(new BodegasEstados("NM", "NUEVO MEXICO", "008"));
        listaBodegasEstados.add(new BodegasEstados("NV", "NEVADA", "008"));
        listaBodegasEstados.add(new BodegasEstados("NY", "NUEVA YORK", "002"));
        listaBodegasEstados.add(new BodegasEstados("OH", "OHIO", "002"));
        listaBodegasEstados.add(new BodegasEstados("OK", "OKLAHOMA", "008"));
        listaBodegasEstados.add(new BodegasEstados("OR", "OREGON", "008"));
        listaBodegasEstados.add(new BodegasEstados("PA", "PENSILVANIA", "002"));
        listaBodegasEstados.add(new BodegasEstados("RI", "RHODE ISLAND", "002"));
        listaBodegasEstados.add(new BodegasEstados("SC", "CAROLINA DEL SUR", "002"));
        listaBodegasEstados.add(new BodegasEstados("SD", "DAKOTA DEL SUR", "008"));
        listaBodegasEstados.add(new BodegasEstados("TN", "TENNESSEE", "002"));
        listaBodegasEstados.add(new BodegasEstados("TX", "TEXAS", "008"));
        listaBodegasEstados.add(new BodegasEstados("UT", "UTAH", "008"));
        listaBodegasEstados.add(new BodegasEstados("VA", "VIRGINIA", "002"));
        listaBodegasEstados.add(new BodegasEstados("VT", "VERMONT", "002"));
        listaBodegasEstados.add(new BodegasEstados("WA", "WASHINGTON", "008"));
        listaBodegasEstados.add(new BodegasEstados("WI", "WISCONSIN", "002"));
        listaBodegasEstados.add(new BodegasEstados("WV", "VIRGINIA OCCIDENTAL", "002"));
        listaBodegasEstados.add(new BodegasEstados("WY", "WYOMING", "008"));

        return listaBodegasEstados;
    }    
    
}
