package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;

import utils.DataReader;

public class Company implements Serializable {

	/*--Serialization--*/
	private static final long serialVersionUID = 003L;
	
	/*--Fields--*/
	private static final String FILE_NAME = "company.obj";
	private Person[] persons;
	private int employeeCounter;
	private transient DataReader dr;
	
	/*--Constructors--*/
	public Company() {
		persons = new Person[3];
		dr = new DataReader();
		employeeCounter = 0;
	}
	
	/*--Methods--*/
	public void addEmployee() {
		boolean error = true;
		Employee employee = null;
		while(error) {
			try {
				employee = dr.readAndCreateEmployee();
				error = false;
			} catch(InputMismatchException e) {
				System.out.println(e);
			}
		}
		persons[employeeCounter] = employee;
		employeeCounter++;
	}
	
	public void serializeSaveCompany(Company company) {
		try (
				FileOutputStream fs = new FileOutputStream(FILE_NAME);
	            ObjectOutputStream os = new ObjectOutputStream(fs);
				) {
			os.writeObject(company);
		} catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public Company serializeLoadCompany() {
		Company company = null;
		try(
                FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ) {
			company = (Company) ois.readObject();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
         
        if(company != null) {
            System.out.println("Wczytano dane...");
            company.printCompanyEmployees();
        }
        return company;
    }
	
	public void printCompanyEmployees() {
		System.out.println("Lista zatrudnionych: ");
		for(int i=0; i<employeeCounter; i++) {
			System.out.println(persons[i]);			
		}
	}
	
	public int menuSign() throws InputMismatchException {
		int sign = 0;
		boolean error = true;
		while(error) {
			try {
				sign = dr.readSign();
				error = false;
				if(sign <= 4 && sign >= 0) {
					error = false;
				} else {
					System.out.println("B³êdnie wybrana opcja, ponów próbê.");
				}
				
			} catch(InputMismatchException e) {
				System.err.println("Company.menuSign()");
			}
		}
		
		return sign;
	}
	
}
