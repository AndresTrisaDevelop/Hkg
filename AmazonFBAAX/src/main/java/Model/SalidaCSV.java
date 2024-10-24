/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author ATriana
 */
public class SalidaCSV {
    private String bodegaAsignada;
    private CSVRecord lineaCSV;

    public SalidaCSV(String bodegaAsignada, CSVRecord lineaCSV) {
        this.bodegaAsignada = bodegaAsignada;
        this.lineaCSV = lineaCSV;
    }

    public String getBodegaAsignada() {
        return bodegaAsignada;
    }

    public void setBodegaAsignada(String bodegaAsignada) {
        this.bodegaAsignada = bodegaAsignada;
    }

    public CSVRecord getLineaCSV() {
        return lineaCSV;
    }

    public void setLineaCSV(CSVRecord lineaCSV) {
        this.lineaCSV = lineaCSV;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SalidaCSV{");
        sb.append("bodegaAsignada=").append(bodegaAsignada);
        sb.append(", lineaCSV=").append(Arrays.toString(lineaCSV.values()));
        sb.append('}');
        return sb.toString();
    }
}
