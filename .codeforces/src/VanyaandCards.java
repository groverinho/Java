import java.util.Scanner;


public class VanyaandCards {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int acu = 0;
		for (int i = 0; i < n; i++) 
		{
			int num = in.nextInt();
			acu += num;
		}
		acu = Math.abs(acu);
		int c =0;
		while (acu>0) 
		{
			acu -= x;
			c++;
		}
		System.out.println(c);
	}
}
