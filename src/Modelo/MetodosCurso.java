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
public class MetodosCurso { 
    ArrayList <Curso> arrayCurso;
    public int vueltasRegistrar=0;
    
 public MetodosCurso()
 {
     arrayCurso=new ArrayList <Curso>();
 }
 
 //metodos
 
 public void agregarCurso(String informacion[],String siglasCurso)
 {
     boolean cursoRepetido=false;
     Curso temporal=new Curso(informacion[0], informacion[1], Integer.parseInt(informacion[2]));
     
     if(vueltasRegistrar==0)
     {
        arrayCurso.add(temporal);
        vueltasRegistrar=1;
        JOptionPane.showMessageDialog(null,"El curso se registró correctamente");
     }
     else
     {
         for(int contador=0; contador<arrayCurso.size(); contador++)
         {
           if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))  
           {
               cursoRepetido=true;
           }
         }
      if(cursoRepetido)
        {
                    JOptionPane.showMessageDialog(null,"Este curso ya existe"); 
         }
      else
        {
                    arrayCurso.add(temporal);
                    JOptionPane.showMessageDialog(null,"El curso se registró correctamente");
                    cursoRepetido=false;
        }
     }     
 }

 public void modificarCurso(String nombreCurso, String siglasCurso, String creditos)//revisar creditos
 {
     int creditosInt;
     int vueltas=0;
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))
         {
             arrayCurso.get(contador).setNombre(nombreCurso);
             creditosInt=Integer.parseInt(creditos);
             arrayCurso.get(contador).setCreditos(creditosInt);
             JOptionPane.showMessageDialog(null,"El curso se modificó correctamente");
         }
         else
         {
             vueltas++;
             if(vueltas==arrayCurso.size())
             {
                JOptionPane.showMessageDialog(null,"El curso no existe");   
             }
         }
     }
 }
 public String[] consultarCurso(String siglasCurso) 
 {
     String arregloDatos[]=new String[1];
     
     
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         //System.out.println(arrayCurso.get(contador).getNombre());
         if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))
        {
            arregloDatos[0]=arrayCurso.get(contador).getNombre();
           // System.out.println(arrayCurso.get(contador).getNombre());
        }
         
     }
     
    return arregloDatos;
 }
  public int[] consultarCursoCreditos(String siglasCurso) 
 {
     int arregloDatosCreditos[]=new int[1];
     int vueltas=0;
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))
        {
            arregloDatosCreditos[0]=arrayCurso.get(contador).getCreditos(); 
        }
         else
         {
             vueltas++;
             if(vueltas==arrayCurso.size())
             {
                JOptionPane.showMessageDialog(null,"El curso no existe");   
             }
         }
     }
     
    return arregloDatosCreditos;
 }
 
 public void eliminarCurso(String siglasCurso)
 {
     int vueltas=0;
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))
         {
             arrayCurso.remove(contador);
             JOptionPane.showMessageDialog(null,"El curso se ha eliminado correctamente");
         }
         else
         {
             vueltas++;
             if(vueltas==arrayCurso.size())
             {
                JOptionPane.showMessageDialog(null,"El curso no existe");   
             }
         }
     }
 }
 public void mostrarInformacion()
 {
      Curso temporal;
     temporal=arrayCurso.get(0);
     System.out.println(temporal.getInformacion());
 }
 
}
