package BEGINNER;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for(int i = 0; i < casos; i++)
        {
            int n = in.nextInt();
            int sum = 0;

            for(int j = 1; j < n; j++)
            {
                if(n % j == 0)
                {
                    sum += j;
                }
            }
            if(sum == n)
                System.out.println(n + " eh perfeito");
            else
                System.out.println(n + " nao eh perfeito");
        }
    }
}
