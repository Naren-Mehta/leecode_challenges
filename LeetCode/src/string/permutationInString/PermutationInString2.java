package string.permutationInString;

import java.util.Arrays;

public class PermutationInString2 {

	public static String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		str=String.valueOf(arr);
		return str;
	}
	public static boolean checkInclusion(String s1, String s2) {

		boolean isFound=false;
		s1=sortString(s1);

		for(int i=0;i<s2.length()-s1.length()+1;i++) {
			String str= s2.substring(i,i+s1.length());
			str=sortString(str);
			
			if(str.equals(s1)) {
				isFound=true;
				break;
			}
		}
		
		return isFound;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("hello", "ooohelooo"));
	}

}
