/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Reynaldo
 */
public class KonversiSuhu2 extends KonversiSuhu {
    double FtoR;
    double FahrenheitToReamur(double fahrenheit){
        FtoR = 0.4444444444444444 * (fahrenheit - 32);
        System.out.println("Fahrenheit ke Reamur (27°F)      = " + FtoR + " R");
        return FtoR;
    }
}
