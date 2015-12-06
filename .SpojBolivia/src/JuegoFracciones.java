

import java.util.Scanner;

class JuegoFracciones {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int x,y,cantidad;
		int result;
		do
		{
			String fraccion="";
			int alice = 0,bob = 0;
			cantidad=entrada.nextInt();
			String [] vector= new String[cantidad*2];
			if(cantidad==0)
				break;
			for (int i = 0; i < cantidad*2; i++)
			{
				fraccion += entrada.next()+"/";				
			}
			vector= fraccion.split("/");						
			for (int i = 0; i < vector.length; i+=2) 
			{
				x=Integer.parseInt(vector[i]);
				y = Integer.parseInt(vector[i+1]);
				result=Euclides(x,y);			
				if(i<=(vector.length/2)-1)
				{
					if(result==1)
						alice+=result;
				}
				else
				{
					if(result==1)
						bob+=result;
				}
			}
			if(alice>bob)
				System.out.println("Alice");
			else if(alice<bob)
				System.out.println("Bob");
			else
				System.out.println("=");		
		}while(cantidad!=0);
	}
	
	public static int Euclides(int a, int b) {
			int r=b;
			while (b> 0){
			r=a%b;
			a=b;
			b=r;
			}
			return (a);
	}
}