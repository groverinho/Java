import java.util.Scanner;


public class DivisionOfNlogonia11498 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();;
	    while (t!=0) 
	    {
	    
	        int x0, y0;
	        x0 = in.nextInt();y0 = in.nextInt();
	        for (int i = 0; i < t; i++)
	        {
	            int x, y;
	            x = in.nextInt();
	            y = in.nextInt();
	            if (x == x0 || y == y0)
	                System.out.println ("divisa");
	            else if (x > x0 && y > y0)
	            	System.out.println("NE");
	            else if (x < x0 && y > y0)
	            	System.out.println("NO");
	            else if (x < x0 && y < y0)
	            	System.out.println("SO");
	            else
	            	System.out.println ("SE");
	        }
	        	t = in.nextInt();
	        }
	}
}
