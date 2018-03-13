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
        velocity = 35;
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

    public boolean isNearRightEdge() {
        if(x >  p.width - p.width/45 - velocity) {
            return true;
        }
        return false;
    }

    public boolean isNearLeftEdge() {
        if(x < p.width/45 - velocity) {
            return true;
        }
        return false;
    }

    public void dropBomb() {
        // logic to drop bomb goes here
    }

    public void draw() {
        p.fill(this.color);
        p.ellipse(x, y, radius, radius);
    }

}
