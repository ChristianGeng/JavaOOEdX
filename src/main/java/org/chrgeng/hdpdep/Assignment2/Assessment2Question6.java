/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *
 *
 *  Question 6
1 point possible (graded)

Consider the following class declaration:

public class StudentID {
    private static int studentNum = 0;
    public StudentID() {
        studentNum++;
    }
    Rest not shows
}

What will be the value of studentNum as a result of the following code?

StudentID a = new StudentID();
StudentID b = new StudentID();

0
3
1
2
-1 
 *
 *
 */
public class Assessment2Question6 {
	public Assessment2Question6(){
		StudentID a = new StudentID();
		StudentID b = new StudentID();
		System.out.println("using static method to get solution which is "+StudentID.getStudentId());
		
	}
}
