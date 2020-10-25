package sef.final_test.activity;

public class Employee extends Person implements Humanity   {

	private int salary;
	private String title;
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Employee() {

	}

	public Employee(String title, String company) {
		this.company = company;
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

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
