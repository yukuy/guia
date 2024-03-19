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
public class EstratoCliente {
    
    short estrato;
    
    public void PedirEstrato(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su estrato");
        estrato = teclado.nextShort();
    }
    
    public void ClacificarEstrato(){
        if(estrato <3){
            System.out.println("Estrato bajo");
        }else{
            System.out.println("Estrato alto"); 
        }
    }
    
    public void ejecutar(){
        PedirEstrato();
        ClacificarEstrato();
    }
}
