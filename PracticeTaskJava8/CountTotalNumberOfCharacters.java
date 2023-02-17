package PracticeTaskJava8;

import java.util.List;
import java.util.stream.Collectors;

public class CountTotalNumberOfCharacters {

	public static void main(String[] args) {
		String str="Java is Real World Programming Language";
		String str2="Java10 is Real2 World 234 Programming5 Language45";
		JavaMethod(str);
		Java8Method(str);
		Java8MethodChar(str2);
	}

	private static void Java8Method(String str) {
		List<Character> chars=str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		System.out.println("Java 8 Method Count No of Char-> " + chars.stream().filter(e -> !Character.isSpaceChar(e)).count());
		
	}
	private static void Java8MethodChar(String str2) {
//		List<Character> chars=str2.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		System.out.println("Java 8 Method -> " + str2.chars().map(Character::toUpperCase)
				.filter(e->!Character.isDigit(e))
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()));
		//.filter(e -> !Character.isSpaceChar(e)) if we want to split with space
				
		
	}

	private static void JavaMethod(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println("JavaMethod Count No of Char-> "+count);
		
	}

}
