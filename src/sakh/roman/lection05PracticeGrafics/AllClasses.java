package sakh.roman.lection05PracticeGrafics;
import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class AllClasses extends GraphicsProgram {
	
	public void run(){
		
		this.setSize(700, 700);
		GLabel label = new GLabel("My favourite book is 'Harry Potter'", 100, 100);
				label.setFont("sansserif-35");
				label.setColor(Color.CYAN);
				add(label);
				
		GRect rectangular = new GRect(100, 100);
			rectangular.setFilled(true);
			rectangular.setFillColor(Color.GREEN);
			rectangular.setColor(Color.MAGENTA);
			rectangular.move(315, 105);
			add(rectangular);
			
		GOval oval = new GOval(100, 100);
			oval.setFilled(true);
			oval.setFillColor(Color.RED);
			oval.setColor(Color.GREEN);
			oval.move(315, 105);
			add(oval);
			
		GLine line0 = new GLine(315, 105, 415, 205);
			line0.setColor(Color.BLACK);
			add(line0);
			
		GLine line2 = new GLine(315, 205, 415, 105 );
			line2.setColor(Color.BLACK);
			add(line2);
		
	}
	

}
