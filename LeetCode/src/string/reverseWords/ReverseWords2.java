package string.reverseWords;

public class ReverseWords2 {

	public static String reverseWords(String s) {
		
		String[] arr = s.split(" ");
		s = "";

		for (String str : arr) {
			s = s + reverse(str.toCharArray(),0,str.length()-1) + " ";
		}
		return s.trim();
	}

	public static String reverse(char[] arr, int l, int r) {
		
		while (l<r) {
			char temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
