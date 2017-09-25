/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 * 
 * 
 *         Which of the following constructors creates an object that may
 *         immediately use all its methods without error?
 * 
 * 
 *         a) public Robot(boolean full, int id, String greet, String proto)
 *         { roboID = id; greeting = greet; fuelEmpty = full; securityProtocol =
 *         proto; }
 * 
 * 
 *         b) public Robot(int id, String greet) { roboID = id; greeting =
 *         greet; }
 * 
 *         c) public Robot(int id, String greet) { roboID = id; greeting = greet;
 *         fuelEmpty = false; }
 * 
 *         d) public Robot(String greet) { greeting = greet; }
 * 
 *         e) public Robot(int id) { roboID = id; }
 * 
 * 
 *
 * 
 */
public class Assessment2Question5 {

	Assessment2Question5(){
		boolean full=true;
		int id = 1;
		String greet = "servas!";
		String proto = "??";
		
		// A) OK
		//Robot robocop = new Robot(full, id, greet, proto);
		// B1) OK 
		// Man könnte denken, dass setSecurityProtocol vielleicht schwierig werden 
		// könnte, aber nein: null
		// Robot robocop = new Robot(id, greet);
		//B2)  OK- geht aber in die endlosschleife
		// Robot robocop = new Robot(id, greet);
		// C) OK. ID ist nur 0, aber ok
		// Robot robocop = new Robot(greet);
		// D) ok, weil das erste Arg einen anderen Typ hat ... 
		Robot robocop = new Robot(id);
		
		
		robocop.destroyAllHumans();
		System.out.println(robocop.getRoboID());
		robocop.greet();
		robocop.setSecurityProtocol("aa");
		System.out.println(robocop.toString());
		
		
		
		
		// destroyAllHumans - uses fuelEmpty == false in while loop	
		// public int getRoboID() - uses roboID
		// public void greet(){ - uses greet 
		// setSecurityProtocol (set securityProtocol)
	}
}
