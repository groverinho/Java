import java.util.Scanner;


public class RoundHouse {

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int n = in.nextInt(), a=in.nextInt(), b =in.nextInt();
		int d = (a+b)%n;
		if (d<0) 
		{
			d+=n;
		}
		if (d==0)
		{
			d=n;
		}
		System.out.println(d);
	
		}

}
