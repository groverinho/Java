import java.util.Scanner;


public class RoyAndProfilePicture {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++) 
		{
			int ancho = in.nextInt();
			int alto = in.nextInt();
			if (ancho < n || alto < n)
			{
				System.out.println("UPLOAD ANOTHER");
			}
			else if (ancho == n && alto == n)
			{
				System.out.println("ACCEPTED");
			}
			else if (ancho > n && alto > n)
			{
				System.out.println("CROP IT");
			}
		}
	}

}
