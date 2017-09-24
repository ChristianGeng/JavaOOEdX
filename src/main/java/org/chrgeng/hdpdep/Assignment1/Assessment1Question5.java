/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

/**
 * @author Christian
 *
 * Question 5
1 point possible (graded)
Consider the following code.

    int[] nums = {5, 3, 6, 8, 11, 2};
    change(nums);
}
public static void change (int[] arr) {
    int k = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (k < arr[i]) {
            arr[0] = arr[i];
            arr[i] = k;
            k = arr[0];
        }
    }
}

Which of the following represents the array nums after being passed through the given method?
{11, 3, 5, 6, 8, 2}
{2, 3, 5, 6, 8, 11}
{11, 3, 6, 8, 5, 2}
{2, 3, 6, 8, 11, 5}
{2, 5, 6, 8, 11, 3} 

 */
public class Assessment1Question5 {

	public static void change (int[] arr) {
	    int k = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	        if (k < arr[i]) {
	            arr[0] = arr[i];
	            arr[i] = k;
	            k = arr[0];
	        }
	    }
	}

	public Assessment1Question5() {
		// TODO Auto-generated constructor stub
		int[] nums = {5, 3, 6, 8, 11, 2};
	    change(nums);
	    for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	    
	}

}
