package string.diStringMatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DIStringMatch {

	public static int[] diStringMatch(String S) {

		List<Integer> list = new ArrayList<Integer>();

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i <= S.length(); i++) {

			stack.push(i);
			if (i == S.length() || S.charAt(i) == 'I') {
				while (!stack.isEmpty()) {
					list.add(stack.pop());
				}
			}
		}

		int[] arr = list.stream().mapToInt(i->i).toArray();
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = diStringMatch("IDID");

		System.out.println(Arrays.toString(arr));
		
	}

}
