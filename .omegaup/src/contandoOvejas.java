import java.util.Scanner;


public class contandoOvejas {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos >0 )
		{
			int p = in.nextInt();
			int oveja=0;
			while (p>0)
			{
				String animal = in.next();
				if (animal.equals("oveja")) {
						oveja++;
				}
				p--;
			}
			System.out.println(oveja);
			casos--;
		}
	}

}
