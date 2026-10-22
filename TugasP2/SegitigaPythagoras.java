/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author rachm
 */
public class SegitigaPythagoras {
    double a;
    double b;

    // Method menghitung sisi miring c (Pythagoras)
    public double hitungC() {
        return Math.sqrt((a * a) + (b * b));
    }

    // Method menghitung keliling (a + b + c)
    public double hitungKeliling() {
        return a + b + hitungC();
    }
}
