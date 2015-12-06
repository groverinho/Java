import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
public class MinimumLandPrice11824 
{
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        int casos = Integer.parseInt(in.readLine());
        while (casos-- > 0) 
        {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            int n = Integer.parseInt(in.readLine());
            while (n != 0) 
            {
                lista.add(n);
                n = Integer.parseInt(in.readLine());
 
            }
            Collections.sort(lista);
            int i = 1;
            int sum = 0;
            for (int j = lista.size() - 1; j >= 0; j--)
            {
                sum += 2 * Math.pow(lista.get(j), i);
                i++;
            }
            if (sum > 5000000)
                System.out.println("Too expensive");
            else
                System.out.println(sum);
        }
    }
 
}