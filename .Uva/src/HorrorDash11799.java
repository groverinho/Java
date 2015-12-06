import java.util.Scanner;

public class HorrorDash11799 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int z = 0; z < cases; z++)
        {
            int amt = in.nextInt();
            int max = 0;
            for (int i = 0; i < amt; i++) 
            {
                max = Math.max(max, in.nextInt());
            }
            System.out.println("Case " + (z + 1) + ": " + max);
        }
    }
}