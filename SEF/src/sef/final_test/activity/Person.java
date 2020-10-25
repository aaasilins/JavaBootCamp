package sef.final_test.activity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

	//Attributes
	private String firstName;
	private String secondName;
	private int age;

	//Behavior - write default constructor. Print 'I'm Person constructor'
	public Person(){
		this.firstName = "Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - write parameterized constructor
	public Person(String name, int age) {
		this.firstName = name;
		this.age = age;
	}

	// write getter for int age
	public int getAge() {
		return age;
	}

	// write setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public void introduction() {
		System.out.println("My name is " + this.firstName + " and I am " + this.age + " years old");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		try {
			if(checkForNonAlphabet(firstName)!=true){
				throw new Exception("Name can't contain non-alphabetic characters");
			} else {
				this.firstName = firstName;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		try {
			if(checkForNonAlphabet(secondName)!=true){
				throw new Exception("Second Name can't contain non-alphabetic characters");
			} else {
				this.secondName = secondName;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public boolean checkForNonAlphabet(String name) {

		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");  
		Matcher matcher = pattern.matcher(name); 
		if(matcher.find())  
			return true;
		else{  
			return false;
		}



	}
}

