package stringbasicmedium;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "The sky is blue";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
		String[] str = s.split("\\s+");

		int i = 0, j = str.length - 1;

		while (i <= j) {
			String temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		return String.join(" ", str).trim();
	}
}
