package com.depaoli.euler;
/** https://projecteuler.net/problem=21
 * solution in Java
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n). 
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 *  
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000
 * 
 * if java is installed, then run by:
 * java ./p021.java
 * 
 * Answer:  31626
 */
class p021 {
    public static void main(String args[]) {

        System.out.println("Euler problem #021 solution");
		int res = 0;
		res = evaluateSum(res);
		System.out.println("result from algorithm: " + Integer.toString(res));
        
    }

	public static int evaluateSum(int sum) {

		for (int i = 1; i < 10000; i++) {  // Evaluate the sum of all the amicable numbers under 10000
			if (isAmicableNum(i))
				sum = sum + i;
		}
		
		return sum;
	}


    public static boolean isAmicableNum(int n) {

		int x = divisorSum(n);
		int y = divisorSum(x);

		return x != n && y == n;
	}

	private static int divisorSum(int d) {

		int sum = 0;
		for (int i = 1; i <= d / 2; i++) {
			if (d % i == 0)
				sum = sum + i;
		}
		return sum;
	}
}