import java.util.Arrays;
import java.util.Scanner;


public class AggressiveCows {


	 public static int binarySearch(int cows, int[] positions) 
	 {
	        int left = 0, right = positions[positions.length-1]-positions[0];
	        while (left <= right) 
	        {
	            int middle = (left + right) / 2;
	            if (minimaDistancia(middle, cows, positions))
	                left = middle + 1;
	            else
	                right = middle - 1;
	        }
	        return right;
	    }
	 public static boolean minimaDistancia(int distancia, int vacas, int[] posiciones) {
	        int posicionVaca = 1;
	        int ultimapos = posiciones[0];
	        for (int i = 1; i < posiciones.length; i++) 
	        {
	            if (posiciones[i]-ultimapos < distancia)
	                continue;
	            if (++posicionVaca == vacas)
	                return true;
	            ultimapos = posiciones[i];
	        }
	        return false;
	    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos=in.nextInt();
		while (casos-->0)
		{
			int puestos = in.nextInt();
	        int vacas = in.nextInt();
	        int[] vectorPuestos = new int[puestos];
	        for (int i = 0; i < puestos; i++)
	        	vectorPuestos[i] = in.nextInt();
	        Arrays.sort(vectorPuestos);
	        System.out.println(binarySearch(vacas, vectorPuestos));
		}
		

	}

}
