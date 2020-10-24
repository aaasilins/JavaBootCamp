package sef.final_test.activity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;
import junit.framework.TestCase;

public class EmployeeTest extends TestCase {


	private Employee theEmployee, theParamEmployee;
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


	protected void setUp() throws Exception {
		super.setUp();

		System.setOut(new PrintStream(outputStreamCaptor));		
		theEmployee = new Employee();
		theParamEmployee = new Employee("Head of Engineering","Google");
	}

	protected void tearDown() throws Exception {
		super.tearDown();

	}

	public void testEmployeeDefaultConstructor() {

		assert(theEmployee.getFirstName()=="Unknown");
		assert(theEmployee.getAge()==0);
	}

	public void testEmployeeParametrizedConstructor() {

		assert(theParamEmployee.getFirstName()=="Unknown");
		assert(theParamEmployee.getAge()==0);
		assert(theParamEmployee.getTitle()=="Head of Engineering");
		assert(theParamEmployee.getCompany()=="Google");
	}

	public void testEmployeeTitle() {

		theEmployee.setTitle("Full-stack Developer");
		assert(theEmployee.getTitle()=="Full-stack Developer");

	}

	public void testEmployeeSalary() {

		theEmployee.setSalary(5000);
		assert(theEmployee.getSalary()==5000);
	}

	public void testEmployeeIntroduction() {

		theParamEmployee.introduction();
		Assert.assertEquals("My name is Unknown and I am 0 years old\nI work as a Head of Engineering in Google", outputStreamCaptor.toString().trim());

	}


}
