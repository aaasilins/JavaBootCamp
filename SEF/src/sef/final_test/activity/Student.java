package sef.final_test.activity;

public class Student extends Person implements Humanity  {

	private String schoolName;

	//Default constructor
	public Student() {

	}
	//Parameterized constructor
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void introduction() {
		System.out.println("I study in University " + this.schoolName);
	}

}
