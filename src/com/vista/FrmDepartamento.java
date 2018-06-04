
package com.vista;

import com.controlador.DaoDepartamento;
import com.modelo.Departamento;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos franco
 */
public class FrmDepartamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmDepartamento
     */
    public FrmDepartamento() {
        initComponents();
        tablaE();
        jTXTcodigoDepartamento.setVisible(false); //OCULTA EL CAMPO ID DEPARTAMENTO
        
        /*if(jTXTcodigoDepartamento.getText().isEmpty() && jTXTDepartamento.getText().isEmpty()){
            this.BtnModificar.setEnabled(false);
            this.BtnEliminar.setEnabled(false);
            this.BtnIngresar.setEnabled(false);
        }
        if(!jTXTDepartamento.getText().isEmpty()){
            this.BtnIngresar.setEnabled(false);
            this.BtnEliminar.setEnabled(true);
            this.BtnModificar.setEnabled(true);
            this.BtnLimpiar.setEnabled(true);
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTXTcodigoDepartamento = new javax.swing.JTextField();
        jTXTDepartamento = new javax.swing.JTextField();
        BtnIngresar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDepartamento = new javax.swing.JTable();
        BtnLimpiar = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("GESTIONAR DEPARTAMENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel3.setText("Nombre Departamento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));
        getContentPane().add(jTXTcodigoDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 160, -1));
        getContentPane().add(jTXTDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 160, -1));

        BtnIngresar.setText("Insertar");
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        BtnModificar.setText("Modificar");
        BtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModificarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jTableDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDepartamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDepartamento);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 610, 320));

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        if(jTXTDepartamento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
        }else{
            insertar();
        }
    }//GEN-LAST:event_BtnIngresarMouseClicked

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked
        modificar();
    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        if(jTXTDepartamento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El registro no puede estar vacio.");
        }else{
            eliminar();
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void jTableDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDepartamentoMouseClicked
       llenarTabla();
    }//GEN-LAST:event_jTableDepartamentoMouseClicked

    private void BtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_BtnLimpiarMouseClicked

    DaoDepartamento daod = new DaoDepartamento();
    Departamento dep = new Departamento();

    public void insertar()
    {
        
        try 
        {
           //dep.setCoddepartamento(Integer.parseInt(this.jTXTcodigoDepartamento.getText().trim()));
           dep.setDepartamento(this.jTXTDepartamento.getText().trim());
           daod.insertarDepartamento(dep);
           JOptionPane.showMessageDialog(null,"Datos Insertado Correctamente");
           tablaE();
           limpiar();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,e.toString(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void llenarTabla()
 {
      int fila=this.jTableDepartamento.getSelectedRow();
      this.jTXTcodigoDepartamento.setText(String.valueOf(this.jTableDepartamento.getValueAt(fila, 0)));
      this.jTXTDepartamento.setText(String.valueOf(this.jTableDepartamento.getValueAt(fila, 1)));
 }
     public void limpiar()
    {
      this.jTXTcodigoDepartamento.setText("");
      this.jTXTDepartamento.setText("");
    }
    
     public void modificar()
    {
         try 
        {
            dep.setCoddepartamento(Integer.parseInt(this.jTXTcodigoDepartamento.getText().trim()));
            dep.setDepartamento(this.jTXTDepartamento.getText().trim());
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el Departamento",
                    "Modificar Departamento",JOptionPane.YES_NO_OPTION);
            if(SiONo==0)
            {
                daod.modificarDepartamento(dep);
                JOptionPane.showMessageDialog(rootPane, "Departamento modificado con exito", 
                        "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE);
                tablaE();
                limpiar();
            }
            else
            {
                limpiar();
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    public void eliminar()
    {

        try 
        {
            dep.setCoddepartamento(Integer.parseInt(this.jTXTcodigoDepartamento.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el Departamento",
                    "Eliminar Departamento",JOptionPane.YES_NO_OPTION);
            if(SiONo==0)
            {
                daod.eliminarDepartamento(dep);
                JOptionPane.showMessageDialog(rootPane,"Eliminado con exito" , "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE);
                tablaE();
                limpiar();
            }
            else
            {
                limpiar();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }
    public void tablaE(){
        String [] columnas={"CodigoDepartamento","NombreDepartamento"} ;
        Object[] obj=new Object[2];
        DefaultTableModel tabla=new DefaultTableModel(null,columnas);
        List ls;
        try 
        {
           ls =daod.mostrarDepartamento();
            for(int i=0;i<ls.size();i++)
            {   dep=(Departamento)ls.get(i);
                obj[0]=dep.getCoddepartamento();
                obj[1]=dep.getDepartamento();
                tabla.addRow(obj);
            }
        
            ls=daod.mostrarDepartamento();
            this.jTableDepartamento.setModel(tabla);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
    }
    
    public void enableButtons(){
        this.BtnIngresar.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTXTDepartamento;
    private javax.swing.JTextField jTXTcodigoDepartamento;
    private javax.swing.JTable jTableDepartamento;
    // End of variables declaration//GEN-END:variables
}
