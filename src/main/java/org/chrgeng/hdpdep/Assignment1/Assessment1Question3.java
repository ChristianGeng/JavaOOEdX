/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

/**
 * @author Christian
 *
 *
 * Question 3
1 point possible (graded)
Consider the following code segment.

int[] anArray = new int[4];
anArray[0] = 4;
anArray[1] = 6;
anArray[2] = 7;
anArray[3] = 3;
for(int j = 0; j < anArray.length; j++){
    System.out.print(anArray[j] + " ");
}

Which of the following statements about the code segment are true?
It produces only some of the contents of the array as output
It results in a runtime error
It produces all of the contents of the array in order as output
It fails to compile.
It produces only the odd number elements’ content as output.


 */
public class Assessment1Question3 {


	public void machet() {
		int[] anArray = new int[4];
		anArray[0] = 4;
		anArray[1] = 6;
		anArray[2] = 7;
		anArray[3] = 3;
		for(int j = 0; j < anArray.length; j++){
			System.out.print(anArray[j] + " ");
		}
	}


	public Assessment1Question3() {
		machet();
	}

}
