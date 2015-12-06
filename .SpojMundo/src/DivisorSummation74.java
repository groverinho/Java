

import java.util.Scanner;

 class DivisorSummation74 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			int cont=0;
			
			while (cont<n)
			{
				int numero = in.nextInt();
				int sumar=0;
				int i=1;
					while (i<numero) 
					{
						if(numero%i==0)
							sumar = sumar+i;
						i++;
					}
				System.out.println(sumar);
				cont++;
			}
		/*int t=10,a,b;
		int  cont =0;
	    while(cont<t)
	    {
	                a = in.nextInt();
	                b=in.nextInt();
	               int x,y;
	               //x+y = a;
	               //x-y = b;
	              
	               System.out.println((a+b)/2+"\n"+(a-b)/2);
	               cont++;
	}*/
	    }

}
