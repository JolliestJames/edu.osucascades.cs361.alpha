package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Score {

    PApplet p;
    int score;

    public Score(PApplet pApplet) {
        p = pApplet;
        score = 0;
    }

    public void increaseScore(int value) {
        score += value;
    }

    public void draw() {
        p.fill(255);
        p.textSize(p.height / 14);
        p.textAlign(p.CENTER);
        p.text("SCORE: " + score, p.width / 2, p.height - 15);
    }
}
