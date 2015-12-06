import java.util.*;
import java.io.*;

public class ThrowingCardsAway10935 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(in.readLine());
		while (n!=0) 
		{
			
			List<Integer> cards = new ArrayList<Integer>();
			List<Integer> descartado = new ArrayList<Integer>();
			for (int i = 1; i <= n; ++i)
				cards.add(i);
			while (cards.size() > 1)
			{
				int top = cards.get(0);
				cards.remove(0);
				descartado.add(top);
				
				top = cards.get(0);
				cards.remove(0);
				cards.add(top);
			}
			String strdiscard = descartado.toString();
			strdiscard = strdiscard.substring(1, strdiscard.length() - 1);
			System.out.println("Discarded cards:" + (strdiscard.isEmpty() ? "" : " " + strdiscard));
			System.out.println("Remaining card:" + (cards.isEmpty() ? "" : " " + cards.get(0)));
			n = Integer.parseInt(in.readLine());
		}
	}
}