/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *
 */
public class Assessment2Question3 {

	public Assessment2Question3(){
		
		RationalNumber r1 = new RationalNumber(2, 5);
//		System.out.println(r1);		
		RationalNumber r2 = new RationalNumber(3, 4);
		
		r1.multiply_I(r2);
		System.out.println(r1);

		r1= new RationalNumber(2, 5);
		r1.multiply_II(r2);
		System.out.println(r1);
		
		r1= new RationalNumber(2, 5);
		r1.multiply_III(r2);
		System.out.println(r1);
		
		
		
		
	};
	
}
