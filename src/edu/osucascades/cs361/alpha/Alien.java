package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public abstract class Alien {

    PApplet p;
    String type;
    int x, y, damage, pointValue, radius, velocity, color;

    public Alien(PApplet p, int x, int y, int damage, int color) {
        this.p = p;
        this.x = x;
        this.y = y;
        radius = p.width/25;
        velocity = 50;
        this.damage = damage;
        this.color = color;
    }

    public void move() {
        x += velocity;
    }

    public void moveDown() {
        y += p.height/20;
    }

    public void reverseVelocity() {
        velocity = -velocity;
    }

    public void increaseVelocity() {
        velocity += 3;
    }

    public void moveLeft() {
        // logic to move left goes here
    }

    public void moveRight() {
        // logic to move right goes here
    }

    public void dropBomb() {
        // logic to drop bomb goes here
    }

    public void draw() {
        p.fill(this.color);
        p.ellipse(x, y, radius, radius);
    }

}
