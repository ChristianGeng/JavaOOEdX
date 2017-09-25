/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *  Question 3
1 point possible (graded)

The method multiply multiplies the numerator of this RationalNumber by the numerator of r, and the denominator of this RationalNumber by the denominator of r. Which of the following can be used to replace missing code  so that the multiply() method will work as intended?
I.

num = num * r.num;
den = den * r.den;

II.

this.num = this.num * r.num;
this.den = this.den * r.den;

III.

num = num * r.getNum();
den = den * r.getDen();

III only
I, II, and III
I and II only
II and III only
II only 

 */

public class RationalNumber {

	private int num;
	private int den; // den != 0
	
	 /** Constructs a RationalNumber object.
	    *  @param n the numerator
	    *  @param d the denominator
	    *  Precondition: d != 0
	    */
	    public RationalNumber(int n, int d) {
	        num = n;
	        den = d;
	    }
	
	    /** Multiplies this RationalNumber by r.
	     *  @param r a RationalNumber object
	     *  Precondition: this.den() != 0
	     */
	     public void multiply(RationalNumber r) {
	         /* missing code */
	    	 Float result;
	    	 this.num = this.num * r.num;
	    	 this.den = this.den * r.den;
	     }
	     
	     
	     public void multiply_I(RationalNumber r) {
	    	 num = num * r.num;
	    	 den = den * r.den;
	     }
	     
	     public void multiply_II(RationalNumber r) {
	    	 this.num = this.num * r.num;
	    	 this.den = this.den * r.den;
	     }
	     
	     public void multiply_III(RationalNumber r) {
	     num = num * r.getNum();
	     den = den * r.getDen();	     
	     }
	     
	     /** @return the numerator
	      */
	      public int getNum() {
	    	  return this.num; 
	      }
	      
	      /** @return the denominator
	       */
	       public int getDen() {
	    	   return this.den;
	       }
	       
	       
	       public String toString() { 
	       	return (this.num +"/"+this.den); 
	       	}
}
