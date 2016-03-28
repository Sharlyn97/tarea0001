/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_RegistrarCurso;
import Vista.FRM_RegistrarEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Moon
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener {
    
    FRM_RegistrarEstudiantes registrarEstudiantes;
    FRM_RegistrarCurso registrarCurso;

public Controlador_FRM_MenuPrincipal()
    {
        registrarEstudiantes=new FRM_RegistrarEstudiantes();
        registrarCurso=new FRM_RegistrarCurso();
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(e.getActionCommand().equals("Estudiantes"))
        {
            this.registrarEstudiantes.setVisible(true);
            //System.out.println("estudiante");
        }
        if(e.getActionCommand().equals("Cursos"))
        {   
            this.registrarCurso.setVisible(true);
            //System.out.println("curso");
        }
        if(e.getActionCommand().equals("Matricula"))
        {
            System.out.println("matricula");
        }
        if(e.getActionCommand().equals("Reportes"))
        {
            System.out.println("reportes");
        }
    }
    
}
