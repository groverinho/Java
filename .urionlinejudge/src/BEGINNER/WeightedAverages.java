package BEGINNER;
import java.util.Scanner;


public class WeightedAverages {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 int qtd_media=1, i=1;
		    double num1, num2, num3;
		    qtd_media = in.nextInt();
		    double [] media = new double [qtd_media+1];
		 
		    for(i=1; i<=qtd_media; i++)
		    {
		 
		        num1 = in.nextDouble();
		        num2 = in.nextDouble();
		        num3 = in.nextFloat();
		        media[i] = (2*num1 + 3*num2 + 5*num3)/10 ;
		 
		    }
		 
		for(i=1; i<=qtd_media; i++)
		        System.out.printf("%.1f\n",media[i]);
	}

}
