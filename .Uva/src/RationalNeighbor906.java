import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 21-08-16

public class RationalNeighbor906 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			int a = in.nextInt();
			int b = in.nextInt();
			double n = in.nextDouble();
			 double t1 = ( double)a/b, t2;
			 long c = 0;
	        for(long d = 1; ; d++) 
	        {
	            c = (long)(t1*d);
	            while(a*d >= b*c)
	                c++;
	            t2 = ( double)c/d;
	            if(t2-t1 <= n) 
	            {
	                System.out.println(c+" "+d);
	                break;
	            }
	        }


		}
		
	}

}
