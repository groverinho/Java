

import java.util.Scanner;

public class CuriosoMuyCurioso {
	public static String cadena ="";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] numero = new int[5];
		int aux, total=0, subtotal, cantidad, cont=0;
		cantidad=  in.nextInt();
		while(cont<cantidad)
			{
					String n=in.next(); 
					int valor=Integer.parseInt(n); 
					int aux2=valor;
					for(int i=0;i<n.length();i++)
					{ 
						numero[i]=valor%10; 
						valor=valor/10; 
					} 
			parar:  for (int i = 0; i < numero.length; i++)
					{
						aux = numero[i];
						if(aux==0)
							break parar;
						else
						{
							subtotal=1;
							for (int j = 2; j <= aux; j++) 
									subtotal = subtotal * j;
						}
						total = total + subtotal;
					}
					
					if (aux2==total)
						 cadena = cadena +  "Y" + "\n";
					else
						cadena = cadena +  "N" + "\n";	
					cont++;
			}
				System.out.print(cadena);	
	}

}
