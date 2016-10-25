import java.util.Arrays;
import java.util.Scanner;
/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 19-10-16
 */

public class taxitravel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos-->0) {
			int n = in.nextInt();

			int vector[] = new int [5];
			
				for (int i = 0; i < n; i++) 
			{
					vector[in.nextInt()]++;
			}
				int c=vector[4];
				int sobrante=0;

					
				if (vector[3]>vector[1]) {
					c += vector[3];
					vector[1]=0;
					
					//3
				}
				else
				{
					c+= vector[3];
					vector[1]-=vector[3];
				}
			
				if (vector[2]%2==0)
				{
					c +=(vector[2]/2);
					vector[2]=0;
				}
				else
				{
					if (vector[1]==0) {
						c+= Math.ceil(vector[2]/(double)2);
						vector[2]=0;
					}
					else
					{
						c+= vector[2]/2;
						vector[2]-=vector[2]/2;
					}
				}
				if (vector[2]>0)
				{
					if (vector[1]<=2)
					{
						vector[1]=0;
						c++;
					}
					else {
						c++;
						vector[1]-=2;
					}
				}
				if (vector[1]>0) {
					c += Math.ceil((vector[1])/(double)4);
				}
				
				
				System.out.println(c);
				
				
//			Arrays.sort(vector);
//			int taxis=0;
//			int l = 0;
//			for (int i = vector.length-1; i >=l; i--)
//			{
//				if(vector[i]==4)
//					taxis++;
//				else if (vector[i]==3) 
//				{
//					if (vector[l]==1)
//					{
//						taxis++;
//						l++;
//					}
//				
//				}
//				else if (vector[i]==2)
//				{
//					if (vector[l]==2)
//					{
//						taxis++;
//						l++;
//					}
//					
//				}
//				else if (vector[i]==1)
//				{
//					int index = l;
//					int cuatro=-1;
//					taxis++;
//					while (i>=l)
//					{
//						
//						i--;
//						cuatro++;
//						if (cuatro==4) {
//							taxis++;
//							cuatro=0;
//						}
//					}
//					
//				}
//			}
//			System.out.println(taxis);
			
		}


	}

}
