package hw6Sallary;

public class Application {

	public static void main(String[] args) {
		WorkerHourPay wrhour = new WorkerHourPay("Logistic", 12, "Olexander", 120);
		wrhour.dowork();
		wrhour.salary();

		WorkerMonthPay wmonth = new WorkerMonthPay("Reclamation", 60, "Anna", 200);
		wmonth.dowork();
		wmonth.salary();
	}

}
