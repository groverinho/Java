package BEGINNER;

import java.util.Scanner;

public class ColumnInArray {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int column = Integer.parseInt(in.nextLine());
        String op = in.nextLine();

        for(int i = 0; i < column; i++)
            in.nextDouble();

        double sum = 0;
        for(int i = 0; i < 11; i++)
        {
            sum += in.nextDouble();
            for(int j = 0; j < 11; j++)
                in.nextDouble();
        }
        sum +=in.nextDouble();

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/12);

    }

}
