/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_while_18;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_18_WHILE_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 100;
        int captu = 0;
        Scanner input = new Scanner(System.in);
        
        while(captu != nume){
            System.out.println("Introduce el numero");
            captu = input.nextInt();
            if(captu == nume)
                System.out.println("Adivinaste!");
            else
                System.out.println("No adivinaste, intenta de nuevo");
        }
              
    }
    
}
