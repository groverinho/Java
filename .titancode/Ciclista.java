import java.util.Scanner;


public class Ciclista {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int subida = in.nextInt();
			int plano = in.nextInt();
			int bajada = in.nextInt();
			int distancias = in.nextInt();
			int s=0, p=0,b=0;
			for (int i = 0; i < distancias; i++)
			{
				int aux = in.nextInt();
				if (aux == 1)
					b++;
				else if(aux == -1)
					s++;
				else if (aux == 0)
					p++;
			}
			double distancia = ((double)(5*b)/bajada)+((double)(5*s)/subida)+((double)(5*p)/plano);
			System.out.printf("%.1f\n",distancia);
		}

	}

}
