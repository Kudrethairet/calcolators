package calculator;

import java.util.Scanner;

public class ScannerFun {

	Scanner scanner = new Scanner(System.in);

	String userText = null;

	/*public ScannerFun(Scanner _scanner) {
		this.scanner = _scanner;
	}
*/

	/*public String userText() {
		String text = null;
		return text;
	}*/

	public void User_Scanner() {
		userText = scanner.nextLine();
	}

}
