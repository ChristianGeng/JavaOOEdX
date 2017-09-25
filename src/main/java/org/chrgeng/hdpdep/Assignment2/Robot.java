/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;


public class Robot {
    private boolean fuelEmpty = true;
    private int roboID;
    private String greeting;
    private String securityProtocol;

    //insert robot constructor here
    
    // A
    public Robot(boolean full, int id, String greet, String proto) {
        roboID = id;
        greeting = greet;
        fuelEmpty = full;
        securityProtocol = proto;
    }
    
    /*  B1
    public Robot(int id, String greet) {
        roboID = id;
        greeting = greet;
    }
    */

    // B2 signatur ist doppelt  
   public Robot(int id, String greet) {
        roboID = id;
        greeting = greet;
        fuelEmpty = false;
    }

    // C
    public Robot(String greet) {
        greeting = greet;
    }

    // D) geht auch alles
    public Robot(int id) {
        roboID = id;
    }

    
    

    public void destroyAllHumans(){
    	System.out.println("destroyAllHumans: robot would destroy if fuelempty was set  true");
        while (fuelEmpty == false) {
        	System.out.println("robot begins to destroy all humans");
        }
    }
    
    
    public int getRoboID(){
        return roboID;
    }
    public void greet(){
        System.out.println(greeting);
    }
    public void setSecurityProtocol(String proto){
        securityProtocol = proto;
    }


    
    /* added methods */
    
    public String toString() { 
    	return ("\nroboID: "+ this.roboID +"\ngreeting "+this.greeting+"\nfuelEmpty = "+this.fuelEmpty+"\nsecurityProtocol : "+ this.securityProtocol); 
    }
    


    
    
    
}