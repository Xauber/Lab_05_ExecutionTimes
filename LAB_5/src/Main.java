
public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		int[]nums = new int[] {10, 100, 1000, 10000, 100000};
		for (int i = 0; i < nums.length; i++) {
			m.run(nums[i]);
		}
	}
	
	public void run(int n) {
		
		System.out.println("Current n: " + n);
		
		double sum = 0d;
		// Fragment #1 --> O(n)
		for ( int i = 0; i < n; i ++) {
		    sum++;
		}
		
		System.out.println("F1: " + sum);
		sum = 0;
		
		// Fragment #2 --> O(n^2)
		for ( int i = 0; i < n; i ++) {
		    for ( int j = 0; j < n; j ++) {
		        sum++;
		    }
		}
		
		System.out.println("F2: " + sum);
		sum = 0;
	
		// Fragment #3 --> O(n^2)
		for ( int i = 0; i < n; i ++) {
		    for ( int j = i; j < n; j ++) {
		        sum++;
		    }
		}
		
		System.out.println("F3: " + sum);
		sum = 0;
	
		// Fragment #4 --> O(n^2) (2n^2, konstanten Fallen weg)
		for ( int i = 0; i < n; i ++) {
		    sum ++;
		    for ( int j = 0; j < n; j ++) {
		        sum ++;
		    }
		}
		    
		System.out.println("F4: " + sum);
		sum = 0;
	
		// Fragment #5 --> O(n^3)
		for ( int i = 0; i < n; i ++) {
		    for ( int j = 0; j < n*n; j ++) {
		    sum++;
		    }
		}
		
		System.out.println("F5: " + sum);
		sum = 0;
		
		// Fragment #6 --> O(n) ---> inner loop hebt sich auf (2n)
		for ( int i = 0; i < n; i ++) {
		    for ( int j = 0; j < i; j ++) {
		        sum++;
		    }
		}
		
		System.out.println("F6: " + sum);
		sum = 0;
		
		// Fragment #7 --> O(n^3) ---> (n^3 log(n)  ???, nicht big-Oh relevant)
		for ( int i = 1; i < n; i ++) {
		    for ( int j = 0; j < n*n; j ++) {
		        if (j % i == 0)
		           for (int k = 0; k < j; k++) {
		               sum++;
		           }
		    }
		}
		
		System.out.println("F7: " + sum);
		sum = 0;
		
		// Fragment #8 -->  O(log(n))
		int i = n;
		while (i > 1) {
		    i = i / 2;
		    sum++;
		}
		System.out.println("F8: " + sum);
		sum = 0;
		
	}
	
}
