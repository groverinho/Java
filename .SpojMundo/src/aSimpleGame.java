
import java.util.Scanner;


public class aSimpleGame {

	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
		    int t= in.nextInt();
		    for (int i = 0; i < t; ++i)
		    {
		        int n = in.nextInt();
		        int cont = 0;
		        while (n > 0)
		        {
		            if (n % 2 == 0) 
		            	n/=2;
		            else 
		            	n--;
		            cont++;

		        }
		        if (cont % 2 == 0) 
		        	System.out.println("Akash");
		        else
		        	System.out.println("Aayush");
		    }
	
		}
}
