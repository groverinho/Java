package BEGINNER;

import java.util.Scanner;

public class LineInArray {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int line = Integer.parseInt(in.nextLine());
        String op = in.nextLine();

        for(int i = 0; i < 12 * line; i++){
            in.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < 12; i++){
            sum += in.nextDouble();
        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/12);

    }

}
