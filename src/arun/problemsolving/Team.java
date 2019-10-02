package arun.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class Team {

	public static void main(String[] args) {
		
		///int arr[] = {5,6,7};
		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(7);
		
		
		int min = 5;
		int max = 7;
		int y = 1;
		
		ArrayList<Integer> arr1 = new ArrayList((max+1)-min);
		
		int j=0;
		for(int i =0;i<arr.size();i++) {
			if(arr.get(i) >=min && arr.get(i) <=max) {
				arr1.add(j, arr.get(i));
				j++;
			}			
		}
		
		String str = "";
		List<String> arrList = new ArrayList<>();
		
		for(int i =0;i<arr1.size();i++) {
			str = String.valueOf(arr1.get(i));
			arrList.add(str);
			for(int k=i;k<arr1.size()-1;k++) {
				str = str+","+ String.valueOf(arr1.get(k+1));
				arrList.add(str);
			}
		}
		
		List<String> newList = new ArrayList<>();
		for(int x = 0;x<arrList.size();x++) {
			String xy=arrList.get(x);
			if(y ==1 && xy.length()>y) {
				newList.add(xy);
			}
			
			if(y>1 && xy.length()>(y+1)) {
				newList.add(xy);
			}
		}
		
		System.out.println(newList.size());
	}
}
