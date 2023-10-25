/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Reynaldo
 */
public class KonversiSuhu {
    double CtoF;
    double CtoR;
    
    double CelciusToFahrenheit(double celcius){
       CtoF = (1.8 * celcius) + 32;
       System.out.println("Celcius ke Fahrenheit (40°C)     = " + CtoF + " F");
       return CtoF ;
    }
    
    double CelciusToReamur(double celcius){
       CtoR = 0.8 * celcius;
       System.out.println("Celcius ke Reamur (77°C)         = " + CtoR + " R");
       return CtoR;
    }
}
