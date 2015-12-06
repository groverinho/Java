import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class abundanciaPalabras {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		String cadena = in.nextLine();
		 Pattern p = Pattern.compile("CodingRush2014");
		 Matcher m = p.matcher(cadena);
		 int cont =0;
		 while (m.find()) 
			cont++;
		 System.out.println(cont);
	}

}
