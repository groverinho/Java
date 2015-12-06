import java.util.Scanner;


public class BrickWallPatterns900
{
	public static long fiboIterativo(int n)
	{
		if(n <= 2){
			if(n==0)
				return 1;
			else
		return n;
		}
		long res = 0;
		long act = 1;
		long ant = 0;
		long i = 0;
		while( i < n )//n-1
		{
		long temp;
		res = act + ant;
		temp = act;
		act = res;
		ant = temp;
		i++;
		}
		return res;
	}



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  int  n = in.nextInt();
		 while(n!=0)
		 {
			System.out.println(fiboIterativo(n));
			 n = in.nextInt();
		}

	}

}
