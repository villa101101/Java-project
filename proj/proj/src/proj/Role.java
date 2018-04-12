package proj;

public enum Role {
	DOCTOR,
	LABTECH,
	ADMIN;
	public int numberValue(){
    return this.ordinal();
	}

}
