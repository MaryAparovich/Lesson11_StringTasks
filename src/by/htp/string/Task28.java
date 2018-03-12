package by.htp.string;

/**
 * 28. Преобразовать текст так, чтобы только первые буквы каждого предложения
 * были заглавными.
 * 
 * @author Maria
 *
 */
public class Task28 {

	public static void main(String[] args) {

		String str = "converts all to upper case. the rules of the default locale. this method is equivalent to toUpperCase.";
		String[] arr = str.split("");
		String newStr;
		newStr = arr[0].toUpperCase();
		arr[0] = String.valueOf(newStr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].equals(".")) {
				newStr = arr[i + 2].toUpperCase();
				arr[i + 2] = String.valueOf(newStr);
			}
		}
		
		for (String value: arr) {
			System.out.print(value);
		}
	}
}
