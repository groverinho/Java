import java.util.Scanner;

public class AbsoluteDifference {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			int [] vector = new int[n];
			int d = in.nextInt();
			for (int i = 0; i < vector.length; i++) {
				vector[i]=in.nextInt();
			}
			boolean bandera = true;
			for (int i = 1; i < vector.length; i++) {
				if (vector[i]-vector[i-1]>d)
				{
					bandera = false;break;
				}
			}
			System.out.println(bandera?"YES":"NO");
		}
	}

}
