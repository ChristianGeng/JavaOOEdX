/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *
 */
public class StudentID {

	  private static int studentNum = 0;
	    public StudentID() {
	        studentNum++;
	    }
	    
	    public static int getStudentId() { // Klassenmethode
	        return studentNum;
	    }
}
