package sakh.roman.lection08Lab;
/*Написати програму, що малює часткову діаграму класів acm.program, 
 * як показано в прикладі:
 * 
 */
import java.awt.Color;
import java.awt.Label;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Task3Diagram extends GraphicsProgram {
	
	private static final int RECTWIDTH=150;
	private static final int RECTHEIGHT=75;
	private static final int WIDTH=800;  
	
	public void run(){
		this.setSize(WIDTH, WIDTH);
		
		GRect rect1 = new GRect(325, 100, RECTWIDTH, RECTHEIGHT);
		rect1.setFilled(false);
		rect1.setColor(Color.BLACK);
		add(rect1);
		
		GRect rect2 = new GRect(325, 250, RECTWIDTH, RECTHEIGHT);
		rect1.setFilled(false);
		rect1.setColor(Color.BLACK);
		add(rect2);
		
		GRect rect3 = new GRect(150, 250, RECTWIDTH, RECTHEIGHT);
		rect1.setFilled(false);
		rect1.setColor(Color.BLACK);
		add(rect3);
		
		GRect rect4 = new GRect(500, 250, RECTWIDTH, RECTHEIGHT);
		rect1.setFilled(false);
		rect1.setColor(Color.BLACK);
		add(rect4);
		
		
		
		GLabel label1 = new GLabel("Program", 370, 150);
		label1.setFont("sansserif-15");
		label1.setColor(Color.BLACK);
		add(label1);
		
		GLabel label2 = new GLabel("Graphics Program", 340, 300);
		label2.setFont("sansserif-15");
		label2.setColor(Color.BLACK);
		add(label2);
		
		 GLabel label3 = new GLabel("Console Program", 170, 300);
		 
		 label3.setFont("sansserif-15");
		 label3.setColor(Color.BLACK);
		add(label3);
		
		
		GLabel label4 = new GLabel("Dialog Program", 530, 300);
		label4.setFont("sansserif-15");
		label4.setColor(Color.BLACK);
		add(label4);
				
		
		
		
		GLine line0 = new GLine(400, 175, 400, 250);
		line0.setColor(Color.BLACK);
		add(line0);
		
		GLine line1 = new GLine(400, 175, 225, 250);
		line1.setColor(Color.BLACK);
		add(line1);
		
		GLine line2 = new GLine(400, 175, 575, 250);
		line2.setColor(Color.BLACK);
		add(line2);
		
		
		
	}

}
