package MATHEMATICS;
import java.util.Scanner;


public class CollectableCards {

	public static int Euclides(int a, int b) 
	{
		int r=b;
		while (b> 0){
		r=a%b;
		a=b;
		b=r;
		}
		return (a);
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		while (n>0)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(Euclides(a, b));
			n--;
		}
	}

}
