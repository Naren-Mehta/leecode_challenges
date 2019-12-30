package string.SplitAStringInBalancedStrings;

import java.util.ArrayList;

public class SplitAStringInBalancedStrings {
	
	public static int balancedStringSplit(String s) {
		
		int count=0;
		String str="";
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			str=str+c;
			
			if(c == 'L') {
				count--;
			}else {
				count++;
			}
			
			if(count==0) {
				list.add(str);
				str="";
			}
		}
		
		return list.size();
	}
	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRRLLRLL"));
	}
}
