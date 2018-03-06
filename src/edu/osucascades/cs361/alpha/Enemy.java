package edu.osucascades.cs361.alpha;

public class Enemy {

    PApplet p;
    string type;
    int x, y, damage, speed, pointValue;

    public Enemy (PApplet pApplet, int xPos, int yPos, string enemyType) {
        p = pApplet;
        x = xPos;
        y = yPos;
        type = enemyType;
        damage = 0;

        // need some logic to determine point value here
        // pretty sure this will be linked to the enemy type
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
        // logic to draw enemy goes here
    }
}
