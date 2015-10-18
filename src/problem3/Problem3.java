/**
 *	@author		Arshan Alam
 *
 *	Problem 3
 *
 *
 *	The prime factors of 13195 are 5, 7, 13 and 29.
 *	
 *	What is the largest prime factor of the number 600851475143 ?
 **/

package problem3;

class Problem3 {
	public static void main(String[] args) {
		// A list of prime numbers less than 200
		int primeNum[] = {
				2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
				43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
				103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163,
				167,173, 179, 181, 191, 193, 197, 199};
		
		long largestPrimeFactor = 0L;
		final long NUM = 600851475143L;
		long product = 1L;
		boolean found = false;
		
		/**
		 * Iterate through the prime numbers to check if we
		 * have found the largest prime factor
		 */
		for(int i = 0; i < primeNum.length; i++) {
			if(NUM % primeNum[i] == 0) {
				product *= primeNum[i];
				largestPrimeFactor = primeNum[i];
				if(product == NUM) {
					found = true;
					break;
				}
			}
		}
		
		/**
		 * If we did not find the largest prime factor in
		 * the pimreNum array, then start from the largest
		 * prime factor from the array, and find the largest
		 * prime fact for NUM.
		 */
		while(!found) {
			if(NUM % ++largestPrimeFactor == 0) {
				product *= largestPrimeFactor;
				if(product == NUM) {
					break;
				}
			}
		}
		
		System.out.println(largestPrimeFactor);
	}
}