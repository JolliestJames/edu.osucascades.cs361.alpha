package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public abstract class Alien {

    PApplet p;
    String type;
    int x, y, damage, speed, pointValue, radius, velocity, color;

    //public abstract void fadeInAndOut();

    public Alien(PApplet p, int x, int y, int damage, int color) {
        this.p = p;
        this.x = x;
        this.y = y;
        radius = p.width/25;
        velocity = 30;
        this.damage = damage;
        this.color = color;
    }

    public void move() {
        x += velocity;
    }

    public void moveDown() {
        y += p.height/20;
    }

    public void changeVelocity() {
        velocity = -velocity;
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
