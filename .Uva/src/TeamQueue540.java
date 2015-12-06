import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;


public class TeamQueue540 {
	public class numeros
	{
		public int a;
		public int b;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int equipos = in.nextInt();
		String consultas ="";
		while (equipos!=0)
		{
			ArrayList<ArrayList<Integer>> team= new ArrayList<ArrayList<Integer>>();
			ArrayList<numeros> fila = new ArrayList<numeros>();
			int []vector = new int [equipos];
			Arrays.fill(vector,-1);
			for (int i = 0; i < equipos; i++)
			{
				int n = in.nextInt();
			ArrayList<Integer> equip = new ArrayList<Integer>();
				for (int j = 0; j < n; j++)
				{
						equip.add(in.nextInt());
				}
				team.add(equip);
			}
			consultas = in.next();
			while (!consultas.equals("STOP"))
			{
				if (consultas.equals("ENQUEUE")) 
				{
					int entero = in.nextInt();
					int numEq=0;
					boolean bandera = false;
					for (int i = 0; i < team.size(); i++)
					{
						if (team.get(i).contains(entero))
						{
							numEq = i;
							break;
						}
					}
					for (int i = fila.size()-1; i >=0; i--)
					{
						numeros num = fila.get(i);
						if (num.b== numEq)
						{
						//	fila.
						}
					}
				}
				else
				{
					
				}
				consultas = in.next();
			}
			equipos = in.nextInt();
					
					
		}

	}

}
