package app;

import data.Doctor;
import data.Hospital;
import data.Nurse;
import data.Person;

public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("Jan", "Psikutas", 2800, 500);
		Nurse nurse01 = new Nurse("Halinka", "Bimba³a", 1500, 50);
		Nurse nurse02 = new Nurse("Bogna", "Szczygie³", 1500, 200);
		
		System.out.println("Szpital jebniety");
		hospital.add((Person)doctor);
		hospital.add(nurse01);
		hospital.add((Person)nurse02);
		
		System.out.println(hospital.toString());
		
	}

}
