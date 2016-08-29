import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 28-08-16

public class CryptographersConundrum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String per = "per";
		while (in.hasNext()) 
		{
			String cadena = in.next();
			cadena = cadena.toLowerCase();
			int j =0, c=0;
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i)!=per.charAt(j)) 
				{
					c++;	
				}
				
				if (j==2)
				{
				j=0;	
				}
				else
					j++;

			}
			System.out.println(c);
		}

	}

}
