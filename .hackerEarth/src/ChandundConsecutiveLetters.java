import java.util.Scanner;


public class ChandundConsecutiveLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos -->0)
		{
			String cad = in.next();
			System.out.print(cad.charAt(0));
			for (int i = 0; i < cad.length(); i++) 
			{
				if (i+1<cad.length()) {
					
			
				if (cad.charAt(i)!=cad.charAt(i+1))
				{
					System.out.print(cad.charAt(i+1));
				}
				}
			}
			System.out.println();
		}

	}

}
