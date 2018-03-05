package edu.osucascades.cs361.alpha;
import processing.core.PApplet;

public class Ship {

    PApplet p;
    int xPosition;
    int yPosition;

    public Ship(PApplet pApplet) {
        p = pApplet;
        xPosition = p.width/2;
        yPosition = p.height-p.height/10;
    }

    public void draw() {
        p.fill(255, 255, 255);
        p.triangle(xPosition - p.width/20, yPosition,
            xPosition + p.width/20, yPosition,
            xPosition, yPosition - p.height/20);
    }

    private void moveShip(int distanceX) {
        xPosition += distanceX;
    }

    private void fireRocket() {

    }

}
