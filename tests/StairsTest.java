import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StairsTest {

	@Test
	void testNum2() {
		Stairs stairs = new Stairs();
		int n = 2;
		int result = stairs.num_steps(2);
		int expected = 0;
		assertEquals(result, expected);
	}

}
