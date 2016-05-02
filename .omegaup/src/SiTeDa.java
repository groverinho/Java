import java.util.ArrayList;
import java.util.Scanner;


public class SiTeDa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int a1 = 0, b1=0;
		a1= a +b ;
		b1 = a1 + b;
		lista.add(a1%10);
		lista.add(b1%10);
		while (true)
		{
			if ((lista.get(lista.size()-2) == a)) 
			{
				if ((lista.get(lista.size()-1) == b)) 
				{
					break;
				}
				
			}
			int aux = ((lista.get(lista.size()-2)%10)+(lista.get(lista.size()-1)%10))%10;
			lista.add(aux);

			
		}
		String cadena = a+" "+b+" ";
		for (int i = 0; i < lista.size(); i++)
		{
			cadena += lista.get(i)+" ";
		}
		cadena = cadena.trim();
		System.out.println(cadena);
		System.out.println(lista.size());

	}

}
