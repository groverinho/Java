import java.util.Scanner;


public class PrimaryArithmetic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        while (true)
        {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            if (n1 == 0 && n2 == 0) 
            	break;

            int acarreos = 0;
            int acarrear = 0;
            while (n1 != 0 || n2 != 0) {
                int sum = acarrear + n1 % 10 + n2 % 10;
                if (sum >= 10) ++acarreos;
                acarrear = sum / 10;
                n1 /= 10;
                n2 /= 10;
            }
            if (acarreos == 0)
                System.out.println("No carry operation.");
            else if (acarreos == 1)
                System.out.println("1 carry operation.");
            else
                System.out.println(acarreos + " carry operations.");
        }

	}

}
