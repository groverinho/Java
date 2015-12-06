package BEGINNER;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for(int i = 0; i < casos; i++){

            int ini = in.nextInt();
            ini = (ini % 2 == 0) ? ini+1 : ini;
            int num = in.nextInt();
            int sum = 0;

            for(int j = 0; j < num; j++){
                sum += ini;
                ini += 2;
            }

            System.out.println(sum);

        }

    }

}
