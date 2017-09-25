/**
 * 
 */
package org.chrgeng.hdpdep.Assignment3;

/**
 * @author christian
 *
 *
 *Assessment
Question 1
1 point possible (graded)
Truck is a subclass of Vehicle, and neither of them is abstract. Which of the following is an invalid declaration and initialization?
Truck t = new Vehicle();
All of the above are valid.
Vehicle v = new Vehicle();
Vehicle v = new Truck();
Truck t = new Truck();
 *
 */
public class Assessment3Question1 {
	public Assessment3Question1(){
		//Truck t = new Vehicle();
		//All of the above are valid.
		Vehicle v = new Vehicle();
		Vehicle v1 = new Truck();
		Truck t2 = new Truck(); 
	}
}
