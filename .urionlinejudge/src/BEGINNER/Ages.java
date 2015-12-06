package BEGINNER;

import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for(;;)
        {
            int age = in.nextInt();
            if(age < 0)
                break;
            sum += age;
            cnt++;
        }
        System.out.printf("%.2f\n", (double) sum / cnt);

    }

}
