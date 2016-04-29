import java.util.Scanner;


public class ColorfulStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next(), t = in.next();
		int c=0;
		for (int i=0 ; i<t.length(); i++)
		{			
			if (s.charAt(c)==t.charAt(i))
			{
				c++;
			}					
		}
		System.out.println(c+1);

	}

}
