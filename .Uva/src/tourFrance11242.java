import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class tourFrance11242 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	

	while (true) 
	{	int f = in.nextInt();
		if (f==0) {
			break;
		}
		int r = in.nextInt();
		int pinonDelantero []= new int[f];
		int pinonTrasero []= new int[r];
//		double vector[] = new double [100];
		ArrayList<Double> vec = new ArrayList<Double>();

		
		for (int i = 0; i < f; i++) {
			pinonDelantero[i] = in.nextInt();
		}
		for (int i = 0; i < r; i++) {
			pinonTrasero[i]= in.nextInt();
		}

	//	int k = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < f; j++) {
				vec.add((double) pinonTrasero[i] / (double) pinonDelantero[j]);
			//	System.out.println(vector[k]);
			//k++;
			}
		}
		Collections.sort(vec);

		double max =-1;
		for (int i = 1; i < vec.size(); i++) {
			
			max = Math.max(max,vec.get(i) / vec.get(i-1));
			//System.out.println(vector[i + 1] / vector[i]);
		}

		System.out.printf("%.2f\n",max);
	}

	}

}
