package STRINGS;
import java.util.Scanner;


public class justifier {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);   
		   int j = 0;
		    while (in.hasNextInt()) 
		    {
		    	int n = in.nextInt();
		    	if (n==0) 
					break;
		        String vector[] = new String[n];
		        int mayor = 0;
		        for (int i = 0; i < n; i++) 
		        {
		             vector[i] = in.next();
		             mayor = Math.max(mayor, vector[i].length());
		        }
		
		        if (j!=0)
		        	System.out.println();
		        for (int i = 0; i < n; i++) 
		        {
		            j++;
		            int espacios = mayor - vector[i].length();
		            while(espacios>0) 
		            {
		                System.out.print(" ");
		                espacios--;
		            }
		            System.out.println(vector[i]);
		        }
		    }	
		
		 
	}
}
