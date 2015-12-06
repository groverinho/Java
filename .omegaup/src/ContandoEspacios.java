import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ContandoEspacios {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
		String cadena = in.nextLine();
		int c =0;
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i)== ' ')
			{
				c++;
			}
		}
		/* Pattern p = Pattern.compile(" ");
		 Matcher m = p.matcher(cadena);
		 while (m.find()) 
			c++;*/
		System.out.println(c);
		}
	}

}
