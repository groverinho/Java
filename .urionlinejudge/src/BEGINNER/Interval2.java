package BEGINNER;
import java.util.Scanner;


public class Interval2 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int i = 0;
		int dentro=0;
		int fuera=0;
		while (i<a)
		{
			int numero = in.nextInt();
			if (numero >= 10 && numero<=20)
				dentro++;
			else
				fuera++;
			
			i++;
		}
		System.out.println(dentro+" in");
		System.out.println(fuera+ " out");
		
	}
}
