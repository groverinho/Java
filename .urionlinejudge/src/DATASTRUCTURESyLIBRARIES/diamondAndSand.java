package DATASTRUCTURESyLIBRARIES;
import java.util.Scanner;

	
public class diamondAndSand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String diamantes;
		int casos, aux, total;
		casos = in.nextInt();
		for (int a=0; a<casos; a++)
		{
			aux = total = 0;
			diamantes = in.next();
			for (int b=0; b<diamantes.length(); b++)
			{
				if(diamantes.charAt(b)=='<')
					aux++;
				if(diamantes.charAt(b)=='>')
				{
					if(aux>0)
					{
						total++;
						aux--;
					}
				}
			}
		System.out.println(total);

	}
	}
}
