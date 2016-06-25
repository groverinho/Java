import java.util.Scanner;


public class magdy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n==1)
		{
		System.out.println("Good Job");	
		}
		else if (n>1) {
			System.out.println("You Rocks Man");
		}
		else
			System.out.println("Don't be lazy, it takes only few minutes, you can do it.");

	}

}
