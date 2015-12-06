import java.util.Scanner;


public class FibonaccimalBase948 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int vector[] = new int[39];
		int n, m ,indice;
		vector[0]=1;
		vector[1]=1;
		for (int i = 2; i <= 38; i++)
		{
			vector[i]= vector[i-1]+ vector[i-2];
			System.out.println(vector[i]);
		}
		n=in.nextInt();
		for (int j = 0; j < n; j++)
		{
			m= in.nextInt();
			indice = vector.length-1;
			while (m< vector[indice]) 
			{
				indice--;
			}
			System.out.print(m+ " = ");
			for (int i = indice; i >=1; i--) 
			{
				if (m>=vector[i]) {
					System.out.print(1);
					m = m-vector[i];
				}
				else
					System.out.print(0);
			}
			System.out.println(" (fib)");
		}
		

	}

}
