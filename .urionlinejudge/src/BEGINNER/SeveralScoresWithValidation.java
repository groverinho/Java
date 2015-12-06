package BEGINNER;

import java.util.Scanner;

public class SeveralScoresWithValidation {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int valid = 0;
        double sum = 0;
        for(;;)
        {
            if(valid == 2)
            {
                System.out.println("novo calculo (1-sim 2-nao)");
                double input = in.nextDouble();
                if(input == 1)
                {
                    valid = 0;
                    sum = 0;
                }
                else if(input == 2)
                {
                    break;
                } 
            }
            else
            {
                double score = in.nextDouble();
                if(score < 0 || score > 10)
                    System.out.println("nota invalida");
                else
                {
                    valid++;
                    sum += score;
                    if(valid == 2)
                        System.out.printf("media = %.2f\n",  sum / valid);
                }
            }
        }
    }
}
