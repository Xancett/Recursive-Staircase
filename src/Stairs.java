import java.util.Arrays;


/**
 * @author Ryan James
 *
 */
public class Stairs {
	
	/**
	 * Returns the number of combinations to take stairs for n steps
	 * @param n steps
	 * @return
	 */
	public int num_steps(int n) {
		// Initial check for more than 0 steps
		if (n < 0) return -1;
		// Check for 0 steps
		if (n == 0) return 0;
		// Check for steps
		if (n == 1) {
			return (int)Math.pow(1, n - 2);
		}
		if (n == 2) {
			return (int)(Math.pow(1, n - 2) + Math.pow(2, n - 2));
		}
		int totalCount = num_steps(n - 1) + num_steps(n - 2);
		return totalCount;
	}
	public int num_steps(int n, int[] x) {
		// Initial check for 0 steps
		if (n < 0) { return -1; }
		if (n == 0) { return 1; }
		// First sort the initial array
		Arrays.sort(x);
		int totalCount = 0;
		for (int i = 0; i < x.length; i++) {
			if (n - x[i] >= 0) {
				totalCount += num_steps(n - x[i], x);
			}
		}
		return totalCount;
	}
}
