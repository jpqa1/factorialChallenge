package factorialChallenge;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(isFactorial(18));

	}

	public static String isFactorial(int num) {

		for (int x = 2; x <= num; x++) {
			if (num / x == 1) {
				return "Factorial: " + x;
			} else if (num % x == 0) {
				num = num / x;
			}

		}

		return "none";

	}

}
