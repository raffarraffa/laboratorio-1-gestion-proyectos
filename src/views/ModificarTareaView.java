/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EquipoData;
import controllers.EquipoMiembroData;
import controllers.MiembroData;
import controllers.ProyectoData;
import controllers.TareaData;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Equipo;
import models.EquipoMiembro;
import models.Miembro;
import models.Proyecto;
import models.Tarea;
import static views.Gestion.vistaProyecto;

/**
 *
 * @author leo_t
 */
public class ModificarTareaView extends javax.swing.JInternalFrame {

    private Tarea tarea = new Tarea();
    private ArrayList<Tarea> tareas = new ArrayList();
    private TareaData tareaD = new TareaData();
    private EquipoMiembro equipoMiembro = new EquipoMiembro();
    private EquipoMiembroData equipoMD = new EquipoMiembroData();
    private Equipo equipo = new Equipo();
    private EquipoData equipoD = new EquipoData();
    private Proyecto proyecto = new Proyecto();
    private ProyectoData proyectoD = new ProyectoData();

    /**
     * Creates new form MiembrosViews
     */
    public ModificarTareaView() {
        initComponents();
        this.setTitle("Aministrar Tarea");
        jidEquipoMiembro.setVisible(false);
        bBorrar.setEnabled(false);
        Inactivo.setEnabled(false);
        limpiarPantalla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        bActualizar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();
        jComboTareas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Completado = new javax.swing.JRadioButton();
        Pendiente = new javax.swing.JRadioButton();
        Progreso = new javax.swing.JRadioButton();
        jFechaCreacion = new com.toedter.calendar.JDateChooser();
        jFechaCierre = new com.toedter.calendar.JDateChooser();
        bAgregar = new javax.swing.JButton();
        jidEquipoMiembro = new javax.swing.JLabel();
        bBorrar = new javax.swing.JButton();
        Inactivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(854, 728));
        setMinimumSize(new java.awt.Dimension(854, 728));
        setPreferredSize(new java.awt.Dimension(854, 728));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha Creación:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estado:");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha Cierre:");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bCerrar.setText("Salir");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        jComboTareas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Seleccione tarea:");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Completado.setText("Completado");
        Completado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompletadoActionPerformed(evt);
            }
        });

        Pendiente.setText("Pendiente");
        Pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendienteActionPerformed(evt);
            }
        });

        Progreso.setText("Progreso");
        Progreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgresoActionPerformed(evt);
            }
        });

        bAgregar.setText("Añadir");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bBorrar.setText("Desactivar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        Inactivo.setText("Inactivo");
        Inactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jidEquipoMiembro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboTareas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreTarea)
                            .addComponent(jFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jFechaCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(238, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Completado)
                                .addGap(18, 18, 18)
                                .addComponent(Progreso)
                                .addGap(18, 18, 18)
                                .addComponent(Pendiente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Inactivo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jFechaCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Completado)
                    .addComponent(Progreso)
                    .addComponent(Pendiente)
                    .addComponent(Inactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jidEquipoMiembro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, txtNombreTarea});

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administar Tarea");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), "Sistema de Gestion", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarPantalla() {

        txtNombreTarea.setText("");
        jFechaCreacion.setDate(null);
        jFechaCierre.setDate(null);
        bBorrar.setEnabled(false);
        Pendiente.setSelected(false);
        Progreso.setSelected(false);
        Inactivo.setSelected(false);
        Completado.setSelected(false);

    }

    private boolean validarCampos() {
        if (txtNombreTarea.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "El campo nombre está vacio");
            return false;
        }
        if (jFechaCreacion.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha de Creacion");
            return false;
        }
        if (jFechaCierre.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha de Cierre");
            return false;
        }
        return true;
    }
    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        dispose();
        vistaProyecto = new ProyectoView();
    }//GEN-LAST:event_bCerrarActionPerformed

    public void cargarCombo() {
        //obtener una lista de las tareas
        int id = Integer.parseInt(jidEquipoMiembro.getText());
        equipoMiembro.setId_equipo_miembro(id);
        tareas = tareaD.selectTareasMiembro(equipoMiembro);//Obtiene un ArrayList de Tareas del MiembroEquipo
        for (Tarea t : tareas) {
            jComboTareas.addItem(t);
        }
    }

    private boolean validarFechas() {
        ZoneId zona = ZoneId.systemDefault();

        Date DateCre = jFechaCreacion.getDate();
        Date DateCie = jFechaCierre.getDate();

        LocalDate fechaCre = DateCre.toInstant().atZone(zona).toLocalDate();
        LocalDate fechaCie = DateCie.toInstant().atZone(zona).toLocalDate();
        //obtento el id equipo con el id del equipoMiembro
        int idEquipo = equipoMD.selectIdEquipo(Integer.parseInt(jidEquipoMiembro.getText()));
        equipo = equipoD.selectEquipo(idEquipo);
        //obtengo el proyecto con el id del equipo
        proyecto = proyectoD.selectProyecto(equipo.getId_proyecto());
        if (proyecto.getFecha_inicio().isAfter(fechaCre)) {
            JOptionPane.showMessageDialog(null, "La fecha de creacion debe ser posterior a la creacion del proyecto: " + proyecto.getFecha_inicio().toString());
            return false;
        }
        if (fechaCre.isAfter(fechaCie)) {
            JOptionPane.showMessageDialog(null, "La fecha de cierre debe ser posterior a la creacion del la tarea");
            return false;
        }
        return true;
    }
    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        if (validarCampos()) {
            tarea = (Tarea) jComboTareas.getSelectedItem();
            ZoneId zona = ZoneId.systemDefault();
            Date DateCreacion = jFechaCreacion.getDate();
            Date DateCierre = jFechaCierre.getDate();
            LocalDate fechaCreacion = DateCreacion.toInstant().atZone(zona).toLocalDate();
            LocalDate fechaCierre = DateCierre.toInstant().atZone(zona).toLocalDate();
            if (Inactivo.isSelected()) {
                bBorrar.setEnabled(false);
            } else {
                bBorrar.setEnabled(true);
            }
            if (Completado.isSelected()) {
                tarea.setEstado(1);
            }
            if (Progreso.isSelected()) {
                tarea.setEstado(2);
            }
            if (Pendiente.isSelected()) {
                tarea.setEstado(3);
            }
            if (!Completado.isSelected() && !Progreso.isSelected() && !Pendiente.isSelected() && !Inactivo.isSelected()) {
                tarea.setEstado(0);
            }
            tarea.setNombre(txtNombreTarea.getText().toString());
            tarea.setFechaCierre(fechaCierre);
            tarea.setFechaCreacion(fechaCreacion);
            int id = Integer.parseInt(jidEquipoMiembro.getText());
            equipoMiembro.setId_equipo_miembro(id);
            tarea.setEquipoMiembro(equipoMiembro);
            if (validarFechas()) {
                if (tareaD.updateTarea(tarea)) {
                    JOptionPane.showMessageDialog(null, "Tarea actualizada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar la tarea");
                }
            }
        }
        cargarCombo();
        limpiarPantalla();
    }//GEN-LAST:event_bActualizarActionPerformed

    private void CompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompletadoActionPerformed
        // TODO add your handling code here:
        if (Completado.isSelected()) {
            Pendiente.setSelected(false);
            Progreso.setSelected(false);
            Inactivo.setSelected(false);
        }
    }//GEN-LAST:event_CompletadoActionPerformed

    private void ProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgresoActionPerformed
        // TODO add your handling code here:
        if (Progreso.isSelected()) {
            Completado.setSelected(false);
            Pendiente.setSelected(false);
            Inactivo.setSelected(false);
        }
    }//GEN-LAST:event_ProgresoActionPerformed

    private void PendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendienteActionPerformed
        // TODO add your handling code here:
        if (Pendiente.isSelected()) {
            Completado.setSelected(false);
            Progreso.setSelected(false);
            Inactivo.setSelected(false);
        }
    }//GEN-LAST:event_PendienteActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:
        if (validarCampos()) {
            if (tareaD.TareaExistente(txtNombreTarea.getText())) {
                JOptionPane.showMessageDialog(null, "Ya existe una tarea con el mismo nombre");
            } else {
                ZoneId zona = ZoneId.systemDefault();
                Date DateCreacion = jFechaCreacion.getDate();
                Date DateCierre = jFechaCierre.getDate();
                LocalDate fechaCreacion = DateCreacion.toInstant().atZone(zona).toLocalDate();
                LocalDate fechaCierre = DateCierre.toInstant().atZone(zona).toLocalDate();
                if (Completado.isSelected()) {
                    tarea.setEstado(1);
                }
                if (Progreso.isSelected()) {
                    tarea.setEstado(2);
                }
                if (Pendiente.isSelected()) {
                    tarea.setEstado(3);
                }
                if (!Completado.isSelected() && !Progreso.isSelected() && !Pendiente.isSelected()) {
                    tarea.setEstado(0);
                }
                tarea.setNombre(txtNombreTarea.getText().toString());
                tarea.setFechaCierre(fechaCierre);
                tarea.setFechaCreacion(fechaCreacion);
                int id = Integer.parseInt(jidEquipoMiembro.getText());
                equipoMiembro.setId_equipo_miembro(id);
                tarea.setEquipoMiembro(equipoMiembro);
                if (validarFechas()) {
                    if (tareaD.insertTarea(tarea)) {
                        JOptionPane.showMessageDialog(null, "Tarea agregada con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo agregar la tarea");
                    }

                }

            }
        }
        limpiarPantalla();
        cargarCombo();
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        // TODO add your handling code here:
        Inactivo.setVisible(true);
        Inactivo.setSelected(true);
        Completado.setSelected(false);
        Progreso.setSelected(false);
        Pendiente.setSelected(false);
        tarea = (Tarea) jComboTareas.getSelectedItem();
        if (tareaD.updateTareaEstado(tarea.getIdTarea(), 4)) {
            JOptionPane.showMessageDialog(null, "Tarea borrada");
            bBorrar.setEnabled(false);
            limpiarPantalla();
            cargarCombo();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo borrar la tarea");
        }
    }//GEN-LAST:event_bBorrarActionPerformed

    private void InactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivoActionPerformed
        // TODO add your handling code here:
        if (Inactivo.isSelected()) {
            Completado.setSelected(false);
            Pendiente.setSelected(false);
            Progreso.setSelected(false);
        }
    }//GEN-LAST:event_InactivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Completado;
    private javax.swing.JRadioButton Inactivo;
    private javax.swing.JRadioButton Pendiente;
    private javax.swing.JRadioButton Progreso;
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCerrar;
    public javax.swing.JComboBox<Tarea> jComboTareas;
    private com.toedter.calendar.JDateChooser jFechaCierre;
    private com.toedter.calendar.JDateChooser jFechaCreacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jidEquipoMiembro;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
