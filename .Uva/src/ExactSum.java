import java.util.Arrays;
import java.util.Scanner;
 
class ExactSum {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) 
        {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            Arrays.sort(a);
            int dinero = in.nextInt();
            int x = -1;
            int y = -1;
            for (int i = 0; i < n; i++) 
            {
                int req = dinero - a[i];
                int res = Arrays.binarySearch(a,i+1,n,req);
                if (res >= 0 && (a[res] - a[i] < y - x || (x == -1 && y == -1))) 
                {
                    x = a[i];
                    y = a[res];
                }
            }
            System.out.printf
            (
            "Peter should buy books whose prices are %d and %d.\n\n",x, y
            );
        }
    }
}
	
