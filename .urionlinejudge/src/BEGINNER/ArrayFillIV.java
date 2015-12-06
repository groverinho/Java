package BEGINNER;

import java.util.Scanner;

public class ArrayFillIV {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] numbers = new int[2][5];
        int[] cont = new int[2];
        for(int i= 0; i < 15; i++)
        {
            int x = in.nextInt();
            int ind = Math.abs(x) % 2 == 1 ? 0 : 1;
            numbers[ind][cont[ind]] = x;
            cont[ind]++;
            if(cont[ind] == 5)
            {
                cont[ind] = 0;
                for(int j = 0; j < 5; j++)
                    System.out.printf("%s[%d] = %d\n", ind == 1 ? "par" : "impar", j, numbers[ind][j]);
            }
        }
        for(int i = 0; i <= 1; i++)
        {
            for(int j = 0; j < cont[i]; j++)
                System.out.printf("%s[%d] = %d\n", i == 1 ? "par" : "impar", j, numbers[i][j]);
        }
    }
}
