import java.awt.ScrollPaneAdjustable;
import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 20/5/2020
 * @company Mojix/Xtime
 */

public class multipleReading1262 {

	/**
RWWRRR
3
RWWRRRR
3
WWWWW
5
RRRRRRRRRR
4
RWRRWWRWRWRRRWWRRRRWRRWRRWRRRRRRRRRWRWRWRRRRWRRRRR
4	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String trace = in.next();
			int procs = in.nextInt();
			
			while(trace.contains("R")){
				String aux ="";
				for (int i = 0; i < procs; i++) {
					aux = aux.concat("R");
				}
				procs--;
				trace = trace.replaceAll(aux, "U");
			}
			// System.out.println(trace);
			System.out.println(trace.length());
		}
	}
}
