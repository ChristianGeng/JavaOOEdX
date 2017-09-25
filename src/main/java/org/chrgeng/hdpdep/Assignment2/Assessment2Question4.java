/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

/**
 * @author christian
 *
 *
 * 1 point possible (graded)
Consider the following class

You can add an optional tip or note related to the prompt like this.

public class Dog {
    private int age;
    private String name;

    public Dog (int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Dog (String name) {
        this.age = 0;
        this.name = name;
    }
}

Which of the below statements will execute without an error?
I.

Dog dog1 = new Dog(“Max”, 8);

II.

Dog dog2 = new Dog(“15”, “Toby”)

III.

Dog dog3 = new Dog(“Gus”);

III only
I, II, and III
I and II only
II and III only
I 
 *
 */
public class Assessment2Question4 {

/*
	Constructor-Signaturen:
		(a) int age, String name
		(b) String name
*/	 
		
	// Dog dog1 = new Dog("Max", 8); - falsch
//	Dog dog2 = new Dog("15", "Toby"); - kein constructor nimmt 2 strings
	
	public Assessment2Question4(){
	Dog dog3 = new Dog("Gus"); 
	System.out.println(dog3);
	}

	
	
	
}
