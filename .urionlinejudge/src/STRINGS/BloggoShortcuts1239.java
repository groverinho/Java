import java.util.Scanner;


/**
 * @author Grover Irusta Miranda
 * @date 8/7/2020
 * @company Mojix/Xtime
 */

public class BloggoShortcuts1239 {

	/**
You _should_ see the new walrus at the zoo!
Move it from *Accounts Payable* to *Receiving*.
I saw _Chelydra serpentina_ in *Centennial Park*.
_ _ __ _ yabba dabba _ * dooooo * ****
_now_I_know_*my*_ABC_next_time_*sing*it_with_me
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String text = in.nextLine();
			// text = text.replaceAll("_", "<i>").replaceAll("\\*", "<b>");
			boolean _flag = false;
			boolean asteriskFlag = false;
			String newText = "";
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == '_') {
					if (!_flag) {
						newText = newText.concat("<i>");
						_flag = true;
					} else {
						newText = newText.concat("</i>");
						_flag = false;
					}
				} else if (text.charAt(i) == '*') {
					if (!asteriskFlag) {
						newText = newText.concat("<b>");
						asteriskFlag = true;
					} else {
						newText = newText.concat("</b>");
						asteriskFlag = false;
					}
				} else {
					newText += text.charAt(i) + "";
				}

			}
			System.out.println(newText);
		}
		

	}

}
