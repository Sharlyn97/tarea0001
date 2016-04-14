/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_FRM_RegistrarEstudiantes;
import javax.swing.JOptionPane;

/**
 *
 * @author Moon
 */
public class FRM_RegistrarEstudiantes extends javax.swing.JFrame {

  Controlador_FRM_RegistrarEstudiantes controladorRegistrarEstudiantes;
    
    public FRM_RegistrarEstudiantes() {
        initComponents();
        setVisible(false);    
    controladorRegistrarEstudiantes=new Controlador_FRM_RegistrarEstudiantes(this); 
    gUI_Botones1.agregarEventos(controladorRegistrarEstudiantes);
    estadoInicial();
    }

    public String devolverCarnet()
    {
        return this.gUI_RegistrarEstudiante1.devolverCarnet();
    }
    public String devolverNombre()
    {
        return this.gUI_RegistrarEstudiante1.devolverNombre();
    }
    public String[] devolverInformacion()
    {
        return this.gUI_RegistrarEstudiante1.devolverInformacion();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_RegistrarEstudiante1.mostrarInformacion(arreglo);
    }
    public void modificoInformacion()
    {
        this.gUI_RegistrarEstudiante1.modifico();
    }
     public void estadoInicial()
    {
        this.gUI_RegistrarEstudiante1.estadoInicial();
        this.gUI_Botones1.estadoInicial();
    }
    public void habilitarAgregar()
    {
        this.gUI_Botones1.habiliarAgregar();
        this.gUI_RegistrarEstudiante1.habilitarAgregar();
    }
    public void deshabilitarCedula()
    {
        this.gUI_RegistrarEstudiante1.DeshabilitarCedula();
    }
    public void habilitarOpciones()
    {
        this.gUI_Botones1.habilitarOpciones();
        this.gUI_RegistrarEstudiante1.habilitarNombre();
    }
    public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones1 = new Vista.GUI_Botones();
        gUI_RegistrarEstudiante1 = new Vista.GUI_RegistrarEstudiante();

        setMinimumSize(new java.awt.Dimension(360, 320));
        setPreferredSize(new java.awt.Dimension(360, 320));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(gUI_Botones1);
        gUI_Botones1.setBounds(0, 130, 350, 160);
        getContentPane().add(gUI_RegistrarEstudiante1);
        gUI_RegistrarEstudiante1.setBounds(0, 0, 350, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_RegistrarEstudiante gUI_RegistrarEstudiante1;
    // End of variables declaration//GEN-END:variables
}
