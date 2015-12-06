import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CombinationLock {

	 public static void main(String[] args) throws IOException {
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		    while (true)
		    {
		      String[] cad = in.readLine().split("[ ]+");

		      int p0 = Integer.parseInt(cad[0]);
		      int p1 = Integer.parseInt(cad[1]);
		      int p2 = Integer.parseInt(cad[2]);
		      int p3 = Integer.parseInt(cad[3]);

		      if (p0 == 0 && p1 == 0 && p2 == 0 && p3 == 0)
		        break;

		      int res = 3 * 40;
		      if (p0 < p1)
		        res += 40 + p0 - p1;
		      else
		        res += p0 - p1;
		      if (p2 < p1)
		        res += 40 + p2 - p1;
		      else
		        res += p2 - p1;
		      if (p2 < p3)
		        res += 40 + p2 - p3;
		      else
		        res += p2 - p3;

		      res = res * 360 / 40;
		      System.out.println(res);
		    }
		  }
		}