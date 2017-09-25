/**
 * 
 */
package org.chrgeng.hdpdep.Assignment3;

/**
 * @author christian
 *
 *         Question 3 1 point possible (graded)
 * 
 *         The following object declarations have been proposed. Which of these
 *         object declarations will cause a compile-time error?
 * 
 *         I.
 * 
 *         String foo = new String("Foo");
 * 
 *         II.
 * 
 *         Char foo = new String("Foo");
 * 
 *         III.
 * 
 *         String foo = "Foo";
 * 
 *         II only 
 *         I and II 
 *         III only 
 *         I and III 
 *         I only
 *
 */
public class Assessment3Question3 {

	public Assessment3Question3(){
	
	String foo1 = new String("Foo1");
	System.out.println("foo1: "+foo1);
	//Char foo2 = new String("Foo");
	String foo3 = "Foo3";
	System.out.println("foo3: "+foo3);
	
	
	}

	
}
