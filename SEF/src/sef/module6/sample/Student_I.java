package sef.module6.sample;

/* Student_I class is the sub class of Person class
 * Attributes : school, grade
 */
public class Student_I extends Person_I {

	//Attributes
	private int grade;
	private String school;
	
	//Behavior - default constructor. This will override the default constructor of Person?
	public Student_I(){ 
		System.out.println("I'm Student_I constructor"); 
	}
	
	// Do we need a parametrized constructor like in Person_I class?
	
	// getter for int grade
	public int getGrade() {
		return grade;
	}
	
	// setter for int grade
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// getter for String school
	public String getSchool() {
		return school;
	}
	
	// setter for String school
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void announce(){ //what happens when you have the same name of the method as te parent class? or is it just overriding?
		super.announce();  // calls announce() method of Person class
		System.out.println("Inside Student Class");
	}
		
}
