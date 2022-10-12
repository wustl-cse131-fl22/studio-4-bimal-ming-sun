package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(100,0,100);
		StdDraw.filledRectangle(0.2,0.5,0.2,0.3);
		StdDraw.filledRectangle(0.8, 0.5, 0.2, 0.3);
		StdDraw.setPenColor(50, 50, 50);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(200,200,0);
		StdDraw.line(0, 0, 1, 1);
		StdDraw.line(0, 1, 1, 0);
	}
}