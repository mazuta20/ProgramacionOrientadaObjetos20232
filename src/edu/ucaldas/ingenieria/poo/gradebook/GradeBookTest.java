package edu.ucaldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class GradeBookTest {
	public GradeBookTest() {
		
	}
	public static void main (String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		GradeBook gradebook = new GradeBook();
		GradeBook gradebookProgramacionOO = new GradeBook("Programacion Orientada a Objetos");
		
		
		System.out.print("give a course name: ");
		String courseName = sc.nextLine();
		gradebook.setCourseName(courseName);
		System.out.println(" nombre del curso "+gradebook.getCourseName());
		System.out.println("Nombre del curso con contructor" + gradebookProgramacionOO);
		gradebook.displayMessage(courseName);
		
	}

}
