import java.io.*;
import java.util.Scanner;
//============================================================================
//Name        : NumberingRoads11723
//Author      : Grover Irusta
//University  : Universidad Privada Domingo Savio - Tarija
//Date 		  : 18-08-16
//============================================================================

public class NumberingRoads11723 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int c = 1;
		while (true)
		{
			int R = in.nextInt();
			int N = in.nextInt();
			if (R == 0 &&  N == 0)
				break;
			
			int r = (R - 1) / N;
			System.out.print("Case " + c + ": ");
			
			if (r <= 26)
				System.out.println(r);
			else
				System.out.println("impossible");
			
			c++;
		}
	}
}
