package BEGINNER;

import java.util.Scanner;

public class Grenais {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rounds = 0,inter = 0,gremio = 0, empates = 0, todo = 1;
        for(int i = 0; ; i++)
        {
            if(i % 2 == 0)
            {
                if(todo == 1)
                {
                    int x = s.nextInt();
                    int y = s.nextInt();
                    if(x > y)
                        inter++;
                    else if(x < y)
                        gremio++;
                    else
                        empates++;
                    rounds++;
              }
              else
              {
                    System.out.println(rounds + " grenais");
                    System.out.println("Inter:" + inter);
                    System.out.println("Gremio:" + gremio);
                    System.out.println("Empates:" + empates);
                    System.out.println((inter > gremio) ? "Inter venceu mais" : (inter < gremio) ? "Gremio venceu " +
                            "mais" : "Nao houve vencedor");
                    break;
              }
            }
            else
            {
                System.out.println("Novo grenal (1-sim 2-nao)");
                todo = s.nextInt();
            }
        }
    }
}
