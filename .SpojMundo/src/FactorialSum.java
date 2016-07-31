import java.util.Scanner;


public class FactorialSum {


//	public static int fact(int n)
//	{
//	      if(n==0) return 1;  
//	      else return n*fact(n-1); 
//	} 

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int facts []= {1,1,2,6,24,120,720,5040,40320,362880,3628800,39916800};

		int casos = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			int index=0;
			boolean bandera = false;
			boolean bandera2 = false;
			for (int i = 0; i < facts.length; i++) 
			{
				if (n<= facts[i] )
				{
					if (n==facts[i]) {
						bandera = true;
					}
					index=i;
					break;
				}
			}
			int sum =0;
			if (bandera)
			{
				System.out.println("YES");	
			}
			else
			{
				
				for (int i = index-1; i>=0 ; i--) 
				{
					sum+=facts[i];
					if (sum>n)
					{
						sum-=facts[i];
				
					}
					if (sum==n) 
					{
						bandera2=true;
						break;
					}
				}
				System.out.println(bandera2?"YES":"NO");
			}
	}
		

	}

}
