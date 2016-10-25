/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 20-10-16
 */


import java.util.Scanner;

public class sodaSurpler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int casos = in.nextInt();
while (casos-->0)
{
	int e= in.nextInt();
	int f = in.nextInt();
	int c = in.nextInt();
	
	int sum = e + f, sodas = 0;
	boolean infi = false;
	while(sum >= c){
		sum -= c;
		sodas++;
		sum++;
		if(c == 1)
		{
			infi = true;
			break;
		}
	}
	if(infi)
		System.out.println(0);
	else
		System.out.println(sodas);
}
	}

}
