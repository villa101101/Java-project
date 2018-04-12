package proj;

/*Constructs objects for child class from Staff*/

public class Admin extends Staff{
	private String username, pass;

	Admin(int IDNUM , String firstName, String lastName, String department, String password, int role, String username, String pass){
		super(IDNUM, firstName, lastName, department, password, role);
		this.username=username;
		this.pass=pass;
	
	}
	
public String toString(){
		
		return ("Admin : \n" +super.toString() + "\t user: " + this.username + this.pass);
	}
}