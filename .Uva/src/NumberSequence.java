import java.util.ArrayList;
import java.util.Scanner;


public class NumberSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>>lista = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 1; i <=10000; i++)
		{	
			ArrayList<Integer> serie = new ArrayList<Integer>();
			for (int j = 1; j <= i; j++)
			{
				serie.add(j);
			}
			lista.add(serie);
			
		}
System.out.println("hola");
//		int casos = in.nextInt();
//		while (casos -->0)
//		{
//			int n = in.nextInt();
//			
//			//System.out.println(serie.charAt(n-1));
//		}

	}

}
