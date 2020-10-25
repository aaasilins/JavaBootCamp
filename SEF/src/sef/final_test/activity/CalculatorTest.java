package sef.final_test.activity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	private Calculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();

		theCalculator = new Calculator();

	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		assert(theCalculator.Add(4, 2)==6);
		assert(theCalculator.Add(4, -2)==2);
		assert(theCalculator.Add(-4, -2)==-6);

	}

	public void testSubtract() {
		assert(theCalculator.Subtract(4, 2)==2);
		assert(theCalculator.Subtract(4, -2)==6);
		assert(theCalculator.Subtract(-4, -2)==-2);

	}

	public void testMultiply() {
		assert(theCalculator.Multiply(4, 2)==8);
		assert(theCalculator.Multiply(-4, -2)==8);

	}

	public void testDivide() {
		assert(theCalculator.Divide(4, 2)==2);
		assert(theCalculator.Divide(-4, -2)==2);

	}
}
