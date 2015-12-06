import java.util.Scanner;
import java.util.TreeSet;


public class IWannaBetheGuy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		TreeSet<Integer> lista = new TreeSet<Integer>();
		for (int i = 0; i < a; i++) 
		{
			int aux = in.nextInt();
			
				lista.add(aux);
			
		}
		int b = in.nextInt();
		for (int i = 0; i < b; i++) 
		{
			int aux = in.nextInt();
			
				lista.add(aux);
			
		}
		if (lista.size()==n) {
			System.out.println("I become the guy.");
		}
		else
			System.out.println("Oh, my keyboard!");

	}

}
