package PracticeTask;

public class FindFirstUniqueCharofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aarurb";
        System.out.println(spliting(s));
	}
	public static int spliting(String str) {

		char[] ch = str.toCharArray();
		int[] repeat = new int[ch.length];
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j <= ch.length-1; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j]=' ';
					
				}
			}
			if(ch[i]!=' ') {
				repeat[i] = count;

			}
		}
		
		/*
		 * for (int m = 0; m < repeat.length;m++) { System.out.println(repeat[m]); }
		 */
		for (int k = 0; k < repeat.length;k++) {
			if(repeat[k] == 1) {
				return k ;
		    }
		}
		return -1;
	}

}
