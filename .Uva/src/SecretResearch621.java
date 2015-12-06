

import java.io.*;

public class SecretResearch621 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		while (T-- > 0)
		{
			String code = in.readLine();
			if (code.equals("1") || code.equals("4") || code.equals("78"))
				System.out.println("+");
			else if (code.endsWith("35"))
				System.out.println("-");
			else if (code.startsWith("9") && code.endsWith("4"))
				System.out.println("*");
			else if (code.startsWith("190"))
				System.out.println("?");
		}

	}
}
