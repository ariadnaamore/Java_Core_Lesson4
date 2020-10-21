package hw6Sallary;

public class WorkerHourPay extends Worcker implements Salary {
	String name;

	public WorkerHourPay(String departament, int dayOfwork, String name, int salaryForDay) {
		super(departament, dayOfwork, salaryForDay);
		this.name = name;

	}

	@Override
	public int setSalaryForDay() {

		return super.setSalaryForDay();
	}

	@Override
	public int getSalaryForDay() {

		return super.getSalaryForDay();
	}

	@Override
	public String getDepartament() {

		return super.getDepartament();
	}

	@Override
	public void setDepartament(String departament) {

		super.setDepartament(departament);
	}

	@Override
	public int getDayOfwork() {

		return super.getDayOfwork();
	}

	@Override
	public void setDayOfwork(int dayOfwork) {

		super.setDayOfwork(dayOfwork);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	void dowork() {
		System.out.println(this.getName() + " WorkerHourPay works in " + this.getDepartament());
	}

	public void salary() {
		System.out.println(" got payed = " + this.getDayOfwork() * this.getSalaryForDay());
	}

}
