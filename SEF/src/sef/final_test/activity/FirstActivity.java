package sef.final_test.activity;

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
		emp02.setFirstName("Maria");
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
		
		
		for (int i = empList.size()-1; i>=0; i--)
		{
		System.out.println(empList.get(i).getFirstName()+" "+ empList.get(i).getSecondName()+" title "+empList.get(i).getTitle()+" salary "+ empList.get(i).getSalary());
		}
	}

}
