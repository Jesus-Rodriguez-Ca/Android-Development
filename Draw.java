// Jesus Rodriguez
// ITC 155 Spring 2020

/*
White a program that uses the DrawingPanel to draw.
   The window is 220 pixels wide and 150 pixels tall. The background is yellow. There are two blue ovals of size 40x40 pixels.
   They are 80 pixels apart, and the left oval's top-felt corner is located at position (50,25). There is a red square whose 
   top corners exactly intersect the centers of the two ovals. Lastle, there is a black horizontal line through the center 
   of the square. 
*/

import java.awt.*;
public class Draw {
public static void main (String[] args) {
	DrawingPanel panel= new DrawingPanel(220, 150);  // window size
	panel.setBackground(Color.YELLOW);               // Background yellow
	Graphics g = panel.getGraphics();
	
	
	g.setColor(Color.BLUE);				//Sets first oval
	g.fillOval(50, 25, 40, 40);
	g.setColor(Color.BLUE);
	g.fillOval(130, 25, 40, 40);			// Sets second oval
	g.setColor(Color.RED);
	g.fillRect(70, 45, 80, 80);			//Sets red square
	g.setColor(Color.BLACK);			
	g.drawLine(70, 85, 150, 85);			// Draw black line
}
}
