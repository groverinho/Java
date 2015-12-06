import java.util.Scanner;


public class NoProblem11608 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		 
		  int cont = 0;
		  int s= in.nextInt();
		  while (true) 
		  {
			  if (s < 0)
					break;

		    cont++;
		    int n[]= new int [12], p[] = new int[12];
		    for (int i = 0; i < 12; i++)
		      n[i]= in.nextInt();

		    for (int i = 0; i < 12; i++)
		      p[i]= in.nextInt();

		    System.out.println("Case " + cont + ":" );
		    for (int i = 0; i < 12; i++) 
		    {
		      if (p[i] <= s)
		      {
		        s -= p[i];
		        s += n[i];
		        System.out.println( "No problem! :D");
		      }
		      else 
		      {
		        s += n[i];
		        System.out.println("No problem. :(" );
		      }
		    }
		    s= in.nextInt();
		  }


	}

}
