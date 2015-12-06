import java.util.Scanner;

public class doubleString {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			int len=in.nextInt();
			if(len%2==0)
				System.out.println(len);
			else
				System.out.println(len-1);
			casos--;	
		}
		
	}

}
