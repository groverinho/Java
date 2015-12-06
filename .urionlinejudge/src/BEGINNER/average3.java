package BEGINNER;
import java.util.Scanner;


public class average3 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

			
		
		double a = in.nextDouble(),b= in.nextDouble(),c = in.nextDouble(), d = in.nextDouble();
		double media = (a*2+b*3+c*4+d)/10;
		System.out.printf("Media: %.1f\n",media); 
		if (media>=7)
			System.out.println("Aluno aprovado.");
		else if(media<5)
			System.out.println("Aluno reprovado.");
		else /*if(media>=5 || media <=6.9)*/
		{
			System.out.println("Aluno em exame.");
			double mesa = in.nextDouble();
			System.out.printf("Nota do exame: %.1f\n",mesa);
			 media= (mesa+media)/2;
			if (media>=5)
				System.out.println("Aluno aprovado.");
			else
				System.out.println("Aluno reprovado.");
			System.out.printf("Media final: %.1f\n",media);			
		}
	}

}