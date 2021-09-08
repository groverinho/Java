import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] criba(int n) {
		int primos[] = new int[n + 1];
		Arrays.fill(primos, 1);
		primos[0] = primos[1] = 0;
		for (int i = 2; i < (int) Math.sqrt(n) + 1; i++)
			if (primos[i] == 1)
				for (int j = i * i; j < primos.length; j += i)
					primos[j] = 0;
		return primos;
	}

	public static void main(String[] args) throws IOException {

		Scanner2 sc = new Scanner2(System.in);
		OutputWriter out = new OutputWriter(System.out);
		int primos[] = new int[1000000 + 1];
		int aux[] = new int[1000000 + 1];
		primos = criba(1000000);
		for (int i = 1; i < aux.length; i++) {
			aux[i] = aux[i - 1] + primos[i];
		}
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(aux[m] - aux[n - 1]);
		}
	}
}

class Scanner2 {
	public BufferedReader reader;
	public StringTokenizer st;

	public Scanner2(InputStream stream) {
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
