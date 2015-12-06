import java.util.Arrays;
import java.util.Scanner;


public class Triángulo {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int [ ] vector  = new int[3];
		for (int i = 0; i < vector.length; i++) {
			vector[i]= in.nextInt();
		}
		Arrays.sort(vector);
		//((A*A) == ((B*B) + (C*C))) 
		if((vector[2]*vector[2])== ((vector[0]*vector[0])+(vector[1]*vector[1])))
		{
			System.out.println(vector[2]+" "+vector[1]+" "+vector[0]);
		}
		else
		{
			System.out.println("imposible");
		}
	}

}
