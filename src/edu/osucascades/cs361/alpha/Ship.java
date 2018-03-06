package edu.osucascades.cs361.alpha;
// we shouldn't need to import this as we are passing the PApplet object into the class
// import processing.core.PApplet;

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

    public void moveRight() {
        x += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    private void fireRocket() {

    }

}
