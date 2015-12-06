package BEGINNER;
import java.util.Scanner;


public class Salary 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int horas = in.nextInt();
		double money = in.nextDouble();
		double total = horas*money;
		/*System.out.println("NUMBER = "+num);
		System.out.printf ("SALARY = R$ %.2f", total);*/
		System.out.printf("NUMBER = "+num);
        System.out.printf("\nSALARY = U$ %.2f\n",total);
	}
}
