import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Parking11364 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-- > 0) 
		{
			int n = in.nextInt();
			ArrayList<Integer> lista = new ArrayList<Integer>();
			for (int i = 0; i < n; i++)
			{
				lista.add(in.nextInt());
			}
			Collections.sort(lista);
			int max = lista.get(lista.size()-1);
			int min = lista.get(0);
			System.out.println(2*(max-min));
		}

	}

}
