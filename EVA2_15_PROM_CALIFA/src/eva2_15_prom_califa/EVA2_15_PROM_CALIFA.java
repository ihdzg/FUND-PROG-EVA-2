/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_prom_califa;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_15_PROM_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantCali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones a capturar");
        cantCali = captu.nextInt();
        int sumaCalifas;
        sumaCalifas = 0;
        
        //acumulador
        
        for (int i = 1; i <= cantCali; i++) {
            System.out.println("Ingresa la calificacion");
            int califas;
            califas = captu.nextInt();
            sumaCalifas = sumaCalifas + califas;
        }
        System.out.println("La suma total es de: " + sumaCalifas);
        double promedio;
        promedio = sumaCalifas / (cantCali * 1.0);
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
    
}
