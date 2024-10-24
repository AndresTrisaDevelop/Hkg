/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author CiaTriana
 */
public class ProductoStock {
    private String SKU;    
    private int stock002;
    private int stock008;
    private String bodegaAsignada;
    private int indexLista;

    public ProductoStock(String SKU) {
        this.SKU = SKU;
        this.stock002 = 0;
        this.stock008 = 0;
        this.bodegaAsignada = null;
        this.indexLista = 0;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getStock002() {
        return stock002;
    }

    public void setStock002(int stock002) {
        this.stock002 = stock002;
    }

    public int getStock008() {
        return stock008;
    }

    public void setStock008(int stock008) {
        this.stock008 = stock008;
    }

    public String getBodegaAsignada() {
        return bodegaAsignada;
    }

    public void setBodegaAsignada(String bodegaAsignada) {
        this.bodegaAsignada = bodegaAsignada;
    }

    public int getIndexLista() {
        return indexLista;
    }

    public void setIndexLista(int indexLista) {
        this.indexLista = indexLista;
    }

    public void setRestaStock002(int cantidad){
        this.stock002 = stock002 - cantidad;
    }

    public void setRestaStock008(int cantidad){
        this.stock008 = stock008 - cantidad;
    }
    
    @Override
    public String toString() {
        return "ProductoStock{" + "SKU=" + SKU 
                + ", stock002=" + stock002 
                + ", stock008=" + stock008 
                + ", bodegaAsignada=" + bodegaAsignada
                + ", indexLista=" + indexLista
                + '}';
    }

}
