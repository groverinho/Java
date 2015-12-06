import java.util.Scanner;

	
public class SumaTriple {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int []f = new int[65];
		int n,i;
		n = in.nextInt();
		f[1] = 1;
		f[2] = 1;
		f[3] = 2;
		for(i=4; i<=n; ++i){
			f[i] = f[i-3]+f[i-2]+f[i-1];
		}
		for(i=1; i<=n; ++i)
		{
			if (i==n)
			 System.out.println(f[i]);	
			else
				 System.out.print(f[i]+" ");
		}

	}

}
