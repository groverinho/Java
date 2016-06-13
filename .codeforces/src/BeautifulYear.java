import java.util.Scanner;


public class BeautifulYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n=n+1;
		String cad = n+"";
		boolean bandera = false;
		while (true) 
		{

	jojo:	for (int i = 0; i < cad.length(); i++)
			{
				for (int j = i+1; j < cad.length() ; j++) 
				{
					if (cad.charAt(i)==cad.charAt(j))
					{
						bandera = true;
						break jojo;
					}
				}
			}
			if (bandera)
			{
				cad = 	(Integer.parseInt(cad)+1)+"";
				bandera = false;
			}
			else
				break;
		}
		System.out.println(cad);
	}
	

}
