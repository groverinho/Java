import java.util.ArrayList;
import java.util.Scanner;
public class StringManipulation1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> lista[] = new ArrayList[26];
		int k = Integer.parseInt(in.nextLine());
		String s= in.nextLine();
		int n = Integer.parseInt(in.nextLine());
		String c=s;
		k--;
		
		while(k-- >0)
		    s+=c;
		
		for(int i=0;i<s.length();i++)
		{
			int aux =s.charAt(i) - 'a'; 
		    if(lista[aux] == null)
		    {
		    	lista[aux] = new ArrayList<Integer>();
		    }
		    lista[aux].add(i);
		}
		StringBuilder cadAux= new StringBuilder(s);
		while(n-- >0)
		{
		    int p = in.nextInt();
		    c = in.nextLine();
		    int j = lista[c.charAt(1)-'a'].get(p-1);
		    lista[c.charAt(1)-'a'].remove(p-1);
		    cadAux.setCharAt(j,'.');
		}
		c = cadAux.toString().replaceAll("\\.", "");//remplaza punto
		System.out.println(c);
	}
}