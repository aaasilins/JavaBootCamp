package sef.final_test.activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		Employee emp01 = new Employee();
		emp01.setFirstName("John");
		emp01.setSecondName("Malkovic");
		emp01.setAge(22);
		emp01.setCompany("Miramax");
		emp01.setTitle("Actor");
		emp01.setSalary(10000);

		Employee emp02 = new Employee();
		emp02.setFirstName("Amanda");
		emp02.setSecondName("Abramovic");
		emp02.setAge(52);
		emp02.setCompany("Abramovic inc.");
		emp02.setTitle("Artist");
		emp02.setSalary(5000);

		Employee emp03 = new Employee();
		emp03.setFirstName("Ewan");
		emp03.setSecondName("McGregor");
		emp03.setAge(50);
		emp03.setCompany("20 Century Fox");
		emp03.setTitle("Actor");
		emp03.setSalary(25000); 

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp01);
		empList.add(emp02);
		empList.add(emp03);



		empList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getFirstName));

		PrintStream ps_console = System.out;

		try {

			File file = new File("./src/sef/final_test/activity/employees.txt");
			FileOutputStream fos = new FileOutputStream(file);

			PrintStream ps = new PrintStream(fos);

			System.setOut(ps);	

			for (int i = empList.size()-1; i>=0; i--)
			{

				System.out.println(empList.get(i).getFirstName()+" "+ empList.get(i).getSecondName()+" title "+empList.get(i).getTitle()+" salary "+ empList.get(i).getSalary());

			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.setOut(ps_console);	
			System.out.println("Employee list sorted by by biggest salary from top to bottom:");
			for (int i = empList.size()-1; i>=0; i--)

			{

				System.out.println(empList.get(i).getFirstName()+" "+ empList.get(i).getSecondName()+" title "+empList.get(i).getTitle()+" salary "+ empList.get(i).getSalary());
			}
		}

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter the size of Fibonacci number list :");

		String temp = myObj.nextLine();  // Read user input
		int sizeFibo = Integer.parseInt(temp);

		int n0 = 0, n1 = 1, n2=0;

		if (sizeFibo==1) System.out.print(n0+" ");
		else if (sizeFibo == 2) 

		{
			System.out.print(n0+" ");
			System.out.print(n1+" ");

		}
		else {
			System.out.print(n0+" ");
			System.out.print(n1+" ");
			for (int i=2; i<sizeFibo; i++)
			{
				n2 = n0+n1;
				System.out.print(n2+" ");
				n0 = n1;
				n1 = n2;
			}
		}
		System.out.println();

		empList.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSecondName));

		System.out.println("Employee list sorted by by first name and second name:");
		for (int i = 0; i<empList.size(); i++)

		{

			System.out.println(empList.get(i).getFirstName()+" "+ empList.get(i).getSecondName()+" title "+empList.get(i).getTitle()+" salary "+ empList.get(i).getSalary());
		}


	}



}


