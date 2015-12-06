package contestEDD_SIS_U6;

import java.util.Arrays;
import java.util.Scanner;

public class BuscandoParejas {

	public static void main(String[] args)
	{
		Scanner in  =new Scanner(System.in);
		int h= in.nextInt();
		int []hombres = new int [h];
		int m= in.nextInt();
		int []mujeres = new int [m];
		for (int i = 0; i < hombres.length; i++) 
		{
			hombres[i]= in.nextInt();
		}
		for (int i = 0; i < mujeres.length; i++)
		{
			mujeres[i]= in.nextInt();
		}
		if (hombres.length<=mujeres.length) 
		{
			System.out.println("No hay solteros");
		}
		else
		{
			Arrays.sort(hombres);
			int total =  hombres.length - mujeres.length;
			System.out.println(total+" "+hombres[0]);
		}
	}

}
