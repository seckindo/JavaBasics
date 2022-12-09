package employeearraylist;

import java.util.ArrayList;

public class MainRunner {

	public static void main(String[] args) {
		String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
		String[] lastName = {"Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr"};
		String[] department = {"production", "r&d", "sales", "marketing", "human resources", "accounting", "sales", "r&d"};
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		for (int i =0;i<firstName.length; i++) {
			Employee emp1 = new Employee(firstName[i],lastName[i],department[i]);
			employees.add(emp1);
			//System.out.println(employees.get(i));
		}
		
		System.out.println(employees);
			
		}
	}
