package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

import java.util.ArrayList;

public class Fleet {

    ArrayList<Alien> aliens;
    PApplet p;
    int moveSignal;
    boolean hasMoved;
    boolean hasMovedDown;

    public Fleet(PApplet p, int t) {
        this.p = p;
        this.moveSignal= t;
        this.aliens = new ArrayList<>();
        this.hasMoved = false;
        this.hasMovedDown = false;
    }

    public void addAlien(Alien alien) {
        aliens.add(alien);
    }

    public void move() {
        for(Alien alien : aliens ) {
            alien.move();
        }
    }

    public void moveDown() {
        for(Alien alien : aliens ) {
            alien.moveDown();
        }
    }

    public void reverseVelocity() {
        for(Alien alien : aliens ) {
            alien.reverseVelocity();
        }
    }

    public void increaseVelocity() {
        for(Alien alien : aliens ) {
            alien.increaseVelocity();
        }
    }

    public boolean shouldMove(int s) {

        if(moveSignal == s){
            return true;
        }

        return false;
    }

    public Alien rightMostAlien() {
        return aliens.get(aliens.size() - 1);
    }

    public Alien leftMostAlien() {
        return aliens.get(0);
    }

    public boolean shouldMoveLeft () {

        if(rightMostAlien().isNearRightEdge()) {
            return true;
        }

        return false;

    }

    public boolean shouldMoveRight() {

        if(leftMostAlien().isNearLeftEdge()) {
            return true;
        }

        return false;

    }

    public void drawAliens() {
        for(Alien alien: aliens) {
            alien.draw();
        }
    }

}
