/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu calificacion");
        califa = input.nextInt();
        
        //EVALUAR:
        if((califa >= 0) && (califa <= 100)){
            System.out.println("La calificacion " + califa + " es valida.");
            if( califa >= 70)
                System.out.println("Tu calificacion es aprobatoria.");
            else
                System.out.println("Tu calificaion no es aprobatoria.");
        }else 
            System.out.println("La calificacion " + califa + " no es valida.");
    }
    
}
