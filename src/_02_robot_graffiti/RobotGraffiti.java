package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot sven = new Robot();
		sven.setSpeed(100);
		sven.penDown();
		sven.move(200);
		sven.turn(180);
		sven.move(100);
		sven.turn(-90);
		sven.move(75);
		sven.turn(90);
		sven.move(100);
		sven.turn(180);
		sven.move(200);
		sven.penUp();
		sven.turn(90);
		sven.move(50);
		sven.turn(90);
		sven.penDown();
		sven.move(200);
		sven.turn(180);
		sven.move(200);
		sven.turn(90);
		for (int i = 0; i < 180; i++) {
			sven.move(1);
			sven.turn(1);
		}
		sven.turn(-120);
		sven.move(100);
		sven.penUp();
		sven.move(100);
	}
}
