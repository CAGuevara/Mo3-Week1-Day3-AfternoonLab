package Employees;

public class Main {

	public static void main(String[] args) {
	
		Employee employee = new Employee();
		Manager manager = new Manager(100000,10,40);
		
		Secretary  s1 = new Secretary(manager);
		Secretary  s2 = new Secretary(manager);	
		
		
		System.out.println(s1.toString());
		System.out.println(manager.toString());
		System.out.println();
		System.out.println(employee.toString());
//		System.out.println("Salary Secretary " + s1.getSalary());
//		System.out.println(s2.getSalary());
//		System.out.println(s1.getVacationDays());
//
//		System.out.println("Salary Manager "+ m1.getSalary());
}
}