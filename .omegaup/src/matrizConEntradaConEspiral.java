
import java.util.Scanner;

public class matrizConEntradaConEspiral {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  System.out.print("Dimesi�n De La Matriz: ");
        int n = in.nextInt();
        int m = in.nextInt();
        mostrarMatriz(generarMatrizCaracol(n, m,1), n, m);
    }

    /**
     * Genera Una Matriz Caracol.
     * @param n dimensi�n de la matriz cuadrada
     * @param x numero con cual se iniciara la matriz caracol
     * @return matriz de enteros con la matriz caracol ya generada.
     */
    public static int[][] generarMatrizCaracol(int n,int m, int x) {
        int[][] M = new int[n + 1][m + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= m - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= m - a; i++) {
                M[i][m - a + 1] = x;
                x++;
            }
            for (int i = m - a + 1; i >= a + 1; i--) {
                M[m- a + 1][i] = x;
                x++;
            }
            for (int i = m - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (m % 2 == 1) {
            M[m / 2 + 1][m / 2 + 1] = x;
        }
        return M;
    }

    /**
     * Muestra Una Matriz Cualquiera Por Consola A Partir De La Fila 1 y Columna 1
     * @param M matriz a mostrar
     * @param f numero de filas de la matriz
     * @param c numero de columnas de la matriz
     */
    public static void mostrarMatriz(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
}