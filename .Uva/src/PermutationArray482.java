import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;
public class PermutationArray482 {
     public static void main(String[] args) throws IOException
     {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
           int cases = Integer.parseInt(in.readLine());
           
           boolean first = true;
            while (cases-->0) 
            {
                in.readLine();
                if(!first)
                    System.out.println();
                
                first = false;
                TreeMap<Integer,String> numeros = new TreeMap<Integer,String>();
                String[] posicion = in.readLine().split("[ ]+"); 
                String[] permutacion = in.readLine().split("[ ]+");
                for(int i=0;i<posicion.length;i++)
                	numeros.put(Integer.parseInt(posicion[i]),permutacion[i]);
                
                
                Entry<Integer,String> salida;
                
                while(!numeros.isEmpty())
                {
                	salida = numeros.pollFirstEntry();
                    System.out.println(salida.getValue());
                }
            }  
    }
}
