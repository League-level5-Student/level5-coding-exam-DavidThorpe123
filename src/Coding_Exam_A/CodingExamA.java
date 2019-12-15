package Coding_Exam_A;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	static int amountOfSides;
	public static void main(String[] args) {
		int amountOfRobots = 0;
		String color;
		
		String aor = JOptionPane.showInputDialog("How many robots");
		amountOfRobots = Integer.parseInt(aor);
		color = JOptionPane.showInputDialog("What color?");
		String aos = JOptionPane.showInputDialog("How many sides");
		amountOfSides = Integer.parseInt(aos);
		
		//timmy.move(400);
		//tammy.move(400);
		//sammy.move(400);
		//
		//timmy.moveTo(400, 700);
		//tammy.moveTo(800, 700);
		//sammy.moveTo(1200, 700);
		
		for (int i = 0; i < amountOfRobots; i++) {
			Robot r = new Robot(i * 300, 300);
			Thread t = new Thread(()->drawShape(r, color));
			t.start();
		}
	
		
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */

	}
	public static void drawShape(Robot r, String c) {
		r.setSpeed(10);
		r.penDown();
		if (c.equals("Red")) {
		r.setPenColor(Color.RED);
		}
		else if (c.equals("Green")) {
			r.setPenColor(Color.GREEN);
		}
		else if (c.equals("Blue")) {
			r.setPenColor(Color.BLUE);
		}
		for (int i = 0; i < amountOfSides; i++) {
			
		
		r.move(360 / amountOfSides);
		r.turn(360 / amountOfSides);
		}
	}
}
