/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena;

/**
 *
 * @author JHONNY
 */
public class AtributosYMetodos {
    String nombre = "Roland Deschaind";
    short edad = 16;
    int poblacion = 1_200_000;
    long enterolargo = 200_045_320_202l;
    char vocal = 'a';
    float altura = 1_500.253f;
    double distancia = 194_000_200_230.0000494;
    boolean esNoche = false;
   
    public void miobjeto(){
        System.out.println("nombre        "+nombre);
        System.out.println("edad          "+edad);
        System.out.println("poblacion     "+poblacion);
        System.out.println("enterolargo   "+enterolargo);
        System.out.println("vocal         "+vocal);
        System.out.println("altura        "+altura);
        System.out.println("distancia     "+distancia);
        System.out.println("esNoche       "+esNoche);
        
    }  

    float numero = 220f;
    float valor = 12f;
    float resultado = numero / valor ;
      
    public void dividirDosNumeros(){
        System.out.println("resultado  "+resultado);
        
    }
       
    public void multiplicarDosNumeros(int cantidad, int precio){
        int total = precio * cantidad;
        System.out.println("Total = "+total);
    }
    
    public int restarDosNumeros(int cotizacion, int presupuesto){
        int respuesta = cotizacion - presupuesto;
        return respuesta;   
    }
    
    public double sumar(double poblacion, double dato){
        double salida = poblacion + dato;
        return salida;  
    }
    
    public void sumaYresta(){
        int resta = restarDosNumeros(3,2);
        double suma = sumar(3,3);
        System.out.println("la reta es "+ resta);
        System.out.println("la suma es "+ suma);
    }
} 
