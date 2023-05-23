package bbdd;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static String dbName = "gestor_tarea";
    public static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
    public static String user = "root";
    public static String pass = "";
    public static String driver = "com.mysql.cj.jdbc.Driver";
    
    public static Connection con;
    public static Statement consulta;
    public static ResultSet resultado;
    
    public static Connection getConnection() {
        try {
           Class.forName(driver) ;
           con = DriverManager.getConnection(url, user, pass);
           consulta = con.createStatement();
           // JOptionPane.showMessageDialog(null, "Conexion existosa");
        } catch (Exception e) {}
        return con;
    }
    
    public static void Conectar(){
    	try {
           Class.forName(driver) ;
           con = DriverManager.getConnection(url, user, pass);
           // System.out.println("Base de datos situada en :\n "+url);
           consulta = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
   public static ResultSet EjecutarSentencia(String Sentencia){
        try {
            if (consulta == null) {
                Conectar();
            }
            resultado = consulta.executeQuery(Sentencia);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;   
    }

    
    public static void EjecutarUpdate(String Sentencia){
    	try{
            if (consulta == null) {
                Conectar();
            }
            consulta = con.createStatement();
            consulta.executeUpdate(Sentencia);
            // System.out.println("Done.");
    	}catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
    	} 
    }
    
    public static void CerrarConexion(){
        try{
            if (consulta != null) {
                consulta.close();
            }
            if (con != null) {
                con.close();
            }
        }catch(Exception e){}
    }
}