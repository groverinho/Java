import java.util.Scanner;


public class ApplemanAndEasyTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String[] s = new String[n];
		for(int i=0 ; i<n ; i++)
		{
			s[i] = in.next();
		}
		if(n==0 || n==1)
		{
			System.out.println("YES");
			System.exit(0);
		}
		for(int i=((int)n/2)-1 ; i<n ; i++)
		{
			if(s[i].equals(s[n-1-i]) || s[i].equals(reverso(s[n-1-i])))
				continue;
			else
			{
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
	
	public static String reverso(String x)
	{
		StringBuilder s = new StringBuilder(x);
		return s.reverse().toString();
	}}