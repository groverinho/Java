

import java.util.Scanner;
 class rectangles4300{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t!=0)
                {	               
	                int sum=0;
	                int i=2;
	                while(i*i<=t)
	                {
	                	System.out.println("pasos"+i*i);
	                        sum+=(t/i)-i+1;
	                        i++;
	                }
	                sum+=t;
	                System.out.println(sum);
	                t=sc.nextInt();
                }
        }
}
