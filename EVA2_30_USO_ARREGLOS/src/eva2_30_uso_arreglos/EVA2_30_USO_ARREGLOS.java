/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_30_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] listaProd = new String [10];
        listaProd [0] = "Tacos";
        listaProd [1] = "Tortas";
        listaProd [2] = "Tamales";
        listaProd [3] = "Tlacoyos";
        listaProd [4] = "Tlayudas";
        listaProd [5] = "Tampinqueñas";
        listaProd [6] = "Tortas ahogadas";
        listaProd [7] = "Tchilaquiles";
        listaProd [8] = "T-Bone";
        listaProd [9] = "Tripas";
        //si tenemos los datos previamente, es mejor hacerlo asi..
        //String [] listaProd = {Tacos, Tortas, ....}
        double[] listaPrecios = {20,40,15,50,30,54,60,200,400,10};
        
        System.out.println("Menu:");
        for (int i = 0; i < listaProd.length; i++) {
            System.out.println(i + " - " + listaProd[i] + ": $" + listaPrecios[i]);
        }
        
        Scanner input = new Scanner(System.in);
        int opc, cant;
        System.out.println("Que deseas ordenar?");
        opc = input.nextInt();
        System.out.println("Cuantas ordenes?");
        cant = input.nextInt();
        System.out.println("Tu total es de: $" + (cant * listaPrecios[opc]));
        
    }
    
}
