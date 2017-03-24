package sakhroman.lection08Lab;
/*Ви маєте написати програму, що малює зображення "мішень для лучника"
 * 
 * */
 
import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class Task2Target extends GraphicsProgram {

	private static final int WIDTH=600;
	
	
	public void run(){
		this.setSize(WIDTH, WIDTH);

		GOval o = filledCircle(300,300,100,Color.RED);
		add(o);
		GOval o1 = filledCircle(300,300,75,Color.WHITE);
		add(o1);
		GOval o2 = filledCircle(300,300,50,Color.RED);
		add(o2);
		GOval o3 = filledCircle(300,300,25,Color.WHITE);
		add(o3);
		
		
	}
	
	//x,y центр кола, r радіус
	private GOval filledCircle(int x, int y, double r, Color color){
		GOval circle = new GOval (x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	
	
	
}
