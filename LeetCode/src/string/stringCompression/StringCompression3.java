package string.stringCompression;

public class StringCompression3 {

	public static int compress(char[] chars) {

		int newIndex = 0;
		int i = 0;
		while (i < chars.length) {
			int count = 0;
			char current = chars[i];
			while (i < chars.length && chars[i] == current) {
				count++;
				i++;
			}
			chars[newIndex++] = current;
			if (count > 1) {
				char[] arr = String.valueOf(count).toCharArray();
				for (int x = 0; x < arr.length; x++) {
					chars[newIndex++] = arr[x];
				}
			}
		}
		System.out.println(chars);
		return newIndex;
	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
//		char[] arr = { 'a','b','c'};
//		char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'x' };

		System.out.println(compress(arr));
	}

}
