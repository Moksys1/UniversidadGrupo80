package universidadgrupo80.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadgrupo80.accesoADatos.AlumnoData;
import universidadgrupo80.accesoADatos.InscripcionData;
import universidadgrupo80.accesoADatos.MateriaData;
import universidadgrupo80.entidades.Alumno;
import universidadgrupo80.entidades.Inscripcion;
import universidadgrupo80.entidades.Materia;

public class FormularioDeInscripcion extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    AlumnoData aluDat = new AlumnoData();
    Alumno alum = new Alumno();
    MateriaData matData = new MateriaData();
    Materia mat = new Materia();
    InscripcionData inscData = new InscripcionData();
    Inscripcion insc = new Inscripcion();

    public FormularioDeInscripcion() {
        initComponents();
        armarCabecera();
        aluDat = new AlumnoData();
        List<Alumno> alumnos = new ArrayList<>();
        alumnos = aluDat.listarAlumnos();
        for (Alumno alum : alumnos) {
            this.jCbAlumnos.addItem(alum);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBInscribir = new javax.swing.JButton();
        jBAnularIns = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jRMateriasInscriptas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jCbAlumnos = new javax.swing.JComboBox<>();
        jRMateriasNo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTincripcion = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(512, 380));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de inscripcion");
        jLabel1.setAutoscrolls(true);

        jBInscribir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBInscribir.setText("Inscribir");

        jBAnularIns.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBAnularIns.setText("Anular inscripcion");

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jRMateriasInscriptas.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jRMateriasInscriptas.setText("Materias inscriptas");
        jRMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasInscriptasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Seleccionar alumno:");

        jCbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbAlumnosItemStateChanged(evt);
            }
        });
        jCbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbAlumnosActionPerformed(evt);
            }
        });

        jRMateriasNo.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jRMateriasNo.setText("Materias no inscriptas");
        jRMateriasNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasNoActionPerformed(evt);
            }
        });

        jTincripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTincripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTincripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInscribir)
                        .addGap(66, 66, 66)
                        .addComponent(jBAnularIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRMateriasInscriptas)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRMateriasNo)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jCbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMateriasInscriptas)
                    .addComponent(jRMateriasNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnularIns)
                    .addComponent(jBSalir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbAlumnosActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbAlumnosItemStateChanged
        // TODO add your handling code here:
        aluDat.listarAlumnos();
        alum = (Alumno) jCbAlumnos.getSelectedItem();

    }//GEN-LAST:event_jCbAlumnosItemStateChanged

    private void jRMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasInscriptasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRMateriasInscriptasActionPerformed

    private void jRMateriasNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRMateriasNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularIns;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRMateriasInscriptas;
    private javax.swing.JRadioButton jRMateriasNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTincripcion;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTincripcion.setModel(modelo);
    }

    private void cargarDatos(Materia mat) {
        modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre()});

    }

    private void cargaDatosNoInscriptas() {
        Alumno selec = (Alumno) jCbAlumnos.getSelectedItem();
        ArrayList listaM = (ArrayList) inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for (Materia mat : listaM) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAño()});
        }
    }

    private void cargaDatosInscriptas() {
        Alumno selec = (Alumno) jCbAlumnos.getSelectedItem();
        List<Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia mat : lista) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAño()});
        }
    }
}
