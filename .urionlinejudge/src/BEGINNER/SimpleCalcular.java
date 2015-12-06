package BEGINNER;
import java.util.Scanner;


public class SimpleCalcular 
{
	public static void main(String[] args) 
	{
		Scanner in  =new Scanner(System.in);
		int cod1= 	in.nextInt();
		double cant1= in.nextDouble();
		double precio1 = in.nextDouble();
		double cod2= 	in.nextDouble();
		double cant2= in.nextInt();
		double precio2 = in.nextDouble();
		double total1= cant1 * precio1;
		double total2= cant2 * precio2;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",(total1+total2));
        //System.out.printf("\nSALARY = U$ %.2f\n",total);
	}

}
