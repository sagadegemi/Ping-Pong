/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JFrame;

/*
Creacion de la ventana del juego y sus funciones.
 */
public class Ventana extends JFrame {

    private final int ancho = 800, alto = 600;    
    private TableroJuego lamina; 
    private Hilo hilo;
    public Ventana() {
        setTitle("Ping Pong");
        setSize(ancho, alto);
        setLocationRelativeTo(null);
        setResizable(false);
        lamina = new TableroJuego();
        add(lamina);
        hilo = new Hilo (lamina);
        hilo.start();
        
    }
    
}
