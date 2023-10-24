/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa las iniciales de tu carrera");
        carrera = input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("Ingeneria en Sistemas Computacionales");
                break; 
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            case "IINF":
                System.out.println("Ingeneria en Informatica");
                break;
            case "II":
                System.out.println("Ingeneria Industrial");
                break;
            case "IDI":
                System.out.println("Ingeneneria en Diseño Industrial");
                break;
            case "LA":
                System.out.println("Licenciatura en Administracion");
                break;
            case "IGE":
                System.out.println("Ingeneria en Gestion Empresarial");
                break;
            default: //siempre al final, es opcional, no tiene break
                System.out.println("No existe carrera con las iniciales: " + carrera);
        }
    }
    
}
