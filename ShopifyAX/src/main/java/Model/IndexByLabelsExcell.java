/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class IndexByLabelsExcell {
    public byte orderNumber;
    public byte orderDateTime;
    public byte currencyCode;
    public byte shipToAddress1;
    public byte shipToAddress2;
    public byte shipToCity;
    public byte shipToState;
    public byte shipToZipcode;
    public byte shipToName;
    public byte shipToPhoneNumber;
    public byte orderCustomerEmail;
    public byte requestedDeliveryDate;
    public byte itemSellerPart;
    public byte itemUnitPrice;
    public byte itemQuantityOrdered;
    public byte itemSellerName;

    public IndexByLabelsExcell() {
        orderNumber=0;
        orderDateTime=0;
        currencyCode=0;
        shipToAddress1=0;
        shipToAddress2=0;
        shipToCity=0;
        shipToState=0;
        shipToZipcode=0;
        shipToName=0;
        shipToPhoneNumber=0;
        orderCustomerEmail=0;
        requestedDeliveryDate=0;
        itemSellerPart=0;
        itemUnitPrice=0;
        itemQuantityOrdered=0;
        itemSellerName=0;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexByLabelsExcell{");
        sb.append("orderNumber=").append(orderNumber);
        sb.append(", orderDateTime=").append(orderDateTime);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", shipToAddress1=").append(shipToAddress1);
        sb.append(", shipToAddress2=").append(shipToAddress2);
        sb.append(", shipToCity=").append(shipToCity);
        sb.append(", shipToState=").append(shipToState);
        sb.append(", shipToZipcode=").append(shipToZipcode);
        sb.append(", shipToName=").append(shipToName);
        sb.append(", shipToPhoneNumber=").append(shipToPhoneNumber);
        sb.append(", orderCustomerEmail=").append(orderCustomerEmail);
        sb.append(", requestedDeliveryDate=").append(requestedDeliveryDate);
        sb.append(", itemSellerPart=").append(itemSellerPart);
        sb.append(", itemUnitPrice=").append(itemUnitPrice);
        sb.append(", itemQuantityOrdered=").append(itemQuantityOrdered);
        sb.append(", itemSellerName=").append(itemSellerName);
        sb.append('}');
        return sb.toString();
    }
}
