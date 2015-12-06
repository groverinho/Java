


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bytelandiangoldcoins346 {

	static HashMap<Integer, Long>dp;
	public static void main(String[]args) throws IOException
	{
		dp=new HashMap<Integer, Long>();
		BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String temp=st.readLine();
			if(temp==null||temp.equals(""))
				break;
			int n=Integer.parseInt(temp);
			System.out.println(f(n));
		}
	}
	public static long f(int n)
	{
		if(n==0)
			return 0;
		if(dp.get(n)!=null)
			return dp.get(n);
		long res=Math.max(n,f(n/2)+f(n/3)+f(n/4));
		dp.put(n,res);
		return res;
	}
}
