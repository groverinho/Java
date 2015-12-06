import java.util.Scanner;


public class SimpleEquations11565 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 int n=in.nextInt();
		  int a, b, c;
		  while (n-->0) 
		  {
		   a=in.nextInt();
		   b=in.nextInt();
		   c=in.nextInt();
	
		    boolean bandera = false;
		    for (int i = -100; i <= 100; i++) {
		      for (int j = -100; j <= 100; j++) {
		        for (int k = -100; k <= 100; k++) {
		          if (i != j && i != k && j != k && i + j + k == a && i * j * k == b && i*i + j*j + k*k == c) {
		            bandera = true;
		           System.out.println( i+ " " + j + " " + k);
		            i = j = 101;
		            break;
		          }
		        }
		      }
		    }
	
		    if (!bandera) {
		      System.out.println( "No solution." );
		    }
		  }

	}

}
