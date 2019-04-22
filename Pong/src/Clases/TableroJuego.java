/*
  Clase tablero, creacion de lamina para fondo, paleta, pelota, etc.
 */
package Clases;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class TableroJuego extends JPanel{

    public TableroJuego() {
        setBackground (Color.WHITE);
    }
    @Override
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.fill(new Rectangle2D.Double(0,0,20,20));
    g2.setColor(Color.BLACK);
    }
}
