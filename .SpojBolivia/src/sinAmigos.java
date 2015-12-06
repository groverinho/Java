import java.util.Scanner;
 class SinAmigos 
 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 	while (in.hasNextInt()) 
		 	{		
				int n=in.nextInt();
				int a1=0;
				int a2=0;
				for (int j = 1; j <= n/2; j++) 
				{
					if(n%j==0)
						a1+=j;
				}
				for (int i = 1; i <= a1/2; i++)
				{
					if(a1%i==0)
						a2+=i;
				}
				if(a2==n)
					System.out.println(a1);
				else
					System.out.println("-1");
			 }
	}
}
 

