package arun.problemsolving;

public class HIIT {

	static String[] exercises = {"Burpee"};
	
	static int noOfReps = 10;
	
	static int noOfSet = 3;
	
	static int noOfSec = 30;
	
	static int interval = 10;
	
	public static void main(String[] args) {
		
//		exerciseBasedOnRepSet();
		
		exerciseBasedOnTime();
		
	}

	private static void exerciseBasedOnTime() {
		try {
			for(String exercise : exercises) {
				System.out.println("..........Exercise....... "+exercise);
				for(int i=1;i<=noOfSec;i++) {
					System.out.println(i);
					Thread.sleep(1000);
				}
			}
			
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}

	private static void exerciseBasedOnRepSet() {
		try {
			for(String exercise : exercises) {
				System.out.println("...............Exercise......."+exercise);
				
				for(int z = 1;z<=noOfSet;z++) {
					System.out.println("..........Round "+z);
					//count reps
					for(int i=1;i<=noOfReps;i++) {
						
						System.out.println(i);
						Thread.sleep(2000);
					}
					//count rest
					System.out.println("................REST.............");
					for(int j=1;j<=interval;j++) {
						System.out.println(j);
						Thread.sleep(1000);
					}
				}
				
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		
	}
}
