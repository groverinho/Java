

import java.util.Scanner;

 class PrimeGenerator2 {

	public static Boolean verificar(long  n)
    {
        if (n == 1)
            return false;
        else
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
	public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
        int casos;
        long inicio, fin;
        String result="";
        casos = in.nextInt();
        for (int i = 0; i < casos; i++)
        {
            inicio = in.nextInt();
            fin = in.nextInt();
            for (long j = inicio; j <= fin; j++)
            {
                if (verificar(j) == true)
                    result = result + j + "\n";
            }
            if(i != casos-1)
            result += "\n";
        }
        System.out.print(result);
    }
}

