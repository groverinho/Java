package STRINGS;
import java.util.Scanner;


public class CompareSubstring 
{
	public static int cuentaSubstrings (String str1, String str2)
	{
		  int max = 0;

		  for (int i = 0; i < str1.length(); i++) 
		  {
		    for (int j = 0; j < str2.length(); j++) 
		    {
		      if (str1.charAt(i) == str2.charAt(j)) 
		      {
		        int c = 0;
		        for (int k = 0; k+i<str1.length() && k+j<str2.length(); k++) 
		        {
		          if (str1.charAt(k+i) != str2.charAt(k+j))
		            break;
		          c++;
		        }
		        if (c > max)
		          max = c;
		      }
		    }
		  }
		  return max;
		}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) 
		{
			String cadena1 = in.nextLine();
			String cadena2 = in.nextLine();	
			System.out.println(cuentaSubstrings(cadena1,cadena2));	
		}
	}

}