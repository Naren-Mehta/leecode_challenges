package string.interleavingString;

public class InterleavingString {

	public static boolean isInterleave(String s1, String s2, String s3) {

		if(s1.length() + s2.length() != s3.length()) {
			return false;
		}
			
		for (int i = 0; i < s3.length(); i++) {
			char c = s3.charAt(i);
			if (s1.startsWith(c + "")) {
				s1 = s1.substring(1);
			}

			if (s2.startsWith(c + "")) {
				s2 = s2.substring(1);
			}
			
			System.out.println(c+"=="+s1+"==="+s2);
		}

		if (s1.equals(s2) && s1.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
//		System.out.println(isInterleave("a", "", "a"));
//		System.out.println(isInterleave("aabd", "abdc", "aabdbadc"));
	
	}
}
