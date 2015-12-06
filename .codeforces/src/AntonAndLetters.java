
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String cad = in.nextLine();
        cad = cad.replaceAll("[{}, ]", "");
        Set<String> distintos = new HashSet<String>();

        for (int i = 0; i < cad.length(); i++)
        {
        	distintos.add(cad.charAt(i)+"");
        	
        }
        System.out.println(distintos.size());
    }
}