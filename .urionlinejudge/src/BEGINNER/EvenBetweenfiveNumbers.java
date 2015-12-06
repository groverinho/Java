package BEGINNER;
import java.util.Scanner;


public class EvenBetweenfiveNumbers {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n =0;
		int c=0;
		for (int i = 0; i < 5; i++) 
		{
			n = in.nextInt();
			if (n%2==0)
			{
				c++;
			}
		}
		System.out.println(c+" valores pares");

	}

}
