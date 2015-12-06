

import java.util.Scanner;

public class LifeUniverseandEverything1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = 0;
    while (a != 42)
    {
        a = in.nextInt();
        if (a == 42)
            break;
        else
            System.out.println(a);
    }

	}

}
