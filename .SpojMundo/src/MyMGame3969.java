

import java.util.*;
class MyMGame3969{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		StringBuilder string = new StringBuilder();
		int num = in.nextInt();
		for(int x = 0; x < num; x++){
			int m = in.nextInt();
			int sum = 0;
			int count = 0;
			for(int y = 0; y < m; y++){
				int c = in.nextInt();
				sum += c;
				count = count ^ c;
			}
			if(sum == m){
				if(sum%2 == 0){
					string.append("John\n");
				}else{
					string.append("Brother\n");
				}
			}else{
				if(count == 0){
					string.append("Brother\n");
				}else{
					string.append("John\n");
				}
			}
		}
		System.out.print(string);
	}
}
