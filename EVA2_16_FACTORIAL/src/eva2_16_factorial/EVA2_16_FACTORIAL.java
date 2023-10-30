/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Escribe el numero");
        num = captu.nextInt();
        
        int factorial;
        factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " - ");
            factorial = factorial * i;
        }
        System.out.println("");
        System.out.println("Factorial de " + num + " es = " + factorial);
        System.out.println("");
        
        int factorial2;
        factorial2 = 1;
        for (int a = num; a >= 1; a--) {
            System.out.print(a + " -");
        factorial2 = factorial2 * a;  
            System.out.println("");
        System.out.println("Factorial de " + num + " es = " + factorial2);
        }
    }
}
