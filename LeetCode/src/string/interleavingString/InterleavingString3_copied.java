package string.interleavingString;

import java.util.Stack;

public class InterleavingString3_copied {

	public static boolean isInterleave(String s1, String s2, String s3) {

		if (s1.length() + s2.length() != s3.length()) {
			return false;
		}

		return testString(0, s1, 0, s2, 0, s3);

	}

	public static boolean testString(int i, String s1, int j, String s2, int k, String s3) {

		System.out.println(i + " " + j + " " + k);
		if ((i == s1.length() || j == s2.length()) && k == s3.length()) {
			return true;
		}

		if (i < s1.length() && k < s3.length() && s1.charAt(i) == s3.charAt(k)) {
			if (testString(i + 1, s1, j, s2, k + 1, s3)) {
				return true;
			}
		}

		if (j < s2.length() && k < s3.length() && s2.charAt(j) == s3.charAt(k)) {
			if (testString(i, s1, j + 1, s2, k + 1, s3)) {
				return true;
			}
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
