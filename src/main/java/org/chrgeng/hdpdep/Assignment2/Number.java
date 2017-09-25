/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *
 */
public class Number {

	private int value;

	
    public Number() { 
    	value = 0; 
    	}
    
    public Number(int num) 
    { 
    	value = num; 
    	}
    
    
    public void setVal(int n) 
    { 
    	value = n;
    }
    
    public String toString() { 
    	return ("Number: " + value); 
    	}
    

}
