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
     int vueltasRegistrar=0;
     String arregloDatos[];
    
 public MetodosCurso()
 {
     arrayCurso=new ArrayList <Curso>();
     arregloDatos=new String[2];
 }
 
 //metodos
 
 public boolean agregarCurso(String informacion[])//String siglasCurso
 {
     boolean cursoRepetido=false;
     boolean agrego=false;
     Curso temporal=new Curso(informacion[0], informacion[1], Integer.parseInt(informacion[2]));
     
     if(vueltasRegistrar==0)
     {
        arrayCurso.add(temporal);
        vueltasRegistrar=1;
        agrego=true;
     }
     else
     {
         for(int contador=0; contador<arrayCurso.size(); contador++)
         {
        System.out.println("Siglas contador: "+arrayCurso.get(contador).getSiglas()+" 2.siglas usuario: "+informacion[1]);
           if(arrayCurso.get(contador).getSiglas().equals(informacion[1]))  
           {
               cursoRepetido=true;
           }

         }
      if(cursoRepetido)
        {
                    //JOptionPane.showMessageDialog(null,"Yo estoy diciendo que ya existe :p"); 
         }
      else
        {
                    arrayCurso.add(temporal);
                    cursoRepetido=false;
                    agrego=true;
        }
     }     
     return agrego;
 }

 public boolean modificarCurso(String informacion[])//revisar creditos[]
 {
     boolean modifico=false;
     
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         if(arrayCurso.get(contador).getSiglas().equals(informacion[1]))
         {
             arrayCurso.get(contador).setNombre(informacion[0]);
             arrayCurso.get(contador).setCreditos(Integer.parseInt(informacion[2]));
             modifico=true;
         }
        // System.out.println("Siglas contador: "+arrayCurso.get(contador).getSiglas()+" 2.siglas usuario: "+informacion[1]);
     }
     return modifico;
 }
 
 public boolean consultarCurso(String siglasCurso) 
 {
     boolean consulto=false;
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         //System.out.println(arrayCurso.get(contador).getNombre());
         if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))
        {
            arregloDatos[0]=arrayCurso.get(contador).getNombre();
            arregloDatos[1]=""+arrayCurso.get(contador).getCreditos();
            consulto=true;
        }
     }
     
    return consulto;
 }
 
 public boolean  eliminarCurso(String siglasCurso)
 {
     int vueltas=0;
     boolean eliminado=false;
     for(int contador=0; contador<arrayCurso.size(); contador++)
     {
         if(arrayCurso.get(contador).getSiglas().equals(siglasCurso))
         {
             arrayCurso.remove(contador);
             eliminado=true;
             //JOptionPane.showMessageDialog(null,"El curso se ha eliminado correctamente");
         }
         else
         {
             vueltas++;
             if(vueltas==arrayCurso.size())
             {
               // JOptionPane.showMessageDialog(null,"El curso no existe");   
             }
         }
     }
     return eliminado;
 }
 public void mostrarInformacion()
 {
      Curso temporal;
     temporal=arrayCurso.get(0);
     System.out.println(temporal.getInformacion());
 }
 
 public String[] getArregloInformacion()
    {
        return this.arregloDatos;
    }
}
