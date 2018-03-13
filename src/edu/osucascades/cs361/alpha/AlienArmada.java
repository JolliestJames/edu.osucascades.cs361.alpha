package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

import java.util.ArrayList;

public class AlienArmada {

    PApplet p;
    ArrayList<Fleet> fleets;
    boolean canMove;

    public AlienArmada(PApplet p) {
        this.p = p;
        this.fleets = new ArrayList<>();
        this.canMove = false;
    }

    public void addFleet(Fleet fleet) {
        fleets.add(fleet);
    }

    public void moveFleets(int s) {
        for(Fleet fleet : fleets){
            if(fleet.shouldMove(s)) {
                if (fleet.shouldMoveLeft()) {
                    fleet.reverseVelocity();
                    fleet.moveDown();
                    fleet.increaseVelocity();
                } else if (fleet.shouldMoveRight()){
                    fleet.reverseVelocity();
                    fleet.moveDown();
                    fleet.increaseVelocity();
                }
                fleet.move();
            }
        }
    }

    public void drawFleets() {
        for(Fleet fleet : fleets) {
            fleet.drawAliens();
        }
    }

}
