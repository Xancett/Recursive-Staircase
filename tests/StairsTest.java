import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StairsTest {

	//================================================================================
    // First method test
    //================================================================================
	
	@Test
	void testNum1(){
		Stairs stairs = new Stairs();
		int n = 1;
		int result = stairs.num_steps(n);
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	void testNum2() {
		Stairs stairs = new Stairs();
		int n = 2;
		int result = stairs.num_steps(n);
		int expected = 2;
		assertEquals(expected, result);
	}
	
	@Test
	void testNum3() {
		Stairs stairs = new Stairs();
		int n = 3;
		int result = stairs.num_steps(n);
		int expected = 3;
		assertEquals(expected, result);
	}
	
	@Test
	void testNum4() {
		Stairs stairs = new Stairs();
		int n = 4;
		int result = stairs.num_steps(n);
		int expected = 5;
		assertEquals(expected, result);
	}
	
	@Test
	void testNum5() {
		Stairs stairs = new Stairs();
		int n = 5;
		int result = stairs.num_steps(n);
		int expected = 8;
		assertEquals(expected, result);
	}
	
	@Test
	void testNum0() {
		Stairs stairs = new Stairs();
		int n = 0;
		int result = stairs.num_steps(n);
		int expected = 0;
		assertEquals(expected, result);
	}
	
	@Test
	void testNumNeg4() {
		Stairs stairs = new Stairs();
		int n = -4;
		int result = stairs.num_steps(n);
		int expected = -1;
		assertEquals(expected, result);
	}
	
	
	//================================================================================
    // Second method test
    //================================================================================
	
	// Initial tests of previous data sets
	@Test
	void test2Num5() {
		Stairs stairs = new Stairs();
		int n = 5;
		int[] myArray = {1, 2};
		int result = stairs.num_steps(n, myArray);
		int expected = 8;
		assertEquals(expected, result);
	}
	
	@Test
	void test2Num4() {
		Stairs stairs = new Stairs();
		int n = 4;
		int[] myArray = {1, 2, 5, 7};
		int result = stairs.num_steps(n, myArray);
		int expected = 5;
		assertEquals(expected, result);
	}
	
	@Test
	void test2Num8() {
		Stairs stairs = new Stairs();
		int n = 9;
		int[] myArray = {2, 3, 7, 9};
		int result = stairs.num_steps(n, myArray);
		int expected = 8;
		assertEquals(expected, result);
	}
}
