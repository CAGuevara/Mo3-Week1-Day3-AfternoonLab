package Employees;

public class Secretary extends Employee{
	private int salary;
	private int vacationDays;
	private int weeklyHours;

//	private Manager manager = new Manager(60000,10,40);
	private Manager manager;
	
	
	/**
	 * @param salary
	 * @param vacationDays
	 * @param weeklyHours
	 */
	
	public Secretary() {
		this.salary = manager.getSalary()-20000;
		this.vacationDays = manager.getVacationDays() / 2;
		this.weeklyHours = manager.getWeeklyHours()*2;
	}
	
	public Secretary(Manager manager) {
//		super();
		this.salary = manager.getSalary()-20000;
		this.vacationDays = manager.getVacationDays() / 2;
		this.weeklyHours = manager.getWeeklyHours()*2;
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
		return "Secretary [salary=" + salary + ", vacationDays=" + vacationDays + ", weeklyHours=" + weeklyHours+"]";
	}
		
	
	
	
}

