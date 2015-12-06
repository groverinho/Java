
import java.util.Scanner;
class Fracciones {
	 public static String cadena = "";

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n1=1,n2=1,d1=1,d2=1;
		do
		{
			n1= entrada.nextInt();
			d1= entrada.nextInt();
			n2= entrada.nextInt();
			d2= entrada.nextInt();
			if (n1==0 && n2==0 && d1==0 && d2==0) 
				break;
			else
			{
				if(d1!=0 && n1!=0)
				{ 
					int r0 = n1; int r1 = d1; int aux;		        
					while (r1 != 0)
			        {
			            aux = (r0 % r1);
			            r0 = r1;
			            r1 = aux;
			        }         
			           n1 /= r0;
			           d1 /= r0;
				}
		           if (n1 == n2 && d1 == d2) 
		        	   cadena = cadena+"=\n";
		           else
		        	   cadena = cadena +"!=\n";
			}
		}while(n1!=0 && n2!=0 && d1!=0 && d2!=0);
		System.out.print(cadena);
		
	}


}
