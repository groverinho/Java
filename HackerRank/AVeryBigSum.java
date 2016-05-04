import java.util.Scanner;


public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		long r=0;
		while (n-->0)
		{
			long m = in.nextLong();
			r += m;
		}
		System.out.println(r);

	}

}
