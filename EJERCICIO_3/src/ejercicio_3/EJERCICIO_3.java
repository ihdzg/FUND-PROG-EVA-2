/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio: Solicitar un número al usuario e imprimir la sumatoria de todos los números 
        //desdeel 1 hasta el número que introdujo el usuario
        
         int nume;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el numero");
        nume = input.nextInt();
        
        int suma;
        suma = 1;
        
        for (int i = 1; i <= nume; i++) {
            System.out.print(i + ", ");
            suma = suma + i;
        }
        
        System.out.println("");
        System.out.println("La suma de todos los numeros antes del " + nume + " es: " + suma);
        
    }
    
}
