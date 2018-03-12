package by.htp.string;

/**
 *2. В тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в
 * одной строке печатать текст с двумя пробелами между буквами, в следующей
 * строке внизу под каждой буквой печатать ее номер.
 * 
 * @author Maria
 *
 */

public class Task02 {

	public static void main(String[] args) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String str = "Hello";

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + "\t");
		}
		System.out.println();
		for (int i = 0; i < str.length(); i++) {
			char charByIndex = str.toLowerCase().charAt(i);
			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j] == charByIndex) {
					System.out.print(j + 1 + "\t");
				}
			}
		}
	}
}
