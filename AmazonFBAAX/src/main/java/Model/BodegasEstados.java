/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author andre
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
        listaBodegasEstados.add(new BodegasEstados("AL", "ALABAMA", "500"));
        listaBodegasEstados.add(new BodegasEstados("AR", "ARKANSAS", "500"));
        listaBodegasEstados.add(new BodegasEstados("AZ", "ARIZONA", "500"));
        listaBodegasEstados.add(new BodegasEstados("CA", "CALIFORNIA", "500"));
        listaBodegasEstados.add(new BodegasEstados("CO", "COLORADO", "500"));
        listaBodegasEstados.add(new BodegasEstados("CT", "CONNECTICUT", "500"));
        listaBodegasEstados.add(new BodegasEstados("DE", "DELAWARE", "500"));
        listaBodegasEstados.add(new BodegasEstados("FL", "FLORIDA", "500"));
        listaBodegasEstados.add(new BodegasEstados("GA", "GEORGIA", "500"));
        listaBodegasEstados.add(new BodegasEstados("HI", "HAWAI", "999"));
        listaBodegasEstados.add(new BodegasEstados("IA", "IOWA", "500"));
        listaBodegasEstados.add(new BodegasEstados("ID", "IDAHO", "500"));
        listaBodegasEstados.add(new BodegasEstados("IL", "ILLINOIS", "500"));
        listaBodegasEstados.add(new BodegasEstados("IN", "INDIANA", "500"));
        listaBodegasEstados.add(new BodegasEstados("KS", "KANSAS", "500"));
        listaBodegasEstados.add(new BodegasEstados("KY", "KENTUCKY", "500"));
        listaBodegasEstados.add(new BodegasEstados("LA", "LUISIANA", "500"));
        listaBodegasEstados.add(new BodegasEstados("MA", "MASSACHUSETTS", "500"));
        listaBodegasEstados.add(new BodegasEstados("MD", "MARYLAND", "500"));
        listaBodegasEstados.add(new BodegasEstados("ME", "MAINE", "500"));
        listaBodegasEstados.add(new BodegasEstados("MI", "MICHIGAN", "500"));
        listaBodegasEstados.add(new BodegasEstados("MN", "MINNESOTA", "500"));
        listaBodegasEstados.add(new BodegasEstados("MO", "MISURI", "500"));
        listaBodegasEstados.add(new BodegasEstados("MS", "MISISIPI", "500"));
        listaBodegasEstados.add(new BodegasEstados("MT", "MONTANA", "500"));
        listaBodegasEstados.add(new BodegasEstados("NC", "CAROLINA DEL NORTE", "500"));
        listaBodegasEstados.add(new BodegasEstados("ND", "DAKOTA DEL NORTE", "500"));
        listaBodegasEstados.add(new BodegasEstados("NE", "NEBRASKA", "500"));
        listaBodegasEstados.add(new BodegasEstados("NH", "NUEVO HAMPSHIRE", "500"));
        listaBodegasEstados.add(new BodegasEstados("NJ", "NUEVA JERSEY", "500"));
        listaBodegasEstados.add(new BodegasEstados("NM", "NUEVO MEXICO", "500"));
        listaBodegasEstados.add(new BodegasEstados("NV", "NEVADA", "500"));
        listaBodegasEstados.add(new BodegasEstados("NY", "NUEVA YORK", "500"));
        listaBodegasEstados.add(new BodegasEstados("OH", "OHIO", "500"));
        listaBodegasEstados.add(new BodegasEstados("OK", "OKLAHOMA", "500"));
        listaBodegasEstados.add(new BodegasEstados("OR", "OREGON", "500"));
        listaBodegasEstados.add(new BodegasEstados("PA", "PENSILVANIA", "500"));
        listaBodegasEstados.add(new BodegasEstados("RI", "RHODE ISLAND", "500"));
        listaBodegasEstados.add(new BodegasEstados("SC", "CAROLINA DEL SUR", "500"));
        listaBodegasEstados.add(new BodegasEstados("SD", "DAKOTA DEL SUR", "500"));
        listaBodegasEstados.add(new BodegasEstados("TN", "TENNESSEE", "500"));
        listaBodegasEstados.add(new BodegasEstados("TX", "TEXAS", "500"));
        listaBodegasEstados.add(new BodegasEstados("UT", "UTAH", "500"));
        listaBodegasEstados.add(new BodegasEstados("VA", "VIRGINIA", "500"));
        listaBodegasEstados.add(new BodegasEstados("VT", "VERMONT", "500"));
        listaBodegasEstados.add(new BodegasEstados("WA", "WASHINGTON", "500"));
        listaBodegasEstados.add(new BodegasEstados("WI", "WISCONSIN", "500"));
        listaBodegasEstados.add(new BodegasEstados("WV", "VIRGINIA OCCIDENTAL", "500"));
        listaBodegasEstados.add(new BodegasEstados("WY", "WYOMING", "500"));

        return listaBodegasEstados;
    }    
}
