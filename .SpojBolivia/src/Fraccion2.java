
import java.util.Scanner;

class Fraccion2 {
public static String cadena = "";
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		double n1=1,n2=1,d1=1,d2=1;
		do //33 15 11 5     7 8 11 2
		{
			n1= entrada.nextDouble();
			d1= entrada.nextDouble();
			n2= entrada.nextDouble();
			d2= entrada.nextDouble();
			if (n1==0 && n2==0 && d1==0 && d2==0) 
				break;
			else
			{
		           if (n1/d1 == n2/d2) 
		        	   cadena = cadena+"=\n";
		           else
		        	   cadena = cadena +"!=\n";
			}
		}while(n1!=0 && n2!=0 && d1!=0 && d2!=0);
		System.out.print(cadena);
	}

}
	