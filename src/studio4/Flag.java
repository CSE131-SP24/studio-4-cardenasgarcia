package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setXscale(0,10);
		StdDraw.setYscale(0,20);
		StdDraw.setPenColor(97, 24, 199);
		StdDraw.filledRectangle(6, 6, 6, 6);
		StdDraw.setPenColor(216, 199, 240);
		StdDraw.filledRectangle(4, 6, 6, 4);
		StdDraw.setPenColor(65, 166, 129);
		StdDraw.filledEllipse(5, 6, 2, 2.5);
		StdDraw.setPenColor(0,0,0);
		StdDraw.line(5, 5, 4, 4);
		StdDraw.line(2, 3, 4, 6);
		
		
 }
}