package WarmUPLvl1nro3;
import java.util.ArrayList;
import java.util.Scanner;


public class KimoAnddivisores {

	public static void main(String[] args) {
		
		/*Scanner in  = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i =1; i <= 178; i++)
		{
			lista.add(i*i);
			//int aa = i*i;
			
		}
		for (int i = 0; i < 178; i++) {
			System.out.println(lista.get(i));
		}
		int casos = in.nextInt();
		while(casos>0)
		{
			int n = in.nextInt();
			boolean bandera = true;
			
	jajaja:	for (int i = 0; i < lista.size(); i++) 
			{
				if(n==lista.get(i))
				{
					bandera = false;
					break jajaja;
				}
			}
			if (bandera == true)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
			casos--;
		}*/
		Scanner in  = new Scanner(System.in);
		int casos = in.nextInt();
		while(casos>0)
		{
			int n = in.nextInt();
			//System.out.println(divisors(n));
			if (n==1) {
				System.out.println("YES");
			}
			else
			{
				if (divisors(n)%2==0)
				{
					System.out.println("NO");
				}
				else
					System.out.println("YES");
			}
			casos--;
		}
		
	}
	public static int divisors(int x)
	{
	    int limit = x;
	    int numberOfDivisors = 0;

	    for (int i=1 ; i < limit; ++i) {
	        if (x % i == 0)
	        {
	            limit = x / i;
	            if (limit != i) 
	            {
	                numberOfDivisors++;
	            }
	            numberOfDivisors++;
	        }
	    }

	    return numberOfDivisors;
	}

}
/*Scanner in  = new Scanner(System.in);
		int casos = in.nextInt();
		while(casos>0)
		{
			int n = in.nextInt();
			int cont = 0;
			for (int i =1; i <= n; i++)
			{
				if (n%i==0) {
					cont++;
				}
			}
			if (cont%2==0)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
			casos--;
		}
		}*/