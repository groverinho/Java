import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 31-10-16
 */

public class MarvelousMazes {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea ="";
		while ((linea = in.readLine()) != null)
		{
			if (linea.equals(""))
			{
				System.out.println();
				continue;
			}
		
		
			String v[]=linea.split("!");
			for (int i = 0; i < v.length; i++) {
				int sum=0;
				String a="";
				for (int j = 0; j < v[i].length(); j++) {
					
					if (Character.isDigit(v[i].charAt(j))) {
						sum+=Integer.parseInt(String.valueOf(v[i].charAt(j)));
					}
					else if ((Character.isLetter(v[i].charAt(j))||v[i].charAt(j)=='*')&&v[i].charAt(j)!='b') {
						for (int k = 0; k < sum; k++) {
							a+=String.valueOf(v[i].charAt(j));
						}
						sum=0;
					}
					else if (v[i].charAt(j)=='b') {
						for (int k = 0; k < sum; k++) {
							a+=" ";
						}
						sum=0;
					}
				}
				System.out.println(a);
			}
		
		}
	
	}



}
