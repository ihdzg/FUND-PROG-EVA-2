/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclo_por;

/**
 *
 * @author ihdzg
 */
public class EVA2_14_CICLO_POR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for --> desde 
        // se ejecuta desde un punto hasta otro
        //for (puneto de inicio; condicion para el termino; manera de avanzar (o retroceder))
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
        System.out.println("------------------------");
        for(int i = 9; i >= 0; i--)
            System.out.println(i);
        //--------------------------------------------
        //NUMEROS PARES DE 0 A 100
        System.out.println("--------------------------");
        for(int i = 0; i <= 100; i+=2)
            System.out.println(i);
        
    }
    
}
