	
	
	import java.util.*;
	
	public class VitosFamily10041 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int casos= in.nextInt();
			while (casos-- > 0) {
				int R = in.nextInt();
				int[] vector = new int[R];
				
				for (int i = 0; i < R; ++i)
					vector[i] = in.nextInt();
				Arrays.sort(vector);
				int median = vector[R / 2];
				int res = 0;
				
				for (int x : vector)
					res += Math.abs(x - median);
				
				System.out.println(res);
			}
		}
	}