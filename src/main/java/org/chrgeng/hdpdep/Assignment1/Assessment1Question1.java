package org.chrgeng.hdpdep.Assignment1;

import java.util.Arrays;

public class Assessment1Question1 {
	/* */

	
	public  int[][] twoDimensionsRet(int[][] numbers){
	    
		
		
		for (int i = 0; i < numbers.length - 1; i++){
	        for (int j = 0; j < numbers[i].length - 1; j++){
	            if (numbers[i][j] < numbers[i][j + 1]){
	                numbers[i][j] = numbers[i][j] + numbers[i + 1][j];
	                numbers[i + 1][j] = numbers[i + 1][j] / 2;
	            }
	        }
	    }
	
		return numbers;
	}

	
	
	public  void twoDimensions(int[][] numbers){
	    for (int i = 0; i < numbers.length - 1; i++){
	        for (int j = 0; j < numbers[i].length - 1; j++){
	            if (numbers[i][j] < numbers[i][j + 1]){
	                numbers[i][j] = numbers[i][j] + numbers[i + 1][j];
	                numbers[i + 1][j] = numbers[i + 1][j] / 2;
	            }
	        }
	    }
	}
	
	
	public static void printTwoDimensions(int[][]number) {
 		for (int i = 0; i < number.length; i++) {
        	System.out.println(Arrays.toString(number[i]));
        }
 	}
	
	
}
