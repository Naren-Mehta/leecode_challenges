package string.removeVowels;

public class RemoveVowels {
	
	
	public static String removeVowels(String str) {
		
		int i=0;
		while (str.length()>=0) {
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				str = str.substring(0,i)+str.substring(i+1);
			}else {
				i++;
			}
			
			if(i==str.length()) {
				break;
			}
			
		}
		
		
		return str;
	}
	
	public static void main(String[] args) {
		String str="welcome to geeksforgeeks";
		System.out.println(removeVowels(str));
		
	}

}
