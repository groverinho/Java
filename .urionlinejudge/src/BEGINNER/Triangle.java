package BEGINNER;
import java.util.Scanner;


public class Triangle {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		while (in.hasNextDouble()) {
			
		
		double a = in.nextDouble(), b= in.nextDouble(), c = in.nextDouble();
	/*	if (a==b && b==c)
		{//Triángulo Equilátero		
			double area1 =3*a;
			System.out.printf("Perimetro =  %.1f\n",area1); 
		}
		else if((a==b && a!=c && b!=c) || (b==c && b!=a && c!=a))
		{//Triángulo Isósceles
			System.out.printf("hola =  %.1f\n"); 

		}
		else if(a!=b && b!=c)
		{//Triángulo Escaleno
			double area3 = a+b+c;
			System.out.printf("Perimetro =  %.1f\n",area3);
		}*/
		
		if(((a + b) > c) && ((b + c) > a) && ((a + c) > b))
		 
			System.out.printf("Perimetro = %.1f\n",a+b+c);
		else
				System.out.printf("Area = %.1f\n",((a+b)*c)/2);


		/* if ((Math.abs(b-c) < a)&& (a < (b+c))&&(b > Math.abs(a-c)) &&(b< (a+a)) &&(c > Math.abs(a-b)) &&(c < (a+b))) 
		{
			 double per =a+b+c;
				System.out.printf("Perimetro =  %.1f\n",per); 
		}
		 else
		 {
				double trapecio =((a + b) * c) / 2;
				System.out.printf("Area = %.1f\n",trapecio); 
		 }*/
		}
	}

}
