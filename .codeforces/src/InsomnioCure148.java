import java.util.Scanner;


public class InsomnioCure148 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int cont = 0;
	    int k = in.nextInt();
	    int l = in.nextInt();
	    int m = in.nextInt();
	    int n = in.nextInt();
	    int d = in.nextInt();
	    cont = d;
	    
	    if(k == 1 || l == 1 || m == 1 || n == 1)
	    {
	       System.out.println(d);
	    }
	    else
	    {
	        for(int i = 1; i <= d; i++)
	        {
	            if((i%k != 0) && (i%l != 0) && (i%m != 0) && (i%n != 0))
	                cont--;
	        }
	        System.out.println(cont);
	    }
	}

}
