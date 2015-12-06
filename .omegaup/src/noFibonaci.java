import java.util.ArrayList;
import java.util.Scanner;


public class noFibonaci {

	public static long fiboIterativo(long n)
	{
		if(n <= 2){
			if(n==0)
				return 1;
			else
		return n;
		}
		long res = 0;
		long act = 1;
		long ant = 0;
		long i = 0;
		while( i < n )//n-1
		{
		long temp;
		res = act + ant;
		temp = act;
		act = res;
		ant = temp;
		i++;
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		ArrayList<Integer> fibos = new ArrayList<Integer>();
		for (long i = 0; i <= n; i++)
		{
			//fibos.add(fiboIterativo(i));
			if (fiboIterativo(i)<=n) {
				System.out.println(fiboIterativo(i));	
			}
			
	
		}
	/*	for (int j = 0; j < fibos.size(); j++) {
			System.out.println(fibos.get(fiboIterativo(j)));	
		}*/
		
	}
}
