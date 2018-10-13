package app;

import java.util.PriorityQueue;

import data.Task;
import utils.DataReader;

public class TaskManager {

	/*--Fields--*/
	static final int EXIT = 0;
	static final int ADD_TASK = 1;
	static final int GET_TASK_AND_DELETE = 2;
	
	private PriorityQueue<Task> priorityQueue;
	private DataReader dr;
	private int taskCounter;
	
	/*--Javabeans--*/
	public int getTaskCounter() {
		return taskCounter;
	}
	
	/*--Constructors--*/
	public TaskManager() {
		priorityQueue = new PriorityQueue<>();
		dr = new DataReader();
		taskCounter = 0;
	}
	
	/*--Methods--*/
	public void taskManagerLoop() {
		int options = -1;
		 do {
			taskAppMenu();
			options = dr.readSign();
			switch(options) {
			case EXIT:
				System.out.println("Dziêki za skorzystanie z programu, do zobaczenia MGD.");
				dr.close();
				break;
			case ADD_TASK:
				addTask();
				break;
			case GET_TASK_AND_DELETE:
				getTaskAndDelete();
				break;
			default: 
				break;				
			} 
		} while(options != 0);
	}

	public void addTask() {
		priorityQueue.add(dr.readAndCreateTask());
		taskCounter++;
		System.out.println("Dodano nowe zadanie");
	}
	
	public void getTaskAndDelete() {
		
		if(priorityQueue.peek() != null) {
			System.out.println("Pobrane zadanie o najwy¿szym priorytecie");
			System.out.println(priorityQueue.poll());
		} else {
			System.out.println("Brak zadañ do wykonania, idz na kawê.:)");
		}
		
	}
	
	static void taskAppMenu() {
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("**-----------Opcje-----------**");
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("** 0 - EXIT                  **");
		System.out.println("** 1 - Dodaj zdarzenie       **");
		System.out.println("** 2 - Pobierz zdarzenie     **");
		System.out.println("*******************************");
		System.out.println("*******************************");
	}
	

}
