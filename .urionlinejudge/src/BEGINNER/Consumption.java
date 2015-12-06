package BEGINNER;
import java.util.Scanner;
public class Consumption 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(Math.rint((in.nextInt()/in.nextFloat())*1000)/1000+" km/l");
	}
}
