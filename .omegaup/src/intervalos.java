import java.util.Arrays;
import java.util.Scanner;


public class intervalos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	int [ ] vector1 = new int [3] ;
	vector1[0]= in.nextInt();
	vector1[1]= in.nextInt();
	vector1[2]= in.nextInt();
	int aux = vector1[2];
	Arrays.sort(vector1);
	if (aux == vector1[1])
	{
		System.out.println("INTERVALO");
	}
	else if (aux == vector1[0])
	{
		System.out.println("IZQUIERDA");
	}
	else if (aux == vector1[2])
	{
		System.out.println("DERECHA");
	}
		}

}
