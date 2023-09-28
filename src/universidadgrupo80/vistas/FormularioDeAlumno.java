package universidadgrupo80.vistas;

import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo80.accesoADatos.AlumnoData;
import universidadgrupo80.entidades.Alumno;

public class FormularioDeAlumno extends javax.swing.JInternalFrame {

    private AlumnoData aludata;

    public FormularioDeAlumno() {
        initComponents();
        aludata = new AlumnoData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jTDocumento = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jDFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jRBestado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setTitle("Formulario Alumno");
        setAlignmentX(2.0F);
        setAlignmentY(2.0F);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Alumno");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jBGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jTDocumento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jDFechaNac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jDFechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFechaNacPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento:");

        jBSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBSalir.setText("Salir ");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jRBestado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRBestado.setText("Activo");
        jRBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBestadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Estado:");

        jtid.setEditable(false);
        jtid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(69, 69, 69)
                        .addComponent(jEliminar)
                        .addGap(83, 83, 83)
                        .addComponent(jBGuardar))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNombre)
                                    .addComponent(jDFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBestado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBSalir)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtid, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRBestado)
                    .addComponent(jtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jEliminar)
                    .addComponent(jBNuevo)
                    .addComponent(jBSalir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            Alumno alumno = aludata.BuscarAlumno(Integer.parseInt(jtid.getText()));
//            int documento = Integer.parseInt(jTDocumento.getText());
//            String apellido = jTApellido.getText();
//            String nombre = jTNombre.getText();
//            LocalDate fechan = jDFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            Alumno alu = new Alumno(documento, apellido, nombre, fechan, true);
            alumno.setDni(Integer.parseInt(jTDocumento.getText()));
            alumno.setApellido(jTApellido.getText());
            alumno.setNombre(jTNombre.getText());
            alumno.setFechaNac(jDFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            alumno.setActivo(true);
            
//            System.out.println(alumno.getIdAlumno() + "");
//            System.out.println(alumno.getDni() + "");
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getFechaNac());
//            System.out.println(alumno.isActivo());
            
            aludata.modificarAlumno(alumno);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos ");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jDFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaNacPropertyChange
    }//GEN-LAST:event_jDFechaNacPropertyChange

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        try {
            int documento = Integer.parseInt(jTDocumento.getText());
            Alumno alumnoEliminar = aludata.BuscarAlumnoPorDni(documento);

            aludata.eliminarAlumno(alumnoEliminar.getIdAlumno());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe buscar un alumno o indicar su DNI.");
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTDocumento.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jDFechaNac.setDateFormatString("");
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            Alumno buscarAlu = aludata.BuscarAlumnoPorDni(Integer.parseInt(jTDocumento.getText()));
            
            jtid.setText(buscarAlu.getIdAlumno() + "");
            jTApellido.setText(buscarAlu.getApellido());
            jTNombre.setText(buscarAlu.getNombre());
            jDFechaNac.setDate(Date.valueOf(buscarAlu.getFechaNac()));
            jRBestado.setSelected(buscarAlu.isActivo());
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No ha ingresado ningun DNI a buscar");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jRBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBestadoActionPerformed
    }//GEN-LAST:event_jRBestadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDFechaNac;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRBestado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTextField jtid;
    // End of variables declaration//GEN-END:variables
}
