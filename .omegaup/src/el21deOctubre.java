import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class el21deOctubre {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));		
			String inifin = entrada.readLine();
			String[] vector = new String[2];
			vector= inifin.split(" ");
			int mes =Integer.parseInt(vector[0]);
			int dia =  Integer.parseInt(vector[1]);		
			int total = 0;
			if (mes>10)
				System.out.println("What a pity, it has passed!");
			else if (mes == 10 && dia == 21)
				System.out.println("It's today!!");
			else
			{
				for (int i = mes; i <10; i++) 
					total = total + 31;
				if (dia <= 21)
					total = total+(21-dia);
				else
					total = total+(dia-21);
				System.out.println(total-1);
			}		
		}
}
