/*import java.math.BigInteger;
import java.util.Scanner;
public class TuViajeEstáAquí 
{

	public static void main(String[] args)// throws IOException 
	{
		Scanner entrada = new Scanner(System.in);
		while (entrada.hasNext()) 
		{
			String cometa = entrada.next();
			String grupo = entrada.next();
			BigInteger acu = BigInteger.ONE;
			BigInteger acu2 = BigInteger.ONE;
			for (int i = 0; i < cometa.length(); i++)
			{
				int ii=1;
				for (int j = 'A'; j <= 'Z';j++) 
				{
					
					if (cometa.charAt(i) == j) 
					{
						acu = acu.multiply(BigInteger.valueOf(ii));
						//break ;
					}ii++;
				}
			}
			for (int k = 0; k < grupo.length(); k++)
			{
				int ii=1;
				for (int jj = 'A' ; jj <= 'Z';jj++) 
				{
					
					if (cometa.charAt(k) == jj) 
					{
						acu2= acu2.multiply(BigInteger.valueOf(ii));
						//break ;
					}ii++;
				}
			}
			System.out.println(acu+ " % " +acu2);
			if (acu.mod(acu2).equals(BigInteger.ZERO)) {
				System.out.println("GO");
			}
			else
				System.out.println("STAY");
		}		
	}
}
*/

import java.util.Scanner;
public class RideUsaco {
	public static void main(String[] args)throws Throwable 
	{
		Scanner sc = new Scanner(System.in);
		String cometa = sc.next();
		String grupo = sc.next();
		int sumaCometa = 1;
		for(int i = 0; i < cometa.length(); i++)
		    sumaCometa*= (int)cometa.charAt(i) - 64;
		int sumaGrupo = 1;
		for(int i = 0; i < grupo.length(); i++)
		    sumaGrupo*= (int)grupo.charAt(i) - 64;
		boolean go = sumaGrupo%47 == sumaCometa%47;	
		System.out.println((go)?"GO":"STAY");

		
		
	}

}
