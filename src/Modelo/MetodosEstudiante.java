/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Moon
 */
public class MetodosEstudiante {
    
    ArrayList <Estudiante> arrayEstudiante; 
    public int vueltasRegistrar=0;

public  MetodosEstudiante()
{
    arrayEstudiante=new ArrayList <Estudiante>();
    
}    
 
public void registrarEstudiante(String informacion[], String carnet)
{
    boolean estudianteRepetido=false;
    Estudiante temporal=new Estudiante(informacion[0], informacion[1]);
    
    if(vueltasRegistrar==0)
    {  
      arrayEstudiante.add(temporal);
      vueltasRegistrar=1;
      JOptionPane.showMessageDialog(null,"El estudiante se agregó correctamente");  
    }    
    else
    { 
      for(int contador=0; contador<arrayEstudiante.size(); contador++)
        { 
          if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
            {
                estudianteRepetido=true;  
            }     
         }   
           if(estudianteRepetido)
            {
                    JOptionPane.showMessageDialog(null,"El estudiante ya existe"); 
            }
           else
            {
                    arrayEstudiante.add(temporal);
                    JOptionPane.showMessageDialog(null,"El estudiante se agregó correctamente");
                    estudianteRepetido=false;
             }
    }
}  
        
 public void modificarEstudiante(String carnet, String nombre)
 {
     int vueltas=0;
     for(int contador=0; contador<arrayEstudiante.size(); contador++)
     {
         if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
         {
             arrayEstudiante.get(contador).setNombre(nombre);
             JOptionPane.showMessageDialog(null,"El estudiante se modificó correctamente"); 
         }
         else
         {
             vueltas++;
             if(vueltas==arrayEstudiante.size())
             {
              JOptionPane.showMessageDialog(null,"El estudiante no existe"); 
             }
         }
     }
 }
 
 public String[] consultarEstudiante(String carnet)
 {
     int vueltas=0;
     
    String arregloDatos[]=new String[1];
    
    for(int contador=0; contador<arrayEstudiante.size(); contador++)
    {
        //System.out.println(arrayEstudiante.get(contador).getCarnet());
        
        if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
        {
            arregloDatos[0]=arrayEstudiante.get(contador).getNombre();   
        }
        else
        {
            vueltas++;
            if(vueltas==arrayEstudiante.size())
            {
             JOptionPane.showMessageDialog(null,"El estudiante no existe"); 
            }
        }
    }
    return arregloDatos;
 }
 
 public void eliminarEstudiante(String carnet)
 {
     int vueltas=0;
     for(int contador=0; contador<arrayEstudiante.size(); contador++)
     {
         if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
         {
             arrayEstudiante.remove(contador);
             JOptionPane.showMessageDialog(null,"El estudiante se ha eliminado correctamente");   
         }
         else
         {
             vueltas++;
            // System.out.println(vueltas);
             if(vueltas==arrayEstudiante.size())
             {
                JOptionPane.showMessageDialog(null,"El estudiante no existe");   
             }
         }
     }
 }
 
 public void mostrarInformacionEstudiante()
 {
     Estudiante temporal;
     temporal=arrayEstudiante.get(0);
     System.out.println(temporal.getInformacion());
 }
}

