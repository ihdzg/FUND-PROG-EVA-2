/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

/**
 *
 * @author ihdzg
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADOR --> SIMBOLO QUE EJECUTA ALGUNA ACCION
        //SUMA --> +
        int suma, val1, val2;
        val1 = 100;
        val2 = 200;
        suma = val1 + val2;
        System.out.println("SUMA---------------");
        System.out.println("La sumna es: " + suma); //concanetación son el simbolo +
        //RESTA
        int resta;
        resta = val2 - val1;
        System.out.println("RESTA--------------");
        System.out.println("La resta es: " + resta);
        //MULTIPLICACIÓN --> *
        int multi;
        multi = 100 * 200;
        System.out.println("MULTIPLICACION-----");
        System.out.println("La multiplicacion es: " + multi);
        //DIVISIÓN ---> /
        int divi;
        divi = val2 / val1;
        System.out.println("DIVISION-----------");
        System.out.println("La resta es: " + divi);
        val1 = 11;
        val2 = 2;
        divi = val1 / val2;
        System.out.println("La division 11/2 = " + divi);
        int residuo;
        residuo = val1 % val2;
        System.out.println("El residup de 11/2 es: " + residuo);
        //------------------------------------------------------
        double resu;
        resu = val1 / val2;
        System.out.println("La division 11/2 es: " + resu);
        double val2Double = 2;
        resu = val1 / val2Double;
        System.out.println("La division 11/2.0 es: " + resu);        
        resu = 11 / 2;
        System.out.println("La division 11/2 es: " + resu);
        resu = 11 / 2.0;
        System.out.println("La division 11/2 es: " + resu);
        //int resu2 = 11 / 2.0; //PERDIDA DE INFORMACIÓN
        //POTENCIA --> NO HAY OPERADOR DE POTENCIA
        double potencia = Math.pow(3, 3);
        System.out.println("POTENCIA------------");
        System.out.println("3 elevado a la 3 = " + potencia);
        //RAIZ --> NO HAY OPERADOR
        double raiz = Math.pow(100, 0.5);
        System.out.println("RAIZ----------------");
        System.out.println("La raiz cuadrada de 100 es: " + raiz);
        // PRCEDENCIA DE OPERADORES:
        int resuOp, x = 3, y = 2, z = 5;
        resuOp = (x * z) + (x * y) / 2 - (y - z);
                 //(15)  +  (6)/2 - (-3)
                 //(15) + 3 -(-3)
                 //15 + 3 + 3
                 // = 21
        System.out.println("El resultado es: " + resuOp);
        //FORMULA GENERAL: 
        double resuForm, a = 3, b = 9, c = 3;
        resuForm = ((-b)-Math.pow((b * b - 4 * a * c), 0.5))/(2 * a);
        System.out.println("El resultado es: " + resuForm);
    }
    
}
