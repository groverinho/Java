

import java.util.*;

public class ReverseandAdd10018 {

    public static void main(String[] args) {
      
            Scanner in = new Scanner(System.in);

            int N = in.nextInt();
            while (N-- > 0) 
            {
                long num = in.nextLong();

                int cnt = 0;
                while (true)
                {
                    String cad = String.valueOf(num);
                    String aux = "";

                    for (int i = 0; i < cad.length(); ++i)
                        aux += cad.charAt(cad.length() - i - 1);
                    long reves = Long.parseLong(aux);

                    if (num == reves) break;
                    num += reves;
                    ++cnt;
                }
                System.out.println(cnt + " " + num);
            }
            
            
        
    }
}
