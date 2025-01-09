/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        mensajeSuma = repetirNombre(10, "Antonio Valencia");
        mensajeSumaDos = repetirNombre("José Gavíca", 10);
        int[] arreglo = {10, 2};
        String mensajeSumaTres = repetirNombre("Jose Gavica", arreglo);
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
        System.out.printf("%s\n", mensajeSumaTres);
    }
        
    public static String repetirNombre(int numero, String nombre){
        int suma;
        String cadena = "";
        for (int i = 1; i <= numero; i++) {
            cadena = String.format("%s%s\n", cadena, nombre);
        }
        
        return cadena;        
    }
    
    public static String repetirNombre(String nombre, int numero){
        int suma;
        String cadena = "";
        for (int i = 1; i <= numero; i++) {
            cadena = String.format("%s%s\n", cadena, nombre);
        }
        
        return cadena;  
        
    }
   public static String repetirNombre(String nombre, int []b){
      
       int suma = 0;
       String cadena = "";
       
      for (int i = 0; i < b.length; i++){
      suma = suma + b[i];
      } 
      for (int i = 1; i <= suma; i++) {
            cadena = String.format("%s%s\n", cadena, nombre);
        }
      return cadena;
   }
}
