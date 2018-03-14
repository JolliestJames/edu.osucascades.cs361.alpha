package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Rocket {

    PApplet p;
    int x, y, speed;

    public Rocket(PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        speed = 50;
    }

    public void move() {
        y -= speed;
    }


    public void draw() {
        p.fill(255, 255, 255);
        p.rect (x, y, 15, 35);
    }
}