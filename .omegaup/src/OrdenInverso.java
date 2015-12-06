import java.util.ArrayList;
import java.util.Scanner;


public class OrdenInverso {

	public static void main(String[] args)
	{
		Scanner in = new Scanner( System.in);
		int casos = in.nextInt();
		ArrayList<String> lista = new ArrayList<String>();
		while (casos>0 )
		{
			lista.add(in.next());
			casos--;
		}
	//	System.out.println("Case #1:");
		for (int i = lista.size()-1; i >=0; i--)
		{
			System.out.println(lista.get(i));
		}

	}

}
