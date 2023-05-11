package main;

import bbdd.Conexion;
import java.awt.EventQueue;
import vista.Inicio_Sesion;

public class Main {
    public static void main(String[] args) {
        Conexion.getConnection();
		
        EventQueue.invokeLater(new Runnable() {
            public void run() {
		try {
                    Inicio_Sesion frame = new Inicio_Sesion();
                    frame.setVisible(true);
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
    }
}
