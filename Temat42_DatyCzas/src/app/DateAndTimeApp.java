package app;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class DateAndTimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean flage = true;
		System.out.println("Program Stoper, w celu rozpoczêcia wciœnij enter: ");
		String startButton = null;
		String stopButton = null;
		Instant startTime = null;
		Instant stopTime = null;
		@SuppressWarnings("resource")
		Scanner button = new Scanner(System.in);
		while(flage == true) {
			startButton = button.nextLine();
			if(startButton.equals("")) {
				startTime = Instant.now();
				System.out.println("Program Stoper, w celu zatrzymania wciœnij enter: ");
				while(flage == true) {
					stopButton = button.nextLine();
					if(stopButton.equals("")) {
						stopTime = Instant.now();
						flage = false;
					}
				}
			}
		}
		Duration measureTime = Duration.between(startTime, stopTime);
		System.out.println("Zmierzony czas w sekundach to: " + measureTime.getSeconds());
	}

}
