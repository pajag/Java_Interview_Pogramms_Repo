package PracticeTaskJava8;

import java.util.List;
import java.util.stream.Collectors;

public class CountNoOfPunctuationInString {

	private static char[] chars;


	public static void main(String[] args) {
		String str = "He said, 'The' mailman: loves you.";

		JavaMethod(str);
		Java8Method(str);

	}

	private static void Java8Method(String str) {

		List<Character> character=str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		System.out.println("Count No Punctuation using Java8Method : "+character.stream().filter(e-> !Character.isSpaceChar(e)).filter(e->!Character.isLetter(e)).count());
		
	}

	private static void JavaMethod(String str) {
		int count = 0;
		chars = str.toCharArray();

		for (char string : chars) {
			if (string == ',' || string == '.' || string == ':') {
				count++;
			}
		}
		System.out.println("Count No Punctuation using JavaMethod : "+count);
	}

}
