/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo80.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import universidadgrupo80.accesoADatos.AlumnoData;
import universidadgrupo80.accesoADatos.InscripcionData;
import universidadgrupo80.accesoADatos.MateriaData;
import universidadgrupo80.entidades.Alumno;
import universidadgrupo80.entidades.Inscripcion;
import universidadgrupo80.entidades.Materia;

/**
 *
 * @author Usuario
 */
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

//    AlumnoData aluData = new AlumnoData();
//    MateriaData mateData = new MateriaData();
//    InscripcionData inscData;
//    List<Alumno> alumm = new ArrayList<>();
//
//    DefaultTableModel modelo = new DefaultTableModel();
//
//    Alumno alumn = new Alumno();
//    Materia mat = new Materia();
//    Inscripcion ins = new Inscripcion();
//    private int idAlu;
    /**
     * Creates new form cargaDeNotas
     */
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

//        inscData = new InscripcionData();
//        aluData = new AlumnoData();
//        alumm = aluData.listarAlumnos();
//        for (Alumno alumn : alumm) {
//            this.jCBAlumnos.addItem(alumn);
//        }
//        armarCabecera();
//        cargarDatos(mat);
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

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de notas");

        jcbAlumno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Seleccionar alumno:");

        jtNotas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtNotas);
        if (jtNotas.getColumnModel().getColumnCount() > 0) {
            jtNotas.getColumnModel().getColumn(0).setResizable(false);
            jtNotas.getColumnModel().getColumn(2).setResizable(false);
        }

        jbGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jbGuardar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here
//        aluData.listarAlumnos();
//        alumn = (Alumno) jCBAlumnos.getSelectedItem();
//        cargarMaterias();
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
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
//            System.out.println("--------------------------------------------");
//            System.out.println(Double.parseDouble(jtNotas.getValueAt(fila, 2).toString()));
//            System.out.println(idAlu);
//            System.out.println(Integer.parseInt(jtNotas.getValueAt(fila, 0).toString()));
//            System.out.println("--------------------------------------------");
            
        }
        jbGuardar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Nota(s) Actualizada(s).");

//            Alumno a = (Alumno) jCBAlumnos.getSelectedItem();
//            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
//            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
//
//            // Corrección: Obtener la nota desde un JComboBox
//            int nota = (Integer) jTNotas.getSelectedColumn();
//
//            Materia m = new Materia(idMateria, nombreMateria, nota, true);
//            Inscripcion ins = new Inscripcion(nota);
//
//            Inscripcion i = (Inscripcion) inscData.ObtenerInscripcion(a.getIdAlumno(), idMateria);
//
//            // Corrección: Llamar al método actualizarNota con los parámetros correctos
//            inscData.actualizarNota(i);
//
//            borrarFilaTabla();
//        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnoItemStateChanged
        // TODO add your handling code here:

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

//    private void armarCabecera() {
//        modelo.addColumn("Codigo");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Nota");
//        jTNotas.setModel(modelo);
//    }
//
//    private void cargarDatos(Materia mat) {
//        borrarFilaTabla();
//
////        Inscripcion ins = new Inscripcion();
////        modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), ins.getNota()});
//        Alumno seleccionada = (Alumno) jCBAlumnos.getSelectedItem();
//        idAlu = seleccionada.getIdAlumno();
//        if (seleccionada != null) {
//            ArrayList<Object[]> lista = (ArrayList) inscData.obtenerMateriasCursadas(idAlu);
//
//            for (Object[] fila : lista) {
//                modelo.addRow(fila);
//            }
//        }
//    }
//
//    private void borrarFilaTabla() {
////        int indice = modelo.getRowCount() - 1;
////
////        for (int i = indice; i >= 0; i--) {
////            modelo.removeRow(i);
////        }
//
//        if (modelo != null) {
//            int a = modelo.getRowCount() - 1;
//
//            if (modelo.getRowCount() > 0) {
//                for (int i = a; i >= 0; i--) {
//                    modelo.removeRow(i);
//                }
//            }
//        }
//    }
//
//    private void cargarMateria() {
//        borrarFilaTabla();
//        
//        Alumno selec = (Alumno) jCBAlumnos.getSelectedItem();
//        
//        idAlu = selec.getIdAlumno();
//        
//        ArrayList<Object[]> lista = (ArrayList) inscData.obtenerMateriasCursadasAriel(idAlu);
//        
//        for(Object[] fila : lista){
//            modelo.addRow(fila);
//        }
////        inscData.obtenerMateriasCursadas(selec.getIdAlumno()).forEach(materia -> cargarDatos(materia));
//    }
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

//        MensajeSB(1, "Seleccione un alumno para modificar su nota");
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
//        } else {
//            MensajeSB(1, "Seleccione primero un alumno");
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
//                    MensajeSB(1, "El valor ingresado no es válido(0-10)");
                    jtNotas.setValueAt(nuevaNota, fila, columna);
                }
            } catch (NumberFormatException e) {
//                MensajeSB(1, "El valor ingresado no es válido");
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

//    public void MensajeSB(int color, String mensaje) {
//        // Los valores pueden variar de 0 a 255
//        if (color == 1) {
//            // Si el color es igual a 1 entonces es = a verde
//            // En este caso Red = 0, Green = 153, Blue = 102.
//            jlStatusBar.setForeground(new Color(0, 153, 102));
//        } else if (color == 2) {
//            // Si el color es igual a 2 entonces es = a rojo
//            // Los valores pueden variar de 0 a 255. En este caso Red = 153, Green = 51, Blue = 0.
//            jlStatusBar.setForeground(new Color(255, 50, 0));
//        } else if (color == 3) {
//            // Usado al iniciar el Form para que no se vea el texto dummy 45,65,88
//            jlStatusBar.setForeground(new Color(45, 65, 88));
//        }
//        // Aquí cargo el texto del mensaje en el Label
//        // Si el texto del mensaje esta vacio entonces no muestro texto en
//        // el Label pero limpio el texto anterior que pueda haber quedado
//        jlStatusBar.setText(mensaje);
//    }
}
