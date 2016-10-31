import java.util.Arrays;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 30-10-16
 */

public class SoldierandBadges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] vector = new int [n];
	
		for (int i = 0; i < n; i++) {
			vector[i] = in.nextInt();
		}
		Arrays.sort(vector);
		long honores=1;
		long coins=0;
		for (int i=0;i<n;i++) {
			honores = Math.max(honores,vector[i]);
			coins+=honores-vector[i];
			honores++;
		}
		
		System.out.println(coins);
	}

}
