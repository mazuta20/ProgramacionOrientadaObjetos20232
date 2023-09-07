package edu.ucaldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class GradeBookTest {
	public GradeBookTest() {
		
	}
	public static void main (String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		GradeBook gradebook = new GradeBook();
		
		System.out.print("give a course name: ");
		String courseName = sc.nextLine();
		gradebook.displayMessage(courseName);
		
	}

}
