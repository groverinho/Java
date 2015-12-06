
import java.util.Scanner;


public class f91_10696 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n!=0)
		{
			if (n>=101)
			{
				System.out.println("f91("+n+") = "+(n-10));
			}
			else
			{
				System.out.println("f91("+n+") = "+91);
			}
			n = in.nextInt();
		}

	}

}
/*
 #include <cstdio>
using namespace std;

int f91 (int n) {
    if( n <= 100 )
        return f91(f91(n+11));
	return n-10;
}

int main () {
	int n;
	while (scanf("%d", &n), n)
		printf("f91(%d) = %d\n", n, f91(n));
}
 */