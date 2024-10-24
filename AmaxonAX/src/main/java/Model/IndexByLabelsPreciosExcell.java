/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class IndexByLabelsPreciosExcell {
    public byte orderItemId;
    public byte sku;
    public byte quantityPurchased;
    public byte itemPrice;
    public byte itemTax;
    

    public IndexByLabelsPreciosExcell() {
        this.itemPrice=0;
        this.itemTax=0;
        this.orderItemId=0;
        this.quantityPurchased=0;
        this.sku=0;        
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexByLabelsPreciosExcell{");
        sb.append("orderItemId=").append(orderItemId);
        sb.append(", sku=").append(sku);
        sb.append(", quantityPurchased=").append(quantityPurchased);
        sb.append(", itemPrice=").append(itemPrice);
        sb.append(", itemTax=").append(itemTax);
        sb.append('}');
        return sb.toString();
    }
}
