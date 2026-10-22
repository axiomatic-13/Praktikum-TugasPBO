/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author rachm
 */
public class PersamaanKuadrat {
    double a;
    double b;
    double c;

    // Method menghitung determinan (b^2 - 4ac)
    public double hitungDeterminant() {
        return (b * b) - (4 * a * c);
    }
}
