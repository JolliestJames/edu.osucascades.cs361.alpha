package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class AlienRed {

    PApplet p;
    String type;
    int x, y, damage, speed, pointValue;

    public AlienRed (PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        damage = 0;

        // need some logic to determine point value here
        // pretty sure this will be linked to the Alien type
        // will ask Yong about this on Wednesday; believe a switch statement is best
    }

    public void moveLeft() {
        // logic to move left goes here
    }

    public void moveRight() {
        // logic to move right goes here
    }

    public void moveDown () {
        // logic to move down goes here
        // this should increase speed every time it triggers
    }

    public void dropBomb() {
        // logic to drop bomb goes here
    }

    public void draw() {
        // logic to draw Alien goes here
    }
}