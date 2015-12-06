

import java.util.*;

public class RatAttack10360 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        for (int i = 0; i < k; ++i) 
        {
            int d = in.nextInt();
            int n = in.nextInt();

            long[][] maps = new long[1025][1025];

            for (int j = 0; j < n; ++j) 
            {
                int x = in.nextInt();
                int y = in.nextInt();
                int size = in.nextInt();
                for (int dy = y - d; dy <= y + d; ++dy)
                    for (int dx = x - d; dx <= x + d; ++dx)
                        if (dy >= 0 && dy < 1025 && dx >= 0 && dx < 1025)
                            maps[dy][dx] += size;
            }

            long max = 0;
            int ymax = 0;
            int xmax = 0;
            for (int x = 0; x < 1025; ++x)
                for (int y = 0; y < 1025; ++y)
                    if (maps[y][x] > max) 
                    {
                        max = maps[y][x];
                        ymax = y;
                        xmax = x;
                    }
            System.out.println(xmax + " " + ymax + " " + max);
        }
    }
}