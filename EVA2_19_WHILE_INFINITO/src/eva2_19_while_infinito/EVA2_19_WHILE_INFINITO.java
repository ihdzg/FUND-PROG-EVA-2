/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner(System.in);
        
        while(true){//CICLO INFIINTO, POR SI SOLO, NUNCA SE VA A DETENER
            System.out.println("Introduce el numero:");
            captu = input.nextInt();
            if(captu == nume){
                System.out.println("Adivinaste!");
                break;//ROMPER ---> DETIENE LA EJECUCION DEL CICLO
            }
            else
                System.out.println("No adivinaste, intenta de nuevo");
        }
    }
    
}
