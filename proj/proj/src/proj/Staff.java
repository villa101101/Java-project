package proj;

public class Staff {
	protected final Integer IDNUM;
	/*protected int regNum;*/
	protected String firstName;
	protected String lastName;
	protected String department;
	public String password;

	

	/**
     * Constructor for superclass Staff
     */
	public Staff(int IDNUM, String firstName, String lastName, String department, String password, int role){
		this.IDNUM= IDNUM;
		this.firstName=firstName;
		this.lastName= lastName;
		this.department= department;
		this.password= password;
	
		
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getIDNUM() {
		return IDNUM;
	}



	public Integer IDNUM() {
		return IDNUM;
	}
	
	/* Function to order vehicles by their respective chassis numbers */
public int CompareById(Staff v){
	
		
		if (this.IDNUM.equals(v.getIDNUM())){
			int result = this.IDNUM.compareTo(v.getIDNUM());
			return result;
		}
		else {
			int result2 = this.IDNUM.compareTo(v.getIDNUM());
			return result2;
		}
	}
/**
 * Format of output for objects of type Vehicle
 */
public String toString(){
	
	return ("Staff Info:  \nId Number: \t" + IDNUM + "\n" + "FirstName: " + firstName + "\t surname: " + lastName +
			"\t department: " + department);
}
	

}