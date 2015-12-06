import java.util.Arrays;
import java.util.Scanner;

public class AutomateTheGrades11777 {

   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       for (int i = 1; i <= t; i++)
       {
           int sum = 0;
           for (int j = 0; j < 4; j++)
               sum += in.nextInt();
           int[] a = { in.nextInt(), in.nextInt(), in.nextInt() };
           Arrays.sort(a);
           sum += (a[1] + a[2]) / 2;
           char c;
           if (sum >= 90)
               c = 'A';
           else if (sum >= 80)
               c = 'B';
           else if (sum >= 70)
               c = 'C';
           else if (sum >= 60)
               c = 'D';
           else
               c = 'F';
           System.out.println("Case " + (i) + ": " + c);
       }
   }
}