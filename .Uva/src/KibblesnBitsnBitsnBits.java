import java.util.Scanner;

/**
 * Name: Grover Irusta
   Date: 05-10-16
 */

public class kibblis {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int maxi=0;
		int casos = in.nextInt();
		while (casos-->0)
		{
			String a = in.next();
			String signo = in.next();
			String b = in.next();
			int a1 = Integer.parseInt(a,16);
			int b1 = Integer.parseInt(b,16);
			String hexaA = Integer.toBinaryString(a1);
			String hexaB = Integer.toBinaryString(b1);
			maxi = Math.max(hexaA.length(), maxi);
			maxi = Math.max(hexaB.length(), maxi);
	
			for (int i = 0; i <13-hexaA.length() ; i++) {
				System.out.print(0);
			}
			if (signo.equals("+")) {
				 System.out.print(hexaA+" + ");
			}
			else{
				 System.out.print(hexaA+" - ");
			}
			for (int i = 0; i <13-hexaB.length() ; i++) {
				System.out.print(0);
			}
			System.out.print(hexaB);
			if (signo.equals("+")) {
				System.out.println(" = "+(a1+b1));
			}
			else
			{
				System.out.println(" = "+(a1-b1));
			}

		}

	}

}
