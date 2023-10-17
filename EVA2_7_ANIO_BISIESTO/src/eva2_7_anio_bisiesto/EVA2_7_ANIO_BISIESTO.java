/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_7_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, resi4, resi100, resi400;
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el año a evaluar:");
        year = input.nextInt();
        
        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        
        // && operador Y (and)
        //|| operador O (or)
        //! operador de negacion (not)
        //!= operador diferente a
        
        if((resi4 == 0) && ((resi100 != 0) || (resi400 == 0)))
            System.out.println("El año " + year + " es bisiesto.");
        else
            System.out.println("El año " + year + " no es bisiesto");
        
    }
    
}
