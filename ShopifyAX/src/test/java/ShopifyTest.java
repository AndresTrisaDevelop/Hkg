/**
 *
 * @author andre
 */
public class ShopifyTest {

    public void fechaTest(){
        String[] tmpfecha = "2022-09-24 14:31:43 -0500".split(" ");
        String tmp = tmpfecha[0]+"T"+tmpfecha[1]+"+00:00";
        System.out.println(tmp);
    }
}
