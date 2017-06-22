import java.util.Scanner;

/**
Name: Grover Irusta M.
Company: CodeRoad
Date: 2017
 */
public class Thejackpot10684 {

	public static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n!=0) {
			int array []= new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i]=in.nextInt();
			}
			System.out.println(maxSubArraySum(array)>0?"The maximum winning streak is "+maxSubArraySum(array)+".":"Losing streak.");
			n=in.nextInt();
		}
		

	}

}
