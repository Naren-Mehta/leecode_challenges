package string.permutationInString;

import java.util.Arrays;

public class PermutationInString {

	public static boolean matches(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}

	public static boolean checkInclusion(String s1, String s2) {

		int[] count1 = new int[26];
		int[] count2 = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			count1[s1.charAt(i) - 'a']++;
			count2[s2.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length() - s1.length(); i++) {
			if (matches(count1, count2)) {
				return true;
			}
			count2[s2.charAt(i + s1.length()) - 'a']++;
			System.out.println(Arrays.toString(count2));

			count2[s2.charAt(i) - 'a']--;
			System.out.println(Arrays.toString(count2));
			System.out.println();
		}

		return matches(count1, count2);

	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidbaooo"));
	}

}
