import java.util.Arrays;
import java.util.Scanner;
/**
Name: Grover Irusta Miranda
Company: Xtime
Date: 28-08-2018
 */

public class Main {
//uva 11777	Automate the Grades
	public static String notas(double nota){
		if(nota>=90){
			return "A";
		}
		else if(nota >=80 && nota < 90){
			return "B";
		}
		else if(nota >=70 && nota < 80)
			return "C";
		else if(nota >=60 && nota < 70)
			return "D";
		else
			return "F";
	}
	public static void main(String[] args) {
		// uri - 1047 Game Time with Minutes
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			double term1 = in.nextInt();
			double term2 = in.nextInt(); 
			double finnal = in.nextInt(); 
			double attendance = in.nextInt();
			double array[]= new double[3];
			array[0]=in.nextDouble();
			array[1]=in.nextDouble();
			array[2]=in.nextDouble();
			Arrays.sort(array);
			double totalClass = (array[1]+array[2])/2;
			double totales = (totalClass+attendance+finnal+term2+term1);
		//	System.out.println(totales);
			System.out.println("Case "+(i+1)+": "+notas(totales));	
		}
		
	}
}
