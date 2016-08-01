package BEGINNER;


import java.util.Scanner;

public class HighestandPosition {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= 100; i++){

            int x = in.nextInt();

            if(x > max){
                max = x;
                index = i;
            }

        }

        System.out.println(max);
        System.out.println(index);

    }

}

