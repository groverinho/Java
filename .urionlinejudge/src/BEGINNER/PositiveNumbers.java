package BEGINNER;
import java.util.Scanner;


public class PositiveNumbers {
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		double[]vector = new double[6];
		int c=0;
		for (int i = 0; i < vector.length; i++) {
			vector[i]=in.nextDouble();
			if (vector[i]>0)
			{
				c++;
			}
		}
		System.out.println(c+" valores positivos");
	}
}
/*7
-5
6
-3,4
4,6
12*/