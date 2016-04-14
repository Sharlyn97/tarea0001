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
    String arregloDatos[];

public  MetodosEstudiante()
{
    arrayEstudiante=new ArrayList <Estudiante>();
    arregloDatos=new String[2];
    
}    
 
public boolean registrarEstudiante(String informacion[], String carnet)
{
    boolean estudianteRepetido=false;
    Estudiante temporal=new Estudiante(informacion[0], informacion[1]);
    boolean registro=false;
    if(vueltasRegistrar==0)
    {  
      arrayEstudiante.add(temporal);
      vueltasRegistrar=1;
      registro=true;
      //JOptionPane.showMessageDialog(null,"El estudiante se agregó correctamente");  
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
                    //JOptionPane.showMessageDialog(null,"El estudiante ya existe"); 
                registro=false;
                    
            }
           else
            {
                    arrayEstudiante.add(temporal);
                    //JOptionPane.showMessageDialog(null,"El estudiante se agregó correctamente");
                    estudianteRepetido=false;
                    registro=true;
             }
    }
    return registro;
}  
        
 public boolean modificarEstudiante(String carnet, String nombre)
 {
     int vueltas=0;
     boolean modifico=false;
     for(int contador=0; contador<arrayEstudiante.size(); contador++)
     {
         if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
         {
             arrayEstudiante.get(contador).setNombre(nombre);
             modifico=true;
             //System.out.println("modifico");
             //JOptionPane.showMessageDialog(null,"El estudiante se modificó correctamente"); 
         }
        
     }
     return modifico;
 }
 
 public boolean consultarEstudiante(String carnet)
 {
     int vueltas=0;
     boolean encontro=false;
             
    //String arregloDatos[]=new String[1];
    
    for(int contador=0; contador<arrayEstudiante.size(); contador++)
    {
        //System.out.println(arrayEstudiante.get(contador).getCarnet());
        
        if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
        {
            //arregloDatos[0]=arrayEstudiante.get(contador).getNombre();   
            encontro=true;
            arregloDatos[1]=arrayEstudiante.get(contador).getCarnet();
            arregloDatos[0]=arrayEstudiante.get(contador).getNombre();
        }
        else
        {
            vueltas++;
            if(vueltas==arrayEstudiante.size())
            {
            // JOptionPane.showMessageDialog(null,"El estudiante no existe"); 
            }
        }

    }
    //return arregloDatos;
    return encontro;
 }
 
 public String[] getArregloInformacion()
 {
     return arregloDatos;
 }
 
 public boolean eliminarEstudiante(String carnet)
 {
     int vueltas=0;
     boolean elimino=false;
     for(int contador=0; contador<arrayEstudiante.size(); contador++)
     {
         if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
         {
             arrayEstudiante.remove(contador);
             elimino=true;
             //JOptionPane.showMessageDialog(null,"El estudiante se ha eliminado correctamente");   
         }
         else
         {
             vueltas++;
            // System.out.println(vueltas);
             if(vueltas==arrayEstudiante.size())
             {
                 elimino=false;
                //JOptionPane.showMessageDialog(null,"El estudiante no existe");   
                
             }
         }
     }
     return elimino;
 }
 
 public void mostrarInformacionEstudiante()
 {
     Estudiante temporal;
     temporal=arrayEstudiante.get(0);
     System.out.println(temporal.getInformacion());
 }
}

