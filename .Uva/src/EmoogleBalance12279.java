
import java.io.*;
import java.util.*;

public class EmoogleBalance12279 {

   public static void main(String[] args) throws IOException{

         Scanner in = new Scanner((System.in));
         int casos = 1;
         while(true)
         {
             int n = in.nextInt();
             if(n == 0)break;
             int c1 = 0;
             int c2 = 0;
             while(n -- > 0)
             {
                 int value = in.nextInt();
                 if(value == 0)c1++;
                 else c2++;
             }
             System.out.println("Case " + casos + ": " + (c2 - c1));
             casos++;
             
         }
     }
}
