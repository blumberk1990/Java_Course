package data;

public class Task implements Comparable<Task>{

	/*--Fields--*/
	private String name;
	private String description;
	private Priority priority;
	
	/*--Javabeans--*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	/*--Constructors--*/
	public Task(String name, String description, Priority priority) {
		this.setName(name);
		this.setDescription(description);
		this.setPriority(priority);
	}
	
	/*--Methods--*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Priorytet " + this.getPriority() + ". " + this.getName() + ": " + this.getDescription();
	}
	
	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return -this.getPriority().compareTo(o.getPriority());
	}
}
