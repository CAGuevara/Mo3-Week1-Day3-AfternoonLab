package Employees;

public class Employee {
	
	private int salary;
	private int vacationDays;
	private int weeklyHours;
	
	//constructor
	
	public Employee() {
		
	}
	
	public Employee(int salary, int vacationDays, int weeklyHours ) {
		this.salary = salary;
		this.vacationDays = vacationDays;
		this.weeklyHours = weeklyHours;
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public int getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}
	
	//to show what is in the class

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", vacationDays=" + vacationDays + ", weeklyHours=" + weeklyHours + "]";
	}
	
	
}
