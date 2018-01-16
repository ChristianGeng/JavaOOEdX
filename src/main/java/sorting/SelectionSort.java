package sorting;


import java.util.Arrays;

public class SelectionSort {

	
	static void selectionSort(int[] lst) {
		System.out.println("initially: "+Arrays.toString(lst));
	    // get the length
	    int n = lst.length;
	    for (int i = 0; i < n; i++) {
	        int index = 0;
	        int smallest = lst[i];
	        for (int j = i; j < n; j++) {
	            if (lst[j] < smallest) {
	                smallest = lst[j];
	                index = j;
	            }
	        
	        int temp = lst[i];
	        lst[i] = smallest;
	        lst[index] = temp;
	    }
	        System.out.println("interation "+i+" "+Arrays.toString(lst));
	   } 
	    System.out.println("sorted: "+Arrays.toString(lst));
	}
	
	
	public SelectionSort(int[] lst) {
		selectionSort(lst);
	}
	
}
