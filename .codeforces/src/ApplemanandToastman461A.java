

/**
 * Name: Grover A. Irusta Miranda 
Company: CodeRoad - xTime 
Date /2018
 */
import java.util.*;
public class ApplemanandToastman461A {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		long sum = 0;
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			sum+=a[i];
		}
		Arrays.sort(a);
		long res = 0;
		for(int i=0;i<n-1;i++) {
			res+=sum;
			res+=a[i];
			sum-=a[i];
		}	
		System.out.println(res+a[n-1]);
		
	}
}