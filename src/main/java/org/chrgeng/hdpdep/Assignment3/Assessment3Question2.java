/**
 * 
 */
package org.chrgeng.hdpdep.Assignment3;

/**
 * @author christian
 * 
 * 
 *         Question 2 1 point possible (graded)
 *
 * 
 * 
 *         Consider the following classes:
 * 
 *         public class Sum { public int doCalc() { return 10; }
 * 
 *         public int doAnotherCalc() { return 20; } } public class BigSum
 *         extends Sum { public int doCalc() { int x = super.doCalc(); return x
 *         + doAnotherCalc(); }
 * 
 *         public int doAnotherCalc() { return 100; } }
 * 
 *         What is displayed to the console after the following code segment
 *         executes:
 * 
 *         Sum s = new BigSum(); System.out.println(s.doCalc());
 * 
 *         110 100 10 20 30 unanswered You have used 0 of 1 attempt Some
 *         problems have options such as save, reset, hints, or show answer.
 *         These options follow the Submit button.
 * 
 *
 * 
 */

public class Assessment3Question2 {
	public Assessment3Question2(){
		
		Sum s = new BigSum();
		System.out.println("Final Result: "+s.doCalc());
		
	}
}
