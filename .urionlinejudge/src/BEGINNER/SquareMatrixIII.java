package BEGINNER;
import java.util.Scanner;


public class SquareMatrixIII {

	 public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        StringBuilder sb = new StringBuilder();

	        for(;;){

	            int x = s.nextInt();

	            if(x == 0){
	                break;
	            }

	            int width = (int) Math.log10(Math.pow(2, 2 * (x-1))) + 1;
	      //      System.out.println("width "+width);
	            int first = 1;

	            for(int i = 0; i < x; i++){

	                int firstCpy = first;

	                for(int j = 0; j < x; j++){

	                    int actWidth = (int) Math.log10(firstCpy) + 1;
	                  //  System.out.println("act width "+actWidth);
	                    for(int k = 0; k < width - actWidth; k++){
	                        sb.append(" ");
	                    }

	                    sb.append(firstCpy);

	                    if(j < x-1){
	                        sb.append(" ");
	                    }

	                    firstCpy *= 2;

	                }

	                first *= 2;
	                sb.append("\n");

	            }

	            sb.append("\n");

	        }

	        System.out.print(sb);

	    }

	}
