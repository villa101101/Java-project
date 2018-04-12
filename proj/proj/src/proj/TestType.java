package proj;

public enum TestType {

	BLOOD,
	STD,
	ECG,
	CPR,
	RPC,
	SICKLE;
	
	 public int numberValue(){
	 return this.ordinal();
	    }
}
