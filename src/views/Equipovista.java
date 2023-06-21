/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EquipoData;
import controllers.ProyectoData;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import models.Equipo;
import models.Proyecto;
import static views.Gestion.desktop;
import static views.Gestion.vistaProyecto;

/**
 *
 * @author Ruben
 */
public class Equipovista extends javax.swing.JInternalFrame {

    public static Equipo equipo = new Equipo();

    /**
     * Creates new form Equipovista
     */
    public Equipovista() {
        initComponents();
        jButtonProyecto.setEnabled(false);
        jButtonEquipo.setEnabled(false);
        jRadioButtonactualizar.setSelected(true);
        jRadioButtonnuevo.setSelected(false);

        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void cargarCombo() {
        ArrayList<Proyecto> proyectos = new ArrayList();
        ProyectoData proyectod = new ProyectoData();
        proyectos = proyectod.selectProyecto();
        for (int i = 0; i < proyectos.size(); i++) {
            jComboBox1.addItem(proyectos.get(i));

        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTexnombre = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButtonEquipo = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jButtonProyecto = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonactualizar = new javax.swing.JRadioButton();
        jRadioButtonnuevo = new javax.swing.JRadioButton();
        jButtonactualizar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setMaximumSize(new java.awt.Dimension(854, 728));
        setMinimumSize(new java.awt.Dimension(854, 728));
        setPreferredSize(new java.awt.Dimension(854, 728));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipo");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), "Sistema de Gestion", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado:");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre:");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha:");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jButtonEquipo.setText("Crear Equipo");
        jButtonEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipoActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jButtonProyecto.setText("Unir a Proyecto");
        jButtonProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProyectoActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Activo/Inactivo");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Proyecto:");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jRadioButtonactualizar.setText("Actualizar");
        jRadioButtonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonactualizarActionPerformed(evt);
            }
        });

        jRadioButtonnuevo.setText("Nuevo");
        jRadioButtonnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonnuevoActionPerformed(evt);
            }
        });

        jButtonactualizar.setText("Actualizar");
        jButtonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonnuevo)
                                .addGap(78, 78, 78)
                                .addComponent(jRadioButtonactualizar)))))
                .addGap(0, 240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonactualizar)
                            .addComponent(jRadioButtonnuevo))
                        .addContainerGap(208, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validar() {
        if (!jTexnombre.getText().equals("") && (jDateChooser1.getCalendar() != null)) {
            return true;
        } else {
            return false;
        }

    }

    private void jButtonEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipoActionPerformed
        int cont;
        Calendar fechaActual = Calendar.getInstance();
        if (validar()) {
            equipo.setNombre(jTexnombre.getText());
            if (jRadioButton1.isSelected()) {
                cont = 1;
            } else {
                cont = 0;
            }
            equipo.setEstado(cont);
            java.time.LocalDate fechaInicioLocalDate = jDateChooser1.getCalendar().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            equipo.setCreacion(fechaInicioLocalDate);
            JOptionPane.showMessageDialog(this, "Tiene que Asignar Equipo a un Proyecto");
            jButtonEquipo.setEnabled(false);
            jButtonProyecto.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(this, "Hay Campos Vacios");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButtonEquipoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
        vistaProyecto = new ProyectoView();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButtonProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProyectoActionPerformed
        EquipoData equipod = new EquipoData();
        Proyecto proyecto = (Proyecto) jComboBox1.getSelectedItem();
        equipod.insertEquipos(equipo, proyecto);

// TODO add your handling code here:
    }//GEN-LAST:event_jButtonProyectoActionPerformed

    private void limpiar() {
        jTexnombre.setText("");
        jDateChooser1.setCalendar(null);
        jRadioButton1.setEnabled(false);
    }
    private void jRadioButtonnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonnuevoActionPerformed
        if (jRadioButtonnuevo.isSelected()) {
            jRadioButtonactualizar.setSelected(false);
            jButtonactualizar.setEnabled(false);
            jButtonEquipo.setEnabled(true);
            jButtonProyecto.setEnabled(true);
            limpiar();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonnuevoActionPerformed

    private void jRadioButtonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonactualizarActionPerformed
        if (jRadioButtonactualizar.isSelected()) {
            jComboBox1.setEnabled(false);
            jRadioButtonnuevo.setSelected(false);
            jButtonactualizar.setEnabled(true);
            jButtonEquipo.setEnabled(false);
            jButtonProyecto.setEnabled(false);

        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonactualizarActionPerformed

    private void jButtonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonactualizarActionPerformed
        int con;
        EquipoData equipod = new EquipoData();
        System.out.println(equipo);
        equipo.setNombre(jTexnombre.getText());
        System.out.println(equipo.getNombre());
        java.time.LocalDate fechaInicioLocalDate = jDateChooser1.getCalendar().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        equipo.setCreacion(fechaInicioLocalDate);
        System.out.println(equipo.getId_equipo());
        if (jRadioButton1.isSelected()) {
            con = 1;
        } else {
            con = 0;
        }
        equipo.setEstado(con);
        System.out.println(equipo);
        equipod.updateEquipo(equipo);

    }//GEN-LAST:event_jButtonactualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButtonEquipo;
    private javax.swing.JButton jButtonProyecto;
    private javax.swing.JButton jButtonactualizar;
    private javax.swing.JComboBox<Proyecto> jComboBox1;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButtonactualizar;
    private javax.swing.JRadioButton jRadioButtonnuevo;
    public javax.swing.JTextField jTexnombre;
    // End of variables declaration//GEN-END:variables
}
