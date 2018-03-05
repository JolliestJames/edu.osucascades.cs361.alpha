package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Sketch extends PApplet
{
    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        background(55);
    }

    public void draw()
    {
        fill(255, 255, 0);
        ellipse(width/2, height/2, 100, 100);
        drawJamesCircle();
        drawNathanCircle();
    }

    private void drawJamesCircle()
    {
        fill(220, 220, 125);
        ellipse(width/4, height/4, 150, 150);
    }

    private void drawLeoCircle()
    {

    }

    private void drawNathanCircle()
    {
        fill(180, 180, 108);
        ellipse(width-150, height-150, 100, 100);
    }
}