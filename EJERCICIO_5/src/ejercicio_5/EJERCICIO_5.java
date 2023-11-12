/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio: Solicitar al usuario dos números enteros positivos. El primero es la base, el segundo
        //es el exponente. Usando ciclos, calcular la potencia de la base elevada al exponente.
        
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado = 1;
        
        System.out.println("Ingresa el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingresa el numero que sera el exponente");
        num2 = input.nextInt();
        
        for (int i = 1; i <= num2; i++) {
            resultado = (resultado * num1);
                
        }
        System.out.println("El resultado de " + num1 + " con exponente " + num2 + " es: " + resultado);  
    }
    
}
