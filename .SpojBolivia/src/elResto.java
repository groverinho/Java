import java.util.Scanner;

 class elResto {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int x;
		int n;
		while(in.hasNextInt());
		{
			 x = in.nextInt();
			 n = in.nextInt();
			int f[] = new int[x];
			f[0]=1;
			f[1]=1;
			for(int i = 2; i<=n; i++ ) 
			{
				f[i] = f[i-1] + f[i-2];
			}
			System.out.println(f[n]%x);
		}	
	}
}
