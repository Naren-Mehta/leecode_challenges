package string.stringWithoutAaaOrBbb;

public class StringWithoutAaaOrBbb2_copied {

	public static String strWithout3a3b(int A, int B) {

		char a='A';
		char b='B';
		
		String str="";
		int i=A;
		int j=B;
		
		if(B>A) {
			a='B';
			b='A';
			i=B;
			j=A;
		}
		while (i-->0) {
			str=str+a;
			
			if(i>j) {
				str=str+a;
				i--;
			}
			
			if(j-->0) {
				str=str+b;
			}
			
		}
		
		return str;
	}

	public static void main(String[] args) {
		System.out.println(strWithout3a3b(4,1));
	}

}
