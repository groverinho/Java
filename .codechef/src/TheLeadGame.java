import java.util.Scanner;


public class TheLeadGame {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
	    int i, x1 = 0, x2 = 0;
	    int aux, max = 0, gano = 0;
	    for (i = 0; i < N; i++) 
	    {
	     int a = in.nextInt();
	     int b = in.nextInt();
	      x1 += a;
	      x2 += b;
	      aux = Math.abs(x1 - x2);
	      if (aux > max)
	      {
	        max = aux;
	        if (x1 > x2) 
	        	gano = 1;
	        else 
	        	gano = 2;
	      }
	    }
	    System.out.println(gano + " " + max);
	}
}
