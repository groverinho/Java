import java.util.Scanner;


public class OddSum10783 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int j = 0; j < casos; j++)
		{
			
		
			int a = in.nextInt();
			int b= in.nextInt();
			int suma = 0;
			for (int i =a; i <= b; i++)
			{
				if (i%2!=0) 
				{
					suma += i;
				}
			}
			System.out.println("Case "+(j+1) +": "+suma);
			
		}
		
	}

}
