package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Rocket {

    PApplet p;
    int x, y, speed;

    public Rocket(PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        speed = 10;
    }

    public void move() {
        y -= speed;
        // move logic goes here
        // does not need to have more specific move functions since the rockets only go straight up
    }

    public void explode() {
        // explode logic goes here
        // not entirely sure if this section is necessary
    }

    public void draw() {
        p.fill(255, 255, 255);
        p.rect (x, y, 15, 15);
        // logic to draw the projectile goes here
    }
}