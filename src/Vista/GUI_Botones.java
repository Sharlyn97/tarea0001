/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Controlador_FRM_RegistrarCursos;
import Controlador.Controlador_FRM_RegistrarEstudiantes;

/**
 *
 * @author Moon
 */
public class GUI_Botones extends javax.swing.JPanel {

    Controlador_FRM_RegistrarEstudiantes controladorRegistrarEstudiantes;
    Controlador_FRM_RegistrarCursos controladorRegistrarCursos;
        
    public GUI_Botones() {
        initComponents();     
    }
   
    public void agregarEventos(Controlador_FRM_RegistrarEstudiantes controladorEstudiantes)
    {
        this.controladorRegistrarEstudiantes=controladorEstudiantes;
        this.jb_Consultar.addActionListener(controladorEstudiantes);
        this.jb_Eliminar.addActionListener(controladorEstudiantes);
        this.jb_Modificar.addActionListener(controladorEstudiantes);
        this.jb_Registrar.addActionListener(controladorEstudiantes);
    }
    public void agregarEventosCurso(Controlador_FRM_RegistrarCursos controladorCursos)
    {
        this.controladorRegistrarCursos=controladorCursos;
        this.jb_Registrar.addActionListener(controladorCursos);
        this.jb_Modificar.addActionListener(controladorCursos);
        this.jb_Eliminar.addActionListener(controladorCursos);
        this.jb_Consultar.addActionListener(controladorCursos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Registrar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Consultar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jb_Registrar.setText("Registrar");
        add(jb_Registrar);
        jb_Registrar.setBounds(111, 31, 112, 46);

        jb_Modificar.setText("Modificar");
        add(jb_Modificar);
        jb_Modificar.setBounds(20, 104, 90, 40);

        jb_Consultar.setText("Consultar");
        add(jb_Consultar);
        jb_Consultar.setBounds(126, 104, 100, 40);

        jb_Eliminar.setText("Eliminar");
        add(jb_Eliminar);
        jb_Eliminar.setBounds(258, 104, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TareaProgra2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 1, 360, 180);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_Consultar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JButton jb_Registrar;
    // End of variables declaration//GEN-END:variables
}