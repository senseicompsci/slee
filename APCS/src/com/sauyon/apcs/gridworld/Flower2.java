package com.sauyon.apcs.gridworld;

import java.awt.Color;

import info.gridworld.actor.Flower;

public class Flower2 extends Flower
{
    public Flower2(Color color) {
		super(color);
	}

	private static final double DARKENING_FACTOR = 0.001;
	
	public void act()
    {
        Color c = getColor();
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        setColor(new Color(red, green, blue));
    }
}
