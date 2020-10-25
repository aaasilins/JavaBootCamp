package sef.final_test.activity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;
import junit.framework.TestCase;

public class StudentTest extends TestCase {

	private Student theStudent, theParamStudent;
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


	protected void setUp() throws Exception {
		super.setUp();

		System.setOut(new PrintStream(outputStreamCaptor));		
		theStudent = new Student();
		theParamStudent = new Student("Stockholm University");
	}

	protected void tearDown() throws Exception {
		super.tearDown();

	}

	public void testStudentDefaultConstructor() {

		assert(theStudent.getFirstName()=="Unknown");
		assert(theStudent.getAge()==0);
	}

	public void testStudentParameterizedConstructor() {
		assert(theParamStudent.getFirstName()=="Unknown");
		assert(theParamStudent.getAge()==0);
		assert(theParamStudent.getSchoolName()=="Stockholm University");

	}

	public void testStudentSchool() {
		theStudent.setSchoolName("MIT");
		assert(theStudent.getSchoolName()=="MIT");
	}

	public void testStudentIntroduction() {

		theParamStudent.introduction();
		Assert.assertEquals("I study in University Stockholm University", outputStreamCaptor.toString().trim());

	}

}
