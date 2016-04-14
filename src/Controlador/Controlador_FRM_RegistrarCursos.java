/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCurso;
import Vista.FRM_RegistrarCurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Moon
 */
public class Controlador_FRM_RegistrarCursos implements ActionListener{

FRM_RegistrarCurso registrarCurso;
MetodosCurso metodos;

public Controlador_FRM_RegistrarCursos(FRM_RegistrarCurso registrarCurso)
{
    this.registrarCurso=registrarCurso;
    metodos=new MetodosCurso();
}

    @Override
    public void actionPerformed(ActionEvent e) {
       
    if(e.getActionCommand().equals("Registrar"))
    {
        if(metodos.agregarCurso((registrarCurso.devolverInformacion())))
        {
        metodos.agregarCurso(registrarCurso.devolverInformacion());
        registrarCurso.modificoInformacion();
        registrarCurso.mostrarMensaje("Registró correctamente");
        }
        else
        {
         registrarCurso.mostrarMensaje("Por alguna falla en el sistema no se correctamente registró");
        }
    }
    if(e.getActionCommand().equals("Modificar"))
    {
        if(metodos.modificarCurso((registrarCurso.devolverInformacion())))
        {
        metodos.modificarCurso(registrarCurso.devolverInformacion());
        registrarCurso.modificoInformacion();
        registrarCurso.mostrarMensaje("Se modificó correctamente");
        }
        else
        {
        registrarCurso.mostrarMensaje("No se modificó correctamente");

        }

    }
    if(e.getActionCommand().equals("Consultar"))
    {
        if(metodos.consultarCurso((registrarCurso.devolverSiglasCurso())))
        {
        registrarCurso.mostrarInformacion((metodos.getArregloInformacion()));
        registrarCurso.mostrarMensaje("Se encontró el curso");
        }
        else
        {
           registrarCurso.mostrarMensaje("Este curso no existe"); 
           registrarCurso.modificoInformacion();
        }
    }
    if(e.getActionCommand().equals("Eliminar"))
    {
       if(metodos.eliminarCurso(registrarCurso.devolverSiglasCurso()))
       {
        registrarCurso.modificoInformacion();
        registrarCurso.mostrarMensaje("Se eliminó correctamente");
       }
       else
       {
           registrarCurso.mostrarMensaje("Este curso no existe"); 
           registrarCurso.modificoInformacion();
       }
        //System.out.println("eliminar");
    }
}
    
}