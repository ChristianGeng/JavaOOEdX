/**
 * 
 */
package org.chrgeng.hdpdep.Assignment2;

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

    public String toString() { 
       	return ("My name is "+this.name+" and I am "+this.age+" years old!"); 
       	}


}