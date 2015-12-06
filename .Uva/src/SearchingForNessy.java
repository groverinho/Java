import java.util.Scanner;
public class SearchingForNessy 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-- > 0)
			System.out.println((in.nextInt()/3)*(in.nextInt()/3));		
	}
}
