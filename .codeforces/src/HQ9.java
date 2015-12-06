import java.util.Scanner;


public class HQ9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String a = "HQ9";
boolean holajejeje= true;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < a.length(); j++)
			{
				if (s.charAt(i)==a.charAt(j)) {
					holajejeje = false;
					break;
				}
			}
		}
		if (holajejeje==false) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
			
	}

}
