package BEGINNER;

import java.util.Scanner;

public class ArraySelectionI {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 100; i++)
        {
            double x = in.nextDouble();
            if(x <= 10)
            {
                System.out.printf("A[%d] = ", i);
                if(x % 1 == 0)
                    System.out.printf("%.0f\n", x);
                else
                    System.out.printf("%.1f\n", x);
            }
        }
    }
}
