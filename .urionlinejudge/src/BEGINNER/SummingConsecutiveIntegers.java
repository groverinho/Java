package BEGINNER;

import java.util.Scanner;

public class SummingConsecutiveIntegers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        while(n <= 0){
            n = in.nextInt();
        }

        int sum = 0;
        for(int i = a; i < a+n; i++)
            sum += i;
        System.out.println(sum);

    }

}
