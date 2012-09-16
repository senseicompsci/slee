package com.sauyon.hivolts;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Hivolts extends JComponent
{
	private Random g = new Random();
	
	ImageIcon playerIcon = new ImageIcon("Hivolts/happy.png");
	ImageIcon mhoIcons = new ImageIcon("Hivolts/sad.png");
	ImageIcon fenceIcon = new ImageIcon("Hivolts/fence.png");
	
	Location playerLocation;
	Location[] fenceLocations = new Location[20];
	Location[] mhoLocations = new Location[12];
	
	//sets the initial map
	char[][] map = 
		{{'F','F','F','F','F','F','F','F','F','F','F','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','F'},
		 {'F','F','F','F','F','F','F','F','F','F','F','F'}};
	
	public Hivolts()
	{
		//randomizes the locations of things
		initLocations();
	}
	
	public void initLocations()
	{
		//sets the locations of the fences
		for(int i = 0; i < 20; i++)
		{
			while(true)
			{
				int x = g.nextInt(10) + 1;
				int y = g.nextInt(10) + 1;
				
				if(map[x][y] == ' ')
				{
					fenceLocations[i] = new Location(x, y);
					break;
				}
			}
		}
	
		while(true)
		{
			int x = g.nextInt(10) + 1;
			int y = g.nextInt(10) + 1;
			
			if(map[x][y] == ' ')
			{
				playerLocation = new Location(x, y);
				break;
			}
		}
		
		for(int i = 0; i < 12; i++)
		{		
			while(true)
			{
				int x = g.nextInt(10) + 1;
				int y = g.nextInt(10) + 1;
				
				if(map[x][y] == ' ')
				{
					mhoLocations[i] = new Location(x, y);
					break;
				}
			}
		}
	}
	
	public void paint(Graphics g)
	{
		//Makes the bg black
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//Sets start x and y of map for easy access
		int startX = getWidth()/2 - 191;
		int startY = getHeight()/2 - 191;
		
		
	}
	
	private class Listener implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent arg0)
		{
			switch(arg0.getKeyChar())
			{
			case 'q':break;
			case 'w':break;
			case 'e':break;
			case 'a':break;
			case 's':break;
			case 'd':break;
			case 'z':break;
			case 'x':break;
			case 'c':break;
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {}

		@Override
		public void keyTyped(KeyEvent arg0) {}
		
	}
}
