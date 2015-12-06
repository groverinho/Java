import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MezclandoVainas {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		ArrayList<Integer> orden = new ArrayList<Integer>();
		for (int i = 0; i <m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				orden.add(in.nextInt());
			}
		}
			Collections.sort(orden);
			for (int i = 0; i < orden.size(); i++) 
			{
				if (i!=orden.size()-1)
					System.out.print(orden.get(i)+" ");
				else
					System.out.print(orden.get(i));
				
			}
	}

}
