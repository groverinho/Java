import java.util.Scanner;
class SerieCuriosa {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n;
		int d;
		while(in.hasNextInt())
		{
			n= in.nextInt();
			d = in.nextInt();
			int []vector = new int[d];
			for (int i = 0; i < vector.length; i++)
				vector[i]=in.nextInt();
			int datoBase = n%d ;
			int incr = n/d ;
			if (datoBase ==0)
			{
				datoBase = d;
				incr = incr - 1;
			}
			System.out.println(vector[datoBase-1] + incr);
			
		}
	}
}
