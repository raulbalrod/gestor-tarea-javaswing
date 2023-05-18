package main;

import bbdd.Conexion;
import java.awt.EventQueue;
import vista.Inicio;

public class Main {
    public static void main(String[] args) {
        Conexion.getConnection();
		
        EventQueue.invokeLater(new Runnable() {
            public void run() {
		try {
                    Inicio frame = new Inicio();
                    frame.setVisible(true);
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
    }
}
