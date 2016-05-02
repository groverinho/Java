import java.util.Scanner;


public class AEM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String  cadena  = in.next();
		int time  = in.nextInt();
		String tiempos[] = cadena.split(":");
		int hora =Integer.parseInt( tiempos[0]);
		int minuto = Integer.parseInt(tiempos[1]);
		int segundo = Integer.parseInt(tiempos[2]);
		int totalDia = 0, totalHora=0, totalMinuto=0, totalSegundo=0;
		while (time>86400)
		{
			totalDia++;
			time = time - 86400;
		}
		while (time >3600)
		{
			totalHora++;
			time = time - 3600;
		}
		while (time >60)
		{
			totalMinuto++;
			time = time -60;
		}

		if (totalHora+hora>=24)
		{
			totalDia++;
			totalHora = (totalHora+hora)-24;
		}
		else
			totalHora += hora;
		if (totalMinuto+minuto>=60)
		{
			totalMinuto++;
			totalMinuto = (totalMinuto+minuto)-60;
		}
		else
			totalMinuto = totalMinuto + minuto;
		if (segundo+time>=60)
		{
			totalMinuto++;
			totalSegundo =( segundo+time )-60;
		}
		else
			totalSegundo = time+segundo;
		
		String totalDiaString="", totalHoraString="", totalMinutoString="", totalSegundoString="";
		if (totalDia==0)
			totalDiaString = "00";
		else
			totalDiaString = totalDia+"";
		if (totalHora==0)
			totalHoraString = "00";
		else
			totalHoraString = totalHora+"";
		if (totalMinuto==0)
			totalMinutoString = "00";
		else
			totalMinutoString = totalMinuto+"";
		if (totalMinuto==0)
			totalMinutoString = "00";
		else
			totalMinutoString = totalMinuto+"";
		if (totalSegundo==0)
			totalSegundoString = "00";
		else
			totalSegundoString = totalSegundo+"";
		System.out.println(totalDiaString+":"+totalHoraString+":"+totalMinutoString+":"+totalSegundoString);
		

	}

}
