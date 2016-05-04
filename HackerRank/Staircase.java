import java.util.Scanner;


public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String a = "#";
		String aux = "";
		int n2=n;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 0; j < n2-1; j++) 
			{
				aux +=" ";
			}
			n2--;
			System.out.println(aux+a);
			aux="";
			a+= "#";
		}

	}

}
