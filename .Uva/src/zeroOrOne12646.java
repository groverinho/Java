import java.util.Scanner;


public class zeroOrOne12646 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) 
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if ((a==1&& b==1&& c==1)||(a==0&& b==0&& c==0)) 
			{
				System.out.println("*");
			}
			if ((a==1&& b==1&& c==0)||(a==0&& b==0&& c==1)) 
			{
				System.out.println("C");
			}
			if ((a==1&& b==0&& c==1)||(a==0&& b==1&& c==0)) 
			{
				System.out.println("B");
			}
			if ((a==0&& b==1&& c==1)||(a==1&& b==0&& c==0)) 
			{
				System.out.println("A");
			}
		}
	}

}
