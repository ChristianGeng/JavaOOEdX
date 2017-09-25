/**
 * 
 */
package org.chrgeng.hdpdep.Assignment3;

/**
 * @author christian
 *
 *
 * Question 6
 * 1 point possible (graded)
 * 
 * Consider the following class definitions.
 * 
 * public class Farmer {
 *    private String crop;
 * 
 *     public Farmer(String crop) {
 *         this.crop = crop;
 *     }
 *     public void setCrop(String crop) {
 *         this.crop = crop;
 *     }
 *     public String getCrop() {
 *         return crop;
 *     }
 *     public static void Farm() {
 *         System.out.println("Work the land. Feed the world");
 *     }
 * }
 * 
 * public class Bob extends Farmer {
 *     private String emotionalState;
 * 
 *     public Bob(String emotionalState, String crop) {
 *         super(crop);
 *         this.emotionalState = emotionalState;
 *     }
 *     public void getRaise() {
 *         System.out.println("gimme a raise!");
 *     }
 *     public String getEmotionalState() {
 *         return emotionalState;
 *    }
 *    public void setEmotionalState(String emotionalSate) {
 *         this.emotionalState = new String(emotionalState);
 *     }
 * }
 * 
 * public class Economy {
 *     public static void main(String[] args) {
 *         Bob Joe = new Bob("happy", "cheese");
 *         Bob Jim = Joe;
 *         Joe.setCrop("not telling");
 *         Jim.setEmotionalState("disillusioned");
 *         System.out.println(Joe.getEmotionalState());
 *         System.out.println(Jim.getEmotionalState());
 *         System.out.println(Jim.getCrop());
 *     }
 * }
 *
 * happy
 * disillusioned
 * not telling
 * 
 * disillusioned
 * disillusioned
 * cheese
 * 
 * happy
 * disillusioned
 * cheese
 * 
 * disillusioned
 * disillusioned
 * not telling
 * 
 * happy
 * happy
 * not telling
 *
 */


public class Assessment3Question6 {

	public Assessment3Question6() {

		Bob Joe = new Bob("happy", "cheese");
		Bob Jim = Joe;
		Joe.setCrop("not telling");
		Jim.setEmotionalState("disillusioned");
		System.out.println(Joe.getEmotionalState());
		System.out.println(Jim.getEmotionalState());
		System.out.println(Jim.getCrop());
	}
}
