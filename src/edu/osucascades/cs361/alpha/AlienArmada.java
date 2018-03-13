package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

import java.util.ArrayList;

public class AlienArmada {

    PApplet p;
    ArrayList<Fleet> fleets;

    public AlienArmada(PApplet p) {
        this.p = p;
        this.fleets = new ArrayList<>();
    }

    public void addFleet(Fleet fleet) {
        fleets.add(fleet);
    }

    public void moveFleets(int s) {
        for(Fleet fleet : fleets){
            if(fleet.shouldMove(s)) {
                if ((fleet.shouldMoveLeft() || fleet.shouldMoveRight()) && fleet.canMoveDown) {
                    fleet.reverseVelocity();
                    fleet.moveDown();
                    fleet.increaseVelocity();
                    fleet.canMove = false;
                    fleet.canMoveDown = false;
                }
                if (fleet.canMove) {
                    fleet.move();
                    fleet.canMoveDown = true;
                }
                fleet.canMove = true;
            }
        }
    }

    public void drawFleets() {
        for(Fleet fleet : fleets) {
            fleet.drawAliens();
        }
    }

}
