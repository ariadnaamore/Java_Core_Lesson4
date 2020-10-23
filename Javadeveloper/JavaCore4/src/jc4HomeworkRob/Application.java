package jc4HomeworkRob;

public class Application {

	public static void main(String[] args) {
		Robot robot = new Robot("Я - робот!", "Я просто працюю.");
		CofeeRobot coferobot = new CofeeRobot("Я - Cofee Robot ", "я  заварюю каву!");
		RobotDancer robodance = new RobotDancer("Я - Robot Dancer", "я просто танцюю!");
		RobotCoocker robocoocker = new RobotCoocker("Я - Robot Coocker ", "я просто готую!");

		robot.getTask();
		robot.getType();

		robot.work();

		coferobot.work();
		robodance.work();
		robocoocker.work();

		Robot robotArray[] = new Robot[] { robot, coferobot, robodance, robocoocker };

		for (int i = 0; i < 4; i++) {
			robotArray[i].work();
		}

	}

}
