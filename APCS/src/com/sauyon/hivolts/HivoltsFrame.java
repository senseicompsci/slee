package com.sauyon.hivolts;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class HivoltsFrame extends JFrame
{
	Hivolt h = new Hivolt();
	
	private class Listener implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent arg0)
		{
			switch(arg0.getKeyChar())
			{
			case 'q':h.getPlayerLocation().ul();
			case 'w':h.getPlayerLocation().u();
			case 'e':h.getPlayerLocation().ur();
			case 'a':h.getPlayerLocation().l();
			case 's':break;
			case 'd':h.getPlayerLocation().r();
			case 'z':h.getPlayerLocation().dl();
			case 'x':h.getPlayerLocation().d();
			case 'c':h.getPlayerLocation().dr();
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {}

		@Override
		public void keyTyped(KeyEvent arg0) {}
		
	}
}
