package BEGINNER;

import java.util.Scanner;

public class LowestNumberAndPosition {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int min = Integer.MAX_VALUE;
        int pos = 0;

        for(int i = 0; i < n; i++){

            int x = in.nextInt();

            if(x <= min){

                min = x;
                pos = i;

            }

        }

        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + pos);

    }

}
