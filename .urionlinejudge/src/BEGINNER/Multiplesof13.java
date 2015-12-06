package BEGINNER;
import java.util.Scanner;


public class Multiplesof13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int acu = 0;
		int mayor=0, menor;
		mayor = Math.max(a, b);
		menor = Math.min(a, b);
		for (int i = menor; i <=mayor; i++) 
		{
			if (i%13 !=0)
			{
				acu = acu+i;
			}
		}
		System.out.println(acu);
	}

}
