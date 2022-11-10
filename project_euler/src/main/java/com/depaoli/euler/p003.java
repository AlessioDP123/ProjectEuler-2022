package com.depaoli.euler;
/** https://projecteuler.net/problem=03
 * solution in Java
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *  
 * if java is installed, then run by:
 * java ./p003.java
 * 
 * Answer:  6857
 */
class p003 {
    public static void main(String args[]) {

        System.out.println("Euler problem #003 solution");
        long n = 600851475143L;
		System.out.println("result from algorithm: " + Long.toString(largestFactor(n)));
        
    }

    // Returns the largest factor of n. The result is always prime.
	public static long largestFactor(long n) {
		while (true) {
			long l = smallestFactor(n);
			if (l < n)
				n /= l;
			else
                 return n;
		}
	}

    // Returns the smallest factor of n, which is in the range [2, n]. The result is always prime.
	public static long smallestFactor(long n) {
		if (n <= 1)
			throw new IllegalArgumentException("n must be greater than zero");
		for (long x = 2, y = (long) Math.sqrt(n); x <= y; x++) {
			if (n % x == 0)
				return x;
		}
		return n;  // n itself is prime
	}
}