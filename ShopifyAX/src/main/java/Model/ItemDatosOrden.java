/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class ItemDatosOrden {
    
    private String SKU;
    private String precio;
    private String cantidad;
    private String fulfillment;

    public ItemDatosOrden(String SKU, String precio, String cantidad, String fulfillment) {
        this.SKU = SKU;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fulfillment = fulfillment;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(String fulfillment) {
        this.fulfillment = fulfillment;
    }

    @Override
    public String toString() {
        return "ItemDatosOrden{" + "SKU=" + SKU + ", precio=" + precio + ", cantidad=" + cantidad + ", fulfillment=" + fulfillment + '}';
    }
}
