/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06ejercicios;

/**
 *
 * Nicolas Zuñiga Estrada
 */
import java.util.Scanner;

public class S06ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("EJERCICIO S06");
    System.out.println();
    
        // producto 1
    String nombre01 = "";
    int cantidad01 = 0;
    double precio01 = 0;
         
        // producto 2
    String nombre02 = "";
    int cantidad02 = 0;
    double precio02 = 0;
      
       
    // producto 3
    String nombre03 = "";
    int cantidad03 = 0;
    double precio03 = 0;
 
    //Declarando e inicializacion variable tipo Scanner
    Scanner sc = new Scanner(System.in);
    
    /*
    *Producto 01
    */
    //Producto 01 ---> nombre
    System.out.println("Ingrese \"nombre\"Producto 01: ");
    nombre01 = sc.next();
    //Producto 01 ---> cantidad
    System.out.println("Ingrese \"cantidad\"Producto 01: ");
    cantidad01 = sc.nextInt();
    //Producto 01 ---> cantidad
    System.out.println("Ingrese \"precio\"Producto 01: ");
    precio01 = sc.nextDouble();
    
    /*
    *Producto 02
    */
    //Producto 02 ---> nombre
    System.out.println("Ingrese \"nombre\"Producto 01: ");
    nombre02 = sc.next();
    //Producto 01 ---> cantidad
    System.out.println("Ingrese \"cantidad\"Producto 02: ");
    cantidad02 = sc.nextInt();
    //Producto 01 ---> cantidad
    System.out.println("Ingrese \"precio\"Producto 02: ");
    precio02 = sc.nextDouble();
    
    /*
    *Producto 03
    */
    //Producto 03 ---> nombre
    System.out.println("Ingrese \"nombre\"Producto 03: ");
    nombre03 = sc.next();
    //Producto 01 ---> cantidad
    System.out.println("Ingrese \"cantidad\"Producto 03: ");
    cantidad03 = sc.nextInt();
    //Producto 01 ---> cantidad
    System.out.println("Ingrese \"precio\"Producto 03: ");
    precio03 = sc.nextDouble();
    
   //subtotal
    double subtotal = 0;
    subtotal += cantidad01 * precio01;
    subtotal += cantidad02 * precio02;
    subtotal += cantidad03 * precio03;
   
    // impuesto
    double impuesto = subtotal * 0.18;
    // total
    double total = subtotal + impuesto;
    
    System.out.println("El total es: " + total);
  }  
}
