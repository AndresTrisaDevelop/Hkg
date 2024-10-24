/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class IndexByLabelsOrdersExcell {
    public byte itemPrice;
    public byte itemTax;
    public byte orderId;
    public byte orderItemId;
    public byte purchaseDate;
    public byte paymentsDate;
    public byte buyerEmail;
    public byte buyerName;
    public byte buyerPhoneNumber;
    public byte sku;
    public byte productName;
    public byte quantityPurchased;
    public byte shipServiceLevel;
    public byte recipientName;
    public byte shipAddress1;
    public byte shipAddress2;
    public byte shipCity;
    public byte shipState;
    public byte shipPostalCode;
    public byte shipCountry;    

    public IndexByLabelsOrdersExcell() {
        itemPrice=0;
        itemTax=0;
        orderId=0;
        orderItemId=0;
        purchaseDate=0;
        paymentsDate=0;
        buyerEmail=0;
        buyerName=0;
        buyerPhoneNumber=0;
        sku=0;
        productName=0;
        quantityPurchased=0;
        shipServiceLevel=0;
        recipientName=0;
        shipAddress1=0;
        shipAddress2=0;
        shipCity=0;
        shipState=0;
        shipPostalCode=0;
        shipCountry=0;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexByLabelsOrdersExcell{");
        sb.append("itemPrice=").append(itemPrice);
        sb.append(", itemTax=").append(itemTax);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderItemId=").append(orderItemId);
        sb.append(", purchaseDate=").append(purchaseDate);
        sb.append(", paymentsDate=").append(paymentsDate);
        sb.append(", buyerEmail=").append(buyerEmail);
        sb.append(", buyerName=").append(buyerName);
        sb.append(", buyerPhoneNumber=").append(buyerPhoneNumber);
        sb.append(", sku=").append(sku);
        sb.append(", productName=").append(productName);
        sb.append(", quantityPurchased=").append(quantityPurchased);
        sb.append(", shipServiceLevel=").append(shipServiceLevel);
        sb.append(", recipientName=").append(recipientName);
        sb.append(", shipAddress1=").append(shipAddress1);
        sb.append(", shipAddress2=").append(shipAddress2);
        sb.append(", shipCity=").append(shipCity);
        sb.append(", shipState=").append(shipState);
        sb.append(", shipPostalCode=").append(shipPostalCode);
        sb.append(", shipCountry=").append(shipCountry);
        sb.append('}');
        return sb.toString();
    }
}
