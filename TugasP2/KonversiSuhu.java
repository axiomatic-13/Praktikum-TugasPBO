/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP2;

/**
 *
 * @author rachm
 */
public class KonversiSuhu {
     double c;
    double f;
    double r;

    // Celcius ke Fahrenheit dan Sebaliknya
    public double celciusToFahrenheit() {
        return (c * 9.0 / 5.0) + 32;
    }

    public double fahrenheitToCelcius() {
        return (f - 32) * 5.0 / 9.0;
    }

    // Celcius ke Reamur dan Sebaliknya
    public double celciusToReamur() {
        return c * 4.0 / 5.0;
    }

    public double reamurToCelcius() {
        return r * 5.0 / 4.0;
    }

    // Fahrenheit ke Reamur dan Sebaliknya
    public double fahrenheitToReamur() {
        return (f - 32) * 4.0 / 9.0;
    }

    public double reamurToFahrenheit() {
        return (r * 9.0 / 4.0) + 32;
    }
}
