

import java.util.Scanner;

public class Factorial11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         for(int i=0;i<t;i++)
         {
                 int n=sc.nextInt();
                 int r=0;
                 while(n>0)
                 {
                	 
                         n=n/5;
                         System.out.println("n"+n);
                         r+=n;
                         System.out.println(r);
                 }
                 System.out.println(r);
         }
	}

}
