

import java.util.*;

public class BeattheSpread10812 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            int s = in.nextInt();
            int d = in.nextInt();

            int a = (s + d) / 2;
            int b = s - a;

            if (a >= 0 && b >= 0 && a - b == d)
                System.out.println(a + " " + b);
            else
                System.out.println("impossible");
        }
    }
}
