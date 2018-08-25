import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
Company: Xtime
Date: 27-08-2017
 */

public class TheRank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int totalScore[] = new int [n];
		int tomasScore =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				int note =in.nextInt();
				totalScore[i] += note; 
			}
			tomasScore = totalScore[0];
		}
		Arrays.sort(totalScore);
		int rank =0;
		int index=0;
		for (int i = totalScore.length-1; i >=0 ; i--) {
			if (totalScore[i]==tomasScore) {
				rank=index+1;
				break;
			}
			index++;
		}
		System.out.println(rank);
	}

}
