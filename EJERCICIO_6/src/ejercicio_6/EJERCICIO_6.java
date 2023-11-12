/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //(Ejercicio: Solicitar un número entero positivo al usuario e imprimir el equivalente en sistema
        //binario.
        
        Scanner input = new Scanner(System.in);
        int num, resi;
        
        System.out.println("Ingresa un numero para saber el equivalente en binario");
        num = input.nextInt();
        
        System.out.println("Lo equivalente en numero binario es: ");
        
        do{
            resi = num % 2;
            num = num / 2;
            System.out.print(resi);
        }while (num > 0);

    }
    
}
