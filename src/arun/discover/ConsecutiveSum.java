package arun.discover;

public class ConsecutiveSum {
	
	// given n number, find how many possible consecutive sum can be made < n.
	public static void main(String[] args) {
		int n = 100;
		
		int counter =0;
		int total = 0;
		int i=1;
		while(i<n) {
			for(int j = i;j<n;j++) {
				
				if((total +j) > n) {
					counter++;
					break;
				}
				total += j;
				System.out.print(total+" ");
			}
			System.out.println("");
			i++;
			total =0;
		}
		System.out.println("number of ways ---- "+counter);
	}
	

}
