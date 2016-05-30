import java.util.Scanner;


public class DesafiodeBino {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int dos=0, tres = 0, cuatro=0, cinco=0;
		for (int i = 0; i < n; i++)
		{
			int l  = in.nextInt();
			if (l%2==0)
			{
				dos++;
			}
			if (l%3==0) {
				tres++;
			}
			if (l%4==0) {
				cuatro++;
			}
			if (l%5==0) {
				cinco++;
			}

			
		}
		System.out.println(dos+" Multiplo(s) de 2");
		System.out.println(tres+" Multiplo(s) de 3");
		System.out.println(cuatro+" Multiplo(s) de 4");
		System.out.println(cinco+" Multiplo(s) de 5");
	}

}
