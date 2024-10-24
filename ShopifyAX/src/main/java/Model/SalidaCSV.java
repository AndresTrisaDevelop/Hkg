/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author CiaTriana
 */
public class SalidaCSV {
    private String bodegaAsignada;
    private String lineaCSV;

    public SalidaCSV(String bodegaAsignada, String lineaCSV) {
        this.bodegaAsignada = bodegaAsignada;
        this.lineaCSV = lineaCSV;
    }

    public String getBodegaAsignada() {
        return bodegaAsignada;
    }

    public void setBodegaAsignada(String bodegaAsignada) {
        this.bodegaAsignada = bodegaAsignada;
    }

    public String getLineaCSV() {
        return lineaCSV;
    }

    public void setLineaCSV(String lineaCSV) {
        this.lineaCSV = lineaCSV;
    }

    @Override
    public String toString() {
        return "SalidaCSV{" + "bodegaAsignada=" + bodegaAsignada + ", lineaCSV=" + lineaCSV + '}';
    }
    
}
