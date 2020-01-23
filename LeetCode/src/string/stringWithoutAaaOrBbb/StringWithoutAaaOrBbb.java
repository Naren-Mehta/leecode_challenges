package string.stringWithoutAaaOrBbb;

public class StringWithoutAaaOrBbb {

	
	
	// Note: Wrong Answer :(
	public static String strWithout3a3b(int A, int B) {
		String str = "";

		int i=1;
		int j=1;
		while (i <=A || j <=B) {
			if (A > 3 && i % 3 == 0) {
				System.out.println("=====1======");
				str = j <=B ? str + "B" : str;
				i++;
			}else if(B > 3 && j%3==0){
				System.out.println("=====2======");
				str =i <=A ?str + "A" : str;
				j++;
			}else {
				System.out.println("=====3======");
				if(i<=A) {
					System.out.println("=====3.1======");
					str = str + "A";
					i++;
				}
				else if(j<=B) {
					System.out.println("=====3.2======"+j);
					str = str + "B";
					j++;
				}
				
				System.out.println(str+"\n");
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(strWithout3a3b(1,4));
	}

}
