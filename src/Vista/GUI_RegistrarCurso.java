/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Moon
 */
public class GUI_RegistrarCurso extends javax.swing.JPanel {

    /**
     * Creates new form GUI_RegistrarCurso
     */
    public GUI_RegistrarCurso() {
        initComponents();
        cargarCreditos();
    }
    
    public void cargarCreditos()
    {
        this.jcb_Creditos.removeAllItems();
        for(int contador=0; contador<10; contador++)
        {
            this.jcb_Creditos.addItem(""+contador);
            
        }
        
        this.jcb_Creditos.setSelectedIndex(4);
    }
    
    public String[] devolverInformacion()
    {
        String arreglo[];
        arreglo=new String [3];
        
        arreglo[0]=this.jt_NombreCurso.getText();
        arreglo[1]=this.jt_SiglasCurso.getText();
        arreglo[2]=""+this.jcb_Creditos.getSelectedIndex();
        
        return arreglo;
    }
    public String devolverNombreCurso()
    {
        return this.jt_NombreCurso.getText();
    }
    public String devolverSiglasCurso()
    {
        return this.jt_SiglasCurso.getText();
    }
    
     public void mostrarInformacion(String arreglo[])
    {
        this.jt_NombreCurso.setText(arreglo[0]);
        this.jcb_Creditos.setSelectedIndex(Integer.parseInt(arreglo[1]));
        
    }
     public void modifico()
     {
         this.jt_SiglasCurso.setText("");
         this.jt_NombreCurso.setText("");
//         this.jt_Creditos.setText("");
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NombreCurso = new javax.swing.JLabel();
        jl_siglasCurso = new javax.swing.JLabel();
        jl_creditos = new javax.swing.JLabel();
        jt_NombreCurso = new javax.swing.JTextField();
        jt_SiglasCurso = new javax.swing.JTextField();
        jcb_Creditos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(372, 300));
        setLayout(null);

        jl_NombreCurso.setText("Nombre del curso");
        add(jl_NombreCurso);
        jl_NombreCurso.setBounds(30, 60, 119, 27);

        jl_siglasCurso.setText("Siglas del curso");
        add(jl_siglasCurso);
        jl_siglasCurso.setBounds(30, 20, 119, 32);

        jl_creditos.setText("Créditos");
        add(jl_creditos);
        jl_creditos.setBounds(30, 100, 119, 31);
        add(jt_NombreCurso);
        jt_NombreCurso.setBounds(160, 60, 190, 27);
        add(jt_SiglasCurso);
        jt_SiglasCurso.setBounds(160, 20, 190, 32);

        jcb_Creditos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcb_Creditos);
        jcb_Creditos.setBounds(160, 100, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TareaProgra2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 372, 180);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcb_Creditos;
    private javax.swing.JLabel jl_NombreCurso;
    private javax.swing.JLabel jl_creditos;
    private javax.swing.JLabel jl_siglasCurso;
    private javax.swing.JTextField jt_NombreCurso;
    private javax.swing.JTextField jt_SiglasCurso;
    // End of variables declaration//GEN-END:variables
}
