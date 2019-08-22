package java.arun.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class ClimbingLeaderBoard {
	static int n = 6;
//	static int[] leaderboard = new int[]{100,100, 50,40,40,20,10};
//	static int numberOfGames = 4;
//	static int[] aliceScores = new int[]{5,25,50,120};
	
	static int[] leaderboard = new int[]{100,90,90,80,75,60};
	static int numberOfGames = 5;
	static int[] aliceScores = new int[]{50,65,77,90,102};
	
	public static void main(String[] args) {
			List<Integer> leaderScoreList = new ArrayList<>();
			int[] result = new int[numberOfGames];
			for(int i=0;i<n;i++) {
				int leaderScore = leaderboard[i];
				if(!leaderScoreList.contains(leaderScore)) {
					leaderScoreList.add(leaderScore);
				}
			}
			
			boolean printed = false;
			for(int k = 0;k<numberOfGames;k++) {
				int score = aliceScores[k];
				int z = 1;
				for(int y : leaderScoreList) {
					if(score >= y) {
						break;
					}
					z++;
				}
				if(!printed){
					result[k] = z;
				}
			}
		for(int o=0;o<result.length;o++) {
			System.out.print(result[o]+" ");
		}
	}
}

//88385 58708
