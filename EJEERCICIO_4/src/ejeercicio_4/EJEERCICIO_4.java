/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeercicio_4;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EJEERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio: Solicitar un número al usuario, indicar si el número es positivo, negativo o cero.
        //Después de solicitar el número y darle la respuesta al usuario, se le debe preguntar si desea
        //terminar el programa
        
        int num;
        String respuesta;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa el numero que quieras");
        num = input.nextInt();
        
        if(num == 0)
            System.out.println("El numero " + num + ", es cero.");
        else if(num < 0)
            System.out.println("El numero " + num + ", es negativo.");
        else if(num > 0)
                System.out.println("El numero " + num + ", es positivo.");
        
        System.out.println("Quieres terminar el programa?");
        respuesta = input.next();
        
        }while (respuesta.equals("No"));
        
        System.out.println("Fin del programa");
        }
}
