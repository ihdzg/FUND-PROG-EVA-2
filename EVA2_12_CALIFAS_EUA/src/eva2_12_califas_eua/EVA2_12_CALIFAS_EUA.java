/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion");
        califa = input.nextInt();
        
        if((califa >= 90) && (califa <= 100))
                System.out.println("Tienes: A");
            else if ((califa >= 80) && (califa <= 89))
                System.out.println("Tienes: B");
            else if ((califa >= 70) && (califa <= 79))
                System.out.println("Tienes: C");
            else if ((califa >= 60) && (califa <= 69))
                System.out.println("Tienes: D");
            else if ((califa >= 0) && (califa <= 60))
                System.out.println("Tienes: F");
            else 
                System.out.println("La calificacion " + califa + " no es una calificaion valida");
    }
    
}
