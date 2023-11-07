/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio: Solicitar al usuario dos números enteros positivos, imprimir todos los números entre ellos en orden ascendente.
        int nume1, nume2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero");
        nume1 = input.nextInt();
        System.out.println("Ingresa el segundo numero");
        nume2 = input.nextInt();
        
        for (int i = nume1; i <= nume2; i++) {
            System.out.print(i + ", ");
        }
        
    }
    
}
