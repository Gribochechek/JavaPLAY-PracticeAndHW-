package sakh.roman.lection08Practice;
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH=210;
	private static final int HEAD_HEIGHT=400;
	private static final int EYE_RADIUS=50;
	private static final int MOUTH_WIDTH =100;
	private static final int MOUTH_HEIGHT=80;
	private static final int WIDTH=800;
	private static final int HEIGHT=600;
	
	
	
	public void run(){
		
		this.setSize(WIDTH, HEIGHT);
		
		GRect head = new GRect(295,100,HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setColor(Color.GRAY);
		add(head);
	
		filledCircle(350, 170, EYE_RADIUS, Color.YELLOW);
		filledCircle(450, 170, EYE_RADIUS, Color.YELLOW);
		
		GRect mouth = new GRect(350,300,MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.RED);
		add(mouth);
		
		
	}
		
	private GOval filledCircle(int x, int y, double r, Color color){
		GOval circle = new GOval (x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
		return circle;
		
		
		
		
	}

}
