
import java.util.*;

public class IndianSummer {
//Indian Summer
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        HashSet<String> hash = new HashSet<String>();
		String cad = in.nextLine();
		int n = Integer.parseInt(cad);
for (int i = 0; i < n; i++) 
{
	hash.add(in.nextLine());
	
}
System.out.println(hash.size());
    }
}