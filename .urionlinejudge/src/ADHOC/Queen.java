package ADHOC;
import java.util.Scanner;


public class Queen {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		 int a=0, b = 0, c=0, d=0;
		    while (true) 
		    {
		        a = in.nextInt();
		        b = in.nextInt();
		        c = in.nextInt();
		        d = in.nextInt();
		        if(a==0 && b==0 && c==0 && d==0) 
		            break;
		        if (a == c && b == d)
		            System.out.print ("0\n");
		        else if (a == c || b == d)
		        	System.out.print("1\n");
		        else if (((a-c)*(a-c)) == ((b-d)*(b-d)))
		        	System.out.print ("1\n");
		        else
		            System.out.print("2\n");
		    }

	}
	}
