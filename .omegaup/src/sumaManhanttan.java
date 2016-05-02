import java.util.Scanner;


public class sumaManhanttan {

	public static long Euclides(long a, long b) 
	{
		long auxN= Math.abs(a);
		long auxD= Math.abs(b);
		long r=auxD;
		while (auxD> 0){
		r=auxN%auxD;
		auxN=auxD;
		auxD=r;
		}
		return (auxN);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0)
		{
			long a = in.nextLong();
			long b = in.nextLong();
			
			if (Euclides(a, b)==1)
			{
				System.out.println("SI");
			}
			else
				System.out.println("NO");
		}
		
	}

}
