package BEGINNER;


import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for(;;)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            if(x == y)
                break;          
            if(x > y)
                System.out.println("Decrescente");
            else
                System.out.println("Crescente");
            
        }
    }
}
