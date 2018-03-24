package basics;



public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		System.out.println("Sums:");
		for (int i = 0; i <= 10000; i++) {
			System.out.println("Sum of " + i + " + all numbers from 1 = " + sum(i));
		}
		System.out.println("Sums End.");
		System.out.println("Factorial:");
		for (int i = 0; i <= 10; i++) {
			System.out.println("!" + i + " = " + factorial(i));
		}
		System.out.println("Factorial End.");
		System.out.println("End");

		int[] test_arr = { 10, 20, 30, 40, 50,-656, 789, 82374, -9987 };

		System.out.println("min: " + minValueOf(test_arr));
		System.out.println("max: " + maxValueOf(test_arr));
		System.out.println("avg: " + avgValueOf(test_arr));

	}

	public static int sum(int s) {
		if (s <= 1) {
			return s; // Needed in case of negative input, to avoid StackOverflow...
		}
		return (s + sum(s - 1));
	}

	public static int factorial(int f) {
		if (f <= 1) {
			return 1;
		}
		return (f * factorial(f - 1));
	}

	public static int minValueOf(int[] n) {
		int min_num = Integer.MAX_VALUE;

		for (int i = 0; i < n.length; i++) {
			if (min_num > n[i]) {
				min_num = n[i];
			}
		}
		return min_num;
	}

	public static int maxValueOf(int[] n) {
		int max_num = Integer.MIN_VALUE;

		for (int i = 0; i < n.length; i++) {
			if (max_num < n[i]) {
				max_num = n[i];
			}
		}
		return max_num;
	}

	public static int avgValueOf(int[] n) {
		int sum_num = 0;

		for (int i = 0; i < n.length; i++) {
			sum_num += n[i];
		}
		return sum_num / n.length;
	}

}
