import java.util.Scanner;


public class bold {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos >0 )
		{
			int p = in.nextInt();
			String letra = in.next();
			int B = 0;
			int N = 0;
			for (int i = 0; i < letra.length(); i++) 
			{
				if (letra.charAt(i)=='B')
				{
					B++;
				}
				if (letra.charAt(i)=='N')
				{
					N++;
				}
				
			}
			if (B==p) {
				System.out.println("Bold");
			}
			if (N==p)
			{
				System.out.println("Non bold");
			}
			else if (B!=p )
				System.out.println("Some bold");
			casos--;
		}
	}
	

}
