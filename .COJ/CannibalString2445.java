import java.util.Scanner;
//============================================================================
//Name        : CannibalString2445
//Author      : Grover Irusta
//University  : Universidad Privada Domingo Savio - Tarija
//Date 		  : 30-07-16
//============================================================================


public class CannibalString2445 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
		int vector [] = new int [cad.length()];
		for (int i = 0; i < cad.length()-1; i++) 
		{
			char aux = cad.charAt(i);
			if (Character.isUpperCase(aux))
			{
				int j = i;
				while (Character.isLowerCase(cad.charAt(j+1)) || (Character.isUpperCase(cad.charAt(j+1)) && (cad.charAt(j+1))<aux)) 
				{
					
					vector[i]++;
					j++;
					if (j==cad.length()-1)
					{
						break;
					}
				}
			}
			else
			{ 
				int j = i;
				while (Character.isLowerCase(cad.charAt(j+1)) && (cad.charAt(j+1))< aux) 
				{
					vector[i]++;
					j++;
					if (j==cad.length()-1)
					{
						break;
					}
				}
			}
			
		}
		int max = 0, index=0;
		for (int i = 0; i < cad.length(); i++) 
		{
			if (max< vector[i])
			{
				max = vector[i];
				index = i;
			}
			
		}
		System.out.println(cad.charAt(index));
	}

}
