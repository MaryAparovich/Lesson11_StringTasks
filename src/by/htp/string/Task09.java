package by.htp.string;

/**
 * 9. Определить, сколько раз повторяется в тексте каждое слово, которое
 * встречается в нем.
 * 
 * @author Maria
 *
 */

public class Task09 {

	public static void main(String[] args) {

		String str = "Name Masha masha name name java Java hello and Name And is is is Is MASHA";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			if (arr[i] != " ") {
				for (int j = i; j < arr.length - 1; j++) {
					if (arr[i].equalsIgnoreCase(arr[j + 1])) {
						count++;
						arr[j + 1] = " ";
					}
				}
				System.out.println(arr[i] + " = " + count);
				arr[i] = " ";
			}
		}
	}
}
