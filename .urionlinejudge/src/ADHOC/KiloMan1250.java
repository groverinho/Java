import java.util.Scanner;

/**
 @author Grover Irusta Miranda
 @date day/month/2020
 @company Mojix/Xtime
 */

public class KiloMan1250 {

	/**
4
9
1 3 2 3 3 1 2 2 1
JJSSSJSSJ
49
1 1 1 1 1 1 1 2 2 2 2 2 2 2 3 3 3 3 3 3 3 4 4 4 4 4 4 4 5 5 5 5 5 5 5 6 6 6 6 6 6 6 7 7 7 7 7 7 7
SSSSSSSSSSSSSSJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ
4
1 2 2 1
SJJS
1
1
J
	 */
	public static int process(int s, int[] heights, char[] jumpsArrays) {
		int hits = 0;

		for (int i = 0; i < jumpsArrays.length; i++) {
			// System.out.println(jumpsArrays[i] +" "+heights[i]);
			if (jumpsArrays[i] == 'S' && (heights[i] == 1 || heights[i] == 2)) {
				hits++;
			}
			if (jumpsArrays[i] == 'J' && (heights[i] == 3 || heights[i] == 4 || heights[i] == 5 || heights[i] == 6 || heights[i] == 7)) {
				hits++;
			}
		}
		return hits;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();

		for (int i = 0; i < cases; i++) {
			int s = in.nextInt();
			int[] heights = new int[s];
			for (int j = 0; j < s; j++) {
				heights[j] = in.nextInt();
			}
			String jumps = in.next();
			char[] jumpsArray = jumps.toCharArray();
			System.out.println(process(s, heights, jumpsArray));
		}
	}

}
