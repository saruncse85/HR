package arun.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class MakeItAnagram {

	public static void main(String[] args) {
		String x = "abc";
		String y = "cde";
		
		
		if(x.length() == y.length()) {
			//follow same length logic; 
		} else {
			//follow diff length logic;
		}
		
		StringBuilder sbX = new StringBuilder();
		
		StringBuilder sbY = new StringBuilder();
		
		for(char c: x.toCharArray()) {
			System.out.println(c);
			if(y.indexOf(c)>-1) {
				sbX.append(c);
			} else {
				System.out.println("char not present");
			}
		}
		
		
		for(char c: y.toCharArray()) {
			System.out.println(c);
			if(x.indexOf(c)>-1) {
				sbX.append(c);
			} else {
				System.out.println("char not present");
			}
		}
		
		Map<Character, Integer> cont = new HashMap<>();
		
		for(char c1 : x.toCharArray()) {
			if(!cont.containsKey(c1)) {
				cont.put(c1, 1);
			} else {
				cont.put(c1, cont.get(c1)+1);
			}
		}
		
		for(char c2: y.toCharArray()) {
			if(cont.containsKey(c2)) {
				cont.put(c2, cont.get(c2)-1);
			} else {
				cont.put(c2, 1);
			}
		}
	}	
	
}
