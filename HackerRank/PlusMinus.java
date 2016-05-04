import java.util.Scanner;


public class PlusMinus {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int vector[] = new int [n];
	double positivo=0, negativo=0, cero=0;
	for (int i = 0; i < vector.length; i++) {
		vector[i] = in.nextInt();
		if (vector[i]>0)
		{
			positivo++;
		}
		else if(vector[i]<0)
		{
			negativo++;
		}
		else if (vector[i]==0)
		{
			cero++;
		}
	}
	
	System.out.printf("%.6f\n",(positivo)/vector.length);
	System.out.printf("%.6f\n",(negativo)/vector.length);
	System.out.printf("%.6f\n",(cero)/vector.length);

	
	}

}
