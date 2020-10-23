package jc4HomeworkAnimal;

public class ApplicationAn {

	public static void main(String[] args) {
		Animal animal = new Animal("Кіт", 12.00, 5);

		animal.getName();
		animal.getSpeed();
		animal.getAge();
		System.out.println("Назва тварини " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
				+ " км/год, Вік тварини = " + animal.getAge() + " років.");

		animal.setName("Носоріг");
		animal.setSpeed(8.00);
		animal.setAge(6);
		System.out.println("Назва тварини " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
				+ " км/год, Вік тварини = " + animal.getAge() + " років.");

		animal.setName("Мавпа");
		animal.setSpeed(17.00);
		animal.setAge(9);
		System.out.println("Назва тварини " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
				+ " км/год, Вік тварини = " + animal.getAge() + " років.");

		animal.setName("Кінь");
		animal.setSpeed(35.00);
		animal.setAge(12);
		System.out.println("Назва тварини " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
				+ " км/год, Вік тварини = " + animal.getAge() + " років.");

	}

}
