import java.util.Scanner;

/**
 @author Grover Irusta Miranda
 @date 10/7/2020
 @company Mojix/Xtime
 */

public class DateInputandOutput2764 {

	/**
02/08/10	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String date = in.next();
		String[]array = date.split("/");
		System.out.println(array[1]+"/"+array[0]+"/"+array[2]);
		System.out.println(array[2]+"/"+array[1]+"/"+array[0]);
		System.out.println(array[0]+"-"+array[1]+"-"+array[2]);
	}

}
