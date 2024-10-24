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
    public byte dateTime;
    public byte settlementId;
    public byte type;
    public byte orderId;
    public byte sku;
    public byte description;
    public byte quantity;
    public byte marketplace;
    public byte fulfillment;
    public byte orderCity;
    public byte orderState;
    public byte orderPostal;
    public byte taxCollectionModel;
    public byte productSales;
    public byte productSalesTax;
    public byte shippingCredits;
    public byte shippingCreditsTax;
    public byte regulatoryFee;
    public byte taxOnRegulatoryFee;
    public byte promotionalRebates;
    public byte promotionalRebatesTax;
    public byte marketplaceWithheldTax;
    public byte sellingFees;
    public byte fbaFees;
    public byte otherTransactionFees;
    public byte other;
    public byte total;

    public IndexByLabelsOrdersExcell() {
        dateTime=0;
        settlementId=0;
        type=0;
        orderId=0;
        sku=0;
        description=0;
        quantity=0;
        marketplace=0;
        fulfillment=0;
        orderCity=0;
        orderState=0;
        orderPostal=0;
        taxCollectionModel=0;
        productSales=0;
        productSalesTax=0;
        shippingCredits=0;
        shippingCreditsTax=0;
        regulatoryFee=0;
        taxOnRegulatoryFee=0;
        promotionalRebates=0;
        promotionalRebatesTax=0;
        marketplaceWithheldTax=0;
        sellingFees=0;
        fbaFees=0;
        otherTransactionFees=0;
        other=0;
        total=0;        
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexByLabelsOrdersExcell{");
        sb.append("dateTime=").append(dateTime);
        sb.append(", settlementId=").append(settlementId);
        sb.append(", type=").append(type);
        sb.append(", orderId=").append(orderId);
        sb.append(", sku=").append(sku);
        sb.append(", description=").append(description);
        sb.append(", quantity=").append(quantity);
        sb.append(", marketplace=").append(marketplace);
        sb.append(", fulfillment=").append(fulfillment);
        sb.append(", orderCity=").append(orderCity);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderPostal=").append(orderPostal);
        sb.append(", taxCollectionModel=").append(taxCollectionModel);
        sb.append(", productSales=").append(productSales);
        sb.append(", productSalesTax=").append(productSalesTax);
        sb.append(", shippingCredits=").append(shippingCredits);
        sb.append(", shippingCreditsTax=").append(shippingCreditsTax);
        sb.append(", giftWrapCredits=").append(regulatoryFee);
        sb.append(", giftwrapCreditsTax=").append(taxOnRegulatoryFee);
        sb.append(", promotionalRebates=").append(promotionalRebates);
        sb.append(", promotionalRebatesTax=").append(promotionalRebatesTax);
        sb.append(", marketplaceWithheldTax=").append(marketplaceWithheldTax);
        sb.append(", sellingFees=").append(sellingFees);
        sb.append(", fbaFees=").append(fbaFees);
        sb.append(", otherTransactionFees=").append(otherTransactionFees);
        sb.append(", other=").append(other);
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
}