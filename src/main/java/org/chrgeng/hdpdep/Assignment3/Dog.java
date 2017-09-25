/**
 * 
 */
package org.chrgeng.hdpdep.Assignment3;

/**
 * @author christian
 *
 */
public class Dog extends Pet { 
	
	private String b; 
	
	public Dog (String color, int weight, String breed) {
		//MISSING CODE

// I.
//		super(color, weight);
//		b = breed;


// II.		
		super(color, weight);
		this.b = breed;


// III.
//		this.breed = breed;
//		super(color, weight);

		
	
	} 
	//
	public String toString() { 
		String ret = "";
		ret = ret + this.b;
	   	return ret; 
	   	}

	
	
}




