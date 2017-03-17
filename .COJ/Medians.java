import java.util.Scanner;

public class Medians {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double s = (a+b+c)/(double)2;
		double r = (4/(double)3) * (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		if (r>0.0) 
			System.out.printf("%.3f\n", r);	
		else
			System.out.println("-1.000");
		}
		

	}

}
