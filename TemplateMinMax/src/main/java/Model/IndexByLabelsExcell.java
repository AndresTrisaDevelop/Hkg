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
    public int itemNumber;
    public int productName;
    //005 - Hidalgo
    public int hidalgo005;
    public int min005;
    public int max005;    
    //011 - Laredo No. 3
    public int laredo011;
    public int min011;
    public int max011;    
    //012 - El Paso
    public int elpaso012;
    public int min012;
    public int max012;    
    //018 - Otay
    public int otay018;
    public int min018;
    public int max018;    
    //019 - San Ysidro
    public int sanysidro019;
    public int min019;
    public int max019;        
    //023 - Laredo 4 Iturbide
    public int iturbide023;
    public int min023;
    public int max023;
    
    public IndexByLabelsExcell() {
        itemNumber=0;
        productName=0;
        hidalgo005=0;
        min005=0;
        max005=0;
        laredo011=0;
        min011=0;
        max011=0;
        elpaso012=0;
        min012=0;
        max012=0;
        otay018=0;
        min018=0;
        max018=0;
        sanysidro019=0;        
        min019=0;
        max019=0;
        iturbide023=0;        
        min023=0;
        max023=0;        
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexByLabelsExcell{");
        sb.append("itemNumber=").append(itemNumber);
        sb.append(", productName=").append(productName);
        sb.append(", hidalgo005=").append(hidalgo005);
        sb.append(", min005=").append(min005);
        sb.append(", max005=").append(max005);
        sb.append(", laredo011=").append(laredo011);
        sb.append(", min011=").append(min011);
        sb.append(", max011=").append(max011);
        sb.append(", elpaso012=").append(elpaso012);
        sb.append(", min012=").append(min012);
        sb.append(", max012=").append(max012);
        sb.append(", otay018=").append(otay018);
        sb.append(", min018=").append(min018);
        sb.append(", max018=").append(max018);
        sb.append(", sanysidro019=").append(sanysidro019);
        sb.append(", min019=").append(min019);
        sb.append(", max019=").append(max019);
        sb.append(", iturbide023=").append(iturbide023);
        sb.append(", min023=").append(min023);
        sb.append(", max023=").append(max023);
        sb.append('}');
        return sb.toString();
    }

}
