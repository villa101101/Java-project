package proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import proj.Patient;
import proj.Staff;
import proj.Test;
import java.util.Scanner;



	public class Driver {

	/* Declaration of Array Lists to be used throughout system */
	
		
		static ArrayList<Patient> customers = new ArrayList<Patient>();
		static ArrayList<Staff> workers = new ArrayList<Staff>();
		static ArrayList<Test> samples = new ArrayList<Test>();
	
	
	 
public static void main(String[] args) {
		
		 boolean running = true;
		 Scanner scan = new Scanner(System.in);
		 int userSelection = 0;

		 
		 
		 /* Programmer defined Patient and Staff objects for testing purposes */
		 Patient patient1 = new Patient( "1001", "Khamoi", "White", "11/11/1997", "1/2/2016",1, "Leprosy", 1, 2);
		 Patient patient2 = new Patient( "1002", "Jason", "Manning", "22/2/1997", "1/2/2015",1, "hepatitis", 3, 4);
		 Patient patient3 = new Patient( "1003", "Dejeon", "Battick", "3/11/1994", "1/4/2016",1, "night fever", 3, 6);
		 Patient patient4 = new Patient( "1004", "Akeem", "Purrier", "3/1/1937", "1/3/2016",1, "ghonorrea", 4, 5);
		 Patient patient5 = new Patient( "1005", "Abi", "Miles", "1/10/1997", "1/3/2016",1, "siffilis", 41, 27);
		 Patient patient6 = new Patient( "1006", "Shemar", "Henry", "11/1/1997", "1/12/2016",1, "kanju", 14, 2);
		 
	
		 
		 Staff staff1 = new Staff(62001, "Bob", "Ross", "Lab", "Bunny50", 1);
		 Staff staff2 = new Staff(62002, "Martha", "Stewart", "Lab", "Bunny50", 1);
		 Staff staff3 = new Staff(62003, "Pat", "Moell", "Office", "Bunny50", 1);
		 Staff staff4 = new Staff(62004, "Juleen", "John", "FrontDesk", "Bunny50", 1);
		 Staff staff5 = new Staff(62005, "Samantha", "Dylan", "Lab", "Bunny50", 1);
		 Staff staff6 = new Staff(62006, "Diana", "Ckarj", "Lab", "Bunny50", 1);
		 
		 Test test1= new Test("Batch 1", "12/6/2016", "17/6/2016", "Dr. Bugsby", "AIDS", 1);
		 Test test2= new Test("Batch 2", "2/6/2016", "7/6/2016", "Dr. Ryan" ,"Cancer", 2);
		 Test test3= new Test("Batch 3", "1/6/2016", "6/6/2016", "Dr. Davis", "Leprosy", 3);
		 Test test4= new Test("Batch 4", "1/6/2016", "17/7/2016", "Dr. Morgan", "ECG",4);
		 Test test5= new Test("Batch 5", "13/6/2016", "18/6/2016", "Dr. HillBilly", "Blood", 5);
		 Test test6= new Test("Batch 6", "21/6/2016", "27/6/2016", "Dr. Sharpe", "STD",6);
		 
		 
		 
		 customers.add(patient1);
		 customers.add(patient2);
		 customers.add(patient3);
		 customers.add(patient4);
		 customers.add(patient5);
		 customers.add(patient6);
		 
		 workers.add(staff1);
		 workers.add(staff2);
		 workers.add(staff3);
		 workers.add(staff4);
		 workers.add(staff5);
		 workers.add(staff6);
		 
		 samples.add(test1);
		 samples.add(test2);
		 samples.add(test3);
		 samples.add(test4);
		 samples.add(test5);
		 samples.add(test6);
		 
		 
		 while (running == true){
			 
			 try{
				 /* Menu to be printed out to user */
			 System.out.println("Input the number option that suits you from below:\n");
			 
			 System.out.println("1. CREATE A PATIENT RECORD\n");
			 System.out.println("2. Create a New Staff Record\n");
			 System.out.println("3. Create a New Test");
			 System.out.println("4. Delete a Staff record\n");
			 System.out.println("5. Delete test record\n");
			 System.out.println("6. Delete a Patient record\n");
			 System.out.println("7. Output Tests\n");
			 System.out.println("8. Output List of patients\n");
			 System.out.println("9. Output Current Staff\n");
			 System.out.println("10. Exit\n");
			 
			 userSelection = scan.nextInt();
			 }
			 catch (IllegalArgumentException e){
				 System.out.println("Invalid data entered, please try again.");
			 }
			 catch (Exception e){
				 System.out.println("Please try again.");
			 }
			 
			 switch(userSelection) {
			 /* Calling of functions dependent on user input from menu */
			 	case 1: addPatient();
			 		break;
			 	case 2: createStaff();
			 		break;
			 	case 3: addTest();
			 		break;
			 	case 4: deleteStaff(workers);
			 		break;
			 	case 5: deleteTest(samples);
			 		break;
			 	case 6: deletePatient(customers);
			 		break;
			 	case 7: outputTests(samples);
		 			break;
			 	case 8: outputPatients(customers);
		 			break;
			 	case 9: outputStaff(workers);
	 				break;
			 	case 10:
			 	System.out.println("Thank you, have a good day!");
		 		running = false;
			 		
			 }
		 }

	}
	

public static void addPatient(){
	
	Scanner add = new Scanner(System.in);
	String idNum, firstName, lastName, dob, illnesses;/*Add enum type*/
	int ID,doctorAssigned;
	String dateOfVisit; /*Change to date class*/
	int typeOfTest; /*This goodly haffi change cause idr how enum work*/
	
	Patient patient=null;
	
	System.out.println("Please enter the patients Identification Number \n");
	idNum = add.next();
	
	System.out.println("Please enter the patients first name \n");
	firstName = add.next();
	
	System.out.println("Please enter the patients last name \n");
	lastName = add.next();
		
	System.out.println("Please enter the date of birth in format DD/MM/YYYY \n");
	dob = add.next();
	
	/*change dateOfVisit class from String to Date
	 * God go with you cause mi na go with you*/
	
	
	System.out.println("Please enter the date of visit \n");
	dateOfVisit = add.next();
	
	System.out.println("Please enter the doctor's number, for confidentiality");
	doctorAssigned = add.nextInt();
	
	System.out.println("Please enter Illnesses seperated by a comma\n");
	illnesses = add.next();
	
	System.out.println("Please enter number of previous tests completed \n");
	ID = add.nextInt();
	
	/*Mek this an enum type thingy*/
	/*Pretty it up*/
	System.out.println("Please enter the number associated with the type of test:" 
						+	"\n" +	"1- blood" 
						+"\n"+  "2- Urine"
						+"\n"+"3- make up some other types please and let the changes reflect in the enum class created");
	typeOfTest = add.nextInt();

	patient = new Patient(idNum, firstName,  lastName,  dob,  dateOfVisit,  doctorAssigned,  illnesses,  ID,  typeOfTest);

	customers.add(patient);
	
	
}

public static void addTest(){
	Scanner add = new Scanner(System.in);
	String name,doctorUsed, patientName;
	String typeofTest;
	String dateDone, DateReleased; /*Change to date class*/
	int num;
	
	
	Test test=null;
	
	System.out.println("Please enter the name of the test \n");
	name = add.next();
	
	System.out.println("Please select the number associated with the type of test:"
						+ "\n"+ "1- FLU \n");
	typeofTest = add.next();
	
	System.out.println("Please enter the date done \n");
	dateDone = add.next();
		
	System.out.println("Please enter the date of release date released \n");
	DateReleased = add.next();
	
	System.out.println("Please enter the name fo the doctor used \n");
	doctorUsed = add.next();
	System.out.println("Please enter the desired test number \n");
	num = add.nextInt();

	/*Fix to actually take name of patient*/
	
	System.out.println("Please enter the name of the Patient that did the test");
	patientName = add.next();
	
	test= new Test(name, dateDone, DateReleased, doctorUsed, typeofTest, num);


	samples.add(test);
}

private static void createStaff() {
	Scanner add = new Scanner(System.in);
	String firstName,lastName, department;
	String password;
	String role;/*Change to date class*/
	int IDNUM, num;
	
	
	Test test=null;
	
	System.out.println("Please enter first name \n");
	firstName = add.next();
	
	System.out.println("Please enter the last name\n");
	lastName = add.next();
	
	System.out.println("Please enter the department \n");
	department = add.next();
		
	System.out.println("Please enter the password \n");
	password = add.next();
	
	System.out.println("Please enter IDNUMBER \n");
	IDNUM = add.nextInt();
	
	System.out.println("Please re-enter IDNUMBER \n");
	num = add.nextInt();
	
	
	System.out.println("Please enter the age (number) \n");
	role = add.next();

	

	Staff staff = new Staff(IDNUM, firstName, lastName, department, password, num);


	samples.add(test);
	
}
		
private static void deletePatient(ArrayList<Patient> customers) {
	/**
	 * Function to delete a staff member based on id number
	 * 
	 */
	Scanner scan = new Scanner(System.in);
	int del = 0;
	
	
	System.out.println("Enter ID number of the customer to be removed:\n");
	del = scan.nextInt();
	
	Iterator<Patient> it = customers.iterator();
	if(customers.size() < 1) {
		System.out.println("There is no customer on system.\n");
	}
	else {
	while (it.hasNext()) {
	  Patient user = it.next();
	  if (user.getID()==(del)) {
	    it.remove();
	  }
	}
	
 }
}

		
private static void deleteStaff(ArrayList<Staff> workers) {
	/**
	 * Function to delete a staff member based on id number
	 * 
	 */
	Scanner scan = new Scanner(System.in);
	int del = 0;
	
	
	System.out.println("Enter ID number of the staff to be removed:\n");
	del = scan.nextInt();
	
	Iterator<Staff> it = workers.iterator();
	if(workers.size() < 1) {
		System.out.println("There is no Staff on system.\n");
	}
	else {
	while (it.hasNext()) {
	  Staff user = it.next();
	  if (user.getIDNUM().equals(del)) {
	    it.remove();
	  }
	}
	
 }
}

private static void deleteTest(ArrayList<Test> samples) {
	/*Function to delete a test */
	Scanner scan = new Scanner(System.in);
	int del = 0;
	
	
	System.out.println("Enter  number of test to be removed:\n");
	del = scan.nextInt();
	
	Iterator<Test> it = samples.iterator();
	if(samples.size() < 1) {
		System.out.println("There are no samples in the system.\n");
	}
	else {
	while (it.hasNext()) {
	  Test user = it.next();
	  if (user.getNum()==del) {
	    it.remove();
	  }
	}
 }
}

private static void outputTests(ArrayList<Test> samples){
	/**
	 * Function to output rental bills
	 * 
	 */
	int count =0;
	
	try
		{for(Test b: samples){
			count=1;
			System.out.println("test number" + count + ":\t" + b + "\n");
			count++;
		}
	}
	catch (NullPointerException e) {
		System.out.println("No tests found on system \n");
	}
	
}

private static void outputPatients(ArrayList<Patient> customers){
	/**
	 * Function to output charter bills
	 * 
	 */
  int count =0;
	
	try{
		for(Patient b: customers){
	
			count=1;
			System.out.println("Patient number" + count + ":\t" + b + "\n");
			count++;
		}
	}
	catch(NullPointerException e) {
		System.out.println("No patients on system \n");
	}

	
}

private static void outputStaff(ArrayList<Staff> workers){
	/**
	 * Function to output Staff on system
	 * 
	 */
	 int count =0;
		
		try {
			for(Staff v: workers){
				count=1;
				System.out.println("Staff Member" + count + ":\t" + v + "\n");
				count++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("No Staff is registered in the system \n");
		}
}


}


