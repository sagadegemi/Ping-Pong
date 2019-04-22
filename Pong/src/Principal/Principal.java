/*
 Clase principal

 */
package Principal;
import Clases.Ventana;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        Ventana ventana = new Ventana (); // crear objeto pantalla
        ventana.setVisible(true); // hacer visible la pantalla
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar ventana al apretar la cruz
    }
}
