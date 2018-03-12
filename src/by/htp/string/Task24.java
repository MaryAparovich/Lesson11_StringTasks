package by.htp.string;

/**
 * 24. Определить сумму всех целых чисел, встречающихся в заданном тексте.
 * 
 * @author Maria
 *
 */
public class Task24 {

	public static void main(String[] args) {

		String str = "Returns 0 an Integer 1 object holding2 the value 10   15,5  1.0  5 ";
		String[] arr = str.split(" ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				sum = sum + Integer.valueOf(arr[i]);
			} 
			catch (NumberFormatException e) {
			}
		}
		System.out.println(sum);
	}
}
