package com.sauyon.apcs.gridworld;

import java.util.Random;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.UnboundedGrid;

public class BugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld(new UnboundedGrid());
		
		Bug b = new Bug();
		
		world.add(b);
		world.add(new Rock());
		world.show();
		
		randomBug1(b, 1000);
	}
	
	public void moveBug(Bug bug)
	{
		bug.move();
	}
	
	public void moveBug1(Bug bug)
	{
		if(bug.canMove())
			bug.move();
	}
	
	public void moveBug2(Bug bug, int n)
	{
		for(int i = 0; i < n; i++)
			if(bug.canMove())
				bug.move();
	}
	
	public void moveBug3(Bug bug, int n)
	{
		for(int i = 0; i < n; i++)
		{
			if(bug.canMove())
				bug.move();
			else
				bug.turn();
		}
	}
	
	public void randomBug(Bug bug)
	{
		Random g = new Random();
		
		bug.setDirection(g.nextInt(4)*90);
		
		if(bug.canMove())
			bug.move();
	}
	
	public static void randomBug1(Bug bug, int n)
	{
		Random g = new Random();
		for(int i = 0; i < n; i++)
		{
			bug.setDirection(g.nextInt(4)*90);
			if(bug.canMove())
				bug.move();
		}
	}
}
