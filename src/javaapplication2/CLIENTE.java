/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author JHONNY
 */
public class CLIENTE {
    private int idcliente;
    private String nombreCliente;
    private String apellidoCliente;
    
    public CLIENTE(int idcliente, String nombreCliente, String apellidoCliente){
        this.idcliente = idcliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        
    }
    
    public void mif(){
        JOptionPane.showMessageDialog(null, "nombre cliente"+ this.nombreCliente);
    }
    
    public void mif1(){
        JOptionPane.showMessageDialog(null, "apellido cliente"+ this.apellidoCliente);
    }
    
    public  void mif2(){
        JOptionPane.showMessageDialog(null, "idcliente"+ this.idcliente);
    }
}
