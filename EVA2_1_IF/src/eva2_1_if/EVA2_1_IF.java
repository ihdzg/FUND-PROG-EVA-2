/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu calificacion:");
        califa = input.nextInt();
        
        if(califa >= 70){ //if(expresiona a evaluar)
            //ESTE BLOQUE SIEMPRE ES UNA VERDAD
            //LAS LLLAVES SE Y¿USAN CUANDO SON MAS DE UNA INSTRUCCION
            //DENTRO DEL IF. SI ES UNA SOLA, NOSE USAN.
            System.out.println("Aprobado: Viaje a cancun");// pertenece al if
            System.out.println("Felicidades!!!");// no pertenece al if
        }else //else --> si no. Es opcional!!!
            //ESTE BLOQUE ES SIEMPRE PARA FALSO
            System.out.println("NO ACREDITADO: Repetir la materia");
        
        System.out.println("Fiin del programa!!");
    }
}
