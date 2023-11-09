/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int [] califas;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de calificaciones que quieres capturar");
        cant = input.nextInt();
        califas = new int [cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion");
            califas[i] = input.nextInt();   
        }
        
        for (int i = 0; i < cant; i++) {
            System.out.println("[" + califas [i] + "]");
            
        }
    }
    
}
