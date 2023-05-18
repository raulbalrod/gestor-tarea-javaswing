package modelo;

import bbdd.Conexion;
import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Tarea {
    public void insertTarea(String nombre, String descripcion, String fecha_entrega, String prioridad, String estado) {
	Conexion.EjecutarUpdate("INSERT INTO tarea (nombre, descripcion, fecha_entrega, prioridad, estado) "
            + "VALUES ('" + nombre + "', '" + descripcion + "', '" + fecha_entrega + "', '" + prioridad + "', '" + estado + "')");
    }
    
    public void updateTarea(int Id, String nombre, String descripcion, String fecha_entrega, String prioridad, String estado) {
	Conexion.EjecutarUpdate("UPDATE tarea "
                + "SET nombre = '" + nombre + "', descripcion = '" + descripcion + "', fecha_entrega = '" + fecha_entrega + "', prioridad = '" + prioridad + "', estado ='" + estado
                + "' WHERE tarea_id ='" + Id +"'");
    }

    public void deleteTarea(int id) {
	Conexion.EjecutarUpdate("DELETE FROM tarea WHERE tarea_id = '" + id + "'");
    }
    
    public void buscarTarea(String nombre_tarea, JTable table) {
        String where = "";
        String sql = "";
        
        if (!"".equals(nombre_tarea)) {
            where += "WHERE nombre LIKE '%" + nombre_tarea + "%'";
        }
        sql += "SELECT * FROM tarea " + where;
        
        mostrar(table, sql);
    }
    
    public void mostrar(JTable jtTarea, String sql) {
        try {
            // Conexión a la base de datos
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            
            // Creación de un objeto PreparedStatement y ResultSet para realizar la consulta
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            // Recoger datos
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            // Modelo de la tabla
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Descripcion");
            model.addColumn("Fecha_Entrega");
            model.addColumn("Prioridad");
            model.addColumn("Estado");
            jtTarea.setModel(model); // Asignacion del modelo de la Tabla
            
            // Medida de las columnas de la tabla
            int[] anchos = {15, 50, 140, 70, 50, 50};
            
            for (int i = 0; i < cantidadColumnas; i++) {
                jtTarea.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            
            // Recuperacion de datos de cada fila y agregandolos al modelo de tabla
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
            }
        } catch (Exception e) {}
    }

    public void mostrarDatosTarea(JTable table, String sql, JTextField Id, JTextField nombre, JTextArea descripcion, JDateChooser fecha_entrega, JComboBox prioridad, JComboBox estado) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            // Conexion a la base de datos
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            
            // Obtener fila seleccionada en la tabla y el valor de la columna "Id" de esa fila
            int fila = table.getSelectedRow();
            String code = table.getValueAt(fila, 0).toString();
            
             // Consulta a la base de datos para obtener los datos de la tarea seleccionada
            ps = con.prepareStatement(sql);
            ps.setString(1, code);
            rs = ps.executeQuery();
            
            // Recoger los datos de la tarea y mostrarlos en las cajas de la derecha de la vista
            while (rs.next()) {
               Id.setText(rs.getString("tarea_id"));
               nombre.setText(rs.getString("nombre"));
               descripcion.setText(rs.getString("descripcion"));
               ((JTextField)fecha_entrega.getDateEditor().getUiComponent()).setText(rs.getString("fecha_entrega"));
               prioridad.setSelectedItem(rs.getString("prioridad"));
               estado.setSelectedItem(rs.getString("estado"));
            }
        } catch (Exception e) {}
    }

    public void exportarTareasFichero() {
        // Ruta y el nombre del archivo a crear
        String ruta = "./src/files/fichero.txt";
        // Consulta para obtener todas las tareas de la base de datos
        String sql = "SELECT * FROM tarea";

        PreparedStatement ps;
        ResultSet rs;

        int num = 0;

        try {
            // Creación del archivo
            File file = new File(ruta);

            // Si el archivo no existe, se crea
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado correctamente");
            }

            // FileWriter nos permite escribir en el archivo creado
            FileWriter fw = new FileWriter(file);
            // BufferedWriter nos permite escribir en el archivo de manera más eficiente
            BufferedWriter bw = new BufferedWriter(fw);

             // Conexión a la base de datos
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            
            // Si la conexión falla, se muestra un mensaje de error
            if (con == null) {
                System.out.println("Error al conectar a la base de datos");
            }

            // Ejecutamos la consulta
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            // Recorremos todas las filas obtenidas de la consulta
            while (rs.next()) {
                num += 1;
                // Escribimos en el archivo cada una de las tareas obtenidas
                bw.write(
                    num + ". "
                        + rs.getString("nombre") + " / "
                        + rs.getString("descripcion") + " / "
                        + rs.getString("fecha_entrega") + " / "
                        + rs.getString("prioridad") + " / "
                        + rs.getString("estado") + ".\n"
                );
            }
            // Mostramos un mensaje de que se ha exportado el txt correctamente
            JOptionPane.showMessageDialog(null, "Se ha importado a .txt correctamente");
            // Cerramos el BufferedWriter
            bw.close();
        } catch (SQLException ex) {
            System.out.println("Error en la consulta SQL: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
    }
    
    public void importarTareasFichero() {
        File file = new File("./src/files/tareas.txt");
        String tarea = "";
        String[] valores = new String[5];
        
     
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            
            while ((tarea = bf.readLine()) != null) {
                valores = tarea.split("/");
                
                // Variables para insetar la tarea
                String nombre = valores[0];
                String descripcion = valores[1];
                String fecha_entrega = valores[2];
                String prioridad = valores[3];
                String estado = valores[4];
                System.out.println(Arrays.toString(valores));
                
                insertTarea(nombre, descripcion, fecha_entrega, prioridad, estado);
            }
            
            bf.close();
        } catch (Exception e) {}
    }
}
