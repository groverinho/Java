package BEGINNER;
import java.util.Scanner;
public class average2 {
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		double  media = ((in.nextDouble() * 2) + (in.nextDouble() * 3)+(in.nextDouble() * 5))/10;
//		System.out.println("MEDIA = "+Math.rint(media*10)/10);
		System.out.print("MEDIA = ");
		System.out.printf("%.1f\n",media);
	}

}
