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
            if(metodos.registrarEstudiante(registrarEstudiantes.devolverInformacion(), registrarEstudiantes.devolverCarnet()))
            {
                registrarEstudiantes.mostrarMensaje("El estudiante se agregó con exito");
                registrarEstudiantes.modificoInformacion();
                registrarEstudiantes.estadoInicial();
            }
            else
            {
                registrarEstudiantes.mostrarMensaje("El estudiante ya existe");
            }       
        }
        
        if(e.getActionCommand().equals("Eliminar"))
        {
            //metodos.eliminarEstudiante(registrarEstudiantes.devolverCarnet());//
            registrarEstudiantes.modificoInformacion();
            registrarEstudiantes.estadoInicial();
            eliminar();
            //System.out.println("eliminar");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            //System.out.println("carnet:"+registrarEstudiantes.devolverCarnet());
            if(metodos.modificarEstudiante(registrarEstudiantes.devolverCarnet(),registrarEstudiantes.devolverNombre()))
            {
                registrarEstudiantes.mostrarMensaje("El estudiante se modificó con exito");
                registrarEstudiantes.modificoInformacion();
                registrarEstudiantes.estadoInicial();
                //System.out.println("entra al if");
            }
            else
            {
                registrarEstudiantes.mostrarMensaje("El estudiante no existe");
                //System.out.println("entra al else");
            }
        }
        if(e.getActionCommand().equals("Consultar")) //ver problema
        {
            buscar();
            //registrarEstudiantes.mostrarInformacion((metodos.consultarEstudiante,registrarEstudiantes.devolverCarnet())));
            //System.out.println("consultar");
        }
        
    }
        public void buscar()
        {
            if(metodos.consultarEstudiante(registrarEstudiantes.devolverCarnet()))        
            {
              registrarEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
              registrarEstudiantes.deshabilitarCedula();
              registrarEstudiantes.habilitarOpciones();
              registrarEstudiantes.mostrarMensaje("Estudiante encontrado");
              //System.out.println("existe");
            }
            else
            {
                //System.out.println("no existe");
                registrarEstudiantes.mostrarMensaje("No existe este estudiante");
                registrarEstudiantes.habilitarAgregar();
            }
        }
        public void eliminar()
        {
            if(metodos.eliminarEstudiante(registrarEstudiantes.devolverCarnet()))
            {
               registrarEstudiantes.mostrarMensaje("No existe el estudiante"); 
               //System.out.println("Entra en el if");
            }
            else
            {
                registrarEstudiantes.mostrarMensaje("Estudiante eliminado con exito");
               // System.out.println("Entra en el else");
            }
        }
}
