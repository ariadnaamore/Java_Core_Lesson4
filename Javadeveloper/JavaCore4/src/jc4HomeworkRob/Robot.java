package jc4HomeworkRob;

public class Robot {
	private String type;
	private String task;
	
	public Robot() {
		
	}

	public Robot(String type, String task) {
		this.type = type;
		this.task = task;
	}



	public void work() {
		System.out.println(this.type + " - " + this.task);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
}
