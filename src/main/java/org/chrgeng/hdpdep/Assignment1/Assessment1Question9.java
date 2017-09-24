/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;


import java.util.ArrayList;

/**
 * @author Christian
 *
 *Which of the following code segments correctly prints the entire contents of a 2D array?
I.

for (int j = 0; j < twoDArray.length; j++) {
    for(int i = 0; i < twoDArray[0].length; i++) {
        System.out.print(twoDArray[j][i] + " ");
    }
}

II.


System.out.println(Arrays.toString(twoDArray);

III.


System.out.println(twoDArray[0][0] + twoDArray[0][1] + twoDArray[1][0] + twoDArray[1][1]);

For which of the expressions will the main method work as intended?
II only
I, II, and III
I and II only
I and III only
I only 
 *
 */
public class Assessment1Question9 {

	/**
	 * 
	 */
	public Assessment1Question9() {
		// TODO Auto-generated constructor stub
		
		int [][] twoDArray = new int[][] {{60, 45, 82, 50},
											{60, 95, 33, 9},
											{82, 41, 72, 37},
											{28, 61, 34, 61}};
			
			for (int j = 0; j < twoDArray.length; j++) {
			    for(int i = 0; i < twoDArray[0].length; i++) {
			        System.out.print(twoDArray[j][i] + " ");
			    }
			}
			System.out.println("\n");
//			System.out.println(Arrays.toString(twoDArray);
			
			System.out.println(twoDArray[0][0] + twoDArray[0][1] + twoDArray[1][0] + twoDArray[1][1]);
			
	}

}

