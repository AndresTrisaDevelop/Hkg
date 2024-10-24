/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class ItemOrdenProducto {
    
    private String orderItemID;
    private String SKU;
    private String precio;
    private String tax;
    private String cantidad;

    public ItemOrdenProducto(String orderItemID, String SKU, String precio, 
            String tax, String cantidad) {
        this.orderItemID = orderItemID;
        this.SKU = SKU;
        this.precio = precio;
        this.tax = tax;
        this.cantidad = cantidad;
    }

    public String getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(String orderItemID) {
        this.orderItemID = orderItemID;
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

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "orderItemID =" + orderItemID + ", SKU=" + SKU 
                + ", precio=" + precio 
                + ", tax=" + tax 
                + ", cantidad=" + cantidad
                + '}';
    }
    
}
