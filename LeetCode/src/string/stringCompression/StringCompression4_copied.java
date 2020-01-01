package string.stringCompression;

public class StringCompression4_copied {

	public static int compress(char[] chars) {
		int indexAns = 0, index = 0;
		while (index < chars.length) {
			char currentChar = chars[index];
			int count = 0;
			
			System.out.println(index);
			while (index < chars.length && chars[index] == currentChar) {
				index++;
				count++;
			}
			
			chars[indexAns++] = currentChar;

//			System.out.println(chars);
			if (count != 1)
				for (char c : Integer.toString(count).toCharArray())
					chars[indexAns++] = c;

//			System.out.println(chars);
//			System.out.println();
		}
		return indexAns;
	}

	public static void main(String[] args) {
//		char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

//		char[] arr = { 'a' };

		char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'x' };

		System.out.println(compress(arr));
	}

}
