import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class ASpecialHappyBirthdaySong12554
{

	public static void main(String[] args) throws IOException
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         String cad = "";;
        String []cancion=
        	{
        		"Happy","birthday","to","you","Happy","birthday","to","you"
               ,"Happy","birthday","to","Rujia","Happy","birthday","to","you"
        	};
        int casos =Integer.parseInt(in.readLine());
        Queue<String> colaPersonas=new LinkedList();
        for(int i=0;i<casos;i++)
        	colaPersonas.add(in.readLine());
        
        while (casos>0)
        {
            for(int i=0;i<cancion.length;i++)
            {
                String aux=colaPersonas.remove();
              
                cad = cad + aux + ": "+ cancion[i] + "\n";
                colaPersonas.add(aux);
            }
            casos-=cancion.length;
        }
        System.out.print(cad);
    }
    
}