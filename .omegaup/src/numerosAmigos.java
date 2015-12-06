import java.util.Scanner;
 class numerosAmigos 
 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 		while (in.hasNextInt()) {
					
				
				int n=in.nextInt();
				int n2=in.nextInt();
				int a1=0;
				for (int j = 1; j <= n/2; j++) 
				{
					if(n%j==0)
						a1+=j;
				}
				if (n2==a1)
					System.out.println("Es Amigo");
				else
					System.out.println("No es Amigo");
		 		}
	}
}

