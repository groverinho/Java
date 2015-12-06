import java.io.*;
public class Digits11687 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String x;
		while (!(x = in.readLine()).equals("END")) 
		{
			int i = 1;
			
			while (true) 
			{
				String xi = String.valueOf(x.length());
				if (xi.equals(x))
				{
					System.out.println(i);
					break;
				}
				x = xi;
				++i;
			}
		}
		
		in.close();
		System.exit(0);
	}
}