package hw6Sallary;

public abstract class Worcker {
	String departament;
	int dayOfwork;
	int salaryForDay;

	public Worcker(String departament, int dayOfwork, int salaryForDay) {
		super();
		this.departament = departament;
		this.dayOfwork = dayOfwork;
		this.salaryForDay = salaryForDay;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getDepartament() {
		return departament;
	}

	public int getDayOfwork() {
		return dayOfwork;
	}

	public int setSalaryForDay() {
		return salaryForDay;
	}

	public int getSalaryForDay() {
		return salaryForDay;
	}

	public void setDayOfwork(int dayOfwork) {
		this.dayOfwork = dayOfwork;
	}

	abstract void dowork();

}
