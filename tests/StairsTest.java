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
		assertEquals(result, expected);
	}
	
	@Test
	void testNum2() {
		Stairs stairs = new Stairs();
		int n = 2;
		int result = stairs.num_steps(n);
		int expected = 2;
		assertEquals(result, expected);
	}
	
	@Test
	void testNum3() {
		Stairs stairs = new Stairs();
		int n = 3;
		int result = stairs.num_steps(n);
		int expected = 3;
		assertEquals(result, expected);
	}
	
	@Test
	void testNum4() {
		Stairs stairs = new Stairs();
		int n = 4;
		int result = stairs.num_steps(n);
		int expected = 6;
		assertEquals(result, expected);
	}
	
	@Test
	void testNum0() {
		Stairs stairs = new Stairs();
		int n = 0;
		int result = stairs.num_steps(n);
		int expected = 0;
		assertEquals(result, expected);
	}
	
	@Test
	void testNumNeg4() {
		Stairs stairs = new Stairs();
		int n = -4;
		int result = stairs.num_steps(n);
		int expected = -1;
		assertEquals(result, expected);
	}
	
	
	//================================================================================
    // Second method test
    //================================================================================
}
