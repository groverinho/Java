import java.util.Scanner;


public class CoinCollector {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t, n, i, sum, cont;  
		t = in.nextInt();
	    while (t-->0)  
	    {  
	        n = in.nextInt();  
	        int vector[]= new int [n];
	        for (i = 0; i < n; ++i)  
	            vector[i]=in.nextInt();  
	        if (n <= 2)
	        	System.out.println(n);
	        else  
	        {  
	            sum = vector[0]; cont = 2;
	            for (i = 1; i < n - 1; ++i)  
	                if (sum < vector[i] && sum + vector[i] < vector[i + 1])  
	                {
	                	 sum += vector[i];
	                	 cont++;  
	                }
	            System.out.println(cont); 
	        }  
	    }  

	}

}
