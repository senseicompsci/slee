package com.sauyon.hivolts;

import java.awt.Dimension;

import javax.swing.JFrame;

public class HivoltsRunner
{
	public static void main(String[] args)
	{
		HivoltsFrame hf = new HivoltsFrame();
		
		hf.setMinimumSize(new Dimension(384,414));
		hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hf.setVisible(true);
	}
}