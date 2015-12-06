import java.util.Scanner;


public class Holesinthetext {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		
		while (casos>0) 
		{
			String cadena = in.next();
			int x=0;
				for (int j = 0; j < cadena.length(); j++) 
				{
					if (cadena.charAt(j)=='A') x=x+1;
					else if (cadena.charAt(j)=='D') x=x+1;
					else if (cadena.charAt(j)=='O') x=x+1;
					else if (cadena.charAt(j)=='P') x=x+1;
					else if (cadena.charAt(j)=='Q') x=x+1;
					else if (cadena.charAt(j)=='R') x=x+1;
					else if (cadena.charAt(j)=='B') x=x+2;
					else x=x+0;
				}
				System.out.println(x);
			casos--;
		}
	}

}
