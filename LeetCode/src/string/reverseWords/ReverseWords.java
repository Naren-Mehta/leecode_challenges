package string.reverseWords;

public class ReverseWords {

	public static String reverseWords(String s) {

		String[] arr = s.split(" ");
		s = "";

		for (String str : arr) {
			s = s + new StringBuffer(str).reverse().toString() + " ";
		}
		return s.trim();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
