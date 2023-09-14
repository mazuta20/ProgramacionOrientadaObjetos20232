package edu.ucaldas.ingenieria.poo.gradebook;

public class GradeBook {
	
	private String courseName;
	//Zona constructores
	public GradeBook()
	{
		
	}

	/**
	 * @param courseName
	 */
	public GradeBook(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void displayMessage(String course)
	 {
		System.out.print(" hello from GadeBook class " + getCourseName());
	 }

}
