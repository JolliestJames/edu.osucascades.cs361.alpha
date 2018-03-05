package edu.osucascades.cs361.alpha;
import processing.core.PApplet;

public class Ship {

    PApplet p;
    int x;
    int y;
    int speed;

    public Ship(PApplet pApplet) {
        p = pApplet;
        x = p.width/2;
        y = p.height-p.height/10;
        speed = 10;
    }

    public void draw() {
        p.fill(255, 255, 255);
        p.triangle(x - p.width/20, y,
            x + p.width/20, y,
            x, y - p.height/20);
    }

    public void moveShipRight() {
        x += speed;
    }

    public void moveShipLeft() {
        x -= speed;
    }

    private void fireRocket() {

    }

}
