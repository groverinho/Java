package MATHEMATICS;

import java.util.Scanner;

public class PaulasMathematicGame {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			String cadena = in.next();
			if (Character.isUpperCase(cadena.charAt(1))) 
			{
				if (cadena.charAt(0)==cadena.charAt(2))
					System.out.println(Character.getNumericValue(cadena.charAt(0))*	Character.getNumericValue(cadena.charAt(2)));
				else
					System.out.println(Character.getNumericValue(cadena.charAt(2))-Character.getNumericValue(cadena.charAt(0)));
			}
			else
			{
				if (cadena.charAt(0)==cadena.charAt(2))
					System.out.println(Character.getNumericValue(cadena.charAt(0))*	Character.getNumericValue(cadena.charAt(2)));
				else
				System.out.println(Character.getNumericValue(cadena.charAt(0))+Character.getNumericValue(cadena.charAt(2)));
			}
			casos--;
		}

	}

}
