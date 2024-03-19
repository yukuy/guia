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
public class TareaHoroscopo {
    
    String signoZoodiacal = "";
    
    public void pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su signoZodiacal");
        signoZoodiacal = teclado.nextLine();
        
    }
    public void procesarDatos(){
        signoZoodiacal = signoZoodiacal.trim();
        signoZoodiacal = signoZoodiacal.toLowerCase();
    }
    public void mostrarMensaje(){
        System.out.println("Tu horoscopo es: ");
        switch(signoZoodiacal){
            case "Aries":
                System.out.println("Te saldra oprtunidad");
            break;
            case "Pisis":
                System.out.println("Twe llamara al cell");
            break;
            case "Tauro":
                System.out.println("Encotraras dinero");
            break;
            default:
                System.out.println("Signo no existente");
        }
    }
}
