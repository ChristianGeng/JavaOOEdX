/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

/**
 * @author Christian
 * 
 *  Question 6
1 point possible (graded)
Consider the following code segment.

int[] array = new int[10];
array[10] = 5;

Which of the following statements about the code segment is true?
The integer value 10 will be assigned to the fifth index in the array.
This code will result in a run-time error.
The integer value 10 will be assigned to the sixth index in the array.
This code will result in a compile-time error.
The integer value 5 will be assigned to the last index in the array.

 *
 */
public class Assessment1Question6 {


	public int[] doit() throws ArrayIndexOutOfBoundsException{
		int[] array = new int[10];
		array[10] = 5;
		return array;
	}

	public Assessment1Question6() {
		// TODO Auto-generated constructor stub
		/* try {
			int[] testarr= doit();
		} catch (Exception e) {
			System.err.println(" Zugriff ueber Array-Grenzen hinaus!\n");
		}
		*/
		int[] testarr= doit();
	}

}
