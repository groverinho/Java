

import java.util.Scanner;
 class emparejandoPeones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for(int j1=0;j1<casos;j1++)
		{
			int n= in.nextInt();
			int s[] = new int[n];
			for (int i = 0; i < n; i++)
			 s[i]=in.nextInt();

			for (int i = n - 1; i >0; i--) 
			{
				if(s[i]>1)
					s[i-1]+=s[i]/2;
			}
			System.out.println(s[0]);
		}
		}
	

}
