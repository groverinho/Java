package STRINGS;
import java.util.Scanner;
 
public class FitorDontFitII{
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        while (casos>0)
        {
           
            String a = entrada.next();
            String b = entrada.next();
            if (a.length()>=b.length())
            {
                if (b.equals(a.substring(a.length()-b.length(), a.length()))) 
                {
                    System.out.println("encaixa");
                }
                else
                    System.out.println("nao encaixa");
            }
            else
                System.out.println("nao encaixa");
             
            casos--;
        }
         
    }
 
}