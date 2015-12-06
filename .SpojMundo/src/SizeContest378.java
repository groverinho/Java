

import java.util.Scanner;

public class SizeContest378 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c=0;
		int t=0;
		while (c<n) {
			int num = in.nextInt();
			if(num>=0)
				t+=num;
			c++;
		}
		System.out.println(t);

	}

}
