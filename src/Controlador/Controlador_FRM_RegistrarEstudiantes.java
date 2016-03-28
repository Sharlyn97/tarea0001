/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosEstudiante;
import Vista.FRM_RegistrarEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane; 

/**
 *
 * @author Moon
 */
public class Controlador_FRM_RegistrarEstudiantes implements ActionListener{
    
    FRM_RegistrarEstudiantes registrarEstudiantes;
    MetodosEstudiante metodos;  
    
    
public Controlador_FRM_RegistrarEstudiantes(FRM_RegistrarEstudiantes registrarEstudiantes)
{
    this.registrarEstudiantes=registrarEstudiantes;
    metodos=new MetodosEstudiante(); 
}
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Registrar"))
        {
            metodos.registrarEstudiante(registrarEstudiantes.devolverInformacion(), registrarEstudiantes.devolverCarnet());
            //metodos.mostrarInformacionEstudiante();
            registrarEstudiantes.modificoInformacion();
            //System.out.println("registrar"); 
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarEstudiante(registrarEstudiantes.devolverCarnet());
            registrarEstudiantes.modificoInformacion();
            //System.out.println("eliminar");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarEstudiante(registrarEstudiantes.devolverCarnet(),registrarEstudiantes.devolverNombre());
            registrarEstudiantes.modificoInformacion();
            //System.out.println("modificar");
        }
        if(e.getActionCommand().equals("Consultar")) //ver problema
        {
            registrarEstudiantes.mostrarInformacion((metodos.consultarEstudiante(registrarEstudiantes.devolverCarnet())));
            //System.out.println("consultar");
        }
       
    }
    
}
