package main;

import bbdd.Conexion;
import java.awt.EventQueue;
import vista.Login;

public class Main {
    public static void main(String[] args) {
        Conexion.getConnection();
		
        EventQueue.invokeLater(new Runnable() {
            public void run() {
		try {
                    Login frame = new Login();
                    frame.setVisible(true);
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
    }
}
