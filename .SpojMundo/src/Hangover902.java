

import java.util.Scanner;

 class Hangover902 {

	public static void main(String[] args) {
	/*	Scanner in  = new Scanner(System.in);
		double a=0;
		for (double i = 2; i <= 61+1; i++)
			a=a+(1/i);
		System.out.println(a);*/
		Scanner in  = new Scanner(System.in);
	            String cadena = in.next();
	            while(!"0.00".equals(cadena))
	            {
	                double tam1;
	                int contarcarta = 0;
	                double tam2 = Double.valueOf(cadena);
	               // System.out.println(tam2 + "tam2");
	                while(tam2 > 0)
	                {
	                	contarcarta++;
	                	tam1 = (1.0/(contarcarta+1));
	                //	System.out.println(tam1);
	                	tam2 -= tam1;
	                }
	                System.out.println(contarcarta + " card(s)");
	                cadena = in.next();
	            }
	}
}
