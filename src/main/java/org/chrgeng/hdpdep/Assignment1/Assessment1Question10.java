/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;
import java.util.ArrayList;;


/**
 * @author Christian
 *
 * Question 10
1 point possible (graded)
Consider the following code segment.

ArrayList < Integer >  numbers = new ArrayList < Integer > ();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.remove(2);
numbers.set(1, 0);
numbers.add(5);
numbers.remove(0);
System.out.println(numbers);

What is printed as a result of executing the code segment?
[0, 5]
[3, 5]
[1, 5]
[2, 5]
[5] 
 *
 *
 */
public class Assessment1Question10 {

	/**
	 * 
	 */
	public Assessment1Question10() {
		// TODO Auto-generated constructor stub
		
		ArrayList <Integer>  numbers = new ArrayList <Integer> ();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.remove(2);
		numbers.set(1, 0);
		numbers.add(5);
		numbers.remove(0);
		System.out.println(numbers);
		
	}

}
