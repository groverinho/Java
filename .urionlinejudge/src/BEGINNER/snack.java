package BEGINNER;
import java.util.Scanner;


public class snack {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		double b = in.nextInt();
		switch (x)
		{
		case 1 :
				System.out.printf("Total: R$ %.2f\n",(b*4));
			break;
		case 2:
			System.out.printf("Total: R$ %.2f\n",(b*4.5));
			break;

		case 3:
			System.out.printf("Total: R$ %.2f\n",(b*5));
			break;
		
		case 4:
			System.out.printf("Total: R$ %.2f\n",(b*2));
			break;
		
		case 5 :
			System.out.printf("Total: R$ %.2f\n",(b*1.5));
			break;

	
		default:
			break;
		}
				

	}

}
