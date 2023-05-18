package controlador;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;

public class FuncionesApp {
    public void insertTarea(String nombre, String descripcion, String fecha_entrega, String prioridad, String estado) {
	new modelo.Tarea().insertTarea(nombre, descripcion, fecha_entrega, prioridad, estado);
    }
    
    public void updateTarea(int id, String nombre, String descripcion, String fecha_entrega, String prioridad, String estado) {
	new modelo.Tarea().updateTarea(id, nombre, descripcion, fecha_entrega, prioridad, estado);
    }
    
    public void deleteTarea(int id) {
	new modelo.Tarea().deleteTarea(id);
    }
    
    public void buscarTarea(String nombre_tarea, JTable table) {
        new modelo.Tarea().buscarTarea(nombre_tarea, table);
    }
    
    public void mostar(JTable table, String sql) {
        new modelo.Tarea().mostrar(table, sql);
    }
    
    public void mostrarDatosTarea(JTable table, String sql, JTextField Id, JTextField nombre, JTextArea descripcion, JDateChooser fecha_entrega, JComboBox prioridad, JComboBox estado) {
        new modelo.Tarea().mostrarDatosTarea(table, sql, Id, nombre, descripcion, fecha_entrega, prioridad, estado);
    }
    
    public void exportarTareasFichero() {
        new modelo.Tarea().exportarTareasFichero();
    }
    
    public void importarTareasFichero() {
        new modelo.Tarea().importarTareasFichero();
    }
}
