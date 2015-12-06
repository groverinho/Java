import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CRBuzzFizz {
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String cadena = entrada.readLine();
		String[]vec = new String [2];
		vec = cadena.split(" ");
		int ini = Integer.parseInt(vec[0]);
		int fin =Integer.parseInt(vec[1]);
		boolean flag;
		for (int i = ini; i <= fin; ++i)
		{
		flag = true;
		if (i % 3 == 0)
		{
		System.out.println( "Buzz");
		flag = false;
		}
		if (i % 5 == 0)
		{
			System.out.println( "Fizz");
		flag=false;
		}
		if (flag == true)
		{
			System.out.println(  i);
		}
		
		}
	}
}
