import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ordenando {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [ ] vector  = new int[n];
		ArrayList<Integer> creciente = new ArrayList<Integer>();
			ArrayList<Integer> decreciente = new ArrayList<Integer>();
			ArrayList<Integer> normal = new ArrayList<Integer>();
		for (int i = 0; i < vector.length; i++) {
			vector[i]= in.nextInt();
			creciente.add(vector[i]);
			normal.add(vector[i]);
		}
		Collections.sort(creciente);
		for (int j = creciente.size()-1; j >=0; j--)
		{
			decreciente.add(creciente.get(j));
		}
		boolean noOrdenado = true;
	for (int i = 0; i < normal.size(); i++)
		{
			if (normal.get(i)!=creciente.get(i))
			{
				noOrdenado = false;
			}
		}
	if (noOrdenado == true)
	{
		System.out.println("CRECIENTE");
	}
	else
	{
		int auxCreciente = 0;
		boolean deCreciente= true;
	jeje:	for (int i = decreciente.size()-1; i >=0; i--)
				{
					if (normal.get(i)!=decreciente.get(i))
					
						deCreciente = false;
						break jeje;	
					
				}
			
			if (deCreciente==true)
			{
				System.out.println("DECRECIENTE");
			}
			else
			{
				System.out.println("NO ORDENADA");
			}
		
	}
		
	}

}
