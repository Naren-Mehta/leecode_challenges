package string.stringCompression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringCompression {

	public static int compress(char[] chars) {

		TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < chars.length; i++) {
			if (hm.containsKey(chars[i])) {
				int x = hm.get(chars[i]);
				hm.put(chars[i], x + 1);
			} else {
				hm.put(chars[i], 1);
			}
		}

		System.out.println(hm);

		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			list.add(entry.getKey());
			if (entry.getValue() > 1) {
				String str = entry.getValue() + "";
				char[] arr = str.toCharArray();
				for (char c : arr) {
					list.add(c);
				}
			}
		}
		
		chars= new char[list.size()];
        for(int i=0;i<list.size();i++){
        	chars[i]= list.get(i);
        }
        
		return chars.length;

	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

//		char[] arr = { 'a' };

//		char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };

		System.out.println(compress(arr));
	}

}
