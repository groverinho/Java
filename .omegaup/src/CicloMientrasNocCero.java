import java.util.Scanner;


public class CicloMientrasNocCero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int acu = 0;
		while (n!=0)
		{
			acu+=n;
			n = in.nextInt();
		}
		System.out.println(acu);
	}

}
