package sef.final_test.activity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

	private Person thePerson, theParamPerson;
	
	// 	to capture the introductions and assert them
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	protected void setUp() throws Exception {
		super.setUp();
		
		System.setOut(new PrintStream(outputStreamCaptor));
		
		thePerson = new Person();
		theParamPerson = new Person("John",34);
		
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		
	}
	
	public void testPersonDefaultConstructor() {
		
		assert(thePerson.getFirstName()=="Unknown");
		assert(thePerson.getAge()==0);
		
	}
	
public void testPersonParametrizedConstructor() {
		
		assert(theParamPerson.getFirstName()=="John");
		assert(theParamPerson.getAge()==34);
		
	}
	
public void testPersonFirstName() {
	
		thePerson.setFirstName("Ivan");
		assert(thePerson.getFirstName()=="Ivan");
	
}

public void testPersonSecondName() {
	
	thePerson.setSecondName("Drago");
	assert(thePerson.getSecondName()=="Drago");

}


public void testPersonAge() {
	
	thePerson.setAge(54);
	assert(thePerson.getAge()==54);

}

public void testPersonIntroduction() {
	
	thePerson.introduction();
	Assert.assertEquals("My name is Unknown and I am 0 years old", outputStreamCaptor.toString().trim());
		
	

}
	

	
}
