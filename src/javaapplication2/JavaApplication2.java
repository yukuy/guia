    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;
import sena.ActividadCiclos;
import sena.AtributosYMetodos;
import sena.EstratoEmpleado;
import sena.EstratoCliente;
import sena.EstratoEstudiante;
import sena.TareaHoroscopo;


/**
 *
 * @author JHONNY
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CLIENTE mic= new CLIENTE(5, "jhonny", "zaraza");
        mic.mif();
        mic.mif1();
        mic.mif2();
        
        Auto miA = new Auto();
        miA.setIdA(1);
        miA.setMarcaA("mazda");
       
        Auto miA1 = new Auto();
        miA1.setIdA(3);
        miA1.setMarcaA("HONDA");
        
        JOptionPane.showMessageDialog(null, miA.getMarcaA());
        JOptionPane.showMessageDialog(null, miA.getIdA());
        
        JOptionPane.showMessageDialog(null, miA1.getMarcaA());
        JOptionPane.showMessageDialog(null, miA1.getIdA());
   
        
        
        AtributosYMetodos miobjeto = new AtributosYMetodos();
         
        miobjeto.miobjeto();
        
        AtributosYMetodos dividirDosNumeros = new AtributosYMetodos();
        dividirDosNumeros.dividirDosNumeros();
        
        AtributosYMetodos multiplicarDosNumeros = new AtributosYMetodos();
        multiplicarDosNumeros.multiplicarDosNumeros(32, 8);
        
        AtributosYMetodos restarDosNumeros = new AtributosYMetodos();
        int as =restarDosNumeros.restarDosNumeros(3, 1);
        System.out.println("la resta es "+ as);
        
        AtributosYMetodos sumar = new AtributosYMetodos();
        double salida = sumar.sumar(59, 100);
        System.out.println("la suma es "+ salida);


        AtributosYMetodos sumarYrestar = new AtributosYMetodos();
        sumarYrestar.sumaYresta();
       
        EstratoEmpleado estrato = new EstratoEmpleado();
        estrato.PedirEstrato();
        
        EstratoEmpleado datos = new EstratoEmpleado();
        datos.pedirCiudad();
        
        EstratoCliente es1 = new EstratoCliente();
        es1.PedirEstrato();
        es1.ClacificarEstrato();
        es1.ejecutar();
        
       EstratoEstudiante estudiante = new EstratoEstudiante();
       estudiante.perdirNombreYEstrato();
       estudiante.mostrarEstudianteTres();
        

        TareaHoroscopo signo =  new TareaHoroscopo();
        signo.pedirDatos();
        signo.procesarDatos();
        signo.mostrarMensaje();

        ActividadCiclos lista = new ActividadCiclos();
        lista.cicloMientras();
        lista.comienzanPorSt();
    }
}

