package edu.osucascades.cs361.alpha;
import processing.core.PApplet;

public class Fort {
    PApplet p;
    int x;
    int y;
    int life;
    int width;
    int height;

    public Fort(PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        width = p.width/8;
        height = p.width/20;
        life = 3;
    }

    public void draw() {
        p.fill(200, 150, 50);
        p.rect(x, y, p.width/8, p.height/20);
    }

    public void decay() {
        //In here, decrease width of fort
    }

}
