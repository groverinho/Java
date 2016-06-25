import java.util.Scanner;
import java.util.StringTokenizer;


public class addthemtwice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double acu = 0.0;
		
		while (in.hasNext())
		{
			StringTokenizer cad = new StringTokenizer(in.nextLine());
			while(cad.hasMoreTokens())
				acu += Double.parseDouble(cad.nextToken());
		}
		
		System.out.printf("%.6f", acu * 2);

	}

}
