package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Projectile {

    PApplet p;
    int x, y, speed, yield;
    String type;

    public Projectile(PApplet pApplet, int xPos, int yPos, String projectileType) {
        p = pApplet;
        x = xPos;
        y = yPos;
        type = projectileType;
    }

    public void move() {
        // move logic goes here
        // does not need to have more specific move functions since the rockets only go straight up
    }

    public void explode() {
        // explode logic goes here
        // not entirely sure if this section is necessary
    }

    public void draw() {
        // logic to draw the projectile goes here
    }
}