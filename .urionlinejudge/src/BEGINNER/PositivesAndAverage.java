package BEGINNER;
import java.util.Scanner;
public class PositivesAndAverage 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double[] vector = new double[6];
		int cuentapositivos=0;
		double totalpositivos=0;
		for (int i = 0; i < vector.length; i++) 
		{
			vector[i]=in.nextDouble();
			if (vector[i]>0)
			{
				cuentapositivos++;
				totalpositivos = totalpositivos+vector[i];
			}
		}
		System.out.println(cuentapositivos+" valores positivos");
		System.out.printf("%.1f\n", totalpositivos/4);
	}
}
/*
 7
-5
6
-3,4
4,6
12
 * */

