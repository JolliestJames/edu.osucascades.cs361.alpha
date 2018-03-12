package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class RedAlien extends Alien {

    public RedAlien(PApplet p, int x, int y) {
        super(p, x, y, 50, p.color(255, 0, 0));
    }

}