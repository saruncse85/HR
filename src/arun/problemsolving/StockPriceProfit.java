package arun.problemsolving;

public class StockPriceProfit {
	public static void main(String[] args) {
		int[] arr = {9, 11, 8, 5, 7, 10};
		
		//find the min number's index position
		int min = arr[0];
		int position = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				position = i;
			}
		}
		
		System.out.println("Minimum value position - "+position);
		//find the max number after min index
		int max = arr[position];
		for(int y=position;y<arr.length;y++) {
			if(arr[y]>max) {
				max = arr[y];
			}
		}
		
		//subtract max - min = profit
		int profit = max - min;
		System.out.println(profit);
		
	}
}
