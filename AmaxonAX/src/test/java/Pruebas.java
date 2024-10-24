/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author CiaTriana
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prueba = "105921-M";
        int index = prueba.indexOf('-');
        prueba = prueba.substring(0, index);
        System.out.println(prueba);
    }
    
}
