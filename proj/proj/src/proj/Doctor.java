package proj;

/*Constructs objects for child class from Staff*/

public class Doctor extends Staff{
	private String patientFName, patientLName;

	Doctor(int IDNUM , String firstName, String lastName, String department, String password, int role, String patientFName, String patientLName){
		super(IDNUM, firstName, lastName, department, password, role);
		this.patientFName=patientFName;
		this.patientLName=patientLName;
}
	
public String toString(){
		
		return ("Patient name: \n" +super.toString() + "\t Patient FirstName: " + this.patientFName + this.patientLName);
	}
}