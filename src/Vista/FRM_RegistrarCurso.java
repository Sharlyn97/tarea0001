/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_RegistrarCursos;
import javax.swing.JOptionPane;

/**
 *
 * @author Moon
 */
public class FRM_RegistrarCurso extends javax.swing.JFrame {

    /**
     * Creates new form FRM_RegistrarCurso
     */
    
    Controlador_FRM_RegistrarCursos controladorRegistrarCursos;
            
    public FRM_RegistrarCurso() {
        initComponents();
        setVisible(false);
     
    controladorRegistrarCursos=new Controlador_FRM_RegistrarCursos(this);
    this.gUI_Botones1.agregarEventosCurso(controladorRegistrarCursos);
        
    }
    
    public String devolverNombreCurso()
    {
        return this.gUI_RegistrarCurso2.devolverNombreCurso();
    }
    public String devolverSiglasCurso()
    {
        return this.gUI_RegistrarCurso2.devolverSiglasCurso();
    }

    public String[] devolverInformacion()
    {
        return this.gUI_RegistrarCurso2.devolverInformacion();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_RegistrarCurso2.mostrarInformacion(arreglo);
    }

    public void modificoInformacion()
    {
        this.gUI_RegistrarCurso2.modifico();
    }
     public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones1 = new Vista.GUI_Botones();
        gUI_RegistrarCurso2 = new Vista.GUI_RegistrarCurso();

        setPreferredSize(new java.awt.Dimension(375, 340));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(gUI_Botones1);
        gUI_Botones1.setBounds(0, 150, 380, 150);
        getContentPane().add(gUI_RegistrarCurso2);
        gUI_RegistrarCurso2.setBounds(0, 0, 360, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_RegistrarCurso gUI_RegistrarCurso2;
    // End of variables declaration//GEN-END:variables
}
