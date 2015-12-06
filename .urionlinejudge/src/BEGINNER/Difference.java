package BEGINNER;
import java.util.Scanner;


public class Difference
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);//(A * B - C * D)
		System.out.println("DIFERENCA = "+((in.nextInt()*in.nextInt())-(in.nextInt()*in.nextInt())));
	}

}
