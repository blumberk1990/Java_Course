package data;

public enum Priority {
	LOW(0, "Ma³y"), MODERATE(1, "Œredni"), HIGH(2, "Wysoki");
	
	/*--Fields--*/
	private int priority;
	private String description;
	
	/*--Javabeans--*/
	public int getPriority() {
		return priority;
	}
	public String getDescription() {
		return description;
	}

	/*--Constructors--*/
	Priority(int priority, String description) {
		this.priority = priority;
		this.description = description;
	}
	
	/*--Methods--*/
	public static Priority createPriorityFromInt(int priority) {
		Priority priorityLevel = Priority.values()[priority];
		return priorityLevel;
	}
}
