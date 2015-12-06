import java.util.Scanner;


public class MediaArmonica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int cont_caso=1;
		while (casos >0 )
		{
			
			double n = in.nextInt();
			double [] vector = new double [(int) n];
			double sub=0;
			for (int i = 0; i < n; i++) 
			{
				vector[i]= in.nextInt();
				sub = sub + (1/vector[i]);
			}
			//System.out.println(sub);
			double resultado = 1/((1/n)*sub);
			System.out.print("Caso "+cont_caso+": ");
			System.out.printf("%.4f\n",resultado);
			cont_caso++;
			casos--;
		}
	}

}
