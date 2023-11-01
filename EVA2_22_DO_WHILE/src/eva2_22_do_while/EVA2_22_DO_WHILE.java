/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA2_22_DO_WHILE {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario;
        String pwd;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Introduce el usuario");
            usuario = input.nextLine();
            System.out.println("Introduce la cpntraseña");
            pwd = input.nextLine();
        }while((!usuario.equals(NOMBRE_USUARIO)) || (!pwd.equals(PASSWORD)));
        System.out.println("Bienvenido al sistema");
    }
    
}
