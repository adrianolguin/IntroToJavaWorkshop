package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Spudnick = new Robot();
		// 5. Set your robot's pen to the down position
		Spudnick.penDown();
		// 3. Set the robot to go at max speed (10)
		Spudnick.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		for(int x = 0; x < 75; x++) {
			// 7. Change the pen color to random
			Spudnick.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			Spudnick.move(x*5);
			// 2. Turn the robot 1/7 of 360 degrees to the right
		Spudnick.turn(360/7);
			// 8. Set the pen width to i
		Spudnick.setPenWidth(x);
	}
	}
}

