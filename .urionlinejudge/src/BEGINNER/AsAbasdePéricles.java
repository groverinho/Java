import java.util.Scanner;


public class AsAbasdePéricles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int m = in.nextInt();
		while (m-->0)
		{
			String cad = in.next();
			if (cad.equals("fechou")) {
				n++;
			}
			else if (cad.equals("clicou"))
			{
				n--;
			}
		}
		System.out.println(n);
	}

}
