import java.util.Scanner;


public class FancyFence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		while (n-->0) 
			{
			int angulo  = in.nextInt();
			System.out.println(360%(180-angulo) == 0?"YES":"NO");
		}
	}

}
