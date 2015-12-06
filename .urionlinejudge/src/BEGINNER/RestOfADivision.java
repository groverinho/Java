package BEGINNER;

import java.util.Scanner;

public class RestOfADivision {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        for(int i = min+1; i < max; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }

    }

}
