import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;


public class ThatisYourQueue {

	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int ind = 1;
        while ((cadena = in.readLine()) != null) 
        {
            if (cadena.equals("0 0")) 
                break;
            
            StringTokenizer token = new StringTokenizer(cadena);
            int p = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());
            System.out.println("Case " + (ind++) + ":");
            Queue<Integer> cola = new ArrayDeque<Integer>();
            if (p > 1000) 
                p = 1000;
            
            for (int i = 1; i <= p; i++) 
            	cola.offer(i);
            
            String[] aux;
            for (int i = 0; i < c; i++) 
            {
                cadena = in.readLine();
                aux = cadena.split(" ");
                if (aux.length == 1)
                {
                    int x = cola.poll();
                    System.out.println(x);
                    cola.offer(x);
                } 
                else 
                {
                    int x = Integer.parseInt(aux[1]);
                    Integer[] qq = cola.toArray(new Integer[0]);
                    cola.clear();
                    cola.offer(x);
                    for (int j : qq) 
                    {
                        if (j != x) 
                        	cola.offer(j);
                    }
                }
            }
        }
    }
}
