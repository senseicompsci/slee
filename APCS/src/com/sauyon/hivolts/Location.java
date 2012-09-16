package com.sauyon.hivolts;

public class Location
{
	private int x, y;
	
	public Location(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void u()
	{
		y++;
	}
	
	public void ur()
	{
		x++;
		y++;
	}
	
	public void r()
	{
		x++;
	}
	
	public void dr()
	{
		x++;
		y--;
	}
	
	public void d()
	{
		y--;
	}
	
	public void dl()
	{
		x--;
		y--;
	}
	
	public void l()
	{
		x--;
	}
	
	public void ul()
	{
		x--;
		y++;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
