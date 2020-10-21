package hw6Sallary;

public class WorkerMonthPay extends Worcker implements Salary {
	String name;

	public WorkerMonthPay(String departament, int dayOfwork, String name, int salaryForDay) {
		super(departament, dayOfwork, salaryForDay);
		this.name = name;
	}

	@Override
	public void setDepartament(String departament) {

		super.setDepartament(departament);
	}

	@Override
	public String getDepartament() {

		return super.getDepartament();
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
	public void dowork() {
		System.out.println(this.name + " WorkerMonthPay works month in " + this.getDepartament());

	}

	@Override
	public int getSalaryForDay() {

		return super.getSalaryForDay();
	}

	@Override
	public int setSalaryForDay() {

		return super.setSalaryForDay();
	}

	@Override
	public void salary() {
		System.out.println("got payed = " + 30 * this.getSalaryForDay());

	}

}
