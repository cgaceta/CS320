package main.java.model;

public class Task {
	
	private String taskId;
	private String taskName;
	private String taskDescription;
	
	public Task(String taskId, String taskName, String taskDescription) {
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		if(taskName == null || taskId.length() > 20) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(taskDescription == null || taskId.length() > 50) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
	}
	
	public String getTaskId() {
		return taskId;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}

}
