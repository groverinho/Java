

import java.util.Scanner;

 class thenextpalindrome5 
 {
	public static int capi (int n)
	{
		int aux=0, r=0;
		while (n>0)
		{
			aux=n%10;
			r=r*10+aux;
			n=n/10;
		}
		return r;
	 }
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		while (n>0) 
		{
			 int numero =in.nextInt();
breakaqui: while (numero != -1 )
			{
			numero++;
				if (numero== capi(numero))
				{
					System.out.println(capi(numero));
					break breakaqui;
				} 
			}
			 n--;
		}
	}
}
