package _99_extra;


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = JOptionPane.showInputDialog("What is your favorite color");
JOptionPane.showMessageDialog(null, input + " is my favorite color too!");
Robot sven = new Robot();
sven.penDown();
sven.setRandomPenColor();
sven.setSpeed(100);
for (int i = 0; i < 3; i++) {
	sven.move(420);
	sven.turn(360/3);
}
	}

}
