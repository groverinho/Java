

import java.util.Scanner;

public class Julka54 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

	 for(int i = 0; i < 10; i++)
     {
		 int x = in.nextInt();
		 int y = in.nextInt();
		 int z = ( x + y ) / 2;
		 System.out.println(z);
		 z = x - z;
		 System.out.println(z); 
	}
}
}