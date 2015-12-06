package BEGINNER;

import java.util.Scanner;

public class ExceedingZ {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int z;
        for(;;){
            z = in.nextInt();

            if(z > x){
                break;
            }

        }

        int i = 1;
        int sum = x;

        while(sum <= z)//3//20
        {
            x++;
            sum += x;
            i++;
        }

        System.out.println(i);

    }

}
