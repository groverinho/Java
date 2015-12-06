package ADHOC;

import java.util.Scanner;

public class GameOfTheGreatest {

	 public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int casos ;
		    while ((casos=in.nextInt())!=0)
		    {
		        int puntosA=0;
		        int puntosB=0;
		        while (casos>0)
		        {
		            int a = in.nextInt();
		            int b = in.nextInt();
		            if (a>b) 
		            {
		                puntosA++;
		            }
		            else if (b>a)
		            {
		                puntosB++;
		            }
		            casos--;
		        }
		        System.out.println(puntosA+" "+puntosB);
		    }
		    }

}
