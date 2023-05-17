package modelo;

import bbdd.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
            // Conexion a bd
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            
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
            jtTarea.setModel(model);
            
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
            // Conexion a bd
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            
            // Obtener fila seleccionada + valor de la fila seleccionada
            int fila = table.getSelectedRow();
            String code = table.getValueAt(fila, 0).toString();
            
            // Consulta
            ps = con.prepareStatement(sql);
            ps.setString(1, code);
            rs = ps.executeQuery();
            
            // Recoger datos de una tarea para mostrar en "vista.agregar_tarea"
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
}
