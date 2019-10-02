package arun.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class LillyChocolate {

	
	
	public static void main(String[] args) {
		int arr[] = {4};
		int d = 4;
		int m = 1;
		
		int count = 0;
		
		if(arr.length == 1 && arr[0] == d ) {
			count =  1;
		} else {
			for(int i=0;i<arr.length;i++) {
				int limit = i+m;
				if(limit <= arr.length) {
					for(int j = i;j<limit;j++) {
						if(j+1 < limit) {
							int sum = arr[j]+arr[j+1];
							if(sum == d) {
								System.out.println("total found ");
								System.out.println(arr[j]+","+arr[j+1]);
								count += 1;
								break;
							}
						}
						
					}
				}
			}
		}
		System.out.println("count "+count);
	}
	
}
