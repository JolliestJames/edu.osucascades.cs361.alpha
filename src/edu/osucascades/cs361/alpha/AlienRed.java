package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class AlienRed {

    PApplet p;
    String type;
    int x, y, damage, speed, pointValue, radius, velocity;

    public AlienRed (PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        radius = p.width/25;
        damage = 0;
        velocity = 3;

        // need some logic to determine point value here
        // pretty sure this will be linked to the Alien type
        // will ask Yong about this on Wednesday; believe a switch statement is best
    }

    public void move() {
        x += velocity;
        if(x > p.width - p.width/50)
        {
            velocity = -velocity;
            y += p.height/20;
        }
        else if( x < p.width/50)
        {
            velocity = -velocity;
            y += p.height/20;
        }
    }

    public void moveLeft() {
        // logic to move left goes here
        x -= velocity;
    }

    public void moveRight() {
        // logic to move right goes here
        x += velocity;
    }

    public void moveDown () {
        // logic to move down goes here
        // this should increase speed every time it triggers
        y += p.height/20;
        velocity += 2;
    }

    public void dropBomb() {
        // logic to drop bomb goes here
    }

    public void draw() {
        p.fill(255, 0, 0);
        p.ellipse(x, y, radius, radius);
    }
}