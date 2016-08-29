import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 28-08-16
public class CD {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    // If you don't use the \n the writer will print trash 
	    // The fast input should be enough  
		while (true)
		{
			int n = in.nextInt();
			int m = in.nextInt();
			int c=0;
			if (n==0&& m ==0)
			{
				break;
			}
			
			 Set<Integer> set = new HashSet<Integer>();
	            for (int i = 0; i < n; i++) {
	                set.add(in.nextInt());
	            }

	            for ( int i = 0; i < m; i++) {
	                if (set.contains(in.nextInt())) c++;
	            }
			System.out.println(c);

		    
		}
		
		}

}