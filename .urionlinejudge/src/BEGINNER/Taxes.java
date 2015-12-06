package BEGINNER;
import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double salario = s.nextDouble();
        double pagar = 0;

        if(salario <= 2000)
        {
            System.out.println("Isento");
        }
        else
        {	
	        if(salario > 2000 && salario <= 3000)
	        {
	            pagar = (salario - 2000) * 0.08;
	        }
	        else if(salario > 3000 && salario <= 4500)
	        {
	            pagar = 1000 * 0.08 + (salario - 3000) * 0.18;
	        }
	        else
	        {
	            pagar = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
	        }
	        System.out.printf("R$ %.2f\n", pagar);

        }
	       
    }

}
