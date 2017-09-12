package org.chrgeng.hdpdep;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */



public class App 
{	
 	public static void twoDimensionsM(int[][] numbers){
	    for (int i = 0; i < numbers.length - 1; i++){
	        for (int j = 0; j < numbers[i].length - 1; j++){
	            if (numbers[i][j] < numbers[i][j + 1]){
	                numbers[i][j] = numbers[i][j] + numbers[i + 1][j];
	                numbers[i + 1][j] = numbers[i + 1][j] / 2;
	            }
	        }
	    }
	}
 	
 	public static void printTwoDimensionsM(int[][]number) {
 		for (int i = 0; i < number.length; i++) {
        	System.out.println(Arrays.toString(number[i]));
        }
 	}
	
    public static void main( String[] args )
    {
    	
    	int[][] trueAnswer = new int[][]  	{{44, 45, 16, 50},
    		 						{16, 12, 66, 9},
    		 						{52, 83, 3, 37},
    		 						{56, 61, 69, 61}};
    	
    	//twoDimensionsM(trueAnswer); // call by ref calculation of arrays
    	
    	/* (A) should be wrong */
    	int[][] AnswerA = new int[][] 	{{44, 57, 16, 50},
							    		{68, 6, 69, 9},
							    		{26, 144, 1, 37},
							    		{56, 30, 69, 61}};
    		 
    		 
							    		
    	/* (E) should be right */
		int [][] AnswerE = new int[][] {{60, 45, 82, 50},
			 					   {60, 95, 33, 9},
			 					   {82, 41, 72, 37},
			 					   {28, 61, 34, 61}};
    	
			 					   
		System.out.println(Arrays.deepEquals(AnswerA, trueAnswer));    		 
    	System.out.println(Arrays.deepEquals(AnswerE, trueAnswer));
    	assert(Arrays.deepEquals(AnswerE, trueAnswer));
    	
    	Assessment1Question1 ass = new Assessment1Question1();
    	ass.twoDimensions(trueAnswer);
    	ass.printTwoDimensions(trueAnswer);
    		 						
    	//printTwoDimensions(a);
    	
    	
    	
    	
    	//printTwoDimensions(trueAnswer);
    	
        
        

       
        


    }
}
