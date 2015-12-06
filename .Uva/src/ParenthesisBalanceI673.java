import java.util.Scanner;


public class ParenthesisBalanceI673 {

	public static String process (String str) {
		  int open = 0, close = 0;
		  for (int i = 0; i < str.length(); i++) 
		  {
		    if (str.charAt(i)== '(')
		      open++;
		    else if (str.charAt(i) == ')')
		      close++;
		    if (close > open)
		      return "No";
		  }
		  if (open != close)
		    return "No";
		  else
		    return "Yes";
		}
		 
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n>0)
		{
			String cadena = in.nextLine();
			System.out.println(process(cadena));
			n--;
		}
		

	}

}
