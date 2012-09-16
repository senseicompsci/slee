package com.sauyon.hivolts;

import javax.swing.JFrame;

public class HivoltsRunner
{
	public static void main(String[] args)
	{
		Hivolts h = new Hivolts();
		
		JFrame f = new JFrame();
		
		f.add(h);
		f.setSize(384,414);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
	}
}
