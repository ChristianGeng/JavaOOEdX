package org.chrgeng.hdpdep;

/**
 * Links : http://selftechy.com/2011/05/17/junit4-before-vs-beforeclass-after-vs-afterclass
 */
import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.BeforeClass;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AssessmentQuestion1Test  extends TestCase {
/**
 * Create the test case.
 *
 * @param testName name of the test case
 */
	
public AssessmentQuestion1Test( String testName )
{
	super( testName );
}

int[][] trueAnswer;
	@BeforeClass
	private void setUpBeforeClass() {
	// TODO Auto-generated method stub
		trueAnswer = new int[][]{{44, 45, 16, 50},
			{16, 12, 66, 9},
			{52, 83, 3, 37},
			{56, 61, 69, 61}};
			Assessment1Question1 ta = new Assessment1Question1();
			ta.twoDimensions(trueAnswer);
}
	

	public void testA()
	{
			int[][] AnswerA = new int[][] 	{{44, 57, 16, 50},
				{68, 6, 69, 9},
				{26, 144, 1, 37},
				{56, 30, 69, 61}};
				assertFalse(Arrays.deepEquals(AnswerA, trueAnswer));	
	}


	public void testB()
	{
			int[][] AnswerB = new int[][] 	{{44, 45, 16, 50},
				{16, 12, 66, 9},
				{52, 83, 3, 37},
				{56, 61, 69, 61}};
				assertFalse(Arrays.deepEquals(AnswerB, trueAnswer));	
	}

	public void testC()
	{
			int[][] AnswerB = new int[][] 	{{89, 22, 66, 25},
				{16, 78, 33, 9},
				{135, 41, 40, 18},
				{56, 61, 69, 61}};
				assertFalse(Arrays.deepEquals(AnswerB, trueAnswer));	
	}

	public void testD()
	{
			int[][] AnswerB = new int[][] 	{{52, 45, 49, 50},
				{34, 53, 33, 9},
				{54, 41, 37, 37},
				{28, 61, 34, 61}};
				assertFalse(Arrays.deepEquals(AnswerB, trueAnswer));	
	}

	public void testE()
	{
			int [][] AnswerE = new int[][] {{60, 45, 82, 50},
				{60, 95, 33, 9},
				{82, 41, 72, 37},
				{28, 61, 34, 61}};
				assertTrue(Arrays.deepEquals(AnswerE, trueAnswer));	
	}
}

