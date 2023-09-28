package universidadgrupo80.vistas;

import java.awt.Dimension;
import java.sql.Connection;
import javax.swing.JOptionPane;
import universidadgrupo80.accesoADatos.Conexion;

public class menuPrincipal extends javax.swing.JFrame {

    private static boolean confirmado = false;

    public menuPrincipal() {
        initComponents();
        // Realizo la coneccion a la DB, si fue exitosa agrego al titulo
        // conectado para no tener ese molesto dialogo de conexion ;)
        Connection con = Conexion.getConnection();
        // Si la conexion fue exitosa cambio el titulo del Frame del menu
        if (con != null) {
            this.setTitle("Sistema de Gestión para la Universidad de La Punta - Estado: Conectado");
        } else {
            this.setTitle("Sistema de Gestión para la Universidad de La Punta - Estado: Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMFormMaterias = new javax.swing.JMenuItem();
        cargaDeNotas = new javax.swing.JMenu();
        jMenuInscripcion = new javax.swing.JMenuItem();
        jMenuCargaDeNotas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMIMatXAlum = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2023 - Elaborado y diseñado por el Grupo 80");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("@Moksys1 - @KevinSepulveda93 - @orli1208 - @Herny74");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(80, 80, 80))
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenu1.setText("Alumno");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuAlumno.setText("Formulario de Alumno");
        jMenuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMFormMaterias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMFormMaterias.setText("Formulario de Materia");
        jMFormMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jMFormMaterias);

        jMenuBar1.add(jMenu2);

        cargaDeNotas.setText("Administracion ");
        cargaDeNotas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cargaDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaDeNotasActionPerformed(evt);
            }
        });

        jMenuInscripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuInscripcion.setText("Manejo de Inscripciones");
        jMenuInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscripcionActionPerformed(evt);
            }
        });
        cargaDeNotas.add(jMenuInscripcion);

        jMenuCargaDeNotas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuCargaDeNotas.setText("Manipulacion de Notas");
        jMenuCargaDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargaDeNotasActionPerformed(evt);
            }
        });
        cargaDeNotas.add(jMenuCargaDeNotas);

        jMenuBar1.add(cargaDeNotas);

        jMenu5.setText("Consultas");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMIMatXAlum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMIMatXAlum.setText("Alumnos por Materia");
        jMIMatXAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMatXAlumActionPerformed(evt);
            }
        });
        jMenu5.add(jMIMatXAlum);

        jMenuBar1.add(jMenu5);

        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeAlumno fdl = new FormularioDeAlumno();
        fdl.setVisible(true);
        escritorio.add(fdl);
        // Para centrar el JInternalFrame en el escritorio ---------------------
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = fdl.getSize();
        fdl.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // ---------------------------------------------------------------------
        escritorio.moveToFront(fdl);
    }//GEN-LAST:event_jMenuAlumnoActionPerformed

    private void jMenuInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeInscripcion inscripcion = new FormularioDeInscripcion();
        inscripcion.setVisible(true);
        escritorio.add(inscripcion);
        // Para centrar el JInternalFrame en el escritorio ---------------------
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = inscripcion.getSize();
        inscripcion.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // ---------------------------------------------------------------------
        escritorio.moveToFront(inscripcion);
    }//GEN-LAST:event_jMenuInscripcionActionPerformed

    private void jMFormMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeMaterias form = new FormularioDeMaterias();
        form.setVisible(true);
        escritorio.add(form);
        // Para centrar el JInternalFrame en el escritorio ---------------------
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = form.getSize();
        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // ---------------------------------------------------------------------
        escritorio.moveToFront(form);
    }//GEN-LAST:event_jMFormMateriasActionPerformed

    private void jMenuCargaDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargaDeNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        cargaDeNotas notitas = new cargaDeNotas();
        notitas.setVisible(true);
        escritorio.add(notitas);
        // Para centrar el JInternalFrame en el escritorio ---------------------
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = notitas.getSize();
        notitas.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // ---------------------------------------------------------------------
        escritorio.moveToFront(notitas);
    }//GEN-LAST:event_jMenuCargaDeNotasActionPerformed

    private void cargaDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaDeNotasActionPerformed
    }//GEN-LAST:event_cargaDeNotasActionPerformed

    private void jMIMatXAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMatXAlumActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeConsulta formCon = new FormularioDeConsulta();
        formCon.setVisible(true);
        escritorio.add(formCon);
        // Para centrar el JInternalFrame en el escritorio ---------------------
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = formCon.getSize();
        formCon.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        // ---------------------------------------------------------------------
        escritorio.moveToFront(formCon);
    }//GEN-LAST:event_jMIMatXAlumActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        if (!confirmado) {
            //int opcion = JOptionPane.showConfirmDialog(jMenu1, "¿Estas seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_CANCEL_OPTION);
            int opcion = JOptionPane.showOptionDialog(null, "¿Está seguro de que desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (opcion == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else {
            confirmado = true;
        }
    }//GEN-LAST:event_jMenuSalirMouseClicked

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cargaDeNotas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMFormMaterias;
    private javax.swing.JMenuItem jMIMatXAlum;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCargaDeNotas;
    private javax.swing.JMenuItem jMenuInscripcion;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
