package universidadgrupo80.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import universidadgrupo80.accesoADatos.AlumnoData;
import universidadgrupo80.accesoADatos.InscripcionData;
import universidadgrupo80.entidades.Alumno;

public class cargaDeNotas extends javax.swing.JInternalFrame {

    // Declaro e Inicializo el modelo que hereda de DefaultTableModel
    // para acceder a sus metodos
    private DefaultTableModel modelo = new DefaultTableModel() {

        // Clase Interna Anónima
        public boolean isCellEditable(int fila, int columna) {

            // Si retorno true las celdas son todas editables, con false
            // ninguna celda es editable
            if (columna == 2) {
                return true;
            }
            return false;
        }
    };
    private AlumnoData aluData;
    private InscripcionData insData;
    private ArrayList<Alumno> listarAlumnos;
    private int idAlu;
    private double nuevaNota;

    public cargaDeNotas() {
        initComponents();

        // Inicializo el acceso a los datos de las tablas alumno e inscripción
        aluData = new AlumnoData();
        insData = new InscripcionData();

        // Con el aluData inicializado puedo llenar el ArrayList a través del
        // siguiente método:
        listarAlumnos = aluData.listarAlumnos();

        // Cargo los alumnos que necesito mostrar en el ComboBox
        cargarAlumnos();

        // Armo la cabecera de la tabla para que se lean bien los campos ID,
        // Nombre y Nota que necesito mostrarle al usuario
        armarCabeceraDeLaTabla();

        // En el jTable se cargan las materias por defecto
        cargarMaterias();

        // Al modelo de nuestra jTable le agrego un ListSelectionListener para 
        // operar sobre la celda seleccionada
        listSelectionListener();

        // Al modelo de la jTable le agrego un ListModelListener que me permite
        // operar sobre los cambios realizados en una celda
        anadeListenerAlModelo();

        jbGuardar.setEnabled(false);

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
        jcbAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setTitle("Carga De Notas");
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de notas");

        jcbAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcbAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnoItemStateChanged(evt);
            }
        });
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Seleccionar alumno:");

        jtNotas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtNotas);

        jbGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jbGuardar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int filas = jtNotas.getRowCount();
        for (int fila = 0; fila < filas; fila++) {
            insData.actualizarNota(
                    Double.parseDouble(jtNotas.getValueAt(fila, 2).toString()),
                    idAlu,
                    Integer.parseInt(jtNotas.getValueAt(fila, 0).toString())
            );
        }
        jbGuardar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Nota(s) Actualizada(s).");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnoItemStateChanged
        cargarMaterias();
    }//GEN-LAST:event_jcbAlumnoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables

    public void cargarAlumnos() {
        // Limpio el ComboBox
        jcbAlumno.removeAllItems();

        // Cargamos los alumnos en el ComboBox
        for (Alumno listar : listarAlumnos) {
            jcbAlumno.addItem(listar);
        }
    }

    public void armarCabeceraDeLaTabla() {
        // =====================================================================
        // Creación del metodo para modificar las caracteristicas de la Tabla
        // =====================================================================

        // Al modelo le agregamos las siguientes columnas:
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");

        // Y a nuestra Tabla le seteamos el modelo
        jtNotas.setModel(modelo);

        jtNotas.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtNotas.getColumnModel().getColumn(1).setPreferredWidth(150);
        jtNotas.getColumnModel().getColumn(2).setPreferredWidth(80);

        System.out.println("Seleccione un alumno para modificar su nota");
    }

    public void cargarMaterias() {
        // Limpio las filas de la tabla
        borrarFilasTabla();

        Alumno seleccionada = (Alumno) jcbAlumno.getSelectedItem();

        idAlu = seleccionada.getIdAlumno();

        if (seleccionada != null) {
            ArrayList<Object[]> lista = (ArrayList) insData.obtenerMateriasCursadasAriel(idAlu);

            for (Object[] fila : lista) {
                modelo.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione primero un alumno");
        }
    }

    public void borrarFilasTabla() {
        // Con este metodo puedo borrar una fila especifica al recorrer el modelo
        // Controlar que no este vacio o cargarlo desde el comienzo
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            if (modelo.getRowCount() > 0) {
                for (int i = a; i >= 0; i--) {
                    modelo.removeRow(i);
                }
            }
        }
    }

    public void anadeListenerAlModelo() {
        jtNotas.getModel().addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent evento) {
                cambioNota(evento);
            }
        });
    }

    public void cambioNota(TableModelEvent evento) {
        // Solo se trata el evento UPDATE, correspondiente al cambio de valor
        // de una celda.
        if (evento.getType() == TableModelEvent.UPDATE) {

            // Se obtiene el modelo de la tabla y la fila/columna que han cambiado.
            int fila = evento.getFirstRow();
            int columna = evento.getColumn();
            int c = 0;

            try {
                Object nueva = jtNotas.getValueAt(fila, columna);
                double pars = Double.parseDouble(nueva.toString());
                if (pars >= 0 && pars <= 10) {
                    c++;
                    nuevaNota = pars;
                    if (c == 1) {
                        jbGuardar.setEnabled(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El valor ingresado no es válido(0-10)");
                    jtNotas.setValueAt(nuevaNota, fila, columna);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es válido");
                jtNotas.setValueAt(nuevaNota, fila, columna);
            }
        }
    }

    public void listSelectionListener() {
        jtNotas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evento) {
                int filaSeleccionada = jtNotas.getSelectedRow();
                int columnaSeleccionada = jtNotas.getSelectedColumn();

                if (jtNotas.isCellEditable(filaSeleccionada, columnaSeleccionada) && filaSeleccionada >= 0 && columnaSeleccionada >= 0) {
                    Object valor = jtNotas.getValueAt(filaSeleccionada, columnaSeleccionada);
                    nuevaNota = Double.parseDouble(valor.toString());
                }
            }
        });
    }
}
