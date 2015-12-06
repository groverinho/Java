package BEGINNER;
import java.util.Scanner;


public class TimeConversion {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hora =0, minuto = 0;
		while (n>=3600)
		{
			n = n-3600;
			hora++;
		}
		while(n>=60)
		{
			n = n-60;
			minuto++;
		}
		System.out.println(hora+":"+minuto+":"+n);
	}
}
