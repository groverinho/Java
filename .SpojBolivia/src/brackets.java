import java.util.Scanner;
public class brackets 
{
	static char arr [] = new char[30]; 
	public static void genera(int pos, int n) 
	{ 
		if(pos == n) 
		{ 
			int abiertos = 0, cerrados = 0, sepuede = 1; 
			for(int i = 0; i < n; i++) 
			{ 
				if(abiertos < cerrados) 
					sepuede = 0; 
				if(arr[i] == '(') 
					abiertos++; 
				else 
					cerrados++; 
			} 
			if(abiertos == cerrados && sepuede == 1) 
			{ 
				for(int i = 0; i < n; i++) 
				System.out.print(arr[i]);
				System.out.println();
			} 
		return; 
		} 
			arr[pos] = '('; 
			genera(pos + 1, n); 
			arr[pos] = ')'; 
			genera(pos + 1, n); 
		} 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
    	genera(0, n * 2); 
    }
}