/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Usuario
 */
public class Pelota {

    private int x;
    private int y;
    private final int ancho = 15, alto = 15;
    private int dx = 1, dy = 1;

    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getPelota() {
        return new Rectangle2D.Double(x, y, ancho, alto);
    }

    public void mover(Rectangle limites) {
        x += dx;
        y += dy;
        if (x > limites.getMaxX()) {
            dx = -dx;
        }
        if (y > limites.getMaxY()) {
            dy = -dy;
        }
        if (x < 0) {
            dx = -dx;
        }
        if (y < 0) {
            dy = -dy;
        }
    }
}
