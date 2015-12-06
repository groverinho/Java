package BEGINNER;


import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(;;){

            int x = s.nextInt();
            int y = s.nextInt();

            if(x == 0 || y == 0){
                break;
            }else if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if(x < 0 && y > 0){
                System.out.println("segundo");
            }else if(x < 0 && y < 0){
                System.out.println("terceiro");
            }else if(x > 0 && y < 0){
                System.out.println("quarto");
            }

        }

    }

}
