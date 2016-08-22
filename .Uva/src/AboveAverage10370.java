import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 22-08-16

public class AboveAverage10370 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0)
			{
			int n  = in.nextInt();
			int v [] = new int [n];
			double sum = 0;
			for (int i = 0; i < n; i++) {
				v[i]=in.nextInt();
				sum+=v[i];
			}
			sum =sum/(double) n;
			int c = 0;
			for (int i = 0; i < v.length; i++) {
				if ( v[i]> sum)
				{
					c++;
				}
			}
			System.out.printf("%.3f", (double)((100*c)/(double)n));
			System.out.println("%");
		}

	}

}
