/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

/**
 *
 * @author Notebook
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jButton2 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mi_crearCurso = new javax.swing.JMenuItem();
        buscarCurso = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        matricular = new javax.swing.JMenuItem();
        buscarAlumno = new javax.swing.JMenuItem();
        graduar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ingresarProfesor = new javax.swing.JMenuItem();
        egresarProfesor = new javax.swing.JMenuItem();
        buscarProfesor = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("jButton2");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jMenu3.setText("Cursos");

        mi_crearCurso.setText("Crear curso");
        mi_crearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearCursoActionPerformed(evt);
            }
        });
        jMenu3.add(mi_crearCurso);

        buscarCurso.setText("Buscar");
        buscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCursoActionPerformed(evt);
            }
        });
        jMenu3.add(buscarCurso);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Alumnos");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        matricular.setText("Matricular");
        matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricularActionPerformed(evt);
            }
        });
        jMenu4.add(matricular);

        buscarAlumno.setText("Buscar");
        buscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(buscarAlumno);

        graduar.setText("Graduar");
        jMenu4.add(graduar);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Profesores");

        ingresarProfesor.setText("Ingresar Profesor");
        ingresarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarProfesorActionPerformed(evt);
            }
        });
        jMenu5.add(ingresarProfesor);

        egresarProfesor.setText("Egresar Profesor");
        jMenu5.add(egresarProfesor);

        buscarProfesor.setText("Buscar");
        buscarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProfesorActionPerformed(evt);
            }
        });
        jMenu5.add(buscarProfesor);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_crearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearCursoActionPerformed
        // TODO add your handling code here:
        
        escritorio.repaint();
        CrearCurso crear = new CrearCurso();
        crear.setVisible(true);
        escritorio.add(crear);
        escritorio.moveToFront(crear);
    }//GEN-LAST:event_mi_crearCursoActionPerformed

    private void matricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricularActionPerformed
        // TODO add your handling code here:
         
        escritorio.repaint();
        Matriculacion ins = new Matriculacion();
        ins.setVisible(true);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
    }//GEN-LAST:event_matricularActionPerformed

    private void buscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlumnoActionPerformed
        // TODO add your handling code here:
      
        escritorio.repaint();
        BuscarAlumno search = new BuscarAlumno();
        search.setVisible(true);
        escritorio.add(search);
        escritorio.moveToFront(search);
    }//GEN-LAST:event_buscarAlumnoActionPerformed

    private void buscarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarProfesorActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void ingresarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarProfesorActionPerformed
        // TODO add your handling code here:
         escritorio.repaint();
        IngresarProfesor profenuevo = new IngresarProfesor();
        profenuevo.setVisible(true);
        escritorio.add(profenuevo);
        escritorio.moveToFront(profenuevo);
        
    }//GEN-LAST:event_ingresarProfesorActionPerformed

    private void buscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCursoActionPerformed
        // TODO add your handling code here:
       escritorio.repaint();
        BuscarCurso search = new BuscarCurso();
        search.setVisible(true);
        escritorio.add(search);
        escritorio.moveToFront(search);
    }//GEN-LAST:event_buscarCursoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buscarAlumno;
    private javax.swing.JMenuItem buscarCurso;
    private javax.swing.JMenuItem buscarProfesor;
    private javax.swing.JMenuItem egresarProfesor;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem graduar;
    private javax.swing.JMenuItem ingresarProfesor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenuItem matricular;
    private javax.swing.JMenuItem mi_crearCurso;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}