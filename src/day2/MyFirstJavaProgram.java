package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Spudnick = new Robot();
	Spudnick.turn(360/7);
	Spudnick.setSpeed(10);
	Spudnick.penDown();
	for(int x = 0; x < 75; x++) {
	Spudnick.move(x*5);
	Spudnick.setRandomPenColor();
	Spudnick.setPenWidth(x);
	}
	
	
	//Spudnick.penDown();
	//Spudnick.move(250);
	//Spudnick.turn(90);
	
		
	}
}
