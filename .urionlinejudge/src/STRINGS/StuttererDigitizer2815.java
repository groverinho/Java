import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 7/7/2020
 * @company Mojix/Xtime
 */

public class StuttererDigitizer2815 {

	/**
Juca comprou fafarinha na memercearia e papagou 4 reais o quilo. A mamae de Juca pediu para ele comprar mamais 2 quilos.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		String array[] = text.split(" ");
		String textFixed = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 3 && array[i].substring(0, 1).equals(array[i].substring(2, 3))) {
				textFixed = textFixed.concat(array[i].substring(2, array[i].length()));
			} else {
				textFixed = textFixed.concat(array[i]);
			}
			if(i+1!=array.length){
				textFixed = textFixed.concat(" ");
			}
		}
		System.out.println(textFixed);
	}

}
