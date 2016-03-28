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
        metodos.agregarCurso(registrarCurso.devolverInformacion(), registrarCurso.devolverSiglasCurso());
        //metodos.mostrarInformacion();
        registrarCurso.modificoInformacion();
        //System.out.println("registrar");
    }
    if(e.getActionCommand().equals("Modificar"))
    {
        metodos.modificarCurso(registrarCurso.devolverNombreCurso(), registrarCurso.devolverSiglasCurso(), registrarCurso.devolverCreditos());
        registrarCurso.modificoInformacion();
        //System.out.println("modificar");
    }
    if(e.getActionCommand().equals("Consultar"))
    {
        registrarCurso.mostrarInformacion((metodos.consultarCurso(registrarCurso.devolverSiglasCurso())));
        registrarCurso.mostrarInformacionCurso((metodos.consultarCursoCreditos(registrarCurso.devolverSiglasCurso())));
     
        //System.out.println("consultar");
    }
    if(e.getActionCommand().equals("Eliminar"))
    {
        metodos.eliminarCurso(registrarCurso.devolverSiglasCurso());
        registrarCurso.modificoInformacion();
        //System.out.println("eliminar");
    }
}
    
}