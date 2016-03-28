/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_FRM_MenuPrincipal;


public class FRM_MenuPrincipal extends javax.swing.JFrame {

    Controlador_FRM_MenuPrincipal controlador_FRM_MenuPrincipal;
    
    public FRM_MenuPrincipal() {
        initComponents();
      controlador_FRM_MenuPrincipal=new Controlador_FRM_MenuPrincipal();
      agregarEventos();
    }
    
    public void agregarEventos()
            {
                this.jm_salir.addActionListener(controlador_FRM_MenuPrincipal);
                this.jm_Cursos.addActionListener(controlador_FRM_MenuPrincipal);
                this.jm_Estudiantes.addActionListener(controlador_FRM_MenuPrincipal);
                this.jm_Matricula.addActionListener(controlador_FRM_MenuPrincipal);
                this.jm_Reportes.addActionListener(controlador_FRM_MenuPrincipal);   
            }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Registrar = new javax.swing.JMenu();
        jm_Estudiantes = new javax.swing.JMenuItem();
        jm_Cursos = new javax.swing.JMenuItem();
        jm_VerificarCarnet = new javax.swing.JMenu();
        jm_Matricula = new javax.swing.JMenuItem();
        jm_Reportes = new javax.swing.JMenuItem();
        jm_Principal = new javax.swing.JMenu();
        jm_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 520));
        setPreferredSize(new java.awt.Dimension(700, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TareaProgra.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        jm_Registrar.setText("Registrar");

        jm_Estudiantes.setText("Estudiantes");
        jm_Registrar.add(jm_Estudiantes);

        jm_Cursos.setText("Cursos");
        jm_Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CursosActionPerformed(evt);
            }
        });
        jm_Registrar.add(jm_Cursos);

        jMenuBar1.add(jm_Registrar);

        jm_VerificarCarnet.setText("Verificar carnet");

        jm_Matricula.setText("Matricula");
        jm_Matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_MatriculaActionPerformed(evt);
            }
        });
        jm_VerificarCarnet.add(jm_Matricula);

        jm_Reportes.setText("Reportes");
        jm_VerificarCarnet.add(jm_Reportes);

        jMenuBar1.add(jm_VerificarCarnet);

        jm_Principal.setText("Principal");

        jm_salir.setText("Salir");
        jm_Principal.add(jm_salir);

        jMenuBar1.add(jm_Principal);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_CursosActionPerformed

    private void jm_MatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_MatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_MatriculaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jm_Cursos;
    private javax.swing.JMenuItem jm_Estudiantes;
    private javax.swing.JMenuItem jm_Matricula;
    private javax.swing.JMenu jm_Principal;
    private javax.swing.JMenu jm_Registrar;
    private javax.swing.JMenuItem jm_Reportes;
    private javax.swing.JMenu jm_VerificarCarnet;
    private javax.swing.JMenuItem jm_salir;
    // End of variables declaration//GEN-END:variables
}
