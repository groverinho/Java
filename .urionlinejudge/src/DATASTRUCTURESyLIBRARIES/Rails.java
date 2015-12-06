package DATASTRUCTURESyLIBRARIES;

import java.util.Scanner;
import java.util.Stack;

public class Rails {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tam, n, top_a; // top_a = guarda o topo da pilha A de tamanho tam
	    Stack<Integer> station=  new Stack<Integer>();
	    boolean yes;
	    tam = in.nextInt();
	    while (tam!=0)
	    {
	        n=in.nextInt();
	        while (n!=0)
	        {
	            top_a = 1;
	            yes = true;
	            for (int i = 0; i < tam; i++)
	            {
	                if (i==0)
	                   n=in.nextInt();
	                if (yes)
	                {
	                    if (!station.empty() && station.peek() == n)
	                        station.pop();
	                    else if (n >= top_a)
	                    {
	                        while (n != top_a)
	                            station.push(top_a++);
	                        top_a++;
	                    }
	                    else
	                    {
	                        System.out.print("No");
	                        station.clear();
	                        yes = false;
	                    }
	                }
	            }
	            if (yes)
	            	 System.out.print("Yes");
	            n=in.nextInt();
	        }
	        System.out.print('\n');
	        tam = in.nextInt();
	    }
	}

}
