/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int talla;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu talla");
        talla = input.nextInt();
        
        if(talla == 29)
                System.out.println("Tu talla es: Small");
            else if (talla == 42)
                System.out.println("Tu talla es: Medium");
            else if (talla == 44)
                System.out.println("Tu talla es: Large");
            else if (talla == 48)
                System.out.println("Tu talla es: XLarge");
            else 
                System.out.println("El valor: " + talla + " es desconocido");
    }
    
}
