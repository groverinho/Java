import java.util.*;
import java.io.*;

public class UVa00540_TeamQueue {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = 1;
		while (true)
		{
			int n = Integer.parseInt(in.readLine());
			if (n == 0)
				break;
			
			Map<Integer, Integer> miembros = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; ++i)
			{
				String[] partes = in.readLine().split("[ ]+");
				for (int j = 1; j < partes.length; ++j) 
				{
					int m = Integer.parseInt(partes[j]);
					miembros.put(m, i);
				}
			}
			
			System.out.println("Scenario #" + casos);
			
			List<Queue<Integer>> colas = new ArrayList<Queue<Integer>>();
			Queue<Integer> equipos = new LinkedList<Integer>();
			
			for (int i = 0; i < n; ++i)
				colas.add(new LinkedList<Integer>());
			
			String instruccion = in.readLine();
			while (!instruccion.equals("STOP")) 
			{
				String[] consulta = instruccion.split("[ ]+");
				if (consulta[0].equals("ENQUEUE")) 
				{
					int valor = Integer.parseInt(consulta[1]);
					int team = miembros.get(valor);
					
					if (colas.get(team).isEmpty()) 
						equipos.offer(team);
					
					colas.get(team).offer(valor);
				} 
				else 
				{
					if (!equipos.isEmpty()) 
					{
						int equipo = equipos.peek();
						int valor = colas.get(equipo).poll();
						System.out.println(valor);
						
						if (colas.get(equipo).isEmpty())
							equipos.poll();
					}
				}
				instruccion = in.readLine();
			}
			System.out.println();
			++casos;
		}
	}
}
