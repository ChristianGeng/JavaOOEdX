/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

/**
 * @author Christian
 *
 *
 *Consider the following code segment.


int[] values = {1, 4, -7, -3};

public static void multiply(int[] values, int amount) {
    for (int i = 0; i < values.length; i++) {
        values[i] = values[i] + amount;
    }
}

What are the results in values after multiply(values, 2) is called?
The code never stops executing due to an infinite loop
{3, 6, -5, -1}
{2, 8,-14, -6}
{1, 4, -7, -3}

 *
 */
public class Assessment1Question8 {

	public static void amultiply(int[] values, int amount) {
	    for (int i = 0; i < values.length; i++) {
	        values[i] = values[i] + amount;
	    }
	}

	
	public Assessment1Question8() {
		// TODO Auto-generated constructor stub
		
		int[] values = {1, 4, -7, -3};
		amultiply(values, 2);
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]+" ");
		}

		
	}

}
