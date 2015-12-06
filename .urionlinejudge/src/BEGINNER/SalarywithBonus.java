package BEGINNER;
import java.util.Scanner;


public class SalarywithBonus 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String num = in.next();
		double horas = in.nextDouble();
		double money = in.nextDouble();
	//	double total = horas+(money*0.15);
	//	System.out.println(num);
		System.out.printf("TOTAL = R$ %.2f\n",(horas+(money*0.15)));
	}
}

