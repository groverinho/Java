package BEGINNER;
import java.util.Scanner;


public class CoordinatesofaPoint {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble()) 
		{				
			double x = in.nextDouble();
			double y = in.nextDouble();				
				if((x == 0) && (y == 0)) System.out.println("Origem");
				if((x == 0) && (y != 0)) System.out.println("Eixo Y");
				if((x != 0) && (y == 0)) System.out.println("Eixo Y");

				if(x > 0) 
				{
					if (y > 0)
						System.out.println("Q1");
					else if (y < 0)
						System.out.println("Q4");
				}
				else if (x < 0)
				{
					if (y > 0)
						System.out.println("Q2");
					else if (y < 0)
						System.out.println("Q3");
				}		
	}
	}
}
