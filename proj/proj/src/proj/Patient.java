package proj;


public class Patient {
	private final String idNum;
	private String firstName,lastName, dob, illnesses;
	/*check if enum type is int for typeOfTest and doctor assigned*/
	private int doctorAssigned,  typeOfTest;
	private int ID;
	/*Change to Date type if we feel we can manage this*/
	private String dateOfVisit;
	/*INPUT CLASS TEST AND BE ABLE TO LIST THE TESTS*/
	
	Patient(String idNum, String firstName, String lastName, String dob, String dateOfVisit, int doctorAssigned, String illnesses, int ID, int typeOfTest)
	{
		this.idNum = idNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.dateOfVisit = dateOfVisit;
		this.doctorAssigned = doctorAssigned;
		this.illnesses = illnesses;
		this.ID= ID;
		this.typeOfTest = typeOfTest;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getIllnesses() {
		return illnesses;
	}

	public void setIllnesses(String illnesses) {
		this.illnesses = illnesses;
	}

	public int getDoctorAssigned() {
		return doctorAssigned;
	}

	public void setDoctorAssigned(int doctorAssigned) {
		this.doctorAssigned = doctorAssigned;
	}

	public int getID() {
		return ID;
	}

	

	public void setID(Integer iD) {
		ID = iD;
	}

	public int getTypeOfTest() {
		return typeOfTest;
	}

	public void setTypeOfTest(int typeOfTest) {
		this.typeOfTest = typeOfTest;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getIdNum() {
		return idNum;
	}




	
	


	/**
     * Format of output for objects of type Customer for chartered service
     */
	public String toString() {
		
		return ("Name: " + this.getFirstName() + "," + this.getLastName() + "\t" + 
		"Date of birth: " + this.getDob() + "\n" + "Illnesses: " + this.getIllnesses() + "\n" +"Doctor: " + this.getDoctorAssigned() +
		"\n" +"ID: " + this.getID() + "\n"  +"Type of test: " + this.getTypeOfTest() + "\n" +"Visiation Date: " + this.getDateOfVisit()+ "\n"); 
	}

}
