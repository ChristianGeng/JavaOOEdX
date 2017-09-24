/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

import java.util.Arrays;

/**
 * @author Christian
 * 	
 * Consider the following code segment.

	int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
	        if (arr[i][j] % 2 == 0) {
	            System.out.println(arr[i][j]);
	        }
	    }
	}

	Which of the following statements about the code segment is true?
	It outputs only the odd values of the array
	It results in an ArrayIndexOutOfBoundsException
	It produces no output
	It fails to compile
	It outputs only the even values of the array
	unanswered
	You have used 0 of 1 attempt 

 */
public class Assessment1Question2 {
	public  void  machet(){
		int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
				}
			}
		}

	}
}
