


import java.util.Scanner;



/* 4 12 36//3
Input:
4 7 10
2 6 18
0 0 0

Output:
AP 13
GP 54
*/
 class WhatsNext7974 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a1=1,a2=1,a3=1;		
		while (a1!=0 || a2!=0 || a3!=0)
		{
		a1=in.nextInt();
		a2=in.nextInt();
		a3= in.nextInt();
		if (a1==0& a2==0&a3==0)
			break;
		if((a2-a1)==(a3-a2))
		{
			int PA=a3+(a2-a1);//2*a3-a2;
			System.out.println("AP "+PA);
		}
		else
		{
			int PG = a3*(a2/a1);//a3/a2*a3;
			System.out.println("GP "+PG);
		}
		}
		
	}

	
}
