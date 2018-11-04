package task1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class testMassive {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class fixation");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class fixation \n");
	}
	@Before
	public void before() {
		System.out.println("Before test fixation \n");
	}
	@After
	public void after() {
		System.out.println("After test fixation");
	}
	
	@Test(expected = InputMismatchException.class)
	public void keyboardInputNegativeTest() {
		Massive massive = new Massive();
		int actualResult = massive.keyboardInputInt();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void keyboardInputPositiveTest() {
		Massive massive = new Massive();
		int actualResult = massive.keyboardInputInt();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

	@Ignore
	@Test
	public void fillingInArrayRandomlyTest() {
		System.out.println("This test is ignored");
	}

	@Test
	public void fillingInArrayByKeybordTest() {
		Massive massive = new Massive();
		int arrayLength = 5;
		int actualArray[] = new int[arrayLength];
		actualArray = massive.fillingInArrayByKeybord(actualArray);
		int expectedArray[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void fillingInArrayByKeybordWithAssertTrueTest2() {
		Massive massive = new Massive();
		int arrayLength = 5;
		int actualArray[] = new int[arrayLength];
		actualArray = massive.fillingInArrayByKeybord(actualArray);
		assertTrue(actualArray[2] == 3);
	}
	
	@Test
	public void fillingInArrayByKeybordUsingAssertThatTest() {
		Massive massive = new Massive();
		int arrayLength = 5;
		int actualArray[] = new int[arrayLength];
		actualArray = massive.fillingInArrayByKeybord(actualArray);
		int expectedArray[] = { 1, 2, 3, 4, 5 };
		assertThat(actualArray, is(expectedArray));
	}
	
	@Test
	public void arrayMultiplicationTest() {
		Massive massive = new Massive();
		int array[] = { 1, 2, 3, 4, 5 };
		int actualResult = massive.arrayMultiplication(array);
		int expectedResult = 120;
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void arrayMultiplicationUsingAssertThatTest() {
		Massive massive = new Massive();
		int array[] = { 1, 2, 3, 4, 5 };
		int actualResult = massive.arrayMultiplication(array);
		int expectedResult = 120;
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void replaceAdjacentElementsTest() {
		Massive massive = new Massive();
		int array[] = { 1, 2, 3, 4, 5 };
		int result = massive.arrayMultiplication(array);
		assertThat(result, is(120));
	}
	
	@Test
	public void replaceAdjacentElementsUsingAssertThatTest() {
		Massive massive = new Massive();
		int actualArray[] = { 1, 2, 3, 4, 5 };
		actualArray = massive.replaceAdjacentElements(actualArray);
		assertThat(Arrays.toString(actualArray), is("[2, 1, 4, 3, 5]"));
	}
	

	
	
}
