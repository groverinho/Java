// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-09-16
package PARADIGMAS;

import java.util.Scanner;

public class paradigmas {

	public static void main(String[] args) {


	
				Scanner in = new Scanner(System.in);
				 
				  while (in.hasNext()) 
				  {
					  int n=in.nextInt();
				    int v []= new int [n];
				    for (int i = 0; i < n; ++i)
				       v[i] = in.nextInt();

				    int iz []= new int [n];
				    int der []= new int [n];
				    int ultimo = 0;
				    for (int i = 0; i < n; i++) 
				    {
				      iz[i] = Math.min(ultimo + 1, v[i]);
				      ultimo = iz[i];
				    }
				    ultimo = 0;
				    for (int i = n - 1; i > 0; i--)
				    {
				      der[i] = Math.min(ultimo + 1, v[i]);
				      ultimo = der[i];
				    }

				    int masAlto = 0;
				    for (int i = 0; i < n; ++i) {
				    	masAlto = Math.max(masAlto, Math.min(iz[i], der[i]));
				    }
				    System.out.println(masAlto);
				  


		}


	}

}
