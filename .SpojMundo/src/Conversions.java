

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int casos = in.nextInt();
		 
		 for (int i = 0; i < casos; i++) 
		 {
			double cant = in.nextDouble();
			String tipo = in.next();
			if (tipo.equals("kg"))
			{
				System.out.print((i+1)+" ");
				System.out.printf("%.4f", (cant*2.2046));
				System.out.println(" lb");
			}

			else if (tipo .equals("lb"))
			{
				System.out.print((i+1)+" ");
				System.out.printf("%.4f", (cant*0.4536));
				System.out.println(" kg");
			}
			else if (tipo.equals( "l"))
			{
				System.out.print((i+1)+" ");
				System.out.printf("%.4f", (cant*0.2642));
				System.out.println(" g");
			}
			else if (tipo .equals("g"))
			{
				System.out.print((i+1)+" ");
				System.out.printf("%.4f", (cant*3.7854));
				System.out.println(" l");
			}
		}
	}
}
