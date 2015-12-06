package BEGINNER;


import java.util.Scanner;

public class BelowTheSecondaryDiagonal {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        String op = in.nextLine();

        double sum = 0;
        for(int i = 0; i < 12; i++){

            for(int j = 0; j < 12-i; j++){
            	in.nextDouble();
            }

            for(int j = 12-i; j < 12; j++){
                sum += in.nextDouble();
            }

        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/66);

    }

}
