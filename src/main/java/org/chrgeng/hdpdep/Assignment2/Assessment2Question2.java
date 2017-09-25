/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *
 *         Question 2 1 point possible (graded) 
 *         What code is necceary in place
 *         of \/*missing code *\/to print the firstNum Number object properly?
 *         
 *         firstNum 
 *         Number.toString()
 *         firstNum.value() 
 *         firstNum.toString() 
 *         value
 *
 *
 */
public class Assessment2Question2 {
	
	public Assessment2Question2() {
	Number firstNum = new Number();
	System.out.println("(a)  "+firstNum);
	System.out.println("(b)  Number.toString() - compile time error");
	System.out.println("(c)  firstNum.value()  - error: value is private");
	System.out.println("(d)  "+firstNum.toString());
	System.out.println("(e)  "+"value - compile time error");
	
	
	}


}
