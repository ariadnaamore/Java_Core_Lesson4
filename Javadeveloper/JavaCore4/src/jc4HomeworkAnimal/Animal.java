package jc4HomeworkAnimal;

public class Animal {
	String name;
	double speed;
	int age;

	public Animal(String name, double speed, int age) {

		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
