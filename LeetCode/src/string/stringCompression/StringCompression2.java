package string.stringCompression;
public class StringCompression2 {

	public static int compress(char[] chars) {

		String str="";
		int count=1;
		for (int i = 0; i < chars.length; i++) {
			if(i+1 != chars.length && chars[i] == chars[i+1]) {
				count++;
			}else {
				if(count>1) {
					str=str+chars[i]+count;
				}else {
					str=str+chars[i];
				}
				count=1;
			}
		}
		
		char[] arr= str.toCharArray();
		chars= new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			chars[i]=arr[i];
		}
		
		System.out.println(chars);
		return arr.length;

	}

	public static void main(String[] args) {
//		char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

//		char[] arr = { 'a' };

		char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' ,'x'};

		System.out.println(compress(arr));
	}

}
