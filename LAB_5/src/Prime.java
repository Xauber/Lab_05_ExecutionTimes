import java.util.Random;


public class Prime {

	public static void main(String[] args) {
		
		//System.out.println(814959254041L + ": ");
		//isPrime(814959254041L);
		
		//20 bit Zahlen: 524288 - 1048776
		System.out.println("20 bit Values:");
		randomizer(524288l, 1048776l);
		
		//20 bit Zahlen: 549755813888 - 1099511627776
		System.out.println("\n40 bit Values:");
		randomizer(549755813888l, 1099511627776l);
	}
	
	/**
	 * 
	 * @param a lowest possible random value
	 * @param b highest possible random value
	 */
	public static void randomizer(long a, long b) {
		long[] nums = new long[100];
		for(int i = 0; i < nums.length; i++) {
			
			long x = a + (long) (Math.random() * (b - a));
			nums[i] = x;
		}
		long startTime = System.nanoTime();
		for(int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i] + ": " + isPrime(nums[i]));
			
			}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		double ms = totalTime / 1000000.;
		System.out.println("Time: " + ms + "[ms]");
	}

	public static boolean isPrime (long n) {
		
		
		/*if(n <= 3 || n == 5 || n == 7 || n == 11) {return prime;}
		
		if((n % 2) == 0) {
		prime = false;}
		
		else if ((n % 3) == 0) {
			prime = false;}
		
		else if ((n % 5) == 0) {
			prime = false;}
		
		else if ((n % 7) == 0) {
			prime = false;}
		
			return prime;*/
		/*for(int i = 3; i <= n; i = i +2) {
			for (int j = 2; j*j <= i; j++) {
				if((i%j) == 0) {
					return false;
				}
			}
			return true;
		}
	
		return false;**/
		//boolean prime = true;
		long i = 2l;
		//long startTime = System.nanoTime();
		while(i <= n/2) {
			//System.out.println("--flag a");
			if(i == 2) {
				if(n%i == 0) return false;
				i++;
				//long endTime   = System.nanoTime();
				//long totalTime = endTime - startTime;
				//double ms = totalTime / 1000000.;
				//System.out.println("Time: " + ms + "[ms]");
			}else {
				if(n%i == 0) return false;
				i += 2;
			}
		}
		return true;
	}
}
