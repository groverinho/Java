import java.util.Scanner;


 class multiploPequeno 
 {
	 public static boolean verificar( int m )
	 {
		 while(m>0)
		 {
			 if( m %10 > 1 )
			 return false;
			 m = m/10;
		 }
		 return true;
	}
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int x =-1;
		while(entrada.hasNextInt())
		{ 
			x=entrada.nextInt();
			if(x!=0)
			{
				int m=0;
				while( true ) 
				{
					m++;
					if( verificar(x*m ) )
					{
						System.out.println(x*m);
						break;
					}
				}
			}	
		}
	}
}