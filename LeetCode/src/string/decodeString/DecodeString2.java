package string.decodeString;

import java.util.Stack;

public class DecodeString2 {

	public static String decodeString(String s) {

		Stack<String> stack = new Stack<String>();
		String finalString = "";
		for (int i = 0; i < s.length(); i++) {
			String str = "";
			String strNew = "";
			System.out.println("==" + stack);

			if (s.charAt(i) == ']') {
				while (!stack.peek().equals("[")) {
					str = stack.peek()+str;
					stack.pop();
				}
				stack.pop();
				int x = Integer.parseInt(stack.pop());
				while (x != 0) {
					strNew = strNew + str;
					x--;
				}
				stack.push(strNew);

			} else {
				
				String digit = s.charAt(i) + "";
				if (Character.isDigit(s.charAt(i))) {
					
					while (Character.isDigit(s.charAt(i + 1))) {
						digit = digit + s.charAt(i + 1);
						i++;
					}
				}
				stack.push(digit);

			}
		}

		for (String st : stack) {
			finalString = finalString + st;
		}

		return finalString;
	}

	public static void main(String[] args) {
		System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
	}

}
