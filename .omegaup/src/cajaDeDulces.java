import java.util.Scanner;

/**
 * Name: Grover A. Irusta Miranda Company: CodeRoad - Xtime Date 13/04/2018
 */
public class cajaDeDulces {
	
	public static void main(String[] args) {
		//only 90% of cases
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int boxes[] = new int[n];
		for (int i = 0; i < n; i++) {
			boxes[i] = in.nextInt();
		}
		int max = 0;
		for (int i = 0; i < boxes.length; i++) {
			int sum = 0;
			if (i + k < boxes.length) {
				for (int j = i, limit = 0; limit < k; j++, limit++) {
					sum += boxes[j];
				}
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
}
