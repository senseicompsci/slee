package com.sauyon.hivolts;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Hivolt extends JComponent
{
	private Random g = new Random();
	
	private ImageIcon playerIcon = new ImageIcon("Hivolts/happy.png");
	private ImageIcon mhoIcon = new ImageIcon("Hivolts/sad.png");
	private ImageIcon fenceIcon = new ImageIcon("Hivolts/fence.png");
	
	private Location playerLocation;
	private Location[] fenceLocations = new Location[20];
	private Location[] mhoLocations = new Location[12];
	
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
	
	public Hivolt()
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
						setPlayerLocation(new Location(x, y));
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
		
		for(int i = 0; i < map.length; i++)
			for(int j = 0; j < map[0].length; i++)
			{
				int x = startX + 32*i;
				int y = startY + 32*i;
				switch (map[i][j])
				{
				case 'F':fenceIcon.paintIcon(this, g, x, y);
				case '+':playerIcon.paintIcon(this, g, x, y);
				case 'M':mhoIcon.paintIcon(this, g, x, y);
				}
			}
	}

	public Location getPlayerLocation() {
		return playerLocation;
	}

	public void setPlayerLocation(Location playerLocation) {
		this.playerLocation = playerLocation;
	}
}
