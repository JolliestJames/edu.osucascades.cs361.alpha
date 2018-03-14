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
            fleet.hasMoved = false;
            if(fleet.shouldMove(s)) {
                if ((fleet.shouldMoveLeft() || fleet.shouldMoveRight()) && !fleet.hasMovedDown) {
                    fleet.reverseVelocity();
                    fleet.moveDown();
                    fleet.increaseVelocity();
                    fleet.hasMoved = true;
                    fleet.hasMovedDown = true;
                }
                if (!fleet.hasMoved) {
                    fleet.move();
                    fleet.hasMovedDown = false;
                }
            }
        }
    }

    public void drawFleets() {
        for(Fleet fleet : fleets) {
            fleet.drawAliens();
        }
    }

}
