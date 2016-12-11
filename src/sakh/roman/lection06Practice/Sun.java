package sakh.roman.lection06Practice;
import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Sun extends GraphicsProgram {

	private static final int SUNBEAMNUMBER = 3; 
	
	public void run(){
		this.setSize(1300, 700);
		GOval sunCore = createSunCore(100, 100, 50, Color.YELLOW);
		add(sunCore);
		
			
		GLine sunbeam1 = createSuneam(0,100,200,100);
			add(sunbeam1);
		GLine sunbeam2 = createSuneam(0,0,200,200);
			add(sunbeam2);
		GLine sunbeam3 = createSuneam(100,0,100,200);
			add(sunbeam3);
		GLine sunbeam4 = createSuneam(200,0,0,200);
			add(sunbeam4);
	}

	private GLine createSuneam(int x, int y, int z, int a) {
		GLine sunbeam = new GLine(x,y,z,a);
			sunbeam.setColor(Color.RED);
		return sunbeam;
	}

	private GOval createSunCore(int x, int y, int r, Color color) { 
		GOval sunCore = new GOval(x-r,y-r,2*r, 2*r);
		sunCore.setFilled(true);
		sunCore.setColor(Color.YELLOW);
		return sunCore;
		
		
	}
}
