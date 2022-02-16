package Employees;

public class Manager extends Employee{
	
	private int salary;
	private int vacationDays;
	private int weeklyHours;
	
	
	/**
	 * @param salary
	 * @param vacationDays
	 * @param weeklyHours
	 */
	
	public Manager() {
	}
	
	public Manager(int salary, int vacationDays, int weeklyHours) {
//		super(salary,vacationDays, weeklyHours);
		super.setSalary(salary);
//		this.salary = salary;
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

	@Override
	public String toString() {
		return "Manager [salary=" + salary + ", vacationDays=" + vacationDays + ", weeklyHours=" + weeklyHours + "]";
	}
	
	
	
	
	
}
