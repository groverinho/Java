import java.util.Scanner;


public class HayFraude {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			String solucion = in.next();
			
			String petardos = in.next();
			String solucionN="";
			for (int j = 0; j < solucion.length(); j++) {
				
			
			int c=1;

			for (char i = 'A' ; i <='Z'; i++)
			{
				if (solucion.charAt(j)==i)
				{
					solucionN += c+"";
					break;
				}
				c++;
			}
			
			}
			if (solucionN.contains(petardos))
			{
				System.out.println("FRAUDE");
			}
			else System.out.println("NO HAY FRAUDE");
		}
	}

}
