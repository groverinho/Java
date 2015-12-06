import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class ArmstrongNumber12895 {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos= Integer.parseInt(in.readLine());
		while (casos-->0)
		{
			int n = Integer.parseInt(in.readLine());
			String cad = n+"";
			int potencia = cad.length();
			long aux=0;
	chau:	for (int i = 0; i < cad.length(); i++)
			{
				if (aux>n) 
				{
					break chau;
				}
				aux+= Math.pow(Integer.parseInt(cad.charAt(i)+""), potencia);	
			}
			if (aux==n) 
				System.out.println("Armstrong");
			else
				System.out.println("Not Armstrong");
			}
	}

}
