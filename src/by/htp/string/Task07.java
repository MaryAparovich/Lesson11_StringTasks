package by.htp.string;

import java.util.regex.Pattern;

/**
 * 7. Из текста удалить все символы, кроме пробелов, не являющиеся буквами.
 * Между последовательностями подряд идущих букв оставить хотя бы один пробел.
 * 
 * @author Maria
 *
 */

public class Task07 {

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile("\\p{Punct}|[0-9]");
		String[] str = p1.split("M#!y4568&^#! n&ew &^%^stri**ng01");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}
}
