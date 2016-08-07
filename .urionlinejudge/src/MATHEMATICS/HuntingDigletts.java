package MATHEMATICS;

import java.util.Scanner;

public class HuntingDigletts {

	public static int Euclides(int a, int b) 
	{
		int r=b;
		while (b> 0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return (a);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v []=new int [n+1];
		int res =1;
		for (int i = 1; i <= n; i++) 
		{
			v[i]=in.nextInt();
		}
		for (int i = 0; i <= n ;i++) {
			int p = v[i];
			int t =1;
			while(p!=i)
			{
				t++;
				p = v[p];
			}
			res = res/Euclides(res,t)*t;
		}
		System.out.println(res);

	}

}
