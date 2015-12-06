package BEGINNER;
import java.util.Scanner;
public class average1 {
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		double  media = ((in.nextDouble() * 3.5) + (in.nextDouble() * 7.5))/11;
		System.out.printf("MEDIA = %.5f\n",media);
	}

}
