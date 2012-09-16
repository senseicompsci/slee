package com.sauyon.apcs.gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class RandomBug extends Bug
{
	public RandomBug()
	{
		super();
	}
	
	public RandomBug(Color color)
	{
		super(color);
	}
	
	public void act()
	{
		Random g = new Random();
		
		setDirection(g.nextInt(4)*90);
		
		if(canMove())
			move();
	}
	
	public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Flower2 flower = new Flower2(getColor());
        flower.putSelfInGrid(gr, loc);
    }

}
