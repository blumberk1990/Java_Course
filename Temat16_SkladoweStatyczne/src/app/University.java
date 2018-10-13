package app;

import data.Student;

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students = new Student[5];
		students[0] = new Student("Hubert", "Magda", 90112405);
		students[1] = new Student("Kasia", "Koleczka", 92070606);
		
		System.out.println("Liczba Studentów na uczelni (Odwolanie do pola static bezposrednio): " + Student.studentIndex);
		System.out.println("Liczba Studentów na uczelni (Odwolanie przez obiekt do pola static klasy): " + students[0].studentIndex);
	}

}
