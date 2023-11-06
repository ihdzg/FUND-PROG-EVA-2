/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_26_CICLOS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        nume = input.nextInt();
        
        for (int i = nume; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
