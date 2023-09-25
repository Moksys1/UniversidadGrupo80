package universidadgrupo80.vistas;

import javax.swing.JOptionPane;

public class menuPrincipal extends javax.swing.JFrame {

    private static boolean confirmado = false;

    public menuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
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

        jMenu4.setText("jMenu4");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jMenuAlumno.setText("Formulario de Alumno");
        jMenuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jMFormMaterias.setText("Formulario de Materia");
        jMFormMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jMFormMaterias);

        jMenuBar1.add(jMenu2);

        cargaDeNotas.setText("Administracion ");
        cargaDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaDeNotasActionPerformed(evt);
            }
        });

        jMenuInscripcion.setText("Manejo de Inscripciones");
        jMenuInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscripcionActionPerformed(evt);
            }
        });
        cargaDeNotas.add(jMenuInscripcion);

        jMenuCargaDeNotas.setText("Manipulacion de Notas");
        jMenuCargaDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargaDeNotasActionPerformed(evt);
            }
        });
        cargaDeNotas.add(jMenuCargaDeNotas);

        jMenuBar1.add(cargaDeNotas);

        jMenu5.setText("Consultas");

        jMIMatXAlum.setText("Alumnos por Materia");
        jMIMatXAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMatXAlumActionPerformed(evt);
            }
        });
        jMenu5.add(jMIMatXAlum);

        jMenuBar1.add(jMenu5);

        jMenuSalir.setText("Salir");
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
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnoActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeAlumno fdl = new FormularioDeAlumno();
        fdl.setVisible(true);
        escritorio.add(fdl);
        escritorio.moveToFront(fdl);
    }//GEN-LAST:event_jMenuAlumnoActionPerformed

    private void jMenuInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscripcionActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();

        MenuInscripcion inscripcion = new MenuInscripcion();
        inscripcion.setVisible(true);
        escritorio.add(inscripcion);
        escritorio.moveToFront(inscripcion);
    }//GEN-LAST:event_jMenuInscripcionActionPerformed

    private void jMFormMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormMateriasActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeMaterias form = new FormularioDeMaterias();
        form.setVisible(true);
        escritorio.add(form);
        escritorio.moveToFront(form);
    }//GEN-LAST:event_jMFormMateriasActionPerformed

    private void jMenuCargaDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargaDeNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();

        cargaDeNotas notitas = new cargaDeNotas();
        notitas.setVisible(true);
        escritorio.add(notitas);
        escritorio.moveToFront(notitas);
//    
    }//GEN-LAST:event_jMenuCargaDeNotasActionPerformed

    private void cargaDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaDeNotasActionPerformed

    }//GEN-LAST:event_cargaDeNotasActionPerformed

    private void jMIMatXAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMatXAlumActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();

        FormularioDeConsulta formCon = new FormularioDeConsulta();
        formCon.setVisible(true);
        escritorio.add(formCon);
        escritorio.moveToFront(formCon);
    }//GEN-LAST:event_jMIMatXAlumActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
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
    private javax.swing.JMenuItem jMFormMaterias;
    private javax.swing.JMenuItem jMIMatXAlum;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCargaDeNotas;
    private javax.swing.JMenuItem jMenuInscripcion;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
