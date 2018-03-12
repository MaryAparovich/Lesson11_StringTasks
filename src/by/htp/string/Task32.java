package by.htp.string;

/**
 * 32. Подсчитать, сколько раз заданное слово входит в текст.
 * 
 * @author Maria
 *
 */

public class Task32_1 {

	public static void main(String[] args) {

		String codeword = "JAVA";
		String str = "java masha jav. Java. Hello.l hi to Masha javA JAVA. JAVA.";
		String[] arrStr = str.split(" ");
		int count = 0;

		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].lastIndexOf(".") == arrStr[i].length() - 1) {
				arrStr[i] = arrStr[i].substring(0, arrStr[i].length() - 1);
			}
		}

		for (int i = 0; i < arrStr.length; i++) {
			if (codeword.equalsIgnoreCase(arrStr[i])) {
				count++;
			}
		}
		System.out.println(codeword + " = " + count);

	}

}
