package BEGINNER;

import java.util.Scanner;

public class BhaskaraFormula {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a= in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        if(a == 0)
        {
        	 System.out.println("Impossivel calcular");
        }
        else
        {
        	if (b*b>= 4*a*c) 
        	{
        		double r1 = ((-1*b)+(Math.sqrt((b*b)-4*a*c)))/(2*a);
            	System.out.printf("R1 = %.5f\n",r1);
            	double r2 = ((-1*b)-(Math.sqrt((b*b)-4*a*c)))/(2*a);
            	System.out.printf("R2 = %.5f\n",r2);
			}
        	else
        		System.out.println("Impossivel calcular");
        	
	        //System.out.printf("R1 = %.5f\n", (b*(-1) + Math.sqrt(b*b - 4*a*c))/(2*a));
	        //System.out.printf("R2 = %.5f\n", (b*(-1) - Math.sqrt(b*b - 4*a*c))/(2*a));
        }
    }

}
/*float a, b, c;
    scanf("%f%f%f", &a, &b, &c);
    
    if(a == 0)
    {
        printf("Impossivel calcular\n");
    }
    else
    {
        printf("R1 = %.5f\n", (b*(-1) + sqrt(b*b - 4*a*c))/(2*a));
        printf("R2 = %.5f\n", (b*(-1) - sqrt(b*b - 4*a*c))/(2*a));
    */