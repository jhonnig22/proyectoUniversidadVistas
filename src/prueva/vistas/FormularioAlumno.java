/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva.vistas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueva.mdoelo.Alumno;
import prueva.mdoelo.AlumnoData;
import prueva.mdoelo.Conexion;

/**
 *
 * @author programador
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {
  
   
    public FormularioAlumno() {
        initComponents();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cBUSCAR = new javax.swing.JTextField();
        cNOMBRE = new javax.swing.JTextField();
        bACTIVAR = new javax.swing.JRadioButton();
        bBUSCAR = new javax.swing.JButton();
        bGUARDAR = new javax.swing.JButton();
        bBORRAR = new javax.swing.JButton();
        bACTUALIZAR = new javax.swing.JButton();
        bLIMPIAR = new javax.swing.JButton();
        buscarTodo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cFECHA = new javax.swing.JTextField();

        jLabel1.setText("id");

        jLabel2.setText("nombre");

        jLabel3.setText("fecha nacimento");

        jLabel4.setText("activo");

        cNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNOMBREActionPerformed(evt);
            }
        });

        bACTIVAR.setText("activar");
        bACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bACTIVARActionPerformed(evt);
            }
        });

        bBUSCAR.setText("Buscar");
        bBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBUSCARActionPerformed(evt);
            }
        });

        bGUARDAR.setText("Guardar");
        bGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGUARDARActionPerformed(evt);
            }
        });

        bBORRAR.setText("Borrar");

        bACTUALIZAR.setText("Actualizar");
        bACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bACTUALIZARActionPerformed(evt);
            }
        });

        bLIMPIAR.setText("Limpiar");

        buscarTodo.setText("Buscar Todos Los Alumnos");
        buscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTodoActionPerformed(evt);
            }
        });

        jLabel5.setText("DD/MM/YYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bGUARDAR)
                        .addGap(18, 18, 18)
                        .addComponent(bBORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bACTUALIZAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buscarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bACTIVAR)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cFECHA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cNOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(cBUSCAR)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBUSCAR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(cFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bACTIVAR))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGUARDAR)
                    .addComponent(bLIMPIAR)
                    .addComponent(bBORRAR)
                    .addComponent(bACTUALIZAR))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bACTIVARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bACTIVARActionPerformed

    private void bACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bACTUALIZARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bACTUALIZARActionPerformed

    private void cNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNOMBREActionPerformed

    private void bBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBUSCARActionPerformed
         
        try {
            Conexion con = new Conexion();
            
            AlumnoData ad = new AlumnoData(con);
            Alumno alumno = ad.buscarAlumno(Integer.parseInt(cBUSCAR.getText()));
            System.out.println(alumno.getNombre());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bBUSCARActionPerformed

    private void buscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTodoActionPerformed
        try {
            Conexion con = new Conexion();
            AlumnoData ad = new AlumnoData(con);
            List<Alumno> lista = ad.obtenerAlumnos();
            lista.forEach(alumno -> System.out.println(alumno.getNombre()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarTodoActionPerformed

    private void bGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGUARDARActionPerformed
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = cFECHA.getText();

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);
            Conexion con = new Conexion();
            AlumnoData ad = new AlumnoData(con);
            Alumno a = new Alumno();
            String fech = cFECHA.getText();
            LocalDate fecha = LocalDate.parse(fech);
            a.setNombre(cNOMBRE.getText());
            a.setFechNac(localDate);
            a.setActivo(bACTIVAR.isEnabled());
            ad.guardarAlumno(a);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGUARDARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bACTIVAR;
    private javax.swing.JButton bACTUALIZAR;
    private javax.swing.JButton bBORRAR;
    private javax.swing.JButton bBUSCAR;
    private javax.swing.JButton bGUARDAR;
    private javax.swing.JButton bLIMPIAR;
    private javax.swing.JButton buscarTodo;
    private javax.swing.JTextField cBUSCAR;
    private javax.swing.JTextField cFECHA;
    private javax.swing.JTextField cNOMBRE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private void Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
