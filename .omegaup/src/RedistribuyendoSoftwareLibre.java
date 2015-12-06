import java.util.Scanner;


public class RedistribuyendoSoftwareLibre {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos >0 )
		{
			int n = in.nextInt();
			
			if (n>=3) {
				System.out.println("Ok");
			}
			else
			{
				System.out.println("No");
			}
			casos--;
		}
		

	}

}
