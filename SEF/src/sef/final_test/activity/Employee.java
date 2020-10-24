package sef.final_test.activity;

//class Employee must extend class Person. Complete code for the same
public class Employee extends Person  {
	
	//Attributes
	private int salary;
	private String title;
	private String company;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	//Behavior - write default constructor.
	public Employee() {
		
	}
	
	//Parameterized constructor
	public Employee(String title, String company) {
		this.company = company;
		this.title = title;
	}

	
	// write getter for String title
	public String getTitle() {
		return title;
	}
	
	// write setter for String title
	public void setTitle(String title) {
		this.title = title;
	}

	public void introduction() {
		super.introduction();
		System.out.println("I work as a "+ this.title + " in " + this.company);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	
}
