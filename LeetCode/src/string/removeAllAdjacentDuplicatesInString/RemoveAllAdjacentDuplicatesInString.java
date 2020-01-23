package string.removeAllAdjacentDuplicatesInString;

public class RemoveAllAdjacentDuplicatesInString {

	public static String removeDuplicates(String S) {

		int i = 0;
		while (S.length() > 0) {
			if(S.charAt(i) == S.charAt(i+1)) {
				S=S.substring(0,i)+S.substring(i+2);
				i=0;
			}else {
				i++;
			}
			
			if(i==S.length()-1) {
				break;
			}
		}

		return S;
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbaca"));
	}

}
