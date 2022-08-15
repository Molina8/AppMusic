package umu.tds.manejador;

import java.awt.EventQueue;



import umu.tds.ventanas.Login;

public class Lanzador {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login ventana = new Login();
                    ventana.mostrarLogin();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}


}
