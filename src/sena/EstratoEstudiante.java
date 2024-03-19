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
public class EstratoEstudiante {
    
    String [] nombreEstudiante  = new String[1];
    int [] estratoEstudiante = new int[1];
    
    public void perdirNombreYEstrato(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < nombreEstudiante.length; i++){
            System.out.println("Escriba el nombre ");
            String nombreEstudiante = teclado.next();
            System.out.println("Estrato estudiante ");
            int estratoEstudiante = teclado.nextInt();
            this.nombreEstudiante [i] = nombreEstudiante;
            this.estratoEstudiante [i] = estratoEstudiante;
        }
    }   
    
    public void mostrarEstudianteTres(){
        perdirNombreYEstrato();
        for(int i = 0; i < estratoEstudiante.length; i++){
            int elEstrato = estratoEstudiante[i];
            if(elEstrato ==3){
                System.out.println("estudiante "+ nombreEstudiante[i]+"es 3");
            }
        }
    }
    
}
