package by.htp.string;
/**
 * 1. В каждом слове текста k-ю букву заменить заданным символом. 
 * Если k больше длины слова, корректировку не выполнять.
 * @author Maria
 *
 */

public class Task01 {

	public static void main(String[] args) {
		
		String str = "My new string";
		String[] arr = str.split(" ");
		int k = 2;
		char h = '*';
		char[] newArr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			newArr = arr[i].toCharArray();
			newArr[k - 1] = h;
			arr[i] = String.copyValueOf(newArr);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
