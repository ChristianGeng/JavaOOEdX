/**
 * 
 */
package org.chrgeng.hdpdep.Assignment1;

import java.util.ArrayList;

/**
 * @author Christian
 * Question 4
1 point possible (graded)
You have an ArrayList called idList that adds a unique user id whenever someone signs up for your website.

Which of these choices will print all of the indexes and the unique user id with a space in between them starting at the first index?

for (int i = 1; i < idList.size(); i++) {
    System.out.println(i - 1  + " " + idList.get(i));
}

B and C

for (String uuid : idList) {
    System.out.println(uuid);
}

for (int i = 0; i < idList.size() - 1; i++) {
    System.out.println(i  + " " + idList[i]);
}

for (int i = 0; i < idList.size(); i++) {
    System.out.println(i  + " " + idList.get(i));
}

unanswered
You have used 0 of 1 attempt 


 *
 *
 */




public class Assessment1Question4 {

	public void machet1(ArrayList<String>idList){
		System.out.println("Alternative 1");
		for (int i = 1; i < idList.size(); i++) {
		    System.out.println(i - 1  + " " + idList.get(i));
		}
	}
	
	public void machet2(ArrayList<String>idList){
		System.out.println("Alternative 2");
		for (String uuid : idList) {
		    System.out.println(uuid);
		}
		}
	
	public void machet3(ArrayList<String>idList) {
		System.out.println("Alternative 3");
		System.out.println(".. compiliert nicht mal ... ");
		for (int i = 0; i < idList.size() - 1; i++) {
		    //System.out.println(i  + " " + idList[i]);
		}
		
	}
	
	public void machet4(ArrayList<String>idList) {
		System.out.println("Alternative 4");
		for (int i = 0; i < idList.size(); i++) {
			System.out.println(i  + " " + idList.get(i));
		}
	}
	

    
	
	/**
	 * 
	 */
	public Assessment1Question4() {
		//TODO Auto-generated constructor stub
		//private List<int> tt = new ArrayList<int>();
		//ArrayList m_bilder = new ArrayList<int>(10);
		//ArrayList<Integer>  = new ArrayList<Integer>();
		ArrayList<String> idList = new ArrayList<String>();
		idList.add("1");
		idList.add("2");
		idList.add("3");
		idList.add("7");
	
		machet1(idList);
		machet2(idList);
		machet3(idList);
		machet4(idList);
	
	}

}
