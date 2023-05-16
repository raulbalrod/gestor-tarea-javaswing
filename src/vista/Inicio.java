package vista;

import bbdd.Conexion;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {
    
    public Inicio() {
        initComponents();
        
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnVerTarea = new javax.swing.JButton();
        btnAgregarTarea = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/logo.png"))); // NOI18N

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 102, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setIconTextGap(10);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnVerTarea.setBackground(new java.awt.Color(255, 255, 255));
        btnVerTarea.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVerTarea.setForeground(new java.awt.Color(0, 102, 255));
        btnVerTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/tareas.png"))); // NOI18N
        btnVerTarea.setText("Ver Tareas");
        btnVerTarea.setBorder(null);
        btnVerTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerTarea.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerTarea.setIconTextGap(20);
        btnVerTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTareaActionPerformed(evt);
            }
        });

        btnAgregarTarea.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarTarea.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregarTarea.setForeground(new java.awt.Color(0, 102, 255));
        btnAgregarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/agregar.png"))); // NOI18N
        btnAgregarTarea.setText("Agregar Tarea");
        btnAgregarTarea.setBorder(null);
        btnAgregarTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTarea.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarTarea.setIconTextGap(10);
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 102, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar / Eliminar Tarea");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.setIconTextGap(15);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnImportar.setBackground(new java.awt.Color(255, 255, 255));
        btnImportar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(0, 102, 255));
        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/txt.png"))); // NOI18N
        btnImportar.setText("Importar Tareas");
        btnImportar.setBorder(null);
        btnImportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Icon icono = jLabel2.getIcon();
        Image imagen = ((ImageIcon) icono).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(imagen);
        jLabel2.setIcon(nuevoIcono);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/fondo-inicio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Icon icono2 = jLabel1.getIcon();
        Image imagen2 = ((ImageIcon) icono2).getImage().getScaledInstance(881, 595, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono2 = new ImageIcon(imagen2);
        jLabel1.setIcon(nuevoIcono2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Inicio boton menu
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    // Ver Tarea boton menu
    private void btnVerTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTareaActionPerformed
        Ver_Tareas verTarea = new Ver_Tareas();
        verTarea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerTareaActionPerformed
    
    // Agregar Tarea boton menu
    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed
        Agregar_Tarea agregarTarea = new Agregar_Tarea();
        agregarTarea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarTareaActionPerformed
    
    // Editar Tarea boton menu
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Ver_Tareas editarTarea = new Ver_Tareas();
        editarTarea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    public void importar() {
        String ruta = "./src/escritura/fichero.txt";
        String sql = "SELECT * FROM tarea";

        PreparedStatement ps;
        ResultSet rs;

        int num = 0;

        try {
            // Creacion de ruta
            File file = new File(ruta);

            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado correctamente");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            // Conexión a la base de datos
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            if (con == null) {
                System.out.println("Error al conectar a la base de datos");
            }

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                num += 1;
                bw.write(
                    num + ". "
                        + rs.getString("nombre") + " / "
                        + rs.getString("descripcion") + " / "
                        + rs.getString("fecha_entrega") + " / "
                        + rs.getString("prioridad") + " / "
                        + rs.getString("estado") + ".\n"
                );
            }
            JOptionPane.showMessageDialog(null, "Se ha importado a .txt correctamente");
            bw.close();
        } catch (SQLException ex) {
            System.out.println("Error en la consulta SQL: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
    }
    
    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
       importar();
    }//GEN-LAST:event_btnImportarActionPerformed

    public static void main(String args[]) {
        
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVerTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
