package BEGINNER;

import java.util.Scanner;
public class PopulationIncrease 
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();

        for(int i = 0; i < n; i++)
        {

            double pa = in.nextDouble();
            double pb = in.nextDouble();

            double g1 = in.nextDouble();
            double g2 = in.nextDouble();

            int years = 0;

            while(pa <= pb && years <= 100)
            {
                pa = (int) (pa * (1 + g1 / 100));
                pb = (int) (pb * (1 + g2 / 100));
                years++;
            }

            if(years > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
            	System.out.println(years + " anos.");
            }

        }

       

    }

}
