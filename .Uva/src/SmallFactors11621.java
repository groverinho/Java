import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
public class SmallFactors11621 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Long> list = new ArrayList<Long>();
        for (int i = 0; i <= 20; i++)
            for (int j = 0; j <= 31; j++)
                list.add((long) (Math.pow(2, j) * Math.pow(3, i)));
        Collections.sort(list);
      
        while (true) 
        {
            long n = Integer.parseInt(entrada.readLine());
            if (n == 0)
                break;
            int i = 0;
            while (list.get(i) < n)
            {
                i++;
            }
             System.out.println(list.get(i));
        }
        
    }
 
}