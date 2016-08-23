import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 23-08-16

public class cola11150 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			int n = in.nextInt();
			int sum = n;
			while(n >= 3)
			{
				sum += n/3;
				n = n/3 + n%3;
			}
			if(n == 2)	sum++;
			System.out.println(sum);
		}

	}

}