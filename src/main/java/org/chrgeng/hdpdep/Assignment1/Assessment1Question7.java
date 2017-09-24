/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

/**
 * @author Christian
 *
 *
 *
 * Question 7
1 point possible (graded)
Consider the following 2-D array.

String[][] set = {{"Hello", "world!"} {"world", "Hello"} {"Hello", "!", "Hello"}};

The following code segments have been proposed.

I.


String hello = set[0][1] + set[1][0];

II.


String hello = set[1][1] + set[0][1];

III.


String hello = set[1][1] + set[1][0] + set[2][1];

Which of these code segments will create a String “Hello world!”?
II only
II and III only
III only
I and III only
I only 

 */
public class Assessment1Question7 {

	/**
	 * 
	 */
	public Assessment1Question7() {
		// TODO Auto-generated constructor stub
		String[][] set = {{"Hello", "world!"}, {"world", "Hello"}, {"Hello", "!", "Hello"}};
		System.out.println("I.: "+set[0][1] + set[1][0]);
		System.out.println("II: "+set[1][1] + set[0][1]);
		System.out.println("III: "+set[1][1] + set[1][0] + set[2][1]);
	}

}
