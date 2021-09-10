import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static String formatTime(int t) {
		if(t<=9) {
			return "0" + t;
		}
		return t+"";
	}


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int h = sc.nextInt();
			int m= sc.nextInt();
			String s = sc.next();
			String message = s.equals("1")?" - A porta abriu!":" - A porta fechou!";
		
			System.out.println(formatTime(h)+":"+formatTime(m)+""+message);
		}
	}
}

class Scanner {
	public BufferedReader reader;
	public StringTokenizer st;

	public Scanner(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				String line = reader.readLine();
				if (line == null)
					return null;
				st = new StringTokenizer(line);
			} catch (Exception e) {
				throw (new RuntimeException());
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

class OutputWriter {
	BufferedWriter writer;

	public OutputWriter(OutputStream stream) {
		writer = new BufferedWriter(new OutputStreamWriter(stream));
	}

	public void print(int i) throws IOException {
		writer.write(i);
	}

	public void print(String s) throws IOException {
		writer.write(s);
	}

	public void print(char[] c) throws IOException {
		writer.write(c);
	}

	public void close() throws IOException {
		writer.close();
	}
}
