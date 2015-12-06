package BEGINNER;
import java.util.Scanner;


public class Remaining2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 2; i < 10000; i++) 
		{
			if (i%n ==2)
			{
				System.out.println(i);
			}
		}

	}

}
