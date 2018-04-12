package proj;

/*import Hospital.TestType;*/

public class Test {

	private String name,doctorUsed;
	private String typeofTest;
	private int num;
	
	/*Maybe this haffi change to date*/
	
	private String dateDone, DateReleased;
	
	Test(String name, String dateDone, String dateReleased, String doctorUsed, String typeofTest, int num)
	{
		this.name = name;
		this.dateDone = dateDone;
		this.DateReleased = dateReleased;
		this.doctorUsed = doctorUsed;
		this.typeofTest=typeofTest;
		this.num=num;
	}

	public String getTypeofTest() {
		return typeofTest;
	}

	public void setTypeofTest(String typeofTest) {
		this.typeofTest = typeofTest;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoctorUsed() {
		return doctorUsed;
	}

	public void setDoctorUsed(String doctorUsed) {
		this.doctorUsed = doctorUsed;
	}

	public String getType() {
		return typeofTest;
	}


	public String getDateDone() {
		return dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public String getDateReleased() {
		return DateReleased;
	}

	public void setDateReleased(String dateReleased) {
		DateReleased = dateReleased;
	}
	
}