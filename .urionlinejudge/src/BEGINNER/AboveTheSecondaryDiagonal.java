package BEGINNER;


import java.util.Scanner;

public class AboveTheSecondaryDiagonal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String op = in.nextLine();

        double sum = 0;
        for(int i = 11; i >= 0; i--){

            for(int j = 0; j < i; j++){
                sum += in.nextDouble();
            }

            for(int j = i; j < 12; j++){
            	in.nextDouble();
            }

        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/66);

    }

}
