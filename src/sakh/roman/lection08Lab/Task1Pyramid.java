package sakh.roman.lection08Lab;
/*Напишіть програму що малює піраміду. Піраміда складається з горизонтальних рядів кірпічів. 
 * В кожному наступному ряду кількість кірпічів зменшується на один.
 * Піраміда має розташовуватися по центру вікна. 
 * Мають бути використані наступні константи:

BRICK_WIDTH - 30 пікселів
BRICK_HEIGHT - 12 пікселів
BRICKS_IN_BASE - 14
 */


import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Task1Pyramid extends GraphicsProgram{

	private static final int BRICK_WIDTH=30;
	private static final int BRICK_HEIGHT=12;
	private static final int BRICKS_IN_BASE=14;
	private static final int WNDSIZE=600;
	
	
	private int  startPointY = WNDSIZE-BRICK_HEIGHT;
	
	private static int nextRowStartX=(WNDSIZE-(BRICK_WIDTH*BRICKS_IN_BASE))/2;
	
	
	
	public void run(){
		this.setSize(WNDSIZE, WNDSIZE);
		
		int bricksNumberInRow=BRICKS_IN_BASE;
		
		for(int i=BRICKS_IN_BASE, nextStartPointY=startPointY; i>0;  i--, nextStartPointY-=BRICK_HEIGHT ){
			
			
			for(int m=bricksNumberInRow, nextStartPointX=nextRowStartX;  m>0; m--, nextStartPointX+=BRICK_WIDTH){
					makeBrick(nextStartPointX, nextStartPointY);
			}
			nextRowStartX+=BRICK_WIDTH/2;
			bricksNumberInRow--;
		}
		
	}
	
	private void makeBrick(int x, int y){
	
	GRect brick =new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		brick.setFilled(false);
		brick.setColor(Color.BLACK);
		add(brick);
		
		
	}
	
	
}
