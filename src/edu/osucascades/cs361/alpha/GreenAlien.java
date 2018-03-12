package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class GreenAlien extends Alien {

    public GreenAlien (PApplet p, int x, int y) {
        super(p, x, y, 45, p.color(0, 255, 0));
    }

}
