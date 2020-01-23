package string.greatestCommonDivisorOfStrings;

public class GreatestCommonDivisorOfStrings {

	public static String gcdOfStrings(String str1, String str2) {

		if(str2.length()> str1.length()) {
			return gcdOfStrings(str2,str1);
		}
		
		if(str1.startsWith(str2) && str1.endsWith(str2)) {
			if (str1.contains(str2)) {
				int index = str1.indexOf(str2);
				return str1.substring(index + str2.length());
			} else {
				return "";
			}
		}else {
			return "";
		}
		

	}

	public static void main(String[] args) {
//		System.out.println(gcdOfStrings("ABABAB", "ABAB"));
//		System.out.println(gcdOfStrings("ABCABC", "ABC"));
//		System.out.println(gcdOfStrings("LEET", "CODE"));
//		System.out.println(gcdOfStrings("ABCDEF", "ABC"));

		System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));


	}

}
