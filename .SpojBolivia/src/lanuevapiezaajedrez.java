import java.util.*;
class lanuevapiezaajedrez
{
	static int con=1;
	public static void main(String[] args) 
	{
		Scanner en=new Scanner(System.in);
		int q=en.nextInt();
		for(int i=0;i<q;i++)
		{
			con=1;
			int n=en.nextInt();
			int nt=en.nextInt();
			int x[]=new int[nt];
			int y[]=new int[nt];
			for(int j=0;j<nt;j++)
			{
				x[j]=en.nextInt();
				y[j]=en.nextInt();
			}
			int m[][]=new int[n][n];
			m[0][0]=1;
			contar(nt,n,x,y,m,0,0);
			System.out.println(con);
		}
	}
	static void contar(int nt,int n, int x[],int y[],int m[][],int a, int b)
	{
		for(int i=0;i<nt;i++)
		{
			if(a+x[i]>=0 && a+x[i]<n && b+y[i]>=0 && b+y[i]<n && m[a+x[i]][b+y[i]]==0)
			{
				m[a+x[i]][b+y[i]]=1;
				con++;
				contar(nt,n,x,y,m,a+x[i],b+y[i]);
			}
		}
		return;
	}
} 