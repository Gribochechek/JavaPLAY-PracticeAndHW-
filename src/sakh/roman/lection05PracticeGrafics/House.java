package sakh.roman.lection05PracticeGrafics;
import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class House  extends GraphicsProgram {

	public void run() {
	
		this.setSize(1300, 760);
		
		GRect found = new GRect(300, 500, 500, 50);
			found.setFilled(true);
			found.setFillColor(Color.BLUE);
			found.setColor(Color.BLACK);
			add(found);
			
		GLabel houseName = new GLabel("Roman Sakh mansion", 400, 530);
			houseName.setFont("sansserif-bold-16");
			houseName.setColor(Color.RED);
			add(houseName);
			
		GRect house = new GRect(330, 300, 440, 200);
			house.setFilled(true);
			house.setFillColor(Color.GRAY);
			house.setColor(Color.BLACK);
			add(house);
			
		GLine leftRoof = new GLine(300, 310, 550, 200);
			leftRoof.setColor(Color.CYAN);
			add(leftRoof);
	
			GLine rightRoof = new GLine(800, 310, 550,200);
			rightRoof.setColor(Color.CYAN);
			add(rightRoof);
			
		GRect chimney = new GRect(380, 230, 20, 50);
			chimney.setFilled(true);
			chimney.setFillColor(Color.BLACK);
			add(chimney);
			
		GRect door = new GRect(720, 430, 40, 70 );
			door.setFilled(true);
			door.setFillColor(Color.BLACK);
			add(door);
		
		GOval doorKnob = new GOval(755, 465, 2, 2);
			doorKnob.setFilled(true);
			doorKnob.setFillColor(Color.RED);
			doorKnob.setColor(Color.WHITE);
			add(doorKnob);
			
		GRect doorWindow = new GRect(735, 445, 10, 10);
			doorWindow.setColor(Color.GREEN);
			doorWindow.setFilled(true);
			doorWindow.setFillColor(Color.WHITE);
			add(doorWindow);
			
		GLine doorWindowVertical = new GLine(740, 445, 740, 455);
			doorWindowVertical.setColor(Color.RED);
			add(doorWindowVertical);
		
		GLine doorWindowHorizontal = new GLine(735, 450, 745, 450);
		doorWindowHorizontal.setColor(Color.RED);
			add(doorWindowHorizontal);
			
		GRect doorStairsSideLeft = new GRect(710, 500, 9, 50);
			doorStairsSideLeft.setColor(Color.GRAY);
			doorStairsSideLeft.setFilled(true);
			doorStairsSideLeft.setFillColor(Color.YELLOW);
			add(doorStairsSideLeft);	
			
		GRect doorStairsSideRight = new GRect(761, 500, 9, 50);
			doorStairsSideRight.setColor(Color.GRAY);
			doorStairsSideRight.setFilled(true);
			doorStairsSideRight.setFillColor(Color.YELLOW);
			add(doorStairsSideRight);
		
		GRect doorStair1 = new GRect(720, 500, 40, 10);
			doorStair1.setFilled(true);
			doorStair1.setFillColor(Color.GREEN);
			add(doorStair1);	
		
		GRect doorStair2 = new GRect(720, 510, 40, 10);
			doorStair2.setFilled(true);
			doorStair2.setFillColor(Color.RED);
			add(doorStair2);	
	
		GRect doorStair3 = new GRect(720, 520, 40, 10);
			doorStair3.setFilled(true);
			doorStair3.setFillColor(Color.GREEN);
			add(doorStair3);
			
		GRect doorStair4 = new GRect(720, 530, 40, 10);
			doorStair4.setFilled(true);
			doorStair4.setFillColor(Color.RED);
			add(doorStair4);
			
		GRect doorStair5 = new GRect(720, 540, 40, 9);
			doorStair5.setFilled(true);
			doorStair5.setFillColor(Color.GREEN);
			add(doorStair5);
	
		 GRect window1 = new GRect(340, 310, 60, 70);
		 	window1.setFilled(true);
		 	window1.setFillColor(Color.BLACK);
		 	add(window1);
		 	
		 GRect window1Inner = new GRect(345, 315, 50, 60);
		 	window1Inner.setFilled(true);
		 	window1Inner.setFillColor(Color.WHITE);
		 	add(window1Inner);
		 	
		 GLine window1InnerVertical = new GLine(370, 315, 370, 375);
		 	window1InnerVertical.setColor(Color.RED);
		 	add(window1InnerVertical);
		 	
		 GLine window1InnerHorizontal = new GLine(346, 345, 394, 345);
		 	window1InnerHorizontal.setColor(Color.RED);
		 	add(window1InnerHorizontal);
	
		 GRect window2 = new GRect(425, 310, 60, 70);
		 	window2.setFilled(true);
		 	window2.setFillColor(Color.BLACK);
		 	add(window2);
		 	
		 GRect window2Inner = new GRect(430, 315, 50, 60);
		 	window2Inner.setFilled(true);
		 	window2Inner.setFillColor(Color.WHITE);
		 	add(window2Inner);
		 	 	
		 GLine window2InnerVertical = new GLine(455, 315, 455, 375);
		 	window2InnerVertical.setColor(Color.RED);
		 	add(window2InnerVertical);
		 		
		 GLine window2InnerHorizontal = new GLine(431, 345, 479, 345);
		 	window2InnerHorizontal.setColor(Color.RED);
		 	add(window2InnerHorizontal);
		
		 
		 	
	} 
		
		
	
}
