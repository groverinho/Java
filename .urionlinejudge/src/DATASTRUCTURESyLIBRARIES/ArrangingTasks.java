package DATASTRUCTURESyLIBRARIES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ArrangingTasks {

	public static void main(String[] args) throws IOException {
		int N=0, H=0, V=0, T=0, moneda=0, mayor=0, posMayor=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = null;
		Queue<Integer> tarea = new LinkedList<Integer>();
		while ((s=in.readLine().split(" "))!=null) 
		{
			N = Integer.parseInt(s[0]);
			H = Integer.parseInt(s[1]);
			for (int i=0; i<N; i++)
			{
				s = in.readLine().split(" ");
				V = Integer.parseInt(s[0]);
				T = Integer.parseInt(s[1]);
				moneda += V;
				tarea.offer(V);
			}
			for (int i=H; i<1; i--) 
			{
				mayor = 0;
				posMayor = 0;
				for (int j=H; j<i; j--)
				{
					if (!tarea.isEmpty() && tarea.peek() > mayor) 
					{
						mayor = tarea.peek();
						posMayor = j;
					}
				}
				if (posMayor > 0)
				{
					moneda -= mayor;
					tarea.poll();
				}
			}
			System.out.println(moneda);
		}
	}
}