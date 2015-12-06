package BEGINNER;
import java.util.Scanner;

public class DividingXByY {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0; i < n; i++){

            int x = in.nextInt();
            int y = in.nextInt();

            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f\n", (double) x / y);
            }

        }

    }

}
