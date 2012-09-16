package com.sauyon.apcs.gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.UnboundedGrid;

public class BugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		
		makeRandomBugs(world, 3);
		
		world.add(new Rock());
		world.show();
	}
	
	public static void moveBug(Bug bug)
	{
		bug.move();
	}
	
	public static void moveBug1(Bug bug)
	{
		if(bug.canMove())
			bug.move();
	}
	
	public static void moveBug2(Bug bug, int n)
	{
		for(int i = 0; i < n; i++)
			if(bug.canMove())
				bug.move();
	}
	
	public static void moveBug3(Bug bug, int n)
	{
		for(int i = 0; i < n; i++)
		{
			bug.act();
		}
	}
	
	public static void randomBug(Bug bug)
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
	
	public static void colorBug(Bug bug)
	{
		bug.setColor(new Color(bug.getLocation().getRow(),0,bug.getLocation().getCol()));
	}
	
	public static void makeBugs(ActorWorld world, int n)
	{
		for(int i = 0; i < n; i++)
		{
			Bug b = new Bug();
			world.add(b);
			colorBug(b);
		}
	}
	
	public static void makeRandomBugs(ActorWorld world, int n)
	{
		for(int i = 0; i < n; i++)
		{
			RandomBug b = new RandomBug();
			world.add(b);
			colorBug(b);
		}
	}
}
