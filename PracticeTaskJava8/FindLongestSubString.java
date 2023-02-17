package PracticeTaskJava8;

public class FindLongestSubString {

	public static void main(String[] args) {

		String str = "javaworld";
		findLongestSubString(str);
		findSubStringUsingJava(str, 2, 4);
		findSubStringUsingJava8(str,2,4);
	}

	private static void findSubStringUsingJava8(String str, int i, int j) {

		
	}

	private static String findSubStringUsingJava(String str, int beginInd, int endInd) {

		String s = "";
		for (int i = beginInd; i < endInd; i++) {

			s = s + str.charAt(i);

		}
		System.out.println(s);
		return s;
	}
	
	private static void findLongestSubString(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {

				String s = findSubStringUsingJava(str, i, j + 1);
				System.out.println(s);
			}

		}

	}

}
