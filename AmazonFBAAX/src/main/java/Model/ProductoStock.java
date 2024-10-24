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
    private int stock500;
    private String bodegaAsignada;
    private int indexLista;

    public ProductoStock(String SKU) {
        this.SKU = SKU;
        this.stock500 = 0;
        this.bodegaAsignada = null;
        this.indexLista = 0;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getStock500() {
        return stock500;
    }

    public void setStock500(int stock500) {
        this.stock500 = stock500;
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

    public void setRestaStock500(int cantidad){
        this.stock500 = stock500 - cantidad;
    }
   
    @Override
    public String toString() {
        return "ProductoStock{" + "SKU=" + SKU 
                + ", stock500=" + stock500 
                + ", bodegaAsignada=" + bodegaAsignada
                + ", indexLista=" + indexLista
                + '}';
    }
}
