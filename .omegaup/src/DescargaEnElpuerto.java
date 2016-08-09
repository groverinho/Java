import java.util.Scanner;
import java.util.Stack;


public class DescargaEnElpuerto {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		Stack<String >pila  = new Stack<String>();
		while (in.hasNext()) {
			String consulta = in.next();
			String contenedor ;
			int cont=0;
			if (consulta.equals("D"))
			{
				contenedor = in.next();
				pila.add(contenedor);	
			}
			else if (consulta.equals("P"))
			{
				contenedor = in.next();
				
				for (int i = pila.size()-1; i >=0 ; i--) 
				{
					String aux = pila.get(i);
					//System.out.println(aux);
					if (pila.get(i).equals(contenedor))
						break;
					cont++;
				}
				System.out.println(cont);
			}
			else
			{
				pila.pop();
			}
		}

	}

}
