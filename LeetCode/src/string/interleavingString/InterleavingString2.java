package string.interleavingString;

import java.util.Stack;

public class InterleavingString2 {

	public static boolean isInterleave(String s1, String s2, String s3) {

		if (s1.length() + s2.length() != s3.length()) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s3.length(); i++) {
			stack.push(s3.charAt(i));
		}
		
		System.out.println(stack+"\n");

		while (!stack.isEmpty()) {
			char c= stack.pop();
			
			System.out.println(c+"=="+s1+"==="+s2);

			if (s1.endsWith(c + "")) {
				s1 = s1.substring(0, s1.length()-1);
			}else if (s2.endsWith(c + "")) {
				s2 = s2.substring(0, s2.length()-1);
			}else {
				break;
			}
			
			System.out.println(c+"=="+s1+"==="+s2+"\n");

		}

		if (s1.isEmpty() && s1.isEmpty() && stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
		System.out.println(isInterleave("aabc", "abad", "aabadabc"));
//		System.out.println(isInterleave("a", "", "a"));
//		System.out.println(isInterleave("aabd", "abdc", "aabdbadc"));

	}
}
