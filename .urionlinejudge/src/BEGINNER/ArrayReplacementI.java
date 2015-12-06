package BEGINNER;
import java.util.Scanner;


public class ArrayReplacementI {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int [] vector = new int[10];
		for (int i = 0; i < 10; i++)
		{
			vector[i]= in.nextInt();
			if (vector[i]<=0)
				System.out.println("X["+i+"] = "+1);
			else
				System.out.println("X["+i+"] = "+vector[i]);
		}

	}

}
