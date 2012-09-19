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

	/**
	 * moves the bug
	 * @param bug the bug to move
	 */
	public static void moveBug(Bug bug)
	{
		bug.move();
	}
		
	/**
	 * moves the bug if it can move
	 * @param bug the bug to move
	 */
	public static void moveBug1(Bug bug)
	{
		if(bug.canMove())
			bug.move();
	}
	
	/**
	 * moves the bug n times if it can move
	 * @param bug the bug to move
	 * @param n the number of times to move it
	 */
	public static void moveBug2(Bug bug, int n)
	{
		for(int i = 0; i < n; i++)
			if(bug.canMove())
				bug.move();
	}
	
	/**
	 * moves the bug if it can move, and turns it if it can't
	 * @param bug the bug to move
	 * @param n the number of times to move it
	 */
	public static void moveBug3(Bug bug, int n)
	{
		for(int i = 0; i < n; i++)
			bug.act();
	}
	
	/**
	 * moves the bug in a random direction
	 * @param bug the bug to move
	 */
	public static void randomBug(Bug bug)
	{
		Random g = new Random();
		
		bug.setDirection(g.nextInt(4)*90);
		
		if(bug.canMove())
			bug.move();
	}
	
	/**
	 * moves the bug in a random direction n times
	 * @param bug the bug to move
	 * @param n the number of times to move it
	 */
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
	
	/**
	 * colors the bug based on its position
	 * @param bug the bug to color
	 */
	public static void colorBug(Bug bug)
	{
		bug.setColor(new Color(bug.getLocation().getRow(),0,bug.getLocation().getCol()));
	}
	
	/**
	 * adds n bugs to the world, then colors them based on their positions
	 * @param world the world to add the bugs to
	 * @param n the number of bugs to add
	 */
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
