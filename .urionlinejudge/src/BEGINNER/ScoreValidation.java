package BEGINNER;

import java.util.Scanner;

public class ScoreValidation {

    public static void main(String[] args) 
    {    
        Scanner s = new Scanner(System.in);
        int valid = 0;
        double sum = 0;
        for(;;)
        {
            double score = s.nextDouble();
            if(score < 0 || score > 10)
                System.out.println("nota invalida");
            else
            {
                valid++;
                sum += score;
                if(valid == 2)
                {
                    System.out.printf("media = %.2f\n",  sum / valid);
                    break;
                }
            }

        }

    }

}
