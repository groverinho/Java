package MATHEMATICS;

import java.util.Scanner;

public class ChristmasDecorations {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
         while(in.hasNextDouble())
         {
        	 double a=in.nextDouble(),b=in.nextDouble(),c=in.nextDouble(),tmp,angulo,ans;
        	 angulo=Math.tan( a * 3.141592654 / 180.0 );
               tmp=angulo*b;
               ans=tmp+c;
               System.out.printf("%.2f\n",ans*5);
         }

	}

}
