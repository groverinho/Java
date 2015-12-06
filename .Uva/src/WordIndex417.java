import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class WordIndex417 {
 
    static HashMap<String, Integer> mapa = new HashMap<String, Integer>();
 
    public static void main(String[] args) {
 
    	algoritmo();// programacion dinamica ? XD
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) 
        {
            Integer n = mapa.get(in.next());
            System.out.println(n == null ? 0 : n);
        }
    }
 
    public static void algoritmo() 
    {
        int i = 1;
        Queue<String> cola = new LinkedList<String>();
 
        for (Character c = 'a'; c <= 'z'; mapa.put(c.toString(), i++), c++)
        	cola.add(c.toString());
 
        while (!cola.isEmpty()) 
        {
            String letra = cola.poll();
            char ultimo = letra.charAt(letra.length() - 1);
            if (letra.length() == 5 || ultimo == 'z')
                continue;
            for (char j = ++ultimo; j <= 'z'; cola.add(letra + j), j++)
                mapa.put(letra + j, i++);
        }
    }
}