package com.org.FinalProject;

public class EventDetails {

	private String level;
	private String DateTime;
	private String source;
	private String taskCategory;
	private String id;
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return this.id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTaskCategory() {
		return taskCategory;
	}
	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}
	
}
