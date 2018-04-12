package proj;

/*Constructs objects for child class from Staff*/

public class LabTech extends Staff{
	private String testType, hospital;

	LabTech(int IDNUM , String firstName, String lastName, String department, String password, int role, String testType, String hospital){
		super(IDNUM, firstName, lastName, department, password, role);
}
	
public String toString(){
		
		return ("LabTech : \n" +super.toString() + "\t Patient FirstName: " + this.testType + this.hospital);
	}
}