import java.util.Scanner;


public class SpeedLimit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  n = in.nextInt();
		int s[];int t[] ;
		int result = 0;
		while (n!=-1)
		{
			s = new int [n];
			t= new int [n];
			for (int i = 0; i < n; i++)
			{
				s[i]= in.nextInt();
				t[i]= in.nextInt();
			}
			result = s[0]*t[0];
			for (int i = 1; i < t.length; i++)
			{
				result += s[i]* (t[i]-t[i-1]);
			}
			System.out.println(result+ " miles");
			n = in.nextInt();
		}

	}

}
