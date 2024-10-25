/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class ItemDatosTemplate {
    
    private String item;
    private String productName;
    private String wareHouse;
    private String minimos;
    private String maximos;

    public ItemDatosTemplate(String item, String productName, String wareHouse, String minimos, String maximos) {
        this.item = item;
        this.productName = productName;
        this.wareHouse = wareHouse;
        this.minimos = minimos;
        this.maximos = maximos;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }

    public String getMinimos() {
        return minimos;
    }

    public void setMinimos(String minimos) {
        this.minimos = minimos;
    }

    public String getMaximos() {
        return maximos;
    }

    public void setMaximos(String maximos) {
        this.maximos = maximos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemDatosTemplate{");
        sb.append("item=").append(item);
        sb.append(", productName=").append(productName);
        sb.append(", wareHouse=").append(wareHouse);
        sb.append(", minimos=").append(minimos);
        sb.append(", maximos=").append(maximos);
        sb.append('}');
        return sb.toString();
    }

}
