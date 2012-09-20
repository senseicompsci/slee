import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;



@SuppressWarnings("serial")
public class MovingGame extends JApplet
{
	private Image hero;
	private int heroX;
	private int heroY;
	private MoveListener move;
	private long lastPressProcessed;
	private int moveAmount;
	
	public void init()
	{
		setBackground(Color.BLACK);
		moveAmount = 10;
		lastPressProcessed = System.currentTimeMillis();
		
		heroX = 100;
		heroY = 100;
		hero = getImage(getDocumentBase(), "hero.png");
		setSize(750,500);
		move = new MoveListener();
		
	}
	public void paint(Graphics g)
	{
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawImage(hero, heroX,heroY,this);
		addKeyListener(move);
	}
	public class MoveListener implements KeyListener
	{
		public void keyPressed(KeyEvent e)
		{

			if(System.currentTimeMillis() - lastPressProcessed > 1) 
			{
				int pressed = e.getKeyChar();
				if(pressed == 'w')
				{
					heroY-= moveAmount;
					repaint();
				}
				else if(pressed == 'a')
				{
					heroX-= moveAmount;
					repaint();
				}
				else if(pressed == 'd')
				{
					heroX+= moveAmount;
					repaint();
				}
				else if(pressed == 's')
				{
					heroY+= moveAmount;
					repaint();
				}
				lastPressProcessed = System.currentTimeMillis();
			}
		}
		

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
