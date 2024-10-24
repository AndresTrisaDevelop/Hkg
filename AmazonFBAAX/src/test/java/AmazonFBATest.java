
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class AmazonFBATest {

    public void readFileCSV(){
        String salida;
        boolean recordOK = false;
        try {
            Reader inputCSV = new FileReader("C:\\Users\\andre\\OneDrive\\Escritorio\\PLANTILLAS FBA\\2023Jul27-2023Jul27CustomUnifiedTransaction.csv");
            CSVRecord records;
            Iterator<CSVRecord> recordsIterator = CSVFormat.EXCEL.parse(inputCSV).iterator();
            while (recordsIterator.hasNext()) {
                records = recordsIterator.next();
                salida = Arrays.toString(records.values());
                System.out.println(salida);
                if(salida.contains("date/time")){
                    recordOK = true;
                }
                if (recordOK){
                    System.out.println(records.get(4) + "-" + records.get(5));
                    //System.out.println(record.get("sku") + "-" + record.get(5));
                }
            }
            System.exit(0);            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "generarInterfaceAX().fileAmazonFBA." + ex.getMessage());
            System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "generarInterfaceAX().fileAmazonFBA." + ex.getMessage());
            System.exit(0);
        }        
    }
}
