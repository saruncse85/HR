package arun.problemsolving;

import java.util.Scanner;

public class EOFFile {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lineNo =1;
		while(scan.hasNextLine()) {
			String nextLine = scan.nextLine();
			if(nextLine != null && !"".equalsIgnoreCase(nextLine.trim())) {
				System.out.println(lineNo + " "+ nextLine);
				lineNo++;
			} else {
				break;
			}
		}
		scan.close();
	}
}
