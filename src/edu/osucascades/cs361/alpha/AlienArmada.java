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
                if (fleet.rightMostAlien().x >  p.width - p.width / 50) {
                    fleet.reverseVelocity();
                    fleet.moveDown();
                    fleet.increaseVelocity();
                } else if (fleet.leftMostAlien().x < p.width / 50){
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
            fleet.draw();
        }
    }

}
