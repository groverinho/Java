import java.util.Scanner;


public class JumpingMario11764 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos, hj, j,n,cur, prev, count=1;

		casos = in.nextInt();

		while(casos-- >0)
		{
			n = in.nextInt();
			prev = in.nextInt();

			hj=j=0;
			for(int i=0;i<n-1;i++)
			{
				cur = in.nextInt();
				if(cur>prev)hj++;
				if(cur<prev)j++;
				prev = cur;
			}

			System.out.printf("Case %d: %d %d\n",count++,hj,j);
		}

	}

}
