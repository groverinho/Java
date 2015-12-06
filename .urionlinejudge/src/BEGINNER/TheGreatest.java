package BEGINNER;
import java.util.Arrays;
import java.util.Scanner;


public class TheGreatest 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int [] vector = new int[3];
		for (int i = 0; i < vector.length; i++) {
			vector[i]= in.nextInt();
		}
		Arrays.sort(vector);
		System.out.println(vector[2]+" eh o maior");
	}

}
