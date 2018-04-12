package proj;

import java.util.Comparator;

/**
 * Programmer defined specification for how the Comparator class should operate when called on Vehicle objects
 * 
 */

public class compareByIDNUM implements Comparator<Staff>{
	
	public int compare(Staff v1, Staff v2){
		Integer c1 = v1.getIDNUM();
		Integer c2 = v2.getIDNUM();
		
		int result = c1.compareTo(c2);
		
		return result;
		
	}
}
