import java.util.Scanner;


public class GirlfriendDemands {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.next();
		int casos = in.nextInt();
		long aux = cad.length();
		while (casos>0)
		{
			long ini = in.nextInt();
			long fin = in.nextInt();
			ini--; fin--;
			ini = ini % aux;
			fin = fin % aux;
			if (cad.charAt((int) ini)==cad.charAt((int) fin))
				System.out.println("Yes");
			else
				System.out.println("No");
			
			
			casos--;
			
		}
	}

}
