package BEGINNER;

import java.util.Scanner;

public class ArrayChangeI {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vector = new int[20];

        for(int i = 0; i < 20; i++){

        	vector[i] = in.nextInt();

        }

        for(int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %d\n", i, vector[19-i]);
        }

    }

}
