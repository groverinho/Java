import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ABC
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>(3);
		String cadenaAux= "";	String cadenaAux2= "";
		char []abc = {'A','B','C'};
		for (int i = 0; i < 3; i++)
			num.add(in.nextInt());	
		String cadena= in.next();
		Collections.sort(num);
		//cadenaAux = num.toString();
		for (int i = 0; i < num.size(); i++)
			cadenaAux = cadenaAux + num.get(i);
	
		for (int i = 0; i < cadena.length(); i++)
		{
			for (int j = 0; j < cadenaAux.length(); j++)
			{
				if (cadena.charAt(i)== abc[j])
				{
					cadenaAux2 += cadenaAux.charAt(j)+ " ";	
				}
			}
		}
		cadenaAux2= cadenaAux2.trim();
		System.out.println(cadenaAux2);
	}
}