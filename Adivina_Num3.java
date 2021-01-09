package Bucles;
import java.util.Scanner;

/**
 * Write a description of class Adivina_Num3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adivina_Num3 {
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    int numero = (int)(Math.random() * 10 ); 
    System.out.println("El numero es " + numero );
    int i =0 ;
    int intentos = 0 ;
    for (i = 0 ;i<10;i--){
    System.out.println("¿Es correcto el numero?");
    String respuesta = entrada.nextLine();
    intentos++;
    if (respuesta.equalsIgnoreCase("Si")){
    
    System.out.println ("Correcto, lo has conseguido en " + intentos + 
    " intentos");
    break;
    
    }else if (respuesta.equalsIgnoreCase("No,es mas alto")){
    
    numero++ ;
    System.out.println("Es el "  + numero + "?");
    
    }else if (respuesta.equalsIgnoreCase("No,es mas bajo")){
    numero--;
    System.out.println("Es el " + numero + "?");
    
    }
     
       
        
        
     }
  }
     
    
}

