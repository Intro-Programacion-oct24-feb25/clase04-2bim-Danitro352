/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 
        int limite;
        int indice;        
        int valor;
        String mensaje = "";
        String mensaje2 = "";
        
        
        System.out.println("Ingrese un numero para la operacion que desea realizar");
        System.out.println("(1) Tabla de multiplicar - (2) Tabla de sumar");
        indice = entrada.nextInt();
        System.out.println("Ingrese un valor para la tabla");
        valor = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        limite = entrada.nextInt();
               
        switch(indice){
            case 1: 
                mensaje = obtenerTablaMultiplicar(limite, valor);
                System.out.printf("%s\n", mensaje);
                break;
            case 2:        
                mensaje2 = obtenerTablaSumar(limite, valor);
                System.out.printf("%s\n", mensaje2);
                break;
        }
                
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
