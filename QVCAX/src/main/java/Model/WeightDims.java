/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andre
 */
public class WeightDims {
    
    private String modelo;
    private String L;
    private String W;
    private String H;
    private String weight;

    public WeightDims(String modelo, String L, String W, String H, String weight) {
        this.modelo = modelo;
        this.L = L;
        this.W = W;
        this.H = H;
        this.weight = weight;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getL() {
        return L;
    }

    public void setL(String L) {
        this.L = L;
    }

    public String getW() {
        return W;
    }

    public void setW(String W) {
        this.W = W;
    }

    public String getH() {
        return H;
    }

    public void setH(String H) {
        this.H = H;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WeightDims{" + "modelo=" + modelo + ", L=" + L + ", W=" + W + ", H=" + H 
                + ", weight=" + weight + '}';
    }

    
}
