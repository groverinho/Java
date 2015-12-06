package BEGINNER;

import java.util.Scanner;

public class GrowingSequences {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(;;)
        {
            int x = in.nextInt();
            if(x == 0)
                break;
            StringBuilder cad = new StringBuilder();
            for(int i = 1; i < x; i++)
                cad.append(i + " ");
            cad.append(x);
            System.out.println(cad.toString());
        }
    }
}
