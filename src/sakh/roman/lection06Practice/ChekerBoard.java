package sakh.roman.lection06Practice;

import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ChekerBoard extends GraphicsProgram{
	
	private static final int COLUMNSNUM=8;
	private static final int ROWSNUM=8;
	private static final int WIDTH=800;
	public void run(){
		this.setSize(WIDTH, WIDTH);
		this.setBackground(Color.BLACK);
		double sqSize=WIDTH/COLUMNSNUM;
		
		for(int i=0; i<= ROWSNUM; i++){
			for (int j=0;j<=COLUMNSNUM; j++ ){
				double x = j*sqSize;
				double y = i*sqSize;
				
				GRect square =new GRect(x, y, sqSize, sqSize);
						square.setFilled((i+j)%2!=0);
						square.setColor(Color.WHITE);
						add(square);
			}
			
			
		}
		
		
		
	}

}
