import java.util.Scanner;


public class PackingforHoliday {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int cont = 1;
		while (casos-- > 0 ) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c= in.nextInt();
			if (a<=20 && b<=20 && c<=20) 
			{
				System.out.println("Case "+cont+": good");
			}
			else
			{
				System.out.println("Case "+cont+": bad");
			}
			cont++;
		}
		
	}

}
