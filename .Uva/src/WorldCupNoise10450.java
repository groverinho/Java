

import java.util.Scanner;

public class WorldCupNoise10450 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long[] fib = new long[52];
        fib[1] = 1;
        fib[0] = 1;
        for (int i = 2; i <= 51; i++) 
            fib[i] = fib[i - 1] + fib[i - 2];
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            System.out.println("Scenario #" + (i + 1) + ":");
            System.out.println(fib[a + 1] + "\n");
        }
    }
}
