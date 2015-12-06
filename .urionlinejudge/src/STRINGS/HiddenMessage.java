package STRINGS;

 import java.util.Scanner;
public class HiddenMessage {
    
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        String aux = "";
        String n = in.nextLine();
        int nn = Integer.parseInt(n);
        for(int i = 0; i < nn; i++)
        {
            String line = in.nextLine();
            boolean espacio = true;
            for(int j = 0; j < line.length(); j++)
            {
                char c = line.charAt(j);
                if(c == ' ')
                    espacio = true;
                else
                {
                    if(espacio)
                        aux = aux + c+"";
                    espacio = false;
                }
            }
            System.out.println(aux);
            aux="";
        }
      
    }
}