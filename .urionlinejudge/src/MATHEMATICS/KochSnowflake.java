package MATHEMATICS;

import java.util.Scanner;

public class KochSnowflake {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) 
		{
			int s = in.nextInt();
			double area = (2 * Math.sqrt(3) * (s*s))/5;
			System.out.printf("%.2f\n",area);
		}
		
	}

}
