package BEGINNER;

import java.util.Scanner;

public class LogicalSequence2 {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        StringBuilder sb = new StringBuilder();

        int j = 1;

        for(int i = 1; i < y; i++)
        {
            sb.append(i);
            if(j == x)
            {
                j = 1;
                sb.append("\n");
            }
            else
            {
                j++;
                sb.append(" ");
            }
        }

        sb.append(y);
        System.out.println(sb);

    }

}
