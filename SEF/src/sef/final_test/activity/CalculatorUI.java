package sef.final_test.activity;

import java.util.Scanner;

public class CalculatorUI {

	public static void main(String[] args) {
		
		Calculator theCalculator = new Calculator();
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter the first number:");

		String first = myObj.nextLine();  // Read user input
		int firstNum = Integer.parseInt(first);
		
		System.out.println("Enter the second number:");

		String second = myObj.nextLine();  // Read user input
		int secondNum = Integer.parseInt(second);

		System.out.println("Enter the operand:");

		String operand = myObj.nextLine();  // Read user input
		char theOperand = operand.charAt(0);
		
		switch (theOperand) {
		case '+':
			System.out.println(theCalculator.Add(firstNum, secondNum));
			break;
		case '-':
			System.out.println(theCalculator.Subtract(firstNum, secondNum));
			break;
		case '*':
			System.out.println(theCalculator.Multiply(firstNum, secondNum));
			break;
		case '/':
			System.out.println(theCalculator.Divide(firstNum, secondNum));
			break;
			default:
				System.out.println("Wrong operand entered");
			
		}
			
	}

}
