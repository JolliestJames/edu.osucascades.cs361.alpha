package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Bomb {

    PApplet p;
    int x, y, speed;

    public Bomb(PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        speed = 10;
    }

    public void move() {
        y += speed;
    }

    public void explode() {
        // explode logic goes here
        // not entirely sure if this section is necessary
    }

    public void draw() {
        p.fill(200, 0, 0);
        p.rect (x, y, 15, 15);
        // logic to draw the projectile goes here
    }
}