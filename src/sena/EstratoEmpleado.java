/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena;

import java.util.Scanner;

        

/**
 *
 * @author JHONNY
 */
public class EstratoEmpleado {
    
    int estrato;
    
    public void PedirEstrato(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el estrato");
        estrato = teclado.nextInt();
        System.out.println("su estrato es: "+ estrato);
    }
    
    String ciudad, nombreCompleto;
    float estatura;
    double distancia;
    
    public void pedirCiudad(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su ciudad ");
        ciudad = teclado.next();
        System.out.println("Escriba su nombre y apellidos  ");
        nombreCompleto = teclado.next();
        System.out.println("Digite su estatura ");
        estatura = teclado.nextFloat();
        System.out.println("Escriba la distancia ");
        distancia = teclado.nextDouble();
        
        
    }
}
